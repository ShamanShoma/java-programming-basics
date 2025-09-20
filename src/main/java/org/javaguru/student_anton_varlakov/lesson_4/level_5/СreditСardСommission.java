package org.javaguru.student_anton_varlakov.lesson_4.level_5;

import java.util.Scanner;

class СreditСardСommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int sum = scanner.nextInt();

        float commission = 0;

        if (sum < 1000) {
            commission = (float) (sum * 0.03);
        } else if ((sum >= 1000) && (sum < 5000)) {
            commission = (float) (sum * 0.04);
        } else if (sum >= 5000) {
            commission = (float) (sum * 0.05);
        }

        System.out.println("Your commission is: " + commission);
    }

}
