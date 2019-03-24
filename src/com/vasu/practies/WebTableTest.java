package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		
		//rows 
		List<WebElement> rows=
				driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		//System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			//col
		List<WebElement> col=	rows.get(i).findElements(By.tagName("td"));
		//System.out.println(col.size());
		
		//for (int j = 0; j < col.size(); j++) 
		//{
			System.out.println(col.get(2).getText());
		//}
		}
		

	}

}
