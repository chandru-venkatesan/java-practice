package multithreading_filehandling;

public class TimerExamMain {
    static void main(String[] args) {
        CountDownTimer t = new CountDownTimer();
        Exam e = new Exam(t);

        t.start();
        e.start();

    }
}
