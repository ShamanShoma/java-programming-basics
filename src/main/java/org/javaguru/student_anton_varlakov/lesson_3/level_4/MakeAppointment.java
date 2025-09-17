package org.javaguru.student_anton_varlakov.lesson_3.level_4;

import java.util.Date;

public class MakeAppointment {

    private String firstName;
    private String lastName;
    private String diagnosis;
    private Date costVisit;

    public MakeAppointment(String firstName,
                           String lastName,
                           String diagnosis,
                           Date costVisit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.costVisit = costVisit;
    }

}
