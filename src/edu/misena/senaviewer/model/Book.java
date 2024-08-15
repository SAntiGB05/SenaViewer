package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {

    int id;
    String title;

    Date edititionDate;
    String editorial;
    String[] authors = new String[5];

    int isbn;
    boolean readed;
    int timeReaded;

    public Book (String title,Date edititionDate, String editorial, int isbn){
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public static void getters(){

    }

    public static void setters(){

    }

}