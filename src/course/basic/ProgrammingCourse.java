package course.basic;

import java.time.LocalDate;

public class ProgrammingCourse extends Course implements Certifiable{
    class Project{
        String projectName;
        int durationInDays;
        Project(String projectName,int durationInDays){
            this.projectName= projectName;
            this.durationInDays = durationInDays;
        }
        void printProjectDetails(){
            System.out.println("Project Name: "+ projectName);
            System.out.println("Project Duration "+ durationInDays+" days");
        }
    }
    Project project;
        public ProgrammingCourse(String name, double price, CourseLevel level, LocalDate createdDate,String projectname,int projectDays){
            super(name,price,level,createdDate);
            this.project = new Project(projectname,projectDays);
        }

        @Override
    void printDetails() {
        System.out.println("Programming Course");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Level: "+level);
        System.out.println("Created Date: "+ createdDate);

    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate Generated for "+studentName+ "in  Programming Course "+ name);
    }
}
