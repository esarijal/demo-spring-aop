package com.mitrais.learn.aopdemo.dao;

import com.mitrais.learn.aopdemo.aspect.annotation.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao2";
    }
}
