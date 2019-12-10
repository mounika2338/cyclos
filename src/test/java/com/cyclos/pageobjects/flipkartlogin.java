package com.cyclos.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartlogin {

WebDriver ldriver;
	
	public flipkartlogin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	@CacheLookup
	WebElement cancel;
	
	@FindBy(linkText="Login & Signup")
	@CacheLookup
	WebElement login;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	@CacheLookup
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	@CacheLookup
	WebElement go;
	
	public void setcancel()
	{
		cancel.click();
	}
	
	public void setlogin()
	{
		login.click();
	}
	public void setusername(String userbutton)
	{
		username.sendKeys(userbutton);;
	}
	public void setpassword(String passwordbutton)
	{
		Password.sendKeys(passwordbutton);
	}
	public void setgo()
	{
		go.click();
	}

}

