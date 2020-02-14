package com.sacs.plt.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sacs.PageMethods.AdditionalPurchasesPage;
import com.sacs.PageMethods.AirlineOwnedPurchasesPage;
import com.sacs.PageMethods.BasicArticlesPage;
import com.sacs.PageMethods.HomePage;
import com.sacs.PageMethods.LoginPage;
import com.sacs.PageMethods.PurchaseOrderRecieptPage;
import com.sacs.PageMethods.PurchaseOrderRegistrationPage;
import com.sacs.PageMethods.ReturnToVendorPage;
import com.sacs.PageMethods.VendorInvoiceEntryPage;
import com.sacs.PageMethods.VendorsPage;
import com.sacs.PageObjects.VendorsPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.beanfactory.BeanFactory;
import com.sacs.dao.AddCreditDebitNoteBeanPage;
import com.sacs.dao.BasicArticlesBeanPage;
import com.sacs.dao.VendorBeanPage;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.TestBase;

public class PLTFlows_POCTestCases extends TestBase{

	private static Logger logger = Logger.getLogger(PLTFlow_TestCases.class);
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
	public void Verify_PLTFLOW_RegularVendor_Airline_NonNominated_PO_TC1(){
		sTestcaseName = new Object() {}.getClass().getEnclosingMethod().getName();
		logger.info("The Test Case Name is ::::::::"+sTestcaseName);
		WebDriver driver=initializeDriver(browser);
		driver.manage().window().maximize();
		launchURL(surl, driver);
		basePage = new BasePage(driver, customReport,new BasePage());
		loginpage=basePage.loginpage(driver, customReport, basePage);
		String username="amastan@gategroup.com";
		String password="Apjak@1930";
		customReport.customizedReport(true, loginpage.enter_UserNameIsDisplayed(), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");		
		customReport.customizedReport(false, loginpage.enter_UserNameIsDisplayed(), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");		
		HomePage homePage = loginpage.login(username, password);
		homePage.select_Master(masterUnit);
		VendorsPage vendorsPage=homePage.navigate_VendorsPage();
		VendorBeanPage vendorbeans= new VendorBeanPage();
		accountBeansFactory.createVendorBeans(vendorbeans);
		String vendorname=vendorsPage.create_VendorWithManditFields(vendorbeans);
		BasicArticlesPage basicArticlesPage=vendorsPage.navigate_BasicArticleFromVendors();
		BasicArticlesBeanPage basicArticlesbeans=new BasicArticlesBeanPage();
		accountBeansFactory.createBasicArticle(basicArticlesbeans);
		basicArticlesPage.create_BasicArticleNonNominated_AirLine_AssignVendor(basicArticlesbeans, vendorname);
		basicArticlesPage.click_ApplyChanges();
		basicArticlesPage.select_Unit(countryUnit);
		homePage.navigate_BasicArticlePage();
		basicArticlesPage.search_BasicArticle(basicArticlesbeans);
		basicArticlesPage.assign_SubStoreBasicArticleUnitLevelForAirLine();
		PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=basicArticlesPage.navigate_PurchaseOrderRegistration();
		purchaseOrderRegistrationPage.searchAndSelectVendor(vendorname, bundle.getString("fromvendorpriceagreement"));
		customReport.customizedReport(0, purchaseOrderRegistrationPage.verify_AddArticleCheckbox(), statusValue, driver, sTestcaseName, "Verifying Check box for add article which should not present");
		AirlineOwnedPurchasesPage airlineOwnedPurchasesPage=purchaseOrderRegistrationPage.navigate_AirlineOwnedPurchasesSearch();
		purchaseOrderRegistrationPage.searchAndSelectVendorAirLineOwnedPurchases(vendorname, bundle.getString("connectedtovendor"));
		customReport.customizedReport(bundle.getString("posubmitmessage"), basicArticlesPage.getText(VendorsPageObjects.toastmessage), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");
		purchaseOrderRegistrationPage.click_ConformationOK();
		purchaseOrderRegistrationPage.very_PORegistartionSubmitted(vendorname);
		customReport.customizedReport(bundle.getString("submittedmessage"), airlineOwnedPurchasesPage.verify_AirLineOwnedPurchasesPOSubmittedText(), statusValue, driver, sTestcaseName, "Verifying AirLine Owned Purchase PO submission message as Submitted");
		purchaseOrderRegistrationPage.click_NavigateBack();
		PurchaseOrderRecieptPage purchaseOrderRecieptPage=homePage.navigate_PurchaseOrderRecieptPage();
		purchaseOrderRecieptPage.submit_OrderReciept(vendorname);
		customReport.customizedReport(bundle.getString("recievedmessage"), purchaseOrderRecieptPage.verify_Status(), statusValue, driver, sTestcaseName, "Verifying Purchase Order Reciept Recieve Message");
		customReport.checkinglist(statusValue);
		browserQuit(driver);
	}
	
	@Test       
	public void Verify_PLTFLOW_RegularVendor_Airline_NonNominated_PO_TC2(){
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
		VendorsPage vendorsPage=homePage.navigate_VendorsPage();
		VendorBeanPage vendorbeans= new VendorBeanPage();
		accountBeansFactory.createVendorBeans(vendorbeans);
		String vendorname=vendorsPage.create_VendorWithManditFields(vendorbeans);
		BasicArticlesPage basicArticlesPage=vendorsPage.navigate_BasicArticleFromVendors();
		BasicArticlesBeanPage basicArticlesbeans=new BasicArticlesBeanPage();
		accountBeansFactory.createBasicArticle(basicArticlesbeans);
		basicArticlesPage.create_BasicArticleNonNominated_AirLine_AssignVendor(basicArticlesbeans, vendorname);
		basicArticlesPage.click_ApplyChanges();
		basicArticlesPage.select_Unit(countryUnit);
		homePage.navigate_BasicArticlePage();
		basicArticlesPage.search_BasicArticle(basicArticlesbeans);
		basicArticlesPage.assign_SubStoreBasicArticleUnitLevelForAirLine();
		PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=basicArticlesPage.navigate_PurchaseOrderRegistration();
		purchaseOrderRegistrationPage.searchAndSelectVendor(vendorname, bundle.getString("fromvendorpriceagreement"));
		customReport.customizedReport(0, purchaseOrderRegistrationPage.verify_AddArticleCheckbox(), statusValue, driver, sTestcaseName, "Verifying Check box for add article which should not present");
		AirlineOwnedPurchasesPage airlineOwnedPurchasesPage=purchaseOrderRegistrationPage.navigate_AirlineOwnedPurchasesSearch();
		purchaseOrderRegistrationPage.searchAndSelectVendorAirLineOwnedPurchases(vendorname, bundle.getString("connectedtovendor"));
		customReport.customizedReport(bundle.getString("posubmitmessage"), basicArticlesPage.getText(VendorsPageObjects.toastmessage), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");
		browserQuit(driver);	
	}
	
	@Test       
	public void Verify_PLTFLOW_RegularVendor_Airline_NonNominated_PO_TC3(){
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
		VendorsPage vendorsPage=homePage.navigate_VendorsPage();
		VendorBeanPage vendorbeans= new VendorBeanPage();
		accountBeansFactory.createVendorBeans(vendorbeans);
		String vendorname=vendorsPage.create_VendorWithManditFields(vendorbeans);
		BasicArticlesPage basicArticlesPage=vendorsPage.navigate_BasicArticleFromVendors();
		BasicArticlesBeanPage basicArticlesbeans=new BasicArticlesBeanPage();
		accountBeansFactory.createBasicArticle(basicArticlesbeans);
		basicArticlesPage.create_BasicArticleNonNominated_AirLine_AssignVendor(basicArticlesbeans, vendorname);
		basicArticlesPage.click_ApplyChanges();
		basicArticlesPage.select_Unit(countryUnit);
		homePage.navigate_BasicArticlePage();
		basicArticlesPage.search_BasicArticle(basicArticlesbeans);
		basicArticlesPage.assign_SubStoreBasicArticleUnitLevelForAirLine();
		PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=basicArticlesPage.navigate_PurchaseOrderRegistration();
		purchaseOrderRegistrationPage.searchAndSelectVendor(vendorname, bundle.getString("fromvendorpriceagreement"));
		customReport.customizedReport(0, purchaseOrderRegistrationPage.verify_AddArticleCheckbox(), statusValue, driver, sTestcaseName, "Verifying Check box for add article which should not present");
		AirlineOwnedPurchasesPage airlineOwnedPurchasesPage=purchaseOrderRegistrationPage.navigate_AirlineOwnedPurchasesSearch();
		purchaseOrderRegistrationPage.searchAndSelectVendorAirLineOwnedPurchases(vendorname, bundle.getString("connectedtovendor"));
		customReport.customizedReport(bundle.getString("posubmitmessage"), basicArticlesPage.getText(VendorsPageObjects.toastmessage), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");
		purchaseOrderRegistrationPage.click_ConformationOK();
		purchaseOrderRegistrationPage.very_PORegistartionSubmitted(vendorname);
		customReport.customizedReport(bundle.getString("submittedmessage"), airlineOwnedPurchasesPage.verify_AirLineOwnedPurchasesPOSubmittedText(), statusValue, driver, sTestcaseName, "Verifying AirLine Owned Purchase PO submission message as Submitted");
		browserQuit(driver);
	}
	
	@Test       
	public void Verify_PLTFLOW_RegularVendor_Airline_NonNominated_PO_TC4(){
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
		VendorsPage vendorsPage=homePage.navigate_VendorsPage();
		VendorBeanPage vendorbeans= new VendorBeanPage();
		accountBeansFactory.createVendorBeans(vendorbeans);
		String vendorname=vendorsPage.create_VendorWithManditFields(vendorbeans);
		BasicArticlesPage basicArticlesPage=vendorsPage.navigate_BasicArticleFromVendors();
		BasicArticlesBeanPage basicArticlesbeans=new BasicArticlesBeanPage();
		accountBeansFactory.createBasicArticle(basicArticlesbeans);
		basicArticlesPage.create_BasicArticleNonNominated_AirLine_AssignVendor(basicArticlesbeans, vendorname);
		basicArticlesPage.click_ApplyChanges();
		basicArticlesPage.select_Unit(countryUnit);
		homePage.navigate_BasicArticlePage();
		basicArticlesPage.search_BasicArticle(basicArticlesbeans);
		basicArticlesPage.assign_SubStoreBasicArticleUnitLevelForAirLine();
		PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=basicArticlesPage.navigate_PurchaseOrderRegistration();
		purchaseOrderRegistrationPage.searchAndSelectVendor(vendorname, bundle.getString("fromvendorpriceagreement"));
		customReport.customizedReport(0, purchaseOrderRegistrationPage.verify_AddArticleCheckbox(), statusValue, driver, sTestcaseName, "Verifying Check box for add article which should not present");
		AirlineOwnedPurchasesPage airlineOwnedPurchasesPage=purchaseOrderRegistrationPage.navigate_AirlineOwnedPurchasesSearch();
		purchaseOrderRegistrationPage.searchAndSelectVendorAirLineOwnedPurchases(vendorname, bundle.getString("connectedtovendor"));
		customReport.customizedReport(bundle.getString("posubmitmessage"), basicArticlesPage.getText(VendorsPageObjects.toastmessage), statusValue, driver, sTestcaseName, "Verifying Sucessfully created PO toast message");
		purchaseOrderRegistrationPage.click_ConformationOK();
		purchaseOrderRegistrationPage.very_PORegistartionSubmitted(vendorname);
		customReport.customizedReport(bundle.getString("submittedmessage"), airlineOwnedPurchasesPage.verify_AirLineOwnedPurchasesPOSubmittedText(), statusValue, driver, sTestcaseName, "Verifying AirLine Owned Purchase PO submission message as Submitted");
		purchaseOrderRegistrationPage.click_NavigateBack();
		PurchaseOrderRecieptPage purchaseOrderRecieptPage=homePage.navigate_PurchaseOrderRecieptPage();
		purchaseOrderRecieptPage.submit_OrderReciept(vendorname);
		customReport.customizedReport(bundle.getString("recievedmessage"), purchaseOrderRecieptPage.verify_Status(), statusValue, driver, sTestcaseName, "Verifying Purchase Order Reciept Recieve Message");
		customReport.checkinglist(statusValue);
		browserQuit(driver);
	}
	
	
	//@AfterMethod(alwaysRun = true)
	public void browserClose(ITestResult result) {
		logger.info("In After method class");
		statusValue.clear();
		
		if (!result.isSuccess()) {
			Reporter.log("Screen shot for failed Test Case"+ customReport.AssertionresultOutput(driver, sTestcaseName));
		}
		browserQuit(driver);
	}
}
