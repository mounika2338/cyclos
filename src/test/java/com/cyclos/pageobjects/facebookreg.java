package com.cyclos.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookreg {
	
	
	WebDriver driver;
	public facebookreg(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
   By firstname = By.name("firstname");
   By surname  = By.name("lastname");
   By username=By.xpath("//*[@id='u_0_r']");
   By Password=By.xpath("(//*[@type='password'])[2]");
   By day=By.name("birthday_day");
   By month =By.name("birthday_month");
   By year=By.name("birthday_year");
   By female=By.xpath("(//*[@type='radio'])[1]");
   //By =By.linkText("Home");
   
   public WebElement setfirstname()
   {
	  return driver.findElement(firstname);
  }
   public WebElement setsurname()
   {
	  return driver.findElement(surname);
  }
   
   public WebElement setusername()
   {
	   return driver.findElement(username);
   }
         
   public WebElement setPassword()
   {
	   return driver.findElement(Password);
   }
   
   public WebElement setday()
   {
	   return driver.findElement(day);
   }
   public WebElement setmonth()
   {
	   return driver.findElement(month);
   }
   public WebElement setyear()
   {
	   return driver.findElement(year);
   }
   public WebElement setfemale()
   {
	   return driver.findElement(female);
   }
}



