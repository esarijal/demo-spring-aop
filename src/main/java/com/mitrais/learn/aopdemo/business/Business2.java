package com.mitrais.learn.aopdemo.business;

import com.mitrais.learn.aopdemo.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        // TODO business logic here
        return dao2.retrieveSomething();
    }
}
