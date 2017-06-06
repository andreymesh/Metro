package com.cinimex.dto;

import com.cinimex.entity.Station;
import com.cinimex.entity.TravelCard;
import java.time.LocalDateTime;
import java.util.List;

public class TicketDto {
    private Integer id;
    
    private LocalDateTime timeOfPurchase;
    
    private Integer nymberOfCard;
    
    private Integer travelCardId;
    
    private Integer stationId;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTravelCardId() {
        return travelCardId;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public Integer getStationId() {
        return stationId;
    }

    public Integer getNymberOfCard() {
        return nymberOfCard;
    }

    public Integer getId() {
        return id;
    }

    public TicketDto(Integer id, LocalDateTime timeOfPurchase, Integer nymberOfCard, Integer travelCardId, Integer stationId) {
        this.id = id;
        this.timeOfPurchase = timeOfPurchase;
        this.nymberOfCard = nymberOfCard;
        this.travelCardId = travelCardId;
        this.stationId = stationId;
    }

    public TicketDto() {
    }
}