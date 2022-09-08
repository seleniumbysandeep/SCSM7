package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetXAndYAxis {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point login = driver.findElement(By.name("login")).getLocation();
		int x = login.getX();
		int y = login.getY();
		System.out.println("x axis = "+x);
		System.out.println("y axis = "+y);
		driver.close();
	}

}
