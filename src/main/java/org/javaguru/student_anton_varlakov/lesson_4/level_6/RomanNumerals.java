package org.javaguru.student_anton_varlakov.lesson_4.level_6;

import java.util.Scanner;

class RomanNumerals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 10: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println(num + " - I");
            case 2 -> System.out.println(num + " - II");
            case 3 -> System.out.println(num + " - III");
            case 4 -> System.out.println(num + " - IV");
            case 5 -> System.out.println(num + " - V");
            case 6 -> System.out.println(num + " - VI");
            case 7 -> System.out.println(num + " - VII");
            case 8 -> System.out.println(num + " - VIII");
            case 9 -> System.out.println(num + " - IX");
            case 10 -> System.out.println(num + " - X");
            default -> System.out.println("Invalid number");
        }

    }

}
