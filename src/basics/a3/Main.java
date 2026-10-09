package basics.a3;

public class Main {
    public static void main(String[] args){
        BankAccount Account1 = new BankAccount();
        Account1.setAccountNumber(654861);
        Account1.setAccountHolder("Jay");
        Account1.Deposit(1000);
        Account1.Withdraw(500);
        Account1.ShowDetails();

        BankAccount Account2 = new BankAccount(5000);
        Account2.setAccountNumber(484266);
        Account2.setAccountHolder("Devi");
        Account2.Deposit(500);
        Account2.Withdraw(200);
        Account2.ShowDetails();

    }
}
