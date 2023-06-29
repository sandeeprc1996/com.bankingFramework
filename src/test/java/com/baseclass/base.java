package com.baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Screenshots;

import inter.generic;

public class base implements generic
{
	WebDriver driver;
	@BeforeClass
	public void launch()
	{
		System.setProperty(key, value);
		 driver = new ChromeDriver();
		 driver.get(url);
	}
	@AfterClass
	public void close()
	{
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("ERROR: (ALERT BOX DETECTED) - ALERT MSG : " + alertText);
		alert.accept();
		
		driver.close();
	}
}
