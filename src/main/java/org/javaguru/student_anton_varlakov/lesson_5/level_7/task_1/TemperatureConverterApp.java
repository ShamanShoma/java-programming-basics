package org.javaguru.student_anton_varlakov.lesson_5.level_7.task_1;

class TemperatureConverterApp {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double tempCels = converter.FahrenheitToCelsiusConverter(32);
        double tempFahren = converter.CelsiusToFahrenheitConverter(32);

        System.out.println("32 градуса по Френгейту - это " + tempCels + " градусов по Цельсию");
        System.out.println("32 градуса по Цельсию - это " + tempFahren + " градусов по Фаренгейту");
    }

}
