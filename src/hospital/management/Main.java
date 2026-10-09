package hospital.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Patient p = new Patient("Ajith",36,"HeadAche",LocalDate.now());

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Joe",22,"Cold",LocalDate.now()));
        patients.add(new Patient("John",30,"Fever",LocalDate.now()));
        patients.add(new Patient("Donna",62,"Cancer",LocalDate.now()));
        patients.add(new Patient("April",65,"Cold",LocalDate.now()));
        patients.add(new Patient("Vasu",18,"HeadAche",LocalDate.now()));



        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("Mark",65,Department.PLASTICS,25));
        doctors.add(new Doctor("Cristina",40,Department.CARDIO,12));
        doctors.add(new Doctor("Meredith",38,Department.GENERAL,12));
        doctors.add(new Doctor("Callie",39,Department.ORTHO,15));
        doctors.add(new Doctor("Baily",50,Department.GENERAL,25));
        doctors.add(new Doctor("Derek",45,Department.NEURO,23));


        System.out.println("-----Patients whose age is above 50-----");
        Patient.sortedByAge(patients);
        System.out.println("-----Patients who has Cold-----");
        Patient.sortedByIllness(patients);

        System.out.println( "Total Bill Amount : "+p.generateBill());

        System.out.println("-----Doctors who has more than 20 years Experience-----");
        Doctor.sortedByExperience(doctors);

        Clinic clinic = new Clinic();
        try{
            clinic.bookAppointment(patients.get(0),doctors.get(1),LocalDate.now());
            clinic.bookAppointment(patients.get(1),doctors.get(0),LocalDate.now());
            clinic.bookAppointment(patients.get(2),doctors.get(3),LocalDate.now());
            clinic.bookAppointment(patients.get(3),doctors.get(5),LocalDate.now());
            clinic.bookAppointment(patients.get(4),doctors.get(4),LocalDate.now());
        }
        catch (AppointmentLimitExceededException e){
            System.out.println(e.getMessage());
        }
        clinic.totalAppointments();

        FileHandle f = new FileHandle();
        f.savePatientsToFile(patients);
        f.saveAppointmentsToFile(clinic.getAllAppointments());

        AppointmentBookingThread abt = new AppointmentBookingThread();
        BillGeneratorThread bgt = new BillGeneratorThread();



        abt.start();
        bgt.start();
    }
}
