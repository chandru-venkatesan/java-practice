package abstraction_scanner_input;

import java.util.Scanner;

public class JavaExam extends OnlineExam{
    @Override
    void startExam() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Q1.What is JVM?");
        System.out.println("1.Java Virtual Machine");
        System.out.println("2.Java Variable Method");
        System.out.println("3.Java Verified Module");
        System.out.println("Enter Your Answer(1/2/3): ");
        int a1 =sc.nextInt();
        if(a1==1){
            score++;
        }
        System.out.println("Q1.What is OOP?");
        System.out.println("1.Other Overridden Process");
        System.out.println("2.Object Oriented Programming");
        System.out.println("3.Only One Project");
        System.out.println("Enter Your Answer(1/2/3): ");
        int a2 =sc.nextInt();
        if(a2==2){
            score++;
        }
        System.out.println("Q1.What is SQL?");
        System.out.println("1.Structured Query Language");
        System.out.println("2.Save in Queue Language");
        System.out.println("3.Secondary Query Language");
        System.out.println("Enter Your Answer(1/2/3): ");
        int a3 =sc.nextInt();
        if(a3==1){
            score++;
        }
        System.out.println("Final Score: "+score);

    }
}
