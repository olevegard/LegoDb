package com.headerphile.olevegard.legopartdb.Database;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LegoSet {
    private ArrayList<LegoSetPart> parts;
    public LegoSet(int id, String name){
        this.id = Integer.toString(id);
        this.name = name;
    }

    public LegoSet(int id, String name, ArrayList<LegoSetPart> parts){
        this.id = Integer.toString(id);
        this.name = name;
        this.parts = parts;
    }


    String id;
    public String getId(){
        return id;
    }

    String name;
    public String getName(){
        return name;
    }

    public ArrayList<LegoSetPart> getParts(){
        return parts;
    }

}
