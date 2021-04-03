package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		/*
		 * try { Assert.assertEquals("abc", "xyz"); } catch(Throwable t){
		 * System.out.println("Inside catch");
		 * 
		 * }
		 */
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		click("bmlBtn_CSS");
		log.debug("Clicked on  BankManager Login button");
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))));
		//Assert.fail("Login not successful");
		
		
	}

	
}
