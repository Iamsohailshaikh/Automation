package SQA;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class Dropdown {



		  
	    public static void main(String[] args) throws InterruptedException { 
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.spicejet.com/");
     driver.manage().window().maximize();  
     driver.findElement(By.cssSelector("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
     
     driver.findElement(By.className("css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid")).click();
     driver.findElement(By.className("css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid")).click();
     driver.findElement(By.className("1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73")).click();
	    }
}