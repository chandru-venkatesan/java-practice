package java.basics;

public class MethodCalling {
    static void displayMessage(){
        System.out.println("Hello User");
    }
    static void displayMessage(String name){
        System.out.println("Hello "+ name);
    }

    static void main(String[] args) {
        displayMessage();
        displayMessage("John");
    }
}
