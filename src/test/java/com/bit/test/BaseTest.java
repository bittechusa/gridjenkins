package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest 
{
	public static WebDriver driver;
	
	@Before
	public void startBrowser() throws Exception
	{
		 //System.setProperty("webdriver.chrome.driver", "/Users/a576627/Documents/driver/chromedriver");
		 //DesiredCapabilities capability = DesiredCapabilities.firefox();
	     //driver = new RemoteWebDriver(new URL("http://172.20.163.248:4444/wd/hub"), capability);
		 driver = new FirefoxDriver();
	     driver.get("http://www.facebook.com");
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}
	

}
