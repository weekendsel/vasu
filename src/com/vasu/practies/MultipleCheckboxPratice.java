package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckboxPratice 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List <WebElement> checkBoxes = table.findElements(By.tagName("input"));
		System.out.println(checkBoxes.size());
		
		for (int i = 0; i < checkBoxes.size(); i++)
		{
			checkBoxes.get(i).click();
			for (int j = 0; j < checkBoxes.size(); j++) 
			{
				System.out.println(checkBoxes.get(j).getAttribute("checked")+"---"+checkBoxes.get(j).getAttribute("value"));
			}
			System.out.println("#########");
		}
		
	}

}
