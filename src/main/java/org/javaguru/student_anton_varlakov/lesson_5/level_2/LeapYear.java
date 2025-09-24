package org.javaguru.student_anton_varlakov.lesson_5.level_2;

class LeapYear {

    String leapYear = "Leap Year";

    String calculateLeapYear(int year) {
        /*
        if (year % 400 == 0){
            return leapYear;
        } else if (year % 100 != 0) {
            return leapYear;
        } else if (year % 4 == 0) {
            return leapYear;
        } else {
            return "Not a leap year";
        } */

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return leapYear;
        } else {
            return "Not a leap year";
        }
    }

}
