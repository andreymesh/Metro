package com.cinimex.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Trip {
    private Integer id;
    
    private LocalDateTime timeOfTrip;
    
    private Integer ticketId;
    
    private Integer stationId;

    public Trip(LocalDateTime timeOfTrip, Integer ticketId, Integer stationId) {
        this.timeOfTrip = timeOfTrip;
        this.ticketId = ticketId;
        this.stationId = stationId;
    }

    public void setTimeOfTrip(LocalDateTime timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTimeOfTrip() {
        return timeOfTrip;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public Integer getId() {
        return id;
    }

    public Trip(Integer id, LocalDateTime timeOfTrip, Integer ticketId, Integer stationId) {
        this.id = id;
        this.timeOfTrip = timeOfTrip;
        this.ticketId = ticketId;
        this.stationId = stationId;
    }
}
