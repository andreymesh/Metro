package com.cinimex;

import com.cinimex.config.DataConfig;
import com.cinimex.service.StatisticService;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        //StatisticService service=new StatisticService();
        //service.topCard(LocalDateTime.of(2017,4,4,13,0,0),LocalDateTime.of(2017,4,4,20,0,0));
        //service.topStation(LocalDateTime.of(2017,4,4,13,0,0),LocalDateTime.of(2017,4,4,20,0,0));
       // service.activeTickets();
       //service.volumeTrafic();
       new JFrame1().setVisible(true);
    }
}
