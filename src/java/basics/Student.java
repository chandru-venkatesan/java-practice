package java.basics;

public class Student {
    String name;
    int age;

    Student(){
        name = "Unknown";
        age =0;
    }

    static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Name: "+s.name);
        System.out.println("Age: "+ s.age);
    }
}
