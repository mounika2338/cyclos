package com.cyclos.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyclos.pageobjects.loginfacebook;

public class Tc_login_001 extends Baseclass {
	
	
	
	
	 @Test
		public void logintest() throws InterruptedException, IOException
		{
		 driver.get(baseURL);
			
	loginfacebook fb = new loginfacebook(driver);
	
	
	         
	
			fb.setusername(username);
			
			fb.setlastname(lastname);
			
			fb.setmobile(mobile);
			
			fb.setpassword(password);
			
			//Select day_dd = new Select(fb.setday());
			//day_dd.selectByVisibleText("15");
			
			//Select month_dd = new Select(fb.setmonth());
			
			
			
			fb.setsignup();
		    Thread.sleep(2000);
		    
		   
		   
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


