package com.cinimex.mybatis.mapper;

import com.cinimex.entity.Trip;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TripMapper {
    @Select("select id,time_of_trip timeOfTrip,ticket_id ticketId,station_id stationId from trip")
    public List<Trip> getAll();
    
    @Select("select time_of_trip timeOfTrip,ticket_id ticketId,station_id stationId "
            + "from trip where id=#{id}")
    public Trip getById(@Param ("id") Integer id);
    
    @Insert("insert into trip (time_of_trip,ticket_id,station_id) "
            + "values(#{trip.timeOfTrip},#{trip.ticketId},#{trip.stationId})")
    public void insert(@Param("trip") Trip trip);
}
