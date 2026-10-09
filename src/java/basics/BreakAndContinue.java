package java.basics;

public class BreakAndContinue {
    static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%4==0 && i%6==0){
                break;
            }
            System.out.println(i);
        }
        for(int i=1;i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
