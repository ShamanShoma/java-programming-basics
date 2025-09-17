package org.javaguru.student_anton_varlakov.lesson_3.level_3;

public class BookApp {
    public static void main(String[] args) {

        Chapter philosopherStone = new Chapter("Philosopher's Stone", "Harry Potter and the Philosopher's Stone");
        Chapter secretRoom = new Chapter("Secret room", "Harry Potter and Secret Room");
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 2001, philosopherStone, secretRoom);

        Chapter shooter = new Chapter("Shooter", "the first volume of the Dark Tower series");
        Chapter extractionThree = new Chapter("Extraction of the Three", "the second work from the Dark Tower cycle");
        Book book2 = new Book("Dark Tower", "Stephen King", 1982, shooter, extractionThree);

    }
}
