package com.abc.testng;


import org.testng.annotations.Test;

public class Launch {

	
	
	@Test(groups="inbox")
	public void p2()
	{
		System.out.println("123");
	}

	@Test(groups="compose")
	public void p3()
	{
		System.out.println("567");
		
	}
	
	@Test(groups="compose")
	public void p4()
	{
		System.out.println("ABC");
	}
	
	
}
