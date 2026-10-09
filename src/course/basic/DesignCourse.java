package course.basic;

import java.time.LocalDate;

public class DesignCourse extends Course implements Certifiable{
    public DesignCourse(String name, double price, CourseLevel level, LocalDate createdDate){
        super(name,price,level,createdDate);
    }

    @Override
    void printDetails() {
        System.out.println("Design Course");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Level: "+level);
        System.out.println("Created Date: "+ createdDate);

    }
    public void generateCertificate(String studentName) {
        System.out.println("Certificate Generated for "+studentName+ "in  Design Course "+ name);
    }
}
