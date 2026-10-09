package java.basics;

public class Person {
    String name;
    int age;

    void displayPersonDetails(){
        System.out.println("Person Name: "+name);
        System.out.println("Age: "+ age);
    }

    static void main(String[] args) {
        Person obj=new Person();
        Address obj1 = new Address();
        obj.name = "Meredith";
        obj.age=30;
        obj1.street="304,GR Street";
        obj1.city= "Chennai";
        obj1.pinCode=603325;
        obj.displayPersonDetails();
        obj1.showAddress();
    }
}

