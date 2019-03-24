package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("VasuDeva");
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("t2dX1c")).sendKeys(Keys.CONTROL+"v");

	}

}
