package basics.a6;

public class CountdownTimer {
    int startnumber;

    public CountdownTimer(int startnumber) {
        this.startnumber = startnumber;
    }

    public void start(int startnumber) {
        if (startnumber > 0) {
            System.out.println(startnumber);
            start(startnumber - 1);
        }
    }
}
