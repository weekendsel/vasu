package com.vasu.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.accept();// ok 
		//al.dismiss();// cancel
		//al.getText();//text
		//al.sendKeys("Vasu");

	}

}
