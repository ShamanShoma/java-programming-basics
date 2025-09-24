package org.javaguru.student_anton_varlakov.lesson_5.level_3;

class TaxRateApp {

    public static void main(String[] args) {
        TaxRate taxRate = new TaxRate();

        System.out.println(taxRate.calculateRate(5));
        System.out.println(taxRate.calculateRate(999));
        System.out.println(taxRate.calculateRate(1000));
        System.out.println(taxRate.calculateRate(1001));
        System.out.println(taxRate.calculateRate(1010));
        System.out.println(taxRate.calculateRate(5000));
        System.out.println(taxRate.calculateRate(5001));
        System.out.println(taxRate.calculateRate(100000));
    }

}
