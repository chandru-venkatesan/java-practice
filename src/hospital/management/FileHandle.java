package hospital.management;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandle {

    public void savePatientsToFile(List<Patient> patients) {

        try (FileWriter fw = new FileWriter("patients.txt")) {

            for (Patient p : patients) {
                fw.write(
                        p.getName() + "," +
                                p.getAge() + "," +
                                p.getIllness() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error saving patients!");
        }
    }

    public void saveAppointmentsToFile(List<Clinic.Appointment> appointments) {

        try (FileWriter fw = new FileWriter("appointments.txt")) {

            for (Clinic.Appointment a : appointments) {
                fw.write(
                        "Doctor: " + a.getDoctor().getName() +
                                ", Patient: " + a.getPatient().getName() +
                                ", Status: " + a.getStatus() +
                                ", Date: " + a.getAppointmentDate() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error storing appointments!");
        }
    }
}
