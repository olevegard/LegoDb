package com.headerphile.olevegard.legopartdb.Database;

public class LegoSet {
    public LegoSet(int id, String name){
        this.id = Integer.toString(id);
        this.name = name;
    }

    String id;
    public String getId(){
        return id;
    }

    String name;
    public String getName(){
        return name;
    }
}
