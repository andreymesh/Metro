package com.cinimex.entity;

public class Station {
    private Integer id;
    
    private String stationName;

    public Station(String stationName) {
        this.id = id;
        this.stationName = stationName;
    }

    public Station(Integer id, String stationName) {
        this.id = id;
        this.stationName = stationName;
    }
    
    public Integer getId() {
        return id;
    }

    public String getStation_name() {
        return stationName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStation_name(String stationName) {
        this.stationName = stationName;
    }
    
    @Override
    public String toString(){
        return "id = "+this.id+" "+"station's name = "+this.stationName;
    }
}
