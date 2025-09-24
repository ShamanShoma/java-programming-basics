package org.javaguru.student_anton_varlakov.lesson_5.level_2;

class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        System.out.println(leapYear.calculateLeapYear(2000));
        System.out.println(leapYear.calculateLeapYear(1900));
        System.out.println(leapYear.calculateLeapYear(2024));
        System.out.println(leapYear.calculateLeapYear(2025));
    }

}
