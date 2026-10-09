package abstraction1;

public class Main {
    static void main(String[] args) {
        PlayStation p = new PlayStation();
        p.startGame();
        p.displayConsoledetails();
        Xbox x = new Xbox();
        x.startGame();
        x.displayConsoledetails();
    }
}
