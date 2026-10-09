package wallet.system;

public class MonthlyReportGenerator extends Thread{
    @Override
    public void run() {

        System.out.println("Generating monthly Report.."+currentThread().getName());
    }
}
