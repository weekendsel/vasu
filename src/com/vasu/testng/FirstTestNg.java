package com.vasu.testng;

import org.testng.annotations.Test;

public class FirstTestNg 
{
@Test()
public void appLaunch()
{
	System.out.println("appLaunch");
}
@Test (dependsOnMethods="appLaunch") 
public void appLogin()
{
	System.out.println("appLogin");
}
@Test (dependsOnMethods="appLogin") 
public void appClose()
{
	System.out.println("appClose");
}

}
