package java.basics;

public class ComparingMaxMinEven {
    static void getMaximum(int a, int b){
        if(a>b){
            System.out.println("a is greater. That is "+ a);
        }
        else{
            System.out.println("b is greater. That is "+ b);
        }
    }

      public static boolean isEven(int a){
        return a%2==0;
      }

    static void main(String[] args) {
        getMaximum(100,20);
        System.out.println(isEven(10));
    }
}
