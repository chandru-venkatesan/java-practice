package wallet.system;


import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WalletAccount extends Account implements TransactionRules {

    private double balance;

    public WalletAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.balance = 0.0;
    }

    public synchronized void credit(double amount) {
        balance = balance + amount;
    }

    public synchronized void debit(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Bank Balance!");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder Name : " + accountHolderName+
                ", Balance: " + balance;
    }


    @Override
    public void accountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    @Override
    public double getDailyLimit() {
        return 50000.0;
    }

    List<Transaction> transactions = new ArrayList<>();
    Map<YearMonth, List<Transaction>> monthlyTransactions = new HashMap<>();

    public synchronized void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        YearMonth month = YearMonth.from(transaction.getTimeStamp());
        monthlyTransactions.computeIfAbsent(month, ym -> new ArrayList<>()).add(transaction);
    }

    public void expenseAboveThreshold() {

        transactions.stream()
                .filter(t -> t.getType() == TransactionType.DEBIT)
                .filter(t -> t.getAmount() > 2000.0)
                .forEach(System.out::println);
    }

    public void totalDebit(){
          double td =transactions.stream()
                .filter(t-> t.getType()==TransactionType.DEBIT)
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total Debited Amount via Transactions: "+ td);

    }

    public void totalCredit(){
       double tc = transactions.stream()
                .filter(t-> t.getType()==TransactionType.CREDIT)
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total Credit Amount via Transactions: "+tc);
    }

    public String getHighestExpenseCategory(){
       return transactions.stream()
                .filter(t-> t.getType() == TransactionType.DEBIT)
                .collect(Collectors.groupingBy(Transaction::getCategory,Collectors.summingDouble(Transaction::getAmount)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No expenses");
    }
}
