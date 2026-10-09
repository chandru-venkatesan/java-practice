package method_overriding;

public class Techbot extends Chatbot{
    @Override
    void respond() {
        System.out.println("Tech news");
    }
}
