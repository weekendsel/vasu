package com.vasu.practies;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class HomePageElements {
	//FirefoxDriver driver;
	ChromeDriver driver;
	String res;
	// application navigation
	public String navigateUrl() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\demo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		if (driver.findElement(By.id("txtuId")).isDisplayed()) {
			res = "true";
		} else {
			res = "false";
		}
		return res;
	}
	// Listing all the web elements
	public void listEelements() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement wls : links) {
			if (!wls.getText().isEmpty()) {
				System.out.println(wls.getText());
			}
		}
	}
	
	public String loginDetails(String name,String paswd){
		
		
		Select s=new Select(driver.findElement(By.name("drlist")));
		s.selectByValue("ECILBranch");
		driver.findElement(By.name("txtuId")).sendKeys(name);
		/*driver.findElement(By.name("txtuId")).clear();*/
		
	 /*driver.findElement(By.name("txtuId")).sendKeys(Keys.CONTROL+"a");*/
	WebElement ws=driver.findElement(By.name("txtuId"));
	 Actions ac=new Actions(driver);
		ac.doubleClick(ws).sendKeys(Keys.DELETE).build().perform();
		
		driver.findElement(By.name("txtuId")).sendKeys(name);
		driver.findElement(By.name("txtPword")).sendKeys(paswd);
		driver.findElement(By.name("login")).click();
		if(driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			
			res="true";
			
		}
		else{
			res="false";
			System.out.println("login failed");
		}
	return res;
	}
	public String creationBranch(String name,String Addr,String Zipcode1,String cntry){
		System.out.println("entered");
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.className("BtnNewBR")).click();
	driver.findElement(By.name("txtbName")).sendKeys(name);
	WebElement t=driver.findElement(By.name("txtbName"));
	Actions as=new Actions(driver);
	as.doubleClick(t).sendKeys(Keys.CLEAR).build().perform();
	driver.findElement(By.name("txtbName")).sendKeys(name);
	driver.findElement(By.name("txtbName")).sendKeys(Addr);
	driver.findElement(By.name("txtbName")).sendKeys(Zipcode1);
	driver.findElement(By.name("txtbName")).sendKeys(cntry);
	Select i=new Select(driver.findElement(By.name("lst_stateI")));
	i.selectByValue("Andhra Pradesh");
	Select j=new Select(driver.findElement(By.name("lst_cityI")));
	j.selectByValue("secundarabad");
	driver.findElement(By.name("btn_insert")).click();
		
		return res;
		
	}
	public void closeApp() {
	driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// browser navigation
		HomePageElements adml = new HomePageElements();
		System.out.println(adml.navigateUrl());
	// Listing all the webelemets
		System.out.println(adml.loginDetails("Admin","Admin"));
		adml.listEelements();
		
		//Login to the application using admin
		//System.out.println(adml.loginDetails("Admin","Admin"));
		
		//Branch creation
		String rest=adml.creationBranch("BranchS.r nagar","Mehdipatnam","50234","INDIA");
		System.out.println(rest);
		
		// closing the browser
		//adml.closeApp();*/
	}
}
