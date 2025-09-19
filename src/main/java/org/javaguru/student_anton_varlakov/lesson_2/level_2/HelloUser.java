package org.javaguru.student_anton_varlakov.lesson_2.level_2;

import java.util.Scanner;

class HelloUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();

        System.out.println("Привет, " + name);

    }
}
