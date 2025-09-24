package org.javaguru.student_anton_varlakov.lesson_5.level_3;

class TaxRate {

    double calculateRate(int sum) {
        if (sum < 10000) {
            return (sum * 0.3);
        } else if (sum >= 10000 && sum <= 50000) return (sum * 0.4);
        else {
            return (sum * 0.5);
        }
    }

}
