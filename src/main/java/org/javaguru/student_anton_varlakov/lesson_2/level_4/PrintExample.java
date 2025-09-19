package org.javaguru.student_anton_varlakov.lesson_2.level_4;

import java.util.Scanner;

class PrintExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Привет, " + name + "! ");
        System.out.print("Добро пожаловать в мир Java!");
    }
}
