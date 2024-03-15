package de.neuefische.book;

import de.neuefische.book.Book;

public class Main {

    public static void main(String[] args) {

        Book barbarasBook = new Book("Algorithmen und Datenstrukturen", 507,
                "Kai Uwe Sattler","Grau","3-89864-255-0" );

        Book deansBook = new Book("Java für Dummies", 463,
                "Berry Bird", "Gelb", "978-3-527-72020-0");


        //Buch
        String book1Title = "Das Merk ich mir!";
        int book1Pages = 383;
        String book1Author = "Brown Roediger III McDaniel";
        String book1CoverColor = "White";
        String book1Isbn = "978-3-442,17850-6";

        printBookInfos(barbarasBook);
        printBookInfos(deansBook);
        
    }

    public static void printBookInfos(Book book){
        System.out.println(
                "Das Buch " + book.title + " des Autors " + book.author + " hat eine Seitenzahl von " + book.pages + "."
        );
        System.out.println("Es strahlt in wunderschönem " + book.coverColor + " und ist unter der isbn " + book.isbn + " bestellbar!");
    }
}