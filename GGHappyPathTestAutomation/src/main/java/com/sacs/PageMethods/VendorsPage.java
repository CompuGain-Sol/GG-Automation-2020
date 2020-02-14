package com.sacs.PageMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.VendorsPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.dao.VendorBeanPage;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class VendorsPage extends WebElements {

	private static Logger logger = Logger.getLogger(VendorsPage.class);
	 private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;

	public VendorsPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public String create_VendorWithManditFields(VendorBeanPage vendorbeanpage) {
		click_AddVendor();
		String vendorname=enter_VendorName(vendorbeanpage);
		select_CurrencyCode();
		select_VendorAccountGroup();
		enter_SAPVendorNumber(vendorbeanpage);
		click_ApplyChanges();
		return vendorname;
	}
	
	public String create_IntercomVendor(VendorBeanPage vendorbeanpage) {
		click_AddVendor();
		String vendorname=enter_VendorName(vendorbeanpage);
		select_CurrencyCode();
		select_VendorAccountGroup();
		enter_SAPVendorNumber(vendorbeanpage);
		click_GR_Based_Inv_Entry();
		click_ApplyChanges();
		return vendorname;

	}
	
	public String create_VendorWithSapTransferDisabled(VendorBeanPage vendorbeanpage) {
		click_AddVendor();
		String vendorname=enter_VendorName(vendorbeanpage);
		select_CurrencyCode();
		select_VendorAccountGroup();
		Uncheck_SapTransfer_CheckBox();
		click_ApplyChanges();
		return vendorname;
	}
	
	public String create_VendorWithElectronicInterfaceSupported(VendorBeanPage vendorbeanpage) {
		click_AddVendor();
		String vendorname=enter_VendorName(vendorbeanpage);
		select_CurrencyCode();
		select_VendorAccountGroup();
		click_ElectronicInterFaceSupportedCheckBox();
		enter_SAPVendorNumber(vendorbeanpage);
		click_ApplyChanges();
		return vendorname;
	}
	
	
	public void click_AddVendor() {
		waitForElementPresent(VendorsPageObjects.addvendorbutton);
		click(VendorsPageObjects.addvendorbutton);
		logger.info("Clicked on Add Vendor Button");
		waitForElementPresent(VendorsPageObjects.vendornametextbox);
		logger.info("Vendor name text box is visible on the page");
	}
	
	public String  enter_VendorName(VendorBeanPage vendorbeanpage) {
		click(VendorsPageObjects.secondarynametextbox);
		pause(2000);
		enterText(VendorsPageObjects.vendornametextbox, vendorbeanpage.getVendorname());
		String vendorname= vendorbeanpage.getVendorname();
		logger.info("Entered Vendor Name is ::::"+vendorbeanpage.getVendorname());
		return vendorname;
	}
	
	public void enter_SAPVendorNumber(VendorBeanPage vendorbeanpage) {
		waitForElementPresent(VendorsPageObjects.sapvendornumbertextbox);
		enterText(VendorsPageObjects.sapvendornumbertextbox, vendorbeanpage.getSapvendornumber());
		logger.info("Entered SAP vendor number is ::::"+vendorbeanpage.getSapvendornumber());
	}
	
	public void select_CurrencyCode() {
		waitForElementPresent(VendorsPageObjects.currencycodedropdown);
		logger.info("Currency code dropdown is visible on the page");
		elementFocusWithTab(VendorsPageObjects.currencycodedropdown);
		logger.info("Element is focused on Currency code drop down");
		pause(1000);
		selectValuefromDropDown_ByIndex(VendorsPageObjects.currencycodedropdown, 1);
	}
	
	public void click_ApplyChanges() {
		click_ElementAfterFocus(VendorsPageObjects.applychangesbutton);
		logger.info("Clicked on Apply changes button");
	}
	
	public BasicArticlesPage navigate_BasicArticleFromVendors() {
		pause(6000);
		click_AddVendor();
		waitForElement(HomePageObjects.basicarticlelinktext);
		click(HomePageObjects.basicarticlelinktext);
		logger.info("Clicked on Basic Article link text");
		waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
		logger.info("Add Basic Article button is visible on the page");
		return basePage.basicArticlesPage(driver, customReport, basePage);
	}
	
	public void click_GR_Based_Inv_Entry(){
		verify_CheckCheckBox("GRBasedInvEntry");
		logger.info("Clicked on GR Based Invoice Entry");
	}
	
	public void Uncheck_SapTransfer_CheckBox(){
		pause(3000);
		elementFocusWithTab(VendorsPageObjects.sapvendornumbertextbox);
		verify_UnCheckCheckBox("SAPTransfer");
		logger.info("Sap Transfer Check Box is Unchecked");
	}
	
	public void click_ElectronicInterFaceSupportedCheckBox() {
		pause(3000);
		elementFocusWithTab(VendorsPageObjects.taxnumber2textbox);
		click(VendorsPageObjects.electronicinterfacesupportedcheckbox);
		logger.info("Electronic Interface Supported CheckBox is Clicked/Enabled ");
	}
	
	public HomePage navigate_HomePage() {
		click_AddVendor();
		waitForElementPresent(VendorsPageObjects.navgateback);
		click(VendorsPageObjects.navgateback);
		logger.info("Clicked on Navigate Back Button");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void select_VendorAccountGroup() {
		waitForElementPresent(VendorsPageObjects.VendorAccountGroupdropdown);
		logger.info("Currency code dropdown is visible on the page");
		elementFocusWithTab(VendorsPageObjects.VendorAccountGroupdropdown);
		logger.info("Element is focused on Currency code drop down");
		pause(1000);
		selectValuefromDropDown_ByIndex(VendorsPageObjects.VendorAccountGroupdropdown, 1);
	}
	
}
