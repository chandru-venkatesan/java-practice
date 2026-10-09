package java.basics;

public class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount){
        balance= balance+amount;
        System.out.println("Credited "+ amount + "and your total balance is "+ balance);
    }

    void withdraw(double amount){
        balance = balance-amount;
        System.out.println("Debited "+ amount + "and your total balance is "+ balance);
    }

    void displayBalance(){
        System.out.println("Your Balance is "+ balance);
    }

    static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        obj1.accountHolder="Joe";
        obj1.balance = 1000.00;
        obj1.deposit(5000.00);
        obj1.withdraw(2000.00);
        obj1.displayBalance();

        BankAccount obj2 = new BankAccount();
        obj2.accountHolder="Joe";
        obj2.balance = 2000.00;
        obj2.deposit(2000.00);
        obj2.withdraw(1000.00);
        obj2.displayBalance();

    }
}
