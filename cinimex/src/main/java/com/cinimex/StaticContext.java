package com.cinimex;

import com.cinimex.config.DataConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StaticContext {
    private static ApplicationContext context=new AnnotationConfigApplicationContext(DataConfig.class);
    
    public static <T> T getBean(Class <T> bean){
        return context.getBean(bean);
    };
}
