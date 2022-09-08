package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tag = driver.findElement(By.linkText("actiTIME Inc.")).getTagName();
		if(tag.equals("a")) {
			System.out.println("tagname is A so pass");
		}
		else {
			System.out.println("tagname is not A so failed");
		}
		driver.close();
	}
}
