package multithreading_filehandling;

public class Exam extends Thread{

    CountDownTimer timer;
    Exam(CountDownTimer timer){
        this.timer = timer;
    }
    @Override
    public void run() {

        try{
            timer.join();
            System.out.println("Times up! submitting the Test");
            System.out.println("Test Submitted successfully");
        }
        catch (InterruptedException e){
            System.out.println("Submission Interrupted");
        }
    }
}

