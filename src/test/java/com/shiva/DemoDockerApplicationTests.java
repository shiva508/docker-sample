package com.shiva;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDockerApplicationTests {

	@Test
	public void contextLoads() 
	{
	String expectedName = "Nattu";
	assertEquals(expectedName, "Nattu");
	System.out.println("Test Successful");	
	}

}
