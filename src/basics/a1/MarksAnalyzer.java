package basics.a1;

public class MarksAnalyzer {
    public static void analyze(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total = total + m;
        }
        double average = total / 5;

        System.out.println(" Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: "  +grade(average));
    }

    public static void analyze(int[] marks, String studentName) {
        int total = 0;
        for (int m : marks) {
            total = total + m;
        }
        double average = total / 5;
        System.out.println(" Student Name:" + studentName);
        System.out.println(" Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: "+ grade(average));
    }

    public  static String  grade(double average){
        if(average>=90)return "O";
        else if(average>=80) return "A+";
        else if(average>=70)return "A";
        else if(average>=60)return "B+";
        else if(average>=50)return"B";
        else return "Fail";
    }

     public static void main(String[] args) {
        int[] marks={70,80,90,75,85};
        analyze(marks);
        analyze(marks,"John");
    }
}
