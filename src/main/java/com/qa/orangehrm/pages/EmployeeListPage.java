package com.qa.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangehrm.utils.ElementUtil;

public class EmployeeListPage {
	
	private WebDriver driver;
	ElementUtil elementUtil;
	
	//constructor
	
	public EmployeeListPage(WebDriver driver) {
		elementUtil = new ElementUtil(driver);
		this.driver = driver;
	}

	//By locators
	By header = By.tagName("h1");
	
	
	
	
	
	
}
