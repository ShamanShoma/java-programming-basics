package org.javaguru.student_anton_varlakov.lesson_5.study_task_4;

class TriangleArea {

    public double findSemiperimeter(int number1,
                                    int number2,
                                    int number3){
        return (double) (number1 + number2 + number3) / 2;
    }

    public double findArea(int number1,
                        int number2,
                        int number3) {
        double p = findSemiperimeter(number1, number2, number3);
        return Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }

}
