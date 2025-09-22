package org.javaguru.student_anton_varlakov.lesson_5.study_task_3;

class MaxNumber {

    int findMax(int number1, int number2, int number3) {
        int max = Math.max(number1, number2);
        return Math.max(max, number3);
    }

}
