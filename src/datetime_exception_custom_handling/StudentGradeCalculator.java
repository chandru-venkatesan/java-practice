package datetime_exception_custom_handling;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Marks: ");
        int tm = sc.nextInt();

        System.out.println("Enter Obtained Marks: ");
        int om = sc.nextInt();

        try {
            if(om>tm || om<0){
                throw new Exception("Error: Obtained marks cannot be greater than total marks!");
            }
            else {
                System.out.println("Secured marks: "+om+"/"+tm);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
