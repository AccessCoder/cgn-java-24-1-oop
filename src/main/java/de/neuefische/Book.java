package de.neuefische;

public class Book {

    String title;
    int pages;
    String author;
    String coverColor;
    String isbn;


    //Constructor für alle Werte -> AllArgsConstructor
    public Book(String title, int pages, String author, String coverColor, String isbn){
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.coverColor = coverColor;
        this.isbn = isbn;
    }
    //Default Constructor -> NoArgsConstructor
    public Book(){

    }
}
