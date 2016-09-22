package com.headerphile.olevegard.legopartdb.Database;

public class LegoSetPart {
    public LegoSetPart(String setName, String partId, String partDesctiption, String partColor, int count, int hasCount){
        this.setName = setName;
        this.partId = partId;
        this.partDescription = partDesctiption;
        this.partColor = partColor;
        this.count = count;
        this.hasCount = hasCount;
    }

    String setName;
    public String getSetName(){
        return setName;
    }

    String partId;
    public String getPartId(){ return partId; }

    String partDescription;
    public String getPartDescription(){
        return partDescription;
    }

    String partColor;
    public String getPartColor(){
        return partColor;
    }

    int count;
    public int getCount(){
        return count;
    }

    int hasCount;
    public int getHasCount(){
        return hasCount;
    }
}
