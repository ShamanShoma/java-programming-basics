package org.javaguru.student_anton_varlakov.lesson_5.level_6;

class StudentsReportCardCalculate {

    public double averageGrade(StudentsReportCard antonGrade) {
        int sumGrade = antonGrade.getMathGrade()
                + antonGrade.getLiteratureGrade()
                + antonGrade.getRussianLanguageGrade()
                + antonGrade.getHistoryGrade()
                + antonGrade.getComputerScienceGrade();
        return (double) sumGrade / 5;
    }

}
