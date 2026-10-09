package java.basics;

public class ArithmeticOperators {
    static int a=20;
    static int b=55;

   public  static void main(String[] args) {
       System.out.println(a + b);
       System.out.println(a - b);
       System.out.println(a * b);
       System.out.println(a / b);
       System.out.println(a % b);

       if (a > b) {
           System.out.println(a + " is the greater number");
       }  if (a == b) {
           System.out.println("Both are Equal");
       } if (b > a) {
           System.out.println(b + " is the greater number");
       }

       if (a>10 && b>10){
           System.out.println("Both are greater than 10");
       }
       else if  (a>10 || b>10){
           System.out.println( "One number is greater than 10");
       }
   }

}
