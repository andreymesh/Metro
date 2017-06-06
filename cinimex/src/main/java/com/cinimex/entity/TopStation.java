package com.cinimex.entity;

public class TopStation {
    private String stationName;
    
    private Long popularStation;

    public TopStation(String stationName, Long popularStation) {
        this.stationName = stationName;
        this.popularStation = popularStation;
    }

    @Override
    public String toString() {
        return "stationName = "+this.stationName+" "+"popularStation = "+this.popularStation;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setPopularStation(Long popularStation) {
        this.popularStation = popularStation;
    }

    public String getStationName() {
        return stationName;
    }

    public Long getPopularStation() {
        return popularStation;
    }
}
