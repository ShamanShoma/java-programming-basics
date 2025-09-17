package org.javaguru.student_anton_varlakov.lesson_3.level_4;

import java.time.LocalDate;

public class DoctorTimetableApp {
    public static void main(String[] args) {

         MakeAppointment beforeLunch = new MakeAppointment("Anton", "Varlakov",
                 "ORVI", 1500);
         MakeAppointment afterLunch = new MakeAppointment("Olya", "Shathova",
                 "diabetes", 2500);

         Schedule therapist = new Schedule("Alla", "Allegrova", "therapist",
                 LocalDate.of(2025, 9, 18), beforeLunch, afterLunch);

        System.out.println("Doctor's name: " + therapist.getFirstName());
        System.out.println("Doctor's surname: " + therapist.getLastName());
        System.out.println("Specialist: " + therapist.getSpeciality());
        System.out.println("Date of admission: " + therapist.getDateAdmission());

        System.out.println("Пациент до обеда");
        System.out.println("Patient name: " + therapist.getAppointment1().getFirstName());
        System.out.println("Patient surname: " + therapist.getAppointment1().getLastName());
        System.out.println("Diagnosis: " + therapist.getAppointment1().getDiagnosis());
        System.out.println("Cost of visit: " + therapist.getAppointment1().getCostVisit());

        System.out.println("Пациент после обеда");
        System.out.println("Patient name: " + therapist.getAppointment2().getFirstName());
        System.out.println("Patient surname: " + therapist.getAppointment2().getLastName());
        System.out.println("Diagnosis: " + therapist.getAppointment2().getDiagnosis());
        System.out.println("Cost of visit: " + therapist.getAppointment2().getCostVisit());

    }
}
