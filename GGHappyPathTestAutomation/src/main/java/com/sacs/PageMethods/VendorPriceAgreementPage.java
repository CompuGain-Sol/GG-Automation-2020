package com.sacs.PageMethods;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.PageObjects.VendorsPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class VendorPriceAgreementPage extends WebElements{
	private static Logger logger = Logger.getLogger(VendorPriceAgreementPage.class);
	private static VendorPriceAgreementPage vendorPriceAgreementPage=null;
	private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;
	
	
	public VendorPriceAgreementPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void SearchVendorPriceAgreement(String vendorname){
		click_AddAgreementButton();
		searchVendor(vendorname);
		click_VendorSearchResult();
	}
	
	public void create_Agreement() {
		enter_Description();
		String startdate=enter_ValidPeriodDate();
		enter_ToDate(startdate);
		click_OKButton();
		add_NewPriceAgreementFromDropDown();
		enter_Price("100");
	}
	
	public void click_AddAgreementButton() {
		waitForElementPresent(VendorPriceAgreementPageObjects.addagreementbutton);
		click(VendorPriceAgreementPageObjects.addagreementbutton);
		logger.info("Clicked on Add Agreement button");
		waitForElementPresent(VendorPriceAgreementPageObjects.vendorsearchtextbox);
	}
	
	public void searchVendor(String vendorname) {
		enterText(VendorPriceAgreementPageObjects.vendorsearchtextbox, vendorname);
		logger.info("Vendor Name Entered in Search box is ::::"+vendorname);
		clickEnter(VendorPriceAgreementPageObjects.vendorsearchtextbox);
		logger.info("Clicked on search text box");
	}
	
	public String verify_VendorSearchGrid() {
		waitForElementPresent(VendorPriceAgreementPageObjects.vendorsearchgrid);
		String  vendorname=getText(VendorPriceAgreementPageObjects.vendorsearchgrid);
		return vendorname;
	}
	
	public void click_VendorSearchResult() {
		waitForElementPresent(VendorPriceAgreementPageObjects.vendorsearchgrid);
		pause(2000);
		doubleClick(VendorPriceAgreementPageObjects.vendorsearchgrid);
		logger.info("Clicked on Vendor Search Result");
		waitForElementPresent(VendorPriceAgreementPageObjects.descriptiontextbox);
		logger.info("Description Text box is visible on the page");
	}
	
	public String verify_VendorName() {
		waitForElementPresent(VendorPriceAgreementPageObjects.vendornametitle);
		return getText(VendorPriceAgreementPageObjects.vendornametitle);
	}
	
	public void enter_Description() {
		String description="Description_"+RandomStringUtils.randomNumeric(5);
		enterText(VendorPriceAgreementPageObjects.descriptiontextbox, description);
		logger.info("Description entered is ::::"+description);
		
	}
	
	public String enter_ValidPeriodDate(){
		waitForElementPresent(VendorPriceAgreementPageObjects.validperioddatetextbox);
		String date=DateTime.addDaysToCurrentDate(1);
		enterText(VendorPriceAgreementPageObjects.validperioddatetextbox,date);
		logger.info("Entered date in valid period date textbox is ::::"+date);
		return date;
	}
	
	public void enter_ToDate(String startDate){
		waitForElementPresent(VendorPriceAgreementPageObjects.todatetextbox);
		String todate= DateTime.addDaysToSpecifiedDate(startDate, 3);
		enterText(VendorPriceAgreementPageObjects.todatetextbox,todate);
		logger.info("Entered To date is ::::"+todate);
	}
	
	public void click_OKButton() {
		waitForElementPresent(VendorPriceAgreementPageObjects.okbutton);
		click(VendorPriceAgreementPageObjects.okbutton);
		logger.info("Clicked on OK Button");
	}
	
	public HomePage select_Unit(String unit) {
		waitForElementPresent(HomePageObjects.workingunitdropdown);
		selectValuefromDropDown(HomePageObjects.workingunitdropdown, unit);
		logger.info("The Country Unit Selected is ::::"+unit);
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void add_NewPriceAgreementFromDropDown() {
		selectValuefromDropDown_ByIndex(VendorPriceAgreementPageObjects.addnewpriceagreementdropdown, 1);
		logger.info("Selected Value from Add New  Price Agreement From dropdown is ::::"+getDropDownSelectedOption(VendorPriceAgreementPageObjects.addnewpriceagreementdropdown));
		waitForElementPresent(VendorPriceAgreementPageObjects.pricetextbox);
	}
	
	public void enter_Price(String price) {
		enterText(VendorPriceAgreementPageObjects.pricetextbox, price);
		logger.info("Entered price in price text box is ::::"+price);
	}
	
	public void click_ApplyChanges() {
		waitForElementPresent(VendorsPageObjects.applychangesbutton);
		click(VendorsPageObjects.applychangesbutton);
		logger.info("Clicked on Apply changes button");
	}
}
