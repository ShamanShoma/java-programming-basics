package org.javaguru.student_anton_varlakov.lesson_3;

class AppleApp {
    public static void main(String[] args) {

        Apple apple1 = new Apple("Gold", "yellow", 5);
        Apple apple2 = new Apple("Антоновка", "green", 7);

        System.out.println("Grade: " + apple1.getGrade());
        System.out.println("Color: " + apple1.getColor());
        System.out.println("Weight: " + apple1.getWeight());
    }
}
