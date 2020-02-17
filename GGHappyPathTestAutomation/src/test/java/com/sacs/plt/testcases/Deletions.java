package com.sacs.plt.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sacs.PageMethods.BasicArticlesPage;
import com.sacs.PageMethods.HomePage;
import com.sacs.PageMethods.LoginPage;
import com.sacs.PageMethods.VendorsPage;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.beanfactory.BeanFactory;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.TestBase;

public class Deletions extends TestBase{
	private static Logger logger = Logger.getLogger(Deletions.class);

	private LoginPage loginpage;
	private List<String> statusValue;
	private CustomReport customReport;
	private String sTestcaseName;
	private ResourceBundle bundle;
	private Locale locale;
	private BeanFactory accountBeansFactory;
	private BasePage basePage;
	private WebDriver driver;
	
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass(){
		statusValue = new ArrayList<String>();
		customReport = new CustomReport();
		accountBeansFactory = new BeanFactory();
		locale = new Locale(language);
	}
	
	@BeforeMethod(alwaysRun = true)
	@Parameters(value = { "sbrowser", "sgrid"})
	public void setUP() {
		bundle = ResourceBundle.getBundle("ResourceBundle.BundleFile", locale);
		//logger.info("value in bundle is" + bundle.getKeys());
		customReport.reset();
	}
	
	@Test
	public void delte_BasicArticles() {
		sTestcaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		logger.info("The Test Case Name is ::::::::"+sTestcaseName);
		WebDriver driver=initializeDriver(browser);
		driver.manage().window().maximize();
		launchURL(surl, driver);
		basePage = new BasePage(driver, customReport,new BasePage());
		loginpage=basePage.loginpage(driver, customReport, basePage);
		String username="amastan@gategroup.com";
		String password="Apjak@1930";
		HomePage homePage = loginpage.login(username, password);
		homePage.select_Master(masterUnit);
		BasicArticlesPage basicArticlesPage=homePage.navigate_BasicArticlePage();
		basicArticlesPage.delete_AllAutoArticles();

	}
	
}
