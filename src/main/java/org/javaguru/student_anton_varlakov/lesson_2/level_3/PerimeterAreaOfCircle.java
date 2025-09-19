package org.javaguru.student_anton_varlakov.lesson_2.level_3;

import java.util.Scanner;

class PerimeterAreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}
