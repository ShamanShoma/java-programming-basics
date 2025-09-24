package org.javaguru.student_anton_varlakov.lesson_5.level_6;

class StudentsReportCard {

    private int mathGrade;
    private int literatureGrade;
    private int russianLanguageGrade;
    private int historyGrade;
    private int computerScienceGrade;

    public StudentsReportCard(int mathGrade,
                              int literatureGrade,
                              int russianLanguageGrade,
                              int historyGrade,
                              int computerScienceGrade) {
        this.mathGrade = mathGrade;
        this.literatureGrade = literatureGrade;
        this.russianLanguageGrade = russianLanguageGrade;
        this.historyGrade = historyGrade;
        this.computerScienceGrade = computerScienceGrade;
    }

    public int getMathGrade(){
        return mathGrade;
    }

    public int getLiteratureGrade() {
        return literatureGrade;
    }

    public int getRussianLanguageGrade() {
        return russianLanguageGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public int getComputerScienceGrade() {
        return computerScienceGrade;
    }

}
