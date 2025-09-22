package org.javaguru.student_anton_varlakov.lesson_5.study_task_1;

class Calculator {

    int findAverage(int number1, int number2) {
        return (number1 + number2) / 2;
    }

    double findAverageDouble(int number1, int number2) {
        int sum = number1 + number2;
        return (double) sum / 2;
    }

}
