package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		
		
		
		WebElement shop=driver.findElement(By.xpath("//*[@id='nav-shop']"));
		WebElement prime=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		WebElement video=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[4]/a[1]/span[1]"));
		
		Actions chain=new Actions(driver);
		chain.moveToElement(shop).moveToElement(prime)
		.pause(2000).moveToElement(video).click().build().perform();
		

	}

}
