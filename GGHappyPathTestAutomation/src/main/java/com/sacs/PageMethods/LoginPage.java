package com.sacs.PageMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.LoginPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;


public class LoginPage extends WebElements{
	private static Logger logger = Logger.getLogger(LoginPage.class);
	private static LoginPage loginpage=null;
	private BasePage basePage;
	private CustomReport customReport;
	private WebDriver driver;
	
	public LoginPage(WebDriver driver,CustomReport customReport, BasePage basePage ) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	
	public void enter_UserName(String username) {
		waitForElementPresent(LoginPageObjects.logintextbox);
		//logger.info("Username Locator is present on the page");
		enterText(LoginPageObjects.logintextbox, username);
		logger.info("Entered user name :::"+username);
	}
	public boolean enter_UserNameIsDisplayed() {
		waitForElementPresent(LoginPageObjects.logintextbox);
		//logger.info("Username Locator is present on the page");
		return isDisplayedWithoutException(LoginPageObjects.logintextbox);
	}
	public void enter_Password(String password) {
		waitForElementPresent(LoginPageObjects.passwordtextbox);
		//logger.info("Password Locator is present on the page");
		enterText(LoginPageObjects.passwordtextbox, password);
		logger.info("Entered Password :::"+password);
	}
	
	public HomePage click_Submit() {
		waitForElementPresent(LoginPageObjects.submitbutton);
		logger.info("Submit button is visible on the page");
		click(LoginPageObjects.submitbutton);
		customReport.reporter("Submit button clicked on login page","");
		logger.info("Submit button is visible on the page");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public HomePage login(String username,String password) {
		enter_UserName(username);
		customReport.reporter("Entered userName is ", username);
		enter_Password(password);
		customReport.reporter("Entered Password is ", password);
		waitForElementPresent(LoginPageObjects.submitbutton);
		click(LoginPageObjects.submitbutton);
		logger.info("Clicked on Submit button");
		customReport.reporter("Submit button clicked on login page","");
		waitForElementPresent(HomePageObjects.homelinktext);
		logger.info("Home Link Text is visible on the page");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	
	
	
	
}
