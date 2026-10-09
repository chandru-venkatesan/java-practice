package course.basic;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static CourseLevel level;
    private static LocalDate createdDate;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[2];
        int index = 0;
        System.out.println("Enter : 1. Programming Course , 2. Design Course");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Course Price : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course Level (BEGINNER,INTERMEDIATE,ADVANCED) ");
        LocalDate craetedDate = LocalDate.now().minusDays(3);
        if(choice==1){
            System.out.println("Enter Project Name : ");
            String projectName = sc.nextLine();
            System.out.println("Enter Project Duration : ");
            int projectDays= sc.nextInt();
            courses[index++]=new ProgrammingCourse(name,price,level,craetedDate,projectName,projectDays);
        }
        else{
            courses[index++]=new DesignCourse(name,price,level,createdDate);
        }
        courses[index++]=new ProgrammingCourse("SQl",5000, CourseLevel.ADVANCED,LocalDate.now().minusDays(5),"Employee Portal",15);
        courses[index++]= new DesignCourse("CATIA",10000, CourseLevel.INTERMEDIATE,LocalDate.now().minusDays(10));
        System.out.println(" Course Details");
        for(Course c : courses){
            if(c!= null){
                c.printDetails();
                System.out.println();
            }
        }
        courses[0].generateCertificate("John");
        FeeCalculator f = new FeeCalculator();
        System.out.println("Fee without Discount "+f.calculateFee(courses[0]));
        System.out.println("Fee with 10%  Discount "+f.calculateFee(courses[0],10));


    }
}
