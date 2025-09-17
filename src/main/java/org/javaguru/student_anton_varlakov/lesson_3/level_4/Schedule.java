package org.javaguru.student_anton_varlakov.lesson_3.level_4;

import java.time.LocalDate;

public class Schedule {

    private String firstName;
    private String lastName;
    private String speciality;
    private LocalDate dateAdmission;
    private MakeAppointment appointment1;
    private MakeAppointment appointment2;

    public Schedule(String firstName,
                    String lastName,
                    String speciality,
                    LocalDate dateAdmission,
                    MakeAppointment appointment1,
                    MakeAppointment appointment2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.dateAdmission = dateAdmission;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public MakeAppointment getAppointment1() {
        return appointment1;
    }

    public MakeAppointment getAppointment2() {
        return appointment2;
    }

}
