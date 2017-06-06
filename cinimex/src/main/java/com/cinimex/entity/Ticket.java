package com.cinimex.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Ticket {
    private Integer id;
    
    private LocalDateTime timeOfPurchase;
    
    private Integer nymberOfCard;
    
    private Integer travelCardId;
    
    private Integer stationId;

    public Ticket(LocalDateTime timeOfPurchase, Integer nymberOfCard, 
            Integer travelCardId, Integer stationId) {
        this.timeOfPurchase = timeOfPurchase;
        this.nymberOfCard = nymberOfCard;
        this.travelCardId = travelCardId;
        this.stationId = stationId;
    }

    public Ticket(Integer id, Timestamp timeOfPurchase, 
            Integer nymberOfCard, Integer travelCardId, Integer stationId) {
        this.id = id;
        this.timeOfPurchase = timeOfPurchase.toLocalDateTime();
        this.nymberOfCard = nymberOfCard;
        this.travelCardId = travelCardId;
        this.stationId = stationId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNymberOfCard() {
        return nymberOfCard;
    }

    public Integer getStationId() {
        return stationId;
    }

    public Integer getTravelCardId() {
        return travelCardId;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public void setId(Integer id) {
        this.id = id;
    }    

    public void setTravelCardId(Integer travelCardId) {
        this.travelCardId = travelCardId;
    }

    public void setTimeOfPurchase(LocalDateTime timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public void setNymberOfCard(Integer nymberOfCard) {
        this.nymberOfCard = nymberOfCard;
    }

    @Override
    public String toString() {
        return "id = "+this.id+" "+"timeOfPurchase = "+this.timeOfPurchase+
                " "+"nymberOfCard = "+this.nymberOfCard+" "+"travelCardId = "+
                this.travelCardId+" "+"stationId = "+this.stationId;
    }
}