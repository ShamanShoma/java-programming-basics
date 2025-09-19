package org.javaguru.student_anton_varlakov.lesson_2.level_3;

import java.util.Scanner;

class ArithmeticMean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int num3 = scanner.nextInt();

        double arithmeticMean = (double) (num1 + num2 + num3 ) / 3;
        System.out.println("Arithmetic mean of numbers: " + arithmeticMean);
    }
}
