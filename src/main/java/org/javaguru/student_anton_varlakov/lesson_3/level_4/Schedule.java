package org.javaguru.student_anton_varlakov.lesson_3.level_4;

public class Schedule {

    private String firstName;
    private String lastName;
    private String speciality;
    private int dateAdmission;
    private MakeAppointment appointment1;
    private MakeAppointment appointment2;

    public Schedule(String firstName,
                    String lastName,
                    String speciality,
                    int dateAdmission,
                    MakeAppointment appointment1,
                    MakeAppointment appointment2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.dateAdmission = dateAdmission;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

}
