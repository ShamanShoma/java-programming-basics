package org.javaguru.student_anton_varlakov.lesson_3;

import java.util.Scanner;

class BankAccountApp {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Vasya", 1);
        BankAccount bankAccount2 = new BankAccount("Peja", 3);
        BankAccount bankAccount3 = new BankAccount("Anton", 4);

        BankAccount bankAccount4 = new BankAccount("Fedya");

        BankAccount bankAccount5 = new BankAccount(5);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String owner = scanner.nextLine();

        System.out.print("Enter your money: ");
        int money = scanner.nextInt();

        BankAccount bankAccount6 = new BankAccount(owner, money);

        String owner1 = bankAccount1.getOwner();
        bankAccount1.addMoney(5);
        int money1 = bankAccount1.getMoney();

        String owner2 = bankAccount2.getOwner();
        int money2 = bankAccount2.getMoney();

        String owner3 = bankAccount3.getOwner();
        bankAccount3.setMoney(888);
        int money3 = bankAccount3.getMoney();

        String owner4 = bankAccount4.getOwner();
        bankAccount4.addMoney(2);
        int money4 = bankAccount4.getMoney();

        String owner5 = bankAccount5.getOwner();
        bankAccount5.setMoney(9999);
        int money5 = bankAccount5.getMoney();

        String owner6 = bankAccount6.getOwner();
        int money6 = bankAccount6.getMoney();

        System.out.println("Owner: " + owner1 + ", Money: " + money1);
        System.out.println("Owner: " + owner2 + ", Money: " + money2);
        System.out.println("Owner: " + owner3 + ", Money: " + money3);
        System.out.println("Owner: " + owner4 + ", Money: " + money4);
        System.out.println("Owner: " + owner5 + ", Money: " + money5);
        System.out.println("Owner: " + owner6 + ", Money: " + money6);

        System.out.println("Money: " + money3);

    }
}
