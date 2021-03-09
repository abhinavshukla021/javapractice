package com.springhandson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BeanConfig {

    @Bean(name="wanted_bean")
    @Scope("prototype")
    public ClassA getobjAtype1 (){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        return new ClassA(1,"Abhinav", arrayList);
    }

    @Bean
    @Scope("prototype")
    public ClassA getobjAtype2 (){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        return new ClassA(1,"Pranshu", arrayList);
    }

    @Bean
    @Scope("prototype")
    public ClassB getobjB ()
    {
        return new ClassB(2,"Shukla", null);
    }

    @Bean
    @Scope("prototype")
    public ClassC getobjC()
    {
        return new ClassC(3,"Manya", getobjB());
    }


}
