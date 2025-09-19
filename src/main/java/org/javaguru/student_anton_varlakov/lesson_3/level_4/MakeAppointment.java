package org.javaguru.student_anton_varlakov.lesson_3.level_4;


import java.time.LocalDate;

class MakeAppointment {

    private String firstName;
    private String lastName;
    private String diagnosis;
    private int costVisit;

    public MakeAppointment(String firstName,
                           String lastName,
                           String diagnosis,
                           int costVisit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.costVisit = costVisit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getCostVisit() {
        return costVisit;
    }

}
