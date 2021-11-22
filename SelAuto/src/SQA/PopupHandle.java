package SQA;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class PopupHandle {

	public static void main(String[] args) {
		

	WebDriver driver=new ChromeDriver();  
    
	
	   driver.get("http://html.com/input-type-file/");  
	   driver.findElement(By.name("fileupload")).sendKeys("/home/sohail.shaikh/chromedriver");

}
}