package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest2
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++)
		{
			//System.out.println(dropList.get(i).getText());
			if (dropList.get(i).getText().equals("Books"))
			{
				dropList.get(i).click();
			}
		}
		
		

	}

}
