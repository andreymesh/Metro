package com.cinimex.mybatis.mapper;

import com.cinimex.entity.ActiveTickets;
import com.cinimex.entity.TopCard;
import com.cinimex.entity.TopStation;
import com.cinimex.entity.VolumeTrafic;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StatisticMapper {
    @Select("select travel_card.count_of_trips,station.station_name,ticket.time_of_purchase,ticket.number_of_card "
            + "from ticket join station on ticket.station_id=station.id "
            + "join travel_card on ticket.travel_card_id=travel_card.id "
            + "where ticket.number_of_card>0;")
    public List<ActiveTickets> getActiveTiclets();
    
    @Select ("select t1.count_of_trips,count(t1.count_of_trips) from travel_card as t1 "
            + "join ticket as t2 on t1.id=t2.travel_card_id "
            + "where t2.time_of_purchase >#{start} and t2.time_of_purchase<#{end} "
            + "group by t1.count_of_trips;")
    public List<TopCard> getTopCard(@Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end);
    
    @Select("select t1.station_name, count(t1.station_name) "
            + "from mydb.station as t1 join mydb.trip as t2 "
            + "on t1.id=t2.station_id where t2.time_of_trip>#{start} "
            + "and t2.time_of_trip< #{end} "
            + "group by t1.station_name;")
    public List<TopStation> getTopStation(@Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end);
    
    @Select("select HOUR(trip.time_of_trip),count(trip.time_of_trip) "
            + "from trip group by HOUR(trip.time_of_trip);")
    public List<VolumeTrafic> getVolumeTrafic();
}
