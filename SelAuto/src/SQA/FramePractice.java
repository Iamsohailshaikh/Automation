package SQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {



	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/nested_frames");
	     driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	     driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	 //    driver.findElement(By.name("frame-bottom")).click();
  System.out.println(driver.findElement(By.id("content")).getText());
	
}
	}