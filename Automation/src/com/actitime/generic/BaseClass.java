package com.actitime.generic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static  WebDriver driver;	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		Reporter.log("Open Browser",true);	
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	@AfterTest
	public void closeBrowser() {
	Reporter.log("Close Browser",true);
	driver.close();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin", "manager");
	}	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}






