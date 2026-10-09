package multithreading_filehandling;

public class RideSharingQueue extends Thread{
    String name;

    RideSharingQueue(String name){
        this.name=name;
    }

    @Override
    public void run() {
            System.out.println(name + " is getting a ride!");
    }
}
