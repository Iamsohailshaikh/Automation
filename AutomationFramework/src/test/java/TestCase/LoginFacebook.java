package TestCase;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory; 

import  org.testng.annotations.Test;

import PageObject.Facebook;
import Utilities.BrowserFactory;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class LoginFacebook {
	
		
		WebDriver driver;
	
		@Test
		
		public void LoginApp() 
		{
			
			driver =BrowserFactory.Start(driver, "Chrome", "https://www.facebook.com/");
	
	Facebook loginPage=PageFactory.initElements(driver,Facebook.class);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	loginPage.login("9769757619","sohu7738",null);
	
	
	
		}
		
	}
