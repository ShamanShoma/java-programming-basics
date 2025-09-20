package org.javaguru.student_anton_varlakov.lesson_4.level_1;

import java.util.Scanner;

class EvenOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " - even!");
        } else {
            System.out.println(num + " - odd!");
        }
    }

}
