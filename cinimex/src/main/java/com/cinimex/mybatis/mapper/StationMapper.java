package com.cinimex.mybatis.mapper;

import com.cinimex.entity.Station;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StationMapper {
    
    @Select("select id,station_name stationName from station")
    public List<Station> getAll();
    
    @Select("select id,station_name stationName from station where id=#{id}")
    public Station getById(@Param ("id") Integer id);
    
    @Insert("insert into station (station_name) values (#{station.stationName});")
    public void insert(@Param("station") Station station);
}
