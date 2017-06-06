package com.cinimex.dto;

import com.cinimex.entity.Station;
import com.cinimex.entity.Ticket;
import java.time.LocalDateTime;
import java.util.List;

public class TripDto {
    private Integer id;
    
    private LocalDateTime timeOfTrip;
    
    private Integer ticketId;
    
    private Integer stationId;

    public TripDto() {
    }

    public TripDto(Integer id, LocalDateTime timeOfTrip, Integer ticketId, Integer stationId) {
        this.id = id;
        this.timeOfTrip = timeOfTrip;
        this.ticketId = ticketId;
        this.stationId = stationId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStationId() {
        return stationId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public LocalDateTime getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public void setTimeOfTrip(LocalDateTime timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }    
}
