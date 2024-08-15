package edu.misena.senaviewer.model;

public class Chapter {
    int id;
    String title;

    int duration;
    short year;
    boolean viewed;

    int timeViewed;
    int sessionNumber;

    public Chapter (String title,int duration,short year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public static void getters(){

    }

    public static void setters(){

    }

}