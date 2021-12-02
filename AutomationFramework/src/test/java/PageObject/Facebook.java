package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook {
WebDriver driver;
	
	public Facebook(WebDriver driver) {

		this.driver=driver;
		}
	
	private By userNameTextbox=By.id("email");
	private By PasswordTextbox=By.id("passContainer");
	private By signInSubmit=By.name("login");	
	
	public void login(String userName ,String password,String signIn){

		this.setUserName(userName);		
		this.setPassword(password);
		this.clicksignIn(signIn);
	}
	public void setUserName(String userName) {
	driver.findElement(userNameTextbox).sendKeys(userName);
	}
public void setPassword(String password) {
	driver.findElement(PasswordTextbox).sendKeys(password);
	}
	 public void clicksignIn(String signIn) {
	 driver.findElement(signInSubmit).click();


	}
}
