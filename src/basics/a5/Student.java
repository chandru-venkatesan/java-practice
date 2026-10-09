package basics.a5;

public class Student {
    private String name;
    private String department;
    private int registernumber;
    private double cgpa;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public int getregisternumber() {
        return registernumber;
    }

    public void setregisternumber(int registernumber) {
        this.registernumber = registernumber;
    }

    public double getcgpa() {
        return cgpa;
    }

    public void setcgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    public Student() {
        this.name = " ";
        this.department = " ";
        this.registernumber = 0;
        this.cgpa = 0.0;
    }

    public Student(String name, String department, int registernumber) {
        this.name = name;
        this.department = department;
        this.registernumber = registernumber;
    }

    public Student(String name, String department, int registernumber, double cgpa) {
        this.name = name;
        this.department = department;
        this.registernumber = registernumber;
        setcgpa(cgpa);
    }
    public void printdetails() {
        System.out.println("Name: "+ name);
        System.out.println("Department : "+ department);
        System.out.println("RegisterNumber : "+ registernumber);
        System.out.println("CGPA: "+ cgpa);
    }

}

