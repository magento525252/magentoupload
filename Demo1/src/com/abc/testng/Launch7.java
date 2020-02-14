package com.abc.testng;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Launch7 {
	
	
	
	@Test
	public void login()
	{
		
		System.out.println("login should be executed");
	}
	
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logout()
	{
		System.out.println("logout should be executed");
	}
	
	@Test(invocationCount=5)
	public void test()
	{
		System.out.println("testcase is executed");
	}
}
