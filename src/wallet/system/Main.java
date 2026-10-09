package wallet.system;

public class Main {
        static void main(String[] args) {
            WalletAccount wallet = new WalletAccount("45125", "John Doe");

            wallet.credit(50000.0);


            try {
                wallet.debit(10000.0);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

            wallet.accountDetails();




                wallet.transactions.add(new Transaction(TransactionType.DEBIT, 3000.0, PaymentMode.CASH, "Clothing"));

                wallet.transactions.add(new Transaction(TransactionType.DEBIT, 3000.0, PaymentMode.NET_BANKING, "Food"));

                wallet.transactions.add(new Transaction(TransactionType.DEBIT, 4000.0, PaymentMode.CARD, "Food"));

                wallet.transactions.add(new Transaction(TransactionType.DEBIT, 5000.0, PaymentMode.CASH, "Clothing"));

                wallet.transactions.add(new Transaction(TransactionType.CREDIT, 5000.0, PaymentMode.CASH, "Clothing"));




            TransactionProcessor tp = new TransactionProcessor();
            MonthlyReportGenerator mr = new MonthlyReportGenerator();
            tp.start();
            mr.start();

            ExpenseCalculator ec = new ExpenseCalculator();
            System.out.println("Total Expense via Transaction : "+ec.totalExpense(wallet.transactions,0));

            System.out.println("Final Balance: "+((wallet.getBalance())-(ec.totalExpense(wallet.transactions,0))));

            wallet.totalDebit();
            wallet.totalCredit();
            wallet.expenseAboveThreshold();
            wallet.getHighestExpenseCategory();

            FileHandling.saveTransactions(wallet.transactions);
            FileHandling.readTransactions();



        }
    }


