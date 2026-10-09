package course.basic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Course {
    String name;
    double price;
     CourseLevel level;
     LocalDate createdDate;

    public Course(String name,double price,CourseLevel level,LocalDate createdDate){
        this.name = name;
        this.price = price;
        this.level = level;
        this.createdDate = createdDate;
    }

   abstract void printDetails();
   int getCourseAgeInDays(){
       return (int) ChronoUnit.DAYS.between(createdDate,LocalDate.now());
   }

    public void generateCertificate(String studentName) {
    }
}
