package com.cinimex.dto;

public class TravelCardDto {
    private Integer id;
    
    private Integer count_of_trips;

    public TravelCardDto() {
    }

    public TravelCardDto(Integer id, Integer count_of_trips) {
        this.id = id;
        this.count_of_trips = count_of_trips;
    }

    public Integer getCount_of_trips() {
        return count_of_trips;
    }

    public Integer getId() {
        return id;
    }

    public void setCount_of_trips(Integer count_of_trips) {
        this.count_of_trips = count_of_trips;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
