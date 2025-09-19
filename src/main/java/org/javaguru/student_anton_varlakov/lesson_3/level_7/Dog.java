package org.javaguru.student_anton_varlakov.lesson_3.level_7;

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String givingVoice() {
        return "My nickname is " + this.name;
    }

    public void celebrateBirthday() {
        this.age += 1;
    }

    public int getAge() {
        return this.age;
    }

}
