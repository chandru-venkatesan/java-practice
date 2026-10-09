package java.basics;

public class Student2 {
    String name;
    int age;

    Student2(){
        name ="Unknown";
        age=0;
    }
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }
    void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }


    static void main(String[] args) {
        Student2 n1 = new Student2();
        n1.showDetails();
        Student2 n2 = new Student2("Levi",25);
        n2.showDetails();
    }
}
