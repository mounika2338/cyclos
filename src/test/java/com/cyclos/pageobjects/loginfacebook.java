package com.cyclos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginfacebook {
	
	
WebDriver ldriver;
	
	public loginfacebook(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//*[@name='firstname']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//*[@name='lastname']")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(xpath="//*[@name='reg_email__']")
	@CacheLookup
	WebElement mobile;
	
	
	@FindBy(xpath="(//*[@type='password'])[2]")
	@CacheLookup
	WebElement Password;
	
	/*@FindBy(xpath="//*[@id='day']")
	@CacheLookup
	WebElement day;
	
	@FindBy(xpath="//*[@id='month']")
	@CacheLookup
	WebElement month;
	
	
	@FindBy(xpath="//*[@id='year']")
	@CacheLookup
	WebElement year;
	
	
	@FindBy(xpath="(//*[@name='sex'])[1]")
	@CacheLookup
	WebElement female;*/  
	
	
	@FindBy(xpath="(//*[text()='Sign Up'])[1]")
	@CacheLookup
	WebElement signup;
	
	
	
	public void setusername(String userbutton)
	{
		username.sendKeys(userbutton);
	}
	
	public void setlastname(String lastbutton )
	{
		lastname.sendKeys(lastbutton);
	}
	public void setmobile(String mobilebutton)
	{
		mobile.sendKeys(mobilebutton);;
	}
	public void setpassword(String passwordbutton)
	{
		Password.sendKeys(passwordbutton);
	}
	/*public void setday()
	{
		day.click();
		
		
	}
	
	public void setmonth()
	{
		month.click();
		
	}
	
	
	public void setyear()
	{
		year.click();
		
	}
	
	public void setfemale()
	{
		female.click();
		
	} */
	
	public void setsignup()
	{
		signup.click();
		
	}

	

	
	
	
	

}

	
	
	
	
	
	
	
	
	
	
	
	


