package com.example.demo;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
@Lazy
public class Bean {

    
    public Bean() {
	
    }
    
    @PostConstruct
    public void ps() {
	System.err.println("toto");
    }
    
}
