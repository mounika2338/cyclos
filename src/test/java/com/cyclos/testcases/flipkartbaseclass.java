package com.cyclos.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class flipkartbaseclass {

	public String baseURL= "https://www.flipkart.com/";
	public String username="mngr164225";
	public String password="jahetAp";
	public static WebDriver driver;
	
	//public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		//logger = Logger.getLogger("ecommerce");
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
