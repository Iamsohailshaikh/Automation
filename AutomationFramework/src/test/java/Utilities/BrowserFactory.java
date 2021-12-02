package Utilities;


import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

 public class BrowserFactory{
	
	
	public static WebDriver Start(WebDriver driver,String browserName, String AppURL) 
	{
	if (browserName.equals("Chrome")) 
	{	
		driver=new ChromeDriver();
	}
	
	else if(browserName.equals("Firefox")) 
	{
		driver=new FirefoxDriver();	
	}	
	else 
	{
	System.out.println("We do not support this browser");	
	}
	driver.manage().window().maximize();
	driver.get(AppURL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	return driver; 
	}
	public static void Quit(WebDriver driver)
	{
	driver.quit();	
	}
	}




