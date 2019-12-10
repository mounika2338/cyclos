package com.cyclos.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyclos.pageobjects.flipkartlogin;

public class Tc_flipkartlogin_001 extends flipkartbaseclass {

    @Test
	public void logintest() throws InterruptedException, IOException
	{
    	driver.get(baseURL);
		//logger.info("URL is opened");
		flipkartlogin fl = new flipkartlogin(driver);
		fl.setcancel();
		//logger.info("homepage is opened");
		fl.setlogin();
		
		fl.setusername(username);
		//logger.info("enter username");
		fl.setpassword(password);
		//logger.info("enter password");
		fl.setgo();
	    Thread.sleep(5000);
	    //fl.setcancel();
//	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			Assert.assertTrue(true);
			//logger.info("Login test passed");
		}
		else
		{
//			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			//logger.info("Login test failed");
	} 
	   
	}
}



