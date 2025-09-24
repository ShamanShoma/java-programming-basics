package org.javaguru.student_anton_varlakov.lesson_5.level_5;

class CompoundInterest {

    public double calculateCompoundInterest(double initialAmount,
                                            double annualInterestRate,
                                            int numberOfPeriods,
                                            int depositTerm){
        return initialAmount * Math.pow((1 + (annualInterestRate / numberOfPeriods)), (numberOfPeriods * depositTerm));
    }
}
