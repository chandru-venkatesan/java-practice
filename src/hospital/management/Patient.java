package hospital.management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Patient extends Person implements Billable{

    String illness;
    LocalDate admissionDate;
    LocalDate billGenerationDate;
    Patient(String name, int age, String illness, LocalDate admissionDate) {
        super(name, age);
        this.illness= illness;
        this.admissionDate = LocalDate.now();

    }
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", illness='" + illness + '\'' +
                ", admissiondate=" + admissionDate +
                '}';
    }



     public String getIllness(){
        return illness;
}
    @Override
    public void showDetails() {
        System.out.println("Patient's Name: "+name);
        System.out.println("Patient's age: "+age);
        System.out.println("Patient's Illness : "+ illness);
        System.out.println("Admission Date: "+ admissionDate);
    }

    @Override
    public  double generateBill() {
        if(admissionDate == null){
            return 0;
        }
        long noOfDays = ChronoUnit.DAYS.between(admissionDate,LocalDate.now());
        return (noOfDays*1000.0)+2000.0;
    }


    public static void sortedByAge(List<Patient> patients){
        patients.stream()
                .filter(t-> t.age>50)
                .forEach(System.out::println);
    }

    public static void sortedByIllness(List<Patient> patients){
         patients.stream()
                .filter(t->(t.illness=="Cold"))
                 .forEach(System.out::println);
    }

}
