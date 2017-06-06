package com.cinimex.service;

import com.cinimex.config.DataConfig;
import com.cinimex.entity.ActiveTickets;
import com.cinimex.entity.TopCard;
import com.cinimex.entity.TopStation;
import com.cinimex.entity.VolumeTrafic;
import com.cinimex.mybatis.mapper.StatisticMapper;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class StatisticService {
    private StatisticMapper statisticMapper;

    @Autowired
    public void setStatisticMapper(StatisticMapper statisticMapper) {
        this.statisticMapper = statisticMapper;
    }       
    
    public List<TopCard> topCard(LocalDateTime start,LocalDateTime end){        
        return statisticMapper.getTopCard(start, end);
    }
    
    public List<TopStation> topStation(LocalDateTime start,LocalDateTime end){
        return statisticMapper.getTopStation(start, end);
    }
    
    public List<ActiveTickets> activeTickets(){
       return statisticMapper.getActiveTiclets();
    }
    
    public List<VolumeTrafic> volumeTrafic(){
        return statisticMapper.getVolumeTrafic();
    }
}
