package com.sacs.PageMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.AdditionalPurchasesPageObjects;
import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.ReturnToVendor;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.PageObjects.VendorsPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class ReturnToVendorPage extends WebElements{

	private static Logger logger = Logger.getLogger(ReturnToVendorPage.class);
	private static HomePage homePage=null;
	private CustomReport customReport;
	private BasePage basePage;
	private WebDriver driver;
	

	public ReturnToVendorPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void createReturn(String vendorname, String qty) {
		click_CreateReturn();
		enter_ToVendor(vendorname);
		enter_StockDate();
		enter_Remarks();
		click_OKAddReturnToVendor();
		click_AddArticleButton();
		click_BasicArticleCheckBox();
		click_AddSelectedButton();
		enter_ReturnQty(qty);
		click_IssueReturnButton();
		click_ContinueButtonForSubmitReturnOrderPopup();
		click_OKForSubmittedReturnOrderPopup();
		click_CancelButtonForAddVendorIncidentPopup();
		click_NavigateBack();
	}
	
	public void click_CreateReturn() {
		waitForElementPresent(AdditionalPurchasesPageObjects.createorderbutton);
		click(AdditionalPurchasesPageObjects.createorderbutton);
		logger.info("Clicked on Create Return Button");
		waitForElementPresent(ReturnToVendor.tovendortextbox);
	}
	
	public void enter_ToVendor(String vendorname) {
		waitForElementPresent(ReturnToVendor.tovendortextbox);
		enterText(ReturnToVendor.tovendortextbox, vendorname);
		logger.info("Entered Vendor Name for To Vendor is :::: "+vendorname);
		waitForElementPresent(ReturnToVendor.vendordropdownmenu);
		logger.info("Entered To Vendor Text is ::::"+vendorname);
		click(ReturnToVendor.vendordropdownmenu);
		logger.info("Clicked on Vendor for To Vendor dropdown menu");
	}
	
	public void enter_StockDate() {
		waitForElementPresent(ReturnToVendor.stockdatetextbox);
		String stockdate=DateTime.getTodayDate();
		enterText(ReturnToVendor.stockdatetextbox, stockdate);
		logger.info("Entered Date for Stock Date is ::::"+stockdate);
	}
	
	public void enter_Remarks() {
		waitForElementPresent(ReturnToVendor.remarks);
		enterText(ReturnToVendor.remarks, "Test");
		logger.info("Entered Text for remarks is ::::"+"Test");
	}
	
	public void click_OKAddReturnToVendor() {
		waitForElementPresent(VendorPriceAgreementPageObjects.okbutton);
		click(VendorPriceAgreementPageObjects.okbutton);
		logger.info("Clicked OK button on Add Return To Vendor ");
		waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
	}
	
	public void click_AddArticleButton() {
		pause(2000);
		waitForElementPresent(ReturnToVendor.addarticlebutton);
		click(ReturnToVendor.addarticlebutton);
		logger.info("Clicked on add article button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlesearchtextbox);
	}
	
	public void click_BasicArticleCheckBox() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		click(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		logger.info("Clicked Check Box for Article");
	}
	
	public void click_AddSelectedButton() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		click(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		logger.info("Clicked on the Add Selected Button");
		waitForElementPresent(ReturnToVendor.returnqtybox);
	}
	
	public void enter_ReturnQty(String qty) {
		waitForElementPresent(ReturnToVendor.returnqtybox);
		click(ReturnToVendor.returnqtybox);
		logger.info("Clicked on Return Qty box");
		waitForElementPresent(ReturnToVendor.returnqtytextbox);
		enterText(ReturnToVendor.returnqtytextbox, qty);
		logger.info("Entered Return Qty is ::::"+qty);
		pause(1000);
	}
	
	public void click_IssueReturnButton() {
		click(ReturnToVendor.issuereturnbutton);
		logger.info("Clicked on Issue Return button");
		waitForElementPresent(VendorsPageObjects.toastmessage);
	}
	
	public void click_ContinueButtonForSubmitReturnOrderPopup() {
		waitForElementPresent(ReturnToVendor.continuebuttonsubmitreturnorderpopup);
		click(ReturnToVendor.continuebuttonsubmitreturnorderpopup);
		logger.info("Clicked on Continue button for Submit Return Order Popup");
		waitForElementPresent(ReturnToVendor.okbuttonsubmittedreturnorderpopup);
	}
	
	public void click_OKForSubmittedReturnOrderPopup() {
		waitForElementPresent(ReturnToVendor.okbuttonsubmittedreturnorderpopup);
		click(ReturnToVendor.okbuttonsubmittedreturnorderpopup);
		logger.info("Clicked on ok button for Submitted Return Order PopUp");
		waitForElementPresent(ReturnToVendor.cancelbuttonforaddvendorincidentpopup);
	}
	
	public void click_CancelButtonForAddVendorIncidentPopup() {
		waitForElementPresent(ReturnToVendor.cancelbuttonforaddvendorincidentpopup);
		click(ReturnToVendor.cancelbuttonforaddvendorincidentpopup);
		logger.info("clicked on Cancel Button For Add Vendor Incident Popup ");
	}
	
	public HomePage click_NavigateBack() {
		waitForElementPresent(ReturnToVendor.navigatebackbutton);
		click(ReturnToVendor.navigatebackbutton);
		logger.info("Clicked on navigate back");
		return basePage.homepage(driver, customReport, basePage);
	}
	
}
