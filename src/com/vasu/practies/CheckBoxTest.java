package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement check=driver.findElement(By.id("remember"));
		//driver.findElement(By.id("remember")).click();
		System.out.println(check.getAttribute("checked"));
		System.out.println(check.getAttribute("value"));
		//validation
		if (check.isSelected()) 
		{
			check.click();
			System.out.println(check.getAttribute("checked"));
		}
	}

}
