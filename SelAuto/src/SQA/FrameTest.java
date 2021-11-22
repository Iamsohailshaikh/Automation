package SQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.get("http://jqueryui.com/droppable/");
	     driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	     driver.findElement(By.id("draggable")).click();
}
}