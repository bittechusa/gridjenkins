package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumGridTest extends BaseTest
{	
	@Test
	public void registerTest()
	{
		driver.findElement(By.id("u_0_b")).sendKeys("Asad");
	}

}
