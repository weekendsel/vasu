package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> list=
				driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15')]/li/span"));
for (WebElement element : list) {
	System.out.println(element.getText());
}
	}

}
