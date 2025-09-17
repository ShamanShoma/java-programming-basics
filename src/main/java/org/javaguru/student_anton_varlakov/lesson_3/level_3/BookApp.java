package org.javaguru.student_anton_varlakov.lesson_3.level_3;

public class BookApp {
    public static void main(String[] args) {

        Chapter philosopherStone = new Chapter("Philosopher's Stone", "Harry Potter and the Philosopher's Stone");
        Chapter secretRoom = new Chapter("Secret room", "Harry Potter and Secret Room");
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 2001, philosopherStone, secretRoom);
        System.out.println("Title: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year of publication: " + book1.getYear());
        System.out.println("Part one: " + philosopherStone.getTitle());
        System.out.println("Text of the first part: " + philosopherStone.getTextChapter());
        System.out.println("Second part: " + secretRoom.getTitle());
        System.out.println("Text of the second part: " + secretRoom.getTextChapter());

        System.out.println(" ");

        Chapter shooter = new Chapter("Shooter", "the first volume of the Dark Tower series");
        Chapter extractionThree = new Chapter("Extraction of the Three", "the second work from the Dark Tower cycle");
        Book book2 = new Book("Dark Tower", "Stephen King", 1982, shooter, extractionThree);
        System.out.println("Title: " + book2.getName());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year of publication: " + book2.getYear());
        System.out.println("Part one: " + shooter.getTitle());
        System.out.println("Text of the first part: " + shooter.getTextChapter());
        System.out.println("Second part: " + extractionThree.getTitle());
        System.out.println("Text of the second part: " + extractionThree.getTextChapter());

    }
}
