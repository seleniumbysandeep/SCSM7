package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");			
			WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
			Actions a=new Actions(driver);
			a.contextClick(link).perform();
			Thread.sleep(1000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_W);
	}

}
