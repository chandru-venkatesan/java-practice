package java.basics;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a =100;
        if((a%2)==0){
            System.out.println("Even Number");
        }
        if((a%2)==1){
            System.out.println("Odd Number");
        }
        if((a%5)==0){
            System.out.println("Divisible by 5");
        }
        if((a%5)!=0){
            System.out.println("Not Divisible by 5");
        }
        if (a==1){
            System.out.println("One");
        }
        if (a==2){
            System.out.println("Two");
        }
        if (a==3){
            System.out.println("Three");
        }
        if (a>3){
            System.out.println("Greater than Three");
        }
    }
}
