package org.javaguru.student_anton_varlakov.lesson_4;

class Scoring {

    public String calculatePoints(int points) {
        if ((90 <= points) && (points <= 100)) {
            return "A";
        } else if ((80 <= points) && (points <= 89)) {
            return "B";
        } else if (((70 <= points) && (points <= 79))) {
            return "C";
        } else if (((60 <= points) && (points <= 69))) {
            return "D";
        } else if (((0 <= points) && (points <= 59))) {
            return "F";
        } else {
            return "Unknow";
        }
    }

}
