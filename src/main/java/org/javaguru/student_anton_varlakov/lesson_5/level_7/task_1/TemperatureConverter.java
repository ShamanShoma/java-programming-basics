package org.javaguru.student_anton_varlakov.lesson_5.level_7.task_1;

class TemperatureConverter {

    public double CelsiusToFahrenheitConverter(double cels) {
        return ((cels * 1.8) + 32);
    }

    public double FahrenheitToCelsiusConverter(double fahren){
        return ((fahren - 32) * 1.8);
    }

}
