package com.mitrais.learn.aopdemo.dao;

import com.mitrais.learn.aopdemo.aspect.annotation.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
