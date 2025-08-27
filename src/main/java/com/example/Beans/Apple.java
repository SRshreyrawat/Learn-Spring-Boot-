package com.example.Beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Apple {
     void getdata(){
        System.out.println("This is Apple class");
     }
     @PostConstruct
     public void CallThisBeforeAppleIsUsed(){
        System.out.println("This method is called before the apple class is used");
     }
     @PreDestroy
    public void CallThisBeforeAppleIsDestroyed(){
        System.out.println("This method is called before the apple class is destroyed");
     }
}
