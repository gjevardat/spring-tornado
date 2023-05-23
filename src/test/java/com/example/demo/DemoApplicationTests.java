package com.example.demo;


import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;



@SpringBootTest
public class DemoApplicationTests  extends AbstractDemoApplicationTest{
    
    	@Autowired
    	ApplicationContext context;

	@Test
	public void contextLoads() {
	    System.err.println("test -");
	    Bean b = context.getBean(Bean.class);
	    b.ps();
	}
	
	@PostConstruct
	public void ps(){
	    System.err.println("test ps");
	}

}
