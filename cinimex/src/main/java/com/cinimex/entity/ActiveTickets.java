package com.cinimex.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ActiveTickets {
    private Integer countOfTrips;
    
    private String stationName;
    
    private LocalDateTime timeOfpurchase;

    private Integer numberOfCard;

    public ActiveTickets(Integer countOfTrips, String stationName, Timestamp timeOfpurchase, Integer numberOfCard) {
        this.countOfTrips = countOfTrips;
        this.stationName = stationName;
        this.timeOfpurchase = timeOfpurchase.toLocalDateTime();
        this.numberOfCard = numberOfCard;
    }

    @Override
    public String toString() {
        return "countOfTrips = "+this.countOfTrips+" "+"stationName = "+this.stationName+" "+
                "timeOfpurchase = "+this.timeOfpurchase+" "+"numberOfCard = "+this.numberOfCard;
    }

    public void setTimeOfpurchase(LocalDateTime timeOfpurchase) {
        this.timeOfpurchase = timeOfpurchase;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setNumberOfCard(Integer numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public void setCountOfTrips(Integer countOfTrips) {
        this.countOfTrips = countOfTrips;
    }

    public LocalDateTime getTimeOfpurchase() {
        return timeOfpurchase;
    }

    public String getStationName() {
        return stationName;
    }

    public Integer getNumberOfCard() {
        return numberOfCard;
    }

    public Integer getCountOfTrips() {
        return countOfTrips;
    }
}
