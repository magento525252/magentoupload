package com.abc.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Demoe {

	WebDriver driver;
  
    
	@Test
 
    public void r1()
    {
    	
    new ChromeDriver();
	driver.get("https://www.magento.com");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.id("email")).sendKeys("cdnlc");
	driver.findElement(By.id("pass")).sendKeys("cdicd");
	driver.findElement(By.id("send2")).click();
	driver.findElement(By.linkText("Log Out")).click();
}
}
