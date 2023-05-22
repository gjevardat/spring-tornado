package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;


@RunWith(SpringRunner.class)
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
