package hospital.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clinic {
    public class Appointment{
        Doctor doctor;
        Patient patient;
        AppointmentStatus status;
        LocalDate appointmentDate;


        Appointment(Doctor doctor,Patient patient,LocalDate appointmentDate ){
            this.doctor= doctor;
            this.patient= patient;
            this.status=AppointmentStatus.BOOKED;
            this.appointmentDate  =appointmentDate;
        }

        public Doctor getDoctor() {
            return doctor;
        }

        public Patient getPatient() {
            return patient;
        }

        public AppointmentStatus getStatus() {
            return status;
        }
        public LocalDate getAppointmentDate(){
            return appointmentDate;
        }
    }

    public List<Appointment> getAllAppointments() {
        List<Appointment> all = new ArrayList<>();
        appointments.values().forEach(all::addAll);
        return all;
    }



    Map<LocalDate, List<Appointment>> appointments = new HashMap<>();
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();


    public synchronized void bookAppointment(Patient patient, Doctor doctor, LocalDate appointmentDate)
            throws AppointmentLimitExceededException {

        appointments.putIfAbsent(appointmentDate, new ArrayList<>());

        if (appointments.get(appointmentDate).size() >= 10) {
            throw new AppointmentLimitExceededException("Daily Appointment limit exceeded!");
        }

        appointments.get(appointmentDate).add(new Appointment(doctor,patient,appointmentDate));
    }

    public Map<LocalDate, List<Appointment>> getAppointments() {
        return appointments;
    }

    public void totalAppointments() {
        appointments.forEach((date, list) ->
                System.out.println("Date of the Appointment = "+date + "  .  Total No of Appointments is  " + list.size()));
    }

}

