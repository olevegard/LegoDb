package com.headerphile.olevegard.legopartdb.Database;

public class LegoPart {
    public LegoPart(String id, String description, int width, int length, int height){
        this.id = id;
        this.description = description;
        this.width = Integer.toString(width);
        this.length = Integer.toString(length);
        this.height = Integer.toString(height);
    }

    String id;
    public String getId(){
        return id;
    }

    String description;
    public String getDescription(){
        return description;
    }

    String width;
    public String getWidth(){
        return width;
    }

    String length;
    public String getLength(){
        return length;
    }

    String height;
    public String getHeight(){
        return height;
    }
}
