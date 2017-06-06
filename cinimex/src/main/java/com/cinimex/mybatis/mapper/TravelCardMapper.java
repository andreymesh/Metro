package com.cinimex.mybatis.mapper;

import com.cinimex.entity.TravelCard;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TravelCardMapper {
    @Select("select id,count_of_trips countOfTrips from travel_card")
    public List<TravelCard> getAll();
    
    @Select("select id,count_of_trips countOfTrips from mydb.travel_card where id=#{id}")
    public TravelCard getById(@Param ("id") Integer id);
    
    @Insert("insert into mydb.travel_card (count_of_trips) values (#{travelCard.countOfTrips})")
    public void insert(@Param("travelCard") TravelCard travelCard);
}
