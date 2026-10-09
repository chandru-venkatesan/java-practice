package hosital.management;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Doctor[] doctors = new Doctor[4];
        Patient[] patients = new Patient[3];
        doctors[0] = new Doctor("Meredith",30,Department.GENERAL,"Monday","9 AM");
        doctors[1] = new Doctor ("Callie",35,Department.ORTHO,"Tuesday","10 AM");
        doctors[2] = new Doctor ("Amelia", 32,Department.NEURO,"Wednesday","12 PM");
        doctors[3] = new Doctor("Cristina",30,Department.CARDIOLOGY,"Monday","9 AM");

        System.out.println("Enter number of patients");
        int count = sc.nextInt();
        sc.nextLine();

        int idx=0;
        while (idx<count){
            System.out.println("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Patient's Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Patient's Illness: ");
            String illness = sc.nextLine();

            System.out.println("Admission Date: ");
            LocalDate admissionDate = LocalDate.now().minusDays(4);
            patients[idx]=new Patient(name,age,illness,admissionDate);
                idx++;

                for(Doctor d: doctors){
                    d.showInfo();
                    System.out.println();
                }

                for (Patient p : patients){
                    if(p!=null){
                        p.showInfo();
                        System.out.println("Bill Amount: "+p.generateBill());
                        System.out.println();
                    }
                }

        }
    }
}
