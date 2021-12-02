package PageObject;

import  org.testng.annotations.Test;

import Utilities.BrowserFactory;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class LoginPage{
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {

		this.driver=driver;		
}
	private By userNameTextbox=By.id("ap_email");
	private By ContinueButton=By.id("continue");
	private By PasswordTextbox=By.id("ap_password");
	private By signInSubmit=By.id("signInSubmit");	
	
	
	public void Login(String userName , String Continue ,String password,String signIn) 
	{
	this.setUserName(userName);
	this.setContinue(Continue);
	this.setPassword(password);
	this.clicksignIn(signIn);

	}

	
	public void setUserName(String userName) {
	driver.findElement(userNameTextbox).sendKeys(userName);
}
public void setContinue(String Continue) {
	driver.findElement(ContinueButton).click();
}
/*try {
Thread.sleep(2000);
}
catch( InterruptedException e) {}
}*/
public void setPassword(String password) {
	driver.findElement(PasswordTextbox).sendKeys(password);
	
}
 public void clicksignIn(String signIn) 
 {
	 driver.findElement(signInSubmit).click();
 }
 }

