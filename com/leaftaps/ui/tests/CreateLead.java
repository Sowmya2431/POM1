package com.leaftaps.ui.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.utils.ReadExcelData;

public class CreateLead extends BaseClass {
	 
	  @Test(dataProvider="fetchData") public void runCreateLead(String
	  username,String password,String cName,String fName,String lName) {
		  driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
	  
	 driver.findElement(By.linkText("Create Lead")).click();
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	  driver.findElement(By.name("submitButton")).click();
	  
	  }
	 
	  @DataProvider(name="fetchData",indices=1) public String[][] senddata() throws
	  IOException { //row and column
	  
	  String[][]readData = ReadExcelData.readData("CreateLead"); return readData;
	  
	 
	
	  }
	  
	  
	  
	 }
/*
 * public class CreateLead extends BaseClass {
 * 
 * 
 * @BeforeTest public void setData() { excelFileName = "tc001"; }
 * 
 * @Test(dataProvider ="testData") public void test(String username,String
 * password,String cname,String fname,String lname) {
 * 
 * WebElement element = driver.findElement(By.id("username"));
 * element.sendKeys(username);
 * 
 * WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
 * passwordElement.sendKeys(password);
 * 
 * WebElement loginButton =
 * driver.findElement(By.className("decorativeSubmit")); loginButton.click();
 * 
 * WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
 * crmsfaElement.click();
 * 
 * WebElement leadElement = driver.findElement(By.linkText("Leads"));
 * leadElement.click();
 * 
 * 
 * WebElement createLeadElement =
 * driver.findElement(By.linkText("Create Lead")); createLeadElement.click();
 * 
 * WebElement companyNameElement =
 * driver.findElement(By.id("createLeadForm_companyName"));
 * companyNameElement.sendKeys(cname);
 * 
 * WebElement firstNameElement =
 * driver.findElement(By.id("createLeadForm_firstName"));
 * firstNameElement.sendKeys(fname);
 * 
 * WebElement lastNameElement =
 * driver.findElement(By.id("createLeadForm_lastName"));
 * lastNameElement.sendKeys(lname);
 * 
 * WebElement localFirstNameElement =
 * driver.findElement(By.id("createLeadForm_firstNameLocal"));
 * localFirstNameElement.sendKeys("SowmyaIBM");
 * 
 * WebElement deptNameElement = driver.findElement(By.name("departmentName"));
 * deptNameElement.sendKeys("Testing");
 * 
 * WebElement descriptionElement = driver.findElement(By.name("description"));
 * descriptionElement.sendKeys("FunctionalTesting");
 * 
 * WebElement emailElement =
 * driver.findElement(By.id("createLeadForm_primaryEmail"));
 * emailElement.sendKeys("abcedfgh@gmail.com");
 * 
 * WebElement stateElement =
 * driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); Select
 * dd = new Select(stateElement); dd.selectByVisibleText("New York");
 * 
 * WebElement createLeadElement1 =
 * driver.findElement(By.className("smallSubmit")); createLeadElement1.click();
 * 
 * System.out.println("The title is :"+ driver.getTitle());
 * 
 * }
 * 
 * @DataProvider(name = "testData") public String[][] testData() throws
 * IOException { return ReadExcelData.readData(excelFileName); }
 * 
 * 
 * }
 */