package com.vasu.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void afterMethod()
	{
		System.out.println("AfterTest Executed");
	}
/*@BeforeMethod
public void beforeMethod()
{
	System.out.println("BeforeMethod Executed");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("AfterMethod Executed");
}*/
	
}
