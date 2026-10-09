package java.basics;

public class Student1 {
    String name;
    int age;

    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    void showDetails(){
        System.out.println(name);
        System.out.println(age);
    }

    static void main(String[] args) {
        Student1 s1 = new Student1("Jackson",30);
        Student1 s2 = new Student1("April",28);
        Student1 s3 = new Student1("Zola",15);
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
