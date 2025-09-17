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

    }
}
