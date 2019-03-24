package com.vasu.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Primusbank
{
	ChromeDriver driver;
	String res;
//appLaunch
	public String  appLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validate
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	
	public String appLogin(String userName,String pwd)
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//validation
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//branchCreation
	public String branchCreation(String branchName,String address1) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(address1);
		driver.findElement(By.id("txtZip")).sendKeys("77777");
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		driver.findElement(By.id("btn_insert")).click();
		//Alert
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		//validation
		if (msg.contains("created Sucessfully"))
		{
			
			res="Pass";
		}else if(msg.contains("already Exist"))
		{
			res="Fail";
		}else if(msg.contains("Please fill in"))
		{
			res="Warning";
		}
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();;
		return res;
	}
	//appLogout
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	public static void main(String[] args) throws Exception 
	{
		Primusbank app=new Primusbank();

		//appLaunch
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appClose();
		//appLogin
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin","Admin");
		app.appLogout();
		app.appClose();
		//branchCreation
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin","Admin");
		app.branchCreation("Selenium12", "Qedge123");
		app.appLogout();
		app.appClose();
		//dele
	}

}
