package com.cinimex.entity;

public class TravelCard {
    private Integer id;
    
    private Integer countOfTrips;

    public TravelCard(Integer countOfTrips) {
        this.id = id;
        this.countOfTrips = countOfTrips;
    }

    public TravelCard(Integer id, Integer countOfTrips) {
        this.id = id;
        this.countOfTrips = countOfTrips;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCount_of_trips() {
        return countOfTrips;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setCount_of_trips(Integer countOfTrips) {
        this.countOfTrips = countOfTrips;
    }

    public Integer getCountOfTrips() {
        return countOfTrips;
    }

    public void setCountOfTrips(Integer countOfTrips) {
        this.countOfTrips = countOfTrips;
    }

    @Override
    public String toString() {
        return "id = "+this.id+" "+"countOfTrips ="+this.countOfTrips;
    }
}
