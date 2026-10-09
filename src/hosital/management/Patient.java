package hosital.management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Patient extends  Person implements Billable {
    String illness;
    LocalDate admissionDate;

    public Patient(String name) {
        super(name);
    }

    public Patient(String name, int age) {
        super(name, age);
    }

    public Patient(String name, int age, String illness, LocalDate admissionDate) {
        super(name, age);
        this.illness = illness;
        this.admissionDate = admissionDate;
    }

    @Override
    void showInfo() {
        System.out.println("Patient Details");
        System.out.println("Patient name: " + name);
        System.out.println("Patient's Age: " + age);
        if (illness != null) {
            System.out.println("Illness: " + illness);
            System.out.println("Admission Date: " + admissionDate);

        }
    }

    public double generateBill() {
        if (admissionDate == null)
            return 0;
            long days = ChronoUnit.DAYS.between(admissionDate, LocalDate.now());
            return days * 1000;
    }
}