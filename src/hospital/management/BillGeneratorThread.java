package hospital.management;

public class BillGeneratorThread extends Thread{
    @Override
    public void run() {
        System.out.println("Generating Bill for "+currentThread().getName());
    }
}
