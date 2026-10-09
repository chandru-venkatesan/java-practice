package multithreading_filehandling;

public class RideSharingQueueMain {
    static void main(String[] args) {
        RideSharingQueue vip = new RideSharingQueue("VIP Rider");
        RideSharingQueue rr = new RideSharingQueue("Regular Rider");
        RideSharingQueue nu = new RideSharingQueue("New User");

        vip.setPriority(Thread.MAX_PRIORITY);
        rr.setPriority(Thread.NORM_PRIORITY);
        nu.setPriority(Thread.MIN_PRIORITY);

        vip.start();
        rr.start();
        nu.start();
    }
}
