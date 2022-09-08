package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMailAssignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String url = driver.getCurrentUrl();
		if(url.contains("google.com")) {
			System.out.println("url is containing  google.com so pass");
		}
		else {
			System.out.println("url is not containing  google.com so failed");
		}
		driver.close();
	}
}
