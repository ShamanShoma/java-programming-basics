package org.javaguru.student_anton_varlakov.lesson_4;

import java.util.Scanner;

class LargerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int num2 = scanner1.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        }

        if (num1 < num2) {
            System.out.println(num2);
        }
    }

}
