package multithreading_filehandling;

public class YouTubeMain {
    static void main(String[] args) {
        YouTube part1 = new YouTube("Part 1");
        YouTube part2 = new YouTube("Part 2");
        YouTube part3 = new YouTube("Part 3");

        part1.start();
        part2.start();
        part3.start();

        try{
            part1.join();
            part2.join();
            part3.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Video Fully Buffered");

    }
}
