package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		
		sl.selectByIndex(26);
		//sl.selectByVisibleText("Books");
		//sl.selectByValue("search-alias=appliances");
		
		/*List<WebElement> dropList=sl.getOptions();
		for (WebElement element : dropList)
		{
			System.out.println(element.getText());
			if (element.getText().equals("Baby"))
			{
			element.click();	
			}
		}*/
		
		//System.out.println(sl.isMultiple());
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		List<WebElement> selectedList=sl.getAllSelectedOptions();
		System.out.println(selectedList.size());
		for (int i = 0; i < selectedList.size(); i++) 
		{
			System.out.println(selectedList.get(i).getText());
		}
		

	}

}
