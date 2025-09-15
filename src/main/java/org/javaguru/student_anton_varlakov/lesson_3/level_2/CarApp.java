package org.javaguru.student_anton_varlakov.lesson_3.level_2;

public class CarApp {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "black", 1568865);
        Car toyota = new Car("Toyota", "white", 500000);
        Car lexus = new Car("Lexus", "green", 2000000);

        String ladaBrend = lada.getBrand();
        String ladaColor = lada.getColor();
        String ladaPrice = lada.getColor();
        System.out.println("Brend: " + ladaBrend + ", Color: " + ladaColor + ", Price: " + ladaPrice);

        String toyotaBrend = toyota.getBrand();
        String toyotaColor = toyota.getColor();
        String toyotaPrice = toyota.getColor();
        System.out.println("Brend: " + toyotaBrend + ", Color: " + toyotaColor + ", Price: " + toyotaPrice);

        String lexusBrend = lexus.getBrand();
        String lexusColor = lexus.getColor();
        String lexusPrice = lexus.getColor();
        System.out.println("Brend: " + lexusBrend + ", Color: " + lexusColor + ", Price: " + lexusPrice);

    }
}
