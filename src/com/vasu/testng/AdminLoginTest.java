package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AdminLoginTest
{
	ChromeDriver driver;
	@Test
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	}
	@BeforeTest
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		//validation
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	}
	@AfterTest
	public void appClose()
	{
	driver.close();
	}
}
