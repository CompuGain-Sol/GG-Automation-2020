package com.sacs.PageMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.AdditionalPurchasesPageObjects;
import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.PurchaseOrderRecieptPageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.VendorInvoiceEntryPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.PageObjects.VendorsPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class HomePage extends WebElements {
	private static Logger logger = Logger.getLogger(HomePage.class);
	private static HomePage homePage=null;
	private CustomReport customReport;
	private BasePage basePage;
	private WebDriver driver;
	

	public HomePage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void click_UnitDropDown(){
        click(HomePageObjects.materialmangementlinktext);
        logger.info("Clicked on Material management ");
        waitForElementPresent(HomePageObjects.vendorslinktext);
        click(HomePageObjects.workingunitdropdown);
        logger.info("Clicked on Working Unit DropDown ");
    }
	
    public void select_Master(String masterunit) {
        click_UnitDropDown();
        By master=By.xpath("//option[contains(text(),'"+masterunit+"')]");
        click(master);
        logger.info("The Master Unit Selected is ::::"+masterunit);
    }
    
    public void select_UnitFromUnit(String masterunit) {
    	waitForElementPresent(HomePageObjects.workingunitdropdown);
    	selectValuefromDropDownWithOutWait(HomePageObjects.workingunitdropdown, masterunit);
         logger.info("The Master Unit Selected is ::::"+masterunit);
	}
    
	public void select_Unit(String unit) {
		waitForElementPresent(HomePageObjects.workingunitdropdown);
		selectValuefromDropDown(HomePageObjects.workingunitdropdown, unit);
		logger.info("The Master Unit Selected is ::::"+unit);
	}
	
	public VendorsPage navigate_VendorsPage() {
		click_MaterialMangement();
		return click_Vendors();
	}
	
	public BasicArticlesPage navigate_BasicArticlePage() {
		click_MaterialMangement();
		return click_BasicArticle();
	}
	
	public PurchaseOrderRecieptPage navigate_PurchaseOrderRecieptPage() {
		click_Stores();
		return click_PurchaseOrderReciept();
	}
	
	public VendorInvoiceEntryPage navigate_VendorInvoiceEntry() {
		click_Finance();
		click_UpdateStandardPrice();
		return click_VendorInvoiceEntry();
	}
	
	public AdditionalPurchasesPage navigate_AdditionalPurchases() {
		click_MaterialMangement();
		return click_AdditionalPurchases();
	}
	
	public PurchaseOrderRegistrationPage navigate_PurchaseOrderRegistrationPage() {
		click_MaterialMangement();
		return click_PurchaseOrderRegistrationPage();
	}
	
	public ReturnToVendorPage navigate_ReturnVendorPage() {
		click_Stores();
		return click_ReturnToVendor();
	}
	
	public void click_MaterialMangement() {
		waitForElementPresent(HomePageObjects.materialmangementlinktext);
		//logger.info("Material Management LinkText is present on the page");
		click(HomePageObjects.materialmangementlinktext);
		logger.info("Clicked on Material Management LinkText");
	}
	
	public VendorsPage click_Vendors() {
		waitForElementPresent(HomePageObjects.vendorslinktext);
		//logger.info("Vendors LinkText is present on the page");
		click(HomePageObjects.vendorslinktext);
		logger.info("Clicked on Vendors LinkText");
		waitForElementPresent(VendorsPageObjects.addvendorbutton);
		//logger.info("Add Vendor button is visible on the page");
		return basePage.vendorspage(driver, customReport, basePage);
	}
	
	public BasicArticlesPage click_BasicArticle() {
		waitForElement(HomePageObjects.basicarticlelinktext);
		click(HomePageObjects.basicarticlelinktext);
		logger.info("Clicked on Basic Article link text");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
		//logger.info("Search text box is visible on the page");
		pause(2000);
		return basePage.basicArticlesPage(driver, customReport, basePage);
	}
	
	public void click_Stores() {
		waitForElement(HomePageObjects.storeslinktext);
		click(HomePageObjects.storeslinktext);
		logger.info("Clicked on Stores Link");
		waitForElementPresent(HomePageObjects.purchaseorderreciept);
	}
	
	public PurchaseOrderRecieptPage click_PurchaseOrderReciept() {
		waitForElementPresent(HomePageObjects.purchaseorderreciept);
		click(HomePageObjects.purchaseorderreciept);
		logger.info("Clicked on purchase order reciept");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.searchorderbyvendorbutton);
		return basePage.purchaseOrderRecieptPage(driver, customReport, basePage);
	}
	
	public void click_Finance() {
		waitForElementPresent(HomePageObjects.financelinktext);
		click_ElementAfterFocus(HomePageObjects.financelinktext);
		logger.info("Clicked on Finance Link Text");
		pause(3000);
	}
	
	public VendorInvoiceEntryPage click_VendorInvoiceEntry() {
		waitForElementPresent(HomePageObjects.vendorinvoiceentrylinktext);
		pause(3000);
		click(HomePageObjects.vendorinvoiceentrylinktext);
		logger.info("Clicked on vendor Invoice Entry Link Text");
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoiceedierrorsbutton);
		return basePage.vendorInvoiceEntryPage(driver, customReport, basePage);
	}
	
	public void click_UpdateStandardPrice() {
		waitForElementPresent(HomePageObjects.updatestandardpricelinktext);
		pause(2000);
		click(HomePageObjects.updatestandardpricelinktext);
		logger.info("Clicked on Update Standard Price Link Text");
	}
	
	public AdditionalPurchasesPage click_AdditionalPurchases() {
		waitForElementPresent(HomePageObjects.additionalpurchaseslinktext);
		click(HomePageObjects.additionalpurchaseslinktext);
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
		return basePage.additionalPurchasesPage(driver, customReport, basePage);
	}
	
	public PurchaseOrderRegistrationPage click_PurchaseOrderRegistrationPage() {
		waitForElementPresent(HomePageObjects.purchaseorderregidtrationlinktext);
		click(HomePageObjects.purchaseorderregidtrationlinktext);
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		return basePage.purchaseOrderRegistrationPage(driver, customReport, basePage);
	}
	
	
	public ReturnToVendorPage click_ReturnToVendor() {
		waitForElementPresent(HomePageObjects.returntovendorlinktext);
		click(HomePageObjects.returntovendorlinktext);
		logger.info("Clicked on Return to Vendor");
		waitForElementPresent(AdditionalPurchasesPageObjects.createorderbutton);
		return basePage.returnToVendorPage(driver, customReport, basePage);
	}
	
	
}
