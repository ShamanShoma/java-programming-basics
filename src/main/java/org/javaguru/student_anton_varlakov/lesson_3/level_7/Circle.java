package org.javaguru.student_anton_varlakov.lesson_3.level_7;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

}
