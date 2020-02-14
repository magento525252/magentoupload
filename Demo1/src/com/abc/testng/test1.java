package com.abc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void login()
	{
		Assert.fail();
		System.out.println("login is executed");
	}
	
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logout()
	{
		System.out.println("logout is  executed");
	}
	
	@Test(invocationCount=10)
	public void t2()
	{
		System.out.println("t2 is executed");
	}
	
	@Test(enabled=false)
	public void t3()
	{
		System.out.println("t3 is executed");
	}
	
	
}
