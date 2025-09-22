package org.javaguru.student_anton_varlakov.lesson_5.study_task_2;

import java.util.Scanner;

class MaxNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(number1, number2);

        System.out.println(result);
    }


}
