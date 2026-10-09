package basics.a5;

public class Main {
    public static void main(String[] args){
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
        Student1.setname("Meredith");
        Student1.setdepartment("Biology");
        Student1.setregisternumber(1201);
        Student1.setcgpa(7.8);
        Student1.printdetails();
        Student2.setname("Jack");
        Student2.setdepartment("Computer Science");
        Student2.setregisternumber(1202);
        Student2.setcgpa(8.2);
        Student2.printdetails();
        Student3.setname("Mark");
        Student3.setdepartment("Physics");
        Student3.setregisternumber(1203);
        Student3.setcgpa(9.5);
        Student3.printdetails();



    }

}
