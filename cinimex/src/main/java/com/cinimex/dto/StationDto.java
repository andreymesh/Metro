package com.cinimex.dto;


public class StationDto {
    private Integer id;
    
    private String station_name;

    public StationDto() {
    }

    public StationDto(Integer id, String station_name) {
        this.id = id;
        this.station_name = station_name;
    }

    public Integer getId() {
        return id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }
}
