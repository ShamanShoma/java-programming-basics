package org.javaguru.student_anton_varlakov.lesson_4.level_6;

import java.util.Scanner;

class SeasonOfTheYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the month from 1 to 12: ");
        int monthNum = scanner.nextInt();

        switch (monthNum) {
            case 1: case 2: case 12:
                System.out.println("This is winter!");
                break;
            case 3: case 4: case 5:
                System.out.println("This is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("This is summer!");
                break;
            case 9: case 10: case 11:
                System.out.println("This is autumn!");
                break;
            default:
                System.out.println("Incorrect number!");
        }
    }

}
