package com.cinimex.entity;

public class TopCard {
    private Integer counOfTrips;
    
    private Long popularCard;

    public TopCard(Integer counOfTrips, Long popularCard) {
        this.counOfTrips = counOfTrips;
        this.popularCard = popularCard;
    }

    public Integer getCounOfTrips() {
        return counOfTrips;
    }

    public Long getPopularCard() {
        return popularCard;
    }

    public void setPopularCard(Long popularCard) {
        this.popularCard = popularCard;
    }

    @Override
    public String toString() {
        return "counOfTrips = "+ this.counOfTrips+" "+"popularCard = "+this.popularCard;
    }

    public void setCounOfTrips(Integer counOfTrips) {
        this.counOfTrips = counOfTrips;
    }
}
