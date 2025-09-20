package org.javaguru.student_anton_varlakov.lesson_4.level_4;

class StockApp {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

    }

}
