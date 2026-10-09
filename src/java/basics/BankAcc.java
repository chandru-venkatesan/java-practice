package java.basics;

public class BankAcc {
    private int accountNumber;
    private double balance;

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance = balance + amount;
            System.out.println("Credited " + amount);
        }
    }
    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Debited " + amount);
        }
    }
    void getbalance(){
        System.out.println("Balance "+ balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    static void main(String[] args) {
        BankAcc obj = new BankAcc();
        obj.setAccountNumber(1020);
        obj.deposit(3000);
        obj.withdraw(2000);
        System.out.println("Account Number: "+ obj.getAccountNumber());
        System.out.println("Final Balance: "+obj.getBalance());
    }
}
