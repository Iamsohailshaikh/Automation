package SQA;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 




public class ChecboxPrac {

  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
         
        WebDriver driver = new ChromeDriver();  
        driver.navigate().to("https://www.spicejet.com/");  
        driver.manage().window().maximize();
        //driver.findElement(By.className("css-1dbjc4n r-1loqt21 r-ah5dr5 r-1otgn73")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
  
driver.close();  
    }  
  
}  