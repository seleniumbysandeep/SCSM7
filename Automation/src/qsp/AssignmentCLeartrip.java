package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCLeartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ban");
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Goa");
		driver.findElement(By.xpath("(//p[contains(text(),'Goa')])[1]")).click();
		driver.findElement(By.xpath("(//button)[4]")).click();
		driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		List<WebElement> allFlights = driver.findElements(By.xpath("//img[@class]"));
		for(int i=0;i<allFlights.size();i++) {
			String flightName = allFlights.get(i).getAttribute("alt");
			System.out.println(flightName);
		}
		
		
	}

}
