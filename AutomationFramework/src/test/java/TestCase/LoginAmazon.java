package TestCase;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory; 

import  org.testng.annotations.Test;

import PageObject.LoginPage;
import Utilities.BrowserFactory;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class LoginAmazon {
	
		
		WebDriver driver;
	//	public void Main() {
		//driver = BrowserFactory.Start(driver,"Chrome","https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		@Test
		//}
		public void LoginApp() 
		{
			driver = BrowserFactory.Start(driver,"Chrome","https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			//driver =BrowserFactory.Start(driver, "Chrome", "https://www.facebook.com/");
		//driver.getTitle();
	LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	loginPage.Login("9769757619",null,"sohu7738",null);
	
	
	
	//loginPage.Login("sohailshaikh706@gmail.com","sohu7738");
		}
		
	}

