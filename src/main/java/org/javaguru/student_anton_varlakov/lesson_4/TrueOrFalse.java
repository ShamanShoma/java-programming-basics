package org.javaguru.student_anton_varlakov.lesson_4;

import java.util.Scanner;

class TrueOrFalse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        if ((num >= 1) && (num <= 10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
