package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoLocators {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/");
        WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
        Actions a=new Actions(driver);
        a.contextClick(link).sendKeys("w").build().perform();
        
	}
}
