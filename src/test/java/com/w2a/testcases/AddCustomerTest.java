package com.w2a.testcases;


import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	@Test(dataProviderClass = TestUtil.class, dataProvider="dp")
	//public void addCustomerTest(String firstName, String lastName, String postCode, String alerttext, String runmode) throws InterruptedException {
		public void addCustomerTest(Hashtable<String, String> data) throws InterruptedException {
		if(!data.get("runmode").equals("Y")) {
			
			throw new SkipException("Skipping the test case as the runmode for data set is NO");
			
		}
		//driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		click("addCustBtn_CSS");
		//driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
		type("firstname_CSS",data.get("firstname"));//type("firstname_CSS",firstName);
		//driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
		type("lastname_XPATH",data.get("lastname"));
		//driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postCode);
		type("postcode_CSS",data.get("postcode"));
		//driver.findElement(By.cssSelector(OR.getProperty("addbtn"))).click();
		click("addbtn_CSS");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();
		//Assert.fail("Login not successful");
		
		
	}
	/*@DataProvider
	public Object[][] getData(){
		String sheetName="AddCustomerTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		Object[][] data = new Object[rows-1][cols];
		for(int rowNum=2;rowNum<=rows;rowNum++) {
			for(int colNum=0;colNum<cols;colNum++) {
				
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
		*/
		
		
	}
	


