package com.cyclos.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyclos.pageobjects.facebookreg;

public class Tc_facebkreg_003 {
	


	
	
	@Test
	public void facebkreg()
	{
	
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\cyclospom\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	  facebookreg fr = new facebookreg(driver);
	  fr.setfirstname().sendKeys("hello");
	  fr.setsurname().sendKeys("hi");
	  fr.setusername().sendKeys("mounika123@gmail.com");
	  fr.setPassword().sendKeys("mouni987");
	  
	  Select day_dd=new Select(fr.setday());
	  day_dd.selectByVisibleText("15");
	  
	  Select month_dd=new Select(fr.setmonth());
	  month_dd.selectByIndex(6);
	  
	  Select year_dd=new Select(fr.setyear());
	  year_dd.selectByValue("2017");
	  
	  fr.setfemale().click();
	}
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


