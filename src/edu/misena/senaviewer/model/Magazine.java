package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {

    int id;
    String title;
    Date edititionDate;
    String editorial;
    String[] authors = new String[5];

    public Magazine(String title,Date edititionDate,String editorial){
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }
}
