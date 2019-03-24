package com.vasu.testng;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.eclipse.jdt.internal.compiler.ast.IfStatement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation 
{
@Test
public void validation()
{
	String data="Selenium Training";
	String data1="Selenium Training";
	
	Assert.assertEquals(data, data1);
	//or
	//Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
}
}
