package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;


public class CustomerModule extends BaseClass{
	
	@Test
	public void createCustomer() throws InterruptedException {
		Reporter.log("createCustomer",true);
		Thread.sleep(4000);
		}
	@Test
	public void modifyCustomer() throws InterruptedException {
		Reporter.log("modifyCustomer",true);
		 Thread.sleep(4000);
	}
}




