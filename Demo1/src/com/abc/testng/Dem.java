package com.abc.testng;

import org.testng.annotations.DataProvider;

public class Dem {
	
	
	@DataProvider(name="authentication")
	public Object[][] dataProvider()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="udkp14ec@cmrit.ac.in";
		obj[0][1]="Welcome1234";
		obj[1][0]="lmnkn";
		obj[1][1]="udkp14ec@cmrit.ac.in";
		return obj;
	
}
	

}
	


