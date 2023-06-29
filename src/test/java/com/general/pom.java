package com.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="passwor")
	WebElement pwd;
	
	@FindBy(name="btnLogin")
	WebElement btn;
	
	public void username(String user)
	{
		username.sendKeys(user);
	}
	public void pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void btn()
	{
		btn.click();
	}
}
