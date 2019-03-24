package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country=driver.findElement(By.name("country"));
		List<WebElement> countryList=country.findElements(By.tagName("option"));
		System.out.println(countryList.size());
		for (int i = 0; i < countryList.size(); i++)
		{
			countryList.get(i).click();
			//Validation
			if (countryList.get(i).isSelected()) 
			{
				System.out.println(countryList.get(i).getText()+" : is selected");
			}else
			{
				System.out.println(countryList.get(i).getText()+" : is not selected");	
			}
		}
	}

}
