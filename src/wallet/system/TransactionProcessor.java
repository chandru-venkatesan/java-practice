package wallet.system;

public class TransactionProcessor extends Thread{
    @Override
    public void run() {
        System.out.println("Transaction in Process!"+currentThread().getName());
    }
}
