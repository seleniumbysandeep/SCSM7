package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String color = link.getCssValue("color");
		String fontType = link.getCssValue("font-family");
		String fontsize = link.getCssValue("font-size");
		System.out.println(color);
		System.out.println(fontType);
		System.out.println(fontsize);
		driver.close();
	}

}
