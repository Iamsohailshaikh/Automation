package SQA;

import java.util.*;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class AuTo {
	///Hello world   
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
   // System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    //driver.get("http://www.amazon.com/");  
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D55759171661%26hvpone%3D%26hvptwo%3D%26hvadid%3D294135909733%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17678997876737947347%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301185%26hvtargid%3Dkwd-298479560553%26hydadcr%3D5840_1738694%26gclid%3DCj0KCQiAys2MBhDOARIsAFf1D1dsWCdpizd85gQTpma6SW6GSyVgXTCVOLuLFSpFqf3-FGstPr1bjWIaAgP9EALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");   
    driver.findElement(By.id("ap_email")).sendKeys("9769757619");  
    
    driver.findElement(By.id("continue")).click();
      driver.findElement(By.name("password")).sendKeys("sohu7738");    
      driver.findElement(By.id("signInSubmit")).click();
      
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("adidas football shoes for men");
      
     driver.findElement(By.id("nav-search-submit-button")).click();
    
     List<WebElement> product=driver.findElements(By.id("productTitle"));
    
     for(int i=0;i<product.size();i++) 
     {
    	String name = product.get(i).getText();
    
    	if (name.contains("Adidas Freak .3 Fg Football Shoe"))
    	{
    	 driver.findElement(By.id("//button[text()='Add to Cart']"));
    	}
     }
    }
}  
