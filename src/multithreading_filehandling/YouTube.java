package multithreading_filehandling;

public class YouTube extends Thread {
    String part;

    YouTube(String part){
        this.part=part;
    }

    @Override
    public void run() {
        try{
            System.out.println("Buffering "+ part);
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
