package org.javaguru.student_anton_varlakov.lesson_5.study_task_1;

import java.util.Scanner;

class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.findAverage(number1, number2);
        double resultDouble = calculator.findAverageDouble(number1, number2);

        System.out.println(result);
        System.out.println(resultDouble);
    }

}
