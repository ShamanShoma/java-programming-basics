package org.javaguru.student_anton_varlakov.lesson_3.level_2;

class CarApp {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "black", 1568865);
        Car toyota = new Car("Toyota", "white", 500000);
        Car lexus = new Car("Lexus", "green", 2000000);

        lada.setBrand("X-rey");
        String ladaBrend = lada.getBrand();
        String ladaColor = lada.getColor();
        int ladaPrice = lada.getPrice();
        System.out.println("Brend: " + ladaBrend + ", Color: " + ladaColor + ", Price: " + ladaPrice);

        String toyotaBrend = toyota.getBrand();
        toyota.setColor("yellow");
        String toyotaColor = toyota.getColor();
        int toyotaPrice = toyota.getPrice();
        System.out.println("Brend: " + toyotaBrend + ", Color: " + toyotaColor + ", Price: " + toyotaPrice);

        String lexusBrend = lexus.getBrand();
        String lexusColor = lexus.getColor();
        lexus.setPrice(3000000);
        int lexusPrice = lexus.getPrice();
        System.out.println("Brend: " + lexusBrend + ", Color: " + lexusColor + ", Price: " + lexusPrice);

    }
}
