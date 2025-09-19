package org.javaguru.student_anton_varlakov.lesson_4;

class ScoringTest {

    public static void main(String[] args) {
        ScoringTest test = new ScoringTest();
        test.test1();
        test.test2();
    }

    public void test1() {
        int points = 100;
        String expectedGrade = "A";

        Scoring scoring = new Scoring();
        String realGrade = scoring.calculatePoints(points);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("Test 1 is OK");
        } else {
            System.out.println("Test 1 is FAIL");
        }
    }

    public void test2() {
        int points = 80;
        String expectedGrade = "B";

        Scoring scoring = new Scoring();
        String realGrade = scoring.calculatePoints(points);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("Test 2 is OK");
        } else {
            System.out.println("Test 2 is FAIL");
        }
    }

}
