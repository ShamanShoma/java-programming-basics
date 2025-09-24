package org.javaguru.student_anton_varlakov.lesson_5.level_1.task_1;

class FizzBuzz {

    public String divFiveAndThree(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

}
