package method_overriding;

public class Main {
    static void main(String[] args) {
        Sassybot s = new Sassybot();
        s.respond();
        Motivationbot m = new Motivationbot();
        m.respond();
        Techbot t = new Techbot();
        t.respond();
    }
}
