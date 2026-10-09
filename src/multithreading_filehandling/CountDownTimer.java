package multithreading_filehandling;

public class CountDownTimer extends Thread{
    @Override
    public void run() {
        try{
            for( int i=10;i>0;i--){
                System.out.println("Exam Starting in "+i);
                Thread.sleep(2000);
            }
    }
        catch (InterruptedException e){
            System.out.println("Timer Interrupted");
        }
}
}

