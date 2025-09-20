package org.javaguru.student_anton_varlakov.lesson_4.level_6;

import java.util.Scanner;

class SeasonOfTheYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the month from 1 to 12: ");
        int monthNum = scanner.nextInt();

        switch (monthNum) {
            case 1 -> System.out.println("This is winter!");
            case 2 -> System.out.println("This is winter!");
            case 3 -> System.out.println("This is spring");
            case 4 -> System.out.println("This is spring!");
            case 5 -> System.out.println("This is spring!");
            case 6 -> System.out.println("This is summer!");
            case 7 -> System.out.println("This is summer!");
            case 8 -> System.out.println("This is summer!");
            case 9 -> System.out.println("This is autumn!");
            case 10 -> System.out.println("This is autumn!");
            case 11 -> System.out.println("This is autumn!");
            case 12 -> System.out.println("This is winter!");
            default -> System.out.println("Incorrect number!");
        }
    }

}
