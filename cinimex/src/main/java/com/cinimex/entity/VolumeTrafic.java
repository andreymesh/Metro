package com.cinimex.entity;

public class VolumeTrafic {
    private Integer hour;
    private Long volume;

    public VolumeTrafic(Integer hour, Long volume) {
        this.hour = hour;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "hour = "+this.hour+" "+"volume = "+this.volume;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getVolume() {
        return volume;
    }
}
