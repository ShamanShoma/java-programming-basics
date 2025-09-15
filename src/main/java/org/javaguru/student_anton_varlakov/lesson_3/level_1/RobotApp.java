package org.javaguru.student_anton_varlakov.lesson_3.level_1;

public class RobotApp {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Android");
        Robot robot2 = new Robot("IOS");

        robot1.setName("Vasya");
        String name1 = robot1.getName();
        System.out.println("Robot1: " + name1);

        robot2.setName("Anton");
        String name2 = robot2.getName();
        System.out.println("Robot2: " + name2);
    }
}
