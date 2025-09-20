package org.javaguru.student_anton_varlakov.lesson_4.level_2;

import java.util.Scanner;

class EqualOrDifferent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 != num2) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }

}
