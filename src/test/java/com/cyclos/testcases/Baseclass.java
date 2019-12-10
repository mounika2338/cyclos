package com.cyclos.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	
	
	public String baseURL = "https://www.facebook.com";
	public String username="manu1";
	public String lastname="reddy";
	public String mobile="8234567873";
	public String password="reddy";
	
	
	
	
	
	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setup()
	{
		
		//PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\cyclospom\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		
	}
	@AfterClass
	public void teardown()
	{
	driver.quit();	
	}
}


