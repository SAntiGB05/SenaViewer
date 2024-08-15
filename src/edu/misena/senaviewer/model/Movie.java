package edu.misena.senaviewer.model;

public class Movie {

    int id;
    String title;

    String gender;
    String creator;
    int duration;
    short year;

    boolean viewed;
    int timeViewed;

    public Movie(String title,String gender,String creator,int duration,short year){
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    public static void getters(){

    }

    public static void setters(){

    }
}
