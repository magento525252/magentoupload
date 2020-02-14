package com.abc.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver;
    @BeforeTest
	@Parameters("browser")
	public void testCase1(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void test5()
	{
		
	
	driver.get("https://www.magento.com");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.id("email")).sendKeys("udkp14ec@cmrit.ac.in");
	driver.findElement(By.id("pass")).sendKeys("Welcome1234");
	driver.findElement(By.id("send2")).click();
	driver.findElement(By.linkText("My Account")).click();
	}
}
