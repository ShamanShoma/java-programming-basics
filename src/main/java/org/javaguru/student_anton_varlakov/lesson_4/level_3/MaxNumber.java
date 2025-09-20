package org.javaguru.student_anton_varlakov.lesson_4.level_3;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxNum = 0;

        if (num1 > num2) {
            maxNum = num1;
        } else if (num2 > num1) {
            maxNum = num2;
        }

        if (maxNum < num3) {
            maxNum = num3;
        } else {
            maxNum = maxNum;
        }

        System.out.println(maxNum);
    }

}
