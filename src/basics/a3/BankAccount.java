package basics.a3;

public  class BankAccount {
    private int AccountNumber;
    private String AccountHolder;
    private int Balance;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }

    public BankAccount() {
        this.Balance = 0;
    }

    public BankAccount(int InitialBankBalance) {
        this.Balance = InitialBankBalance;
    }

    public void Deposit(int Amount) {
        if (Amount > 0) {
            Balance = Balance + Amount;
            System.out.println(Amount + " is Deposited in your Account");
        }
    }

    public void Withdraw(int Amount) {
        if (Amount > 0 && Amount <= Balance) {
            Balance = Balance - Amount;
            System.out.println("Your withdrawn Amount is " + Amount);
        } else {
            System.out.println("Insufficient Bank Balance");
        }
    }

    public void ShowDetails() {
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Account Holder : " + AccountHolder);
        System.out.println("Account Balance : " + Balance);
    }
}


