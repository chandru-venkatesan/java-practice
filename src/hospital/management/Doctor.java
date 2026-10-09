package hospital.management;

import java.util.List;

public class Doctor extends Person{
    Department department;
    int experience;

    Doctor(String name, int age, Department department, int experience) {
        super(name, age);
        this.department=department;
        this. experience = experience;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", experience=" + experience +
                '}';
    }


    @Override
    public void showDetails() {
        System.out.println("Doctor's Name: "+ name);
        System.out.println("Doctor's Age: "+ age);
        System.out.println("Department: "+department);
        System.out.println("Experience in years : "+ experience+" Years.");
    }

    public static void sortedByExperience(List<Doctor> doctors){
        doctors.stream()
                .filter(t->t.experience>20)
                .forEach(System.out::println);
    }
}
