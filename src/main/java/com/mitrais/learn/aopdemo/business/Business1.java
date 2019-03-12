package com.mitrais.learn.aopdemo.business;

import com.mitrais.learn.aopdemo.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        // TODO business logic here
        return dao1.retrieveSomething();
    }
}
