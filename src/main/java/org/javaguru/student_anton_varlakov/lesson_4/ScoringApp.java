package org.javaguru.student_anton_varlakov.lesson_4;

import java.util.Scanner;

class ScoringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        Scoring scoring = new Scoring();
        String grade = scoring.calculatePoints(points);

        System.out.println(grade);
    }

}
