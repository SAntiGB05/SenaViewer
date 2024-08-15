package edu.misena.senaviewer.model;

public class Serie {

    int id;
    String title;

    String gender;
    String creator;
    int duration;
    short year;

    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Serie( String title,String gender,int duration){
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public static void getters(){

    }

    public static void setters(){

    }

}
