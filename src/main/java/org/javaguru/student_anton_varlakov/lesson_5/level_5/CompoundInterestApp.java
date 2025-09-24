package org.javaguru.student_anton_varlakov.lesson_5.level_5;

class CompoundInterestApp {

    public static void main(String[] args) {
        CompoundInterest calculate = new CompoundInterest();

        double result = calculate.calculateCompoundInterest(1000000,0.17,12, 1);
        System.out.println(result);
    }

}
