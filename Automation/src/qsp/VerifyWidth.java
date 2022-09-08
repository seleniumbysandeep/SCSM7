package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWidth {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	int width1 = driver.findElement(By.id("username")).getSize().getWidth();
	int width2 = driver.findElement(By.name("pwd")).getSize().getWidth();
	if(width1==width2) {
		System.out.println("username and password width are same");
	}
	else {
		System.out.println("username and password width are not same");
	}
	driver.close();
	}
}
