package com.cinimex.mybatis.mapper;

import com.cinimex.entity.Ticket;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TicketMapper {
    
    @Select("select id,time_of_purchase timeOfPurchase,number_of_card nymberOfCard,"
            + "travel_card_id travelCards,station_id station from ticket")
    public List<Ticket> getAll();
    
    @Select ("select time_of_purchase timeOfPurchase,number_of_card nymberOfCard,"
            + "travel_card_id travelCards,station_id station from ticket where id=#{id}")
    public Ticket getById(@Param ("id") Integer id);
    
    @Insert("insert into mydb.ticket (time_of_purchase,number_of_card, "
            + "travel_card_id,station_id) values (#{ticket.timeOfPurchase},"
            + "#{ticket.nymberOfCard},#{ticket.travelCardId},#{ticket.stationId})")
    public void insert(@Param("ticket") Ticket ticket);
}
