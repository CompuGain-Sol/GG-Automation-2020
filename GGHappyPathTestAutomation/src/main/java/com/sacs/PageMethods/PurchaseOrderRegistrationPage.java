package com.sacs.PageMethods;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.AdditionalPurchasesPageObjects;
import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class PurchaseOrderRegistrationPage extends WebElements{
	 private static final String String = null;
	private static Logger logger = Logger.getLogger(PurchaseOrderRegistrationPage.class);
	 private static PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=null;
	 private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;

	public PurchaseOrderRegistrationPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void searchAndSelectVendor(String vendorname,String value) {
		click_OrderByVendorButton();
		vendorSearch(vendorname);
		click_SearchResult();
		click_CreateOrderbutton();
		select_GetArticlesFromDropDown(value);
		click_OKButton();
		click_AddArticle();
	}
	
	public void searchAndSelectVendorWithOutAddArticle(String vendorname,String value) {
		click_OrderByVendorButton();
		vendorSearch(vendorname);
		click_SearchResult();
		click_CreateOrderbutton();
		select_GetArticlesFromDropDown(value);
		click_OKButton();
	}
	
	public void searchAndSelectVendorAirLineOwnedPurchases(String vendorname,String value) {
		click_OrderByVendorButton();
		vendorSearch(vendorname);
		click_SearchResult();
		click_CreateOrderbutton();
		select_GetArticlesFromDropDown(value);
		click_OKButtonWithoutWaitforElement();
		enter_OrderQty("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
	}
	
	public void searchAndSelectVendorForMultiplePO(String vendorname,String value) {
		click_OrderByVendorButton();
		vendorSearch(vendorname);
		click_SearchResult();
		click_CreateOrderbutton();
		select_GetArticlesFromDropDown(value);
		click_OKButtonWithoutWaitforElement();
		enter_OrderQty("100");
		enter_OrderQtyForSecondArticle("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
		click_ConformationOK();
	}
	
	public void submitOrderWithoutAddArticle(String ordervalue) {
		enter_OrderQty(ordervalue);
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
		click_ConformationOK();
	}
	
	public void checkCheckBoxForSecondArticle() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox2);
		check_Checkbox(PurchaseOrderRegistrationPageObjects.addarticlecheckbox2);
		logger.info("Clicked in add article checkbox2");
	}
	
	public void checkCheckBoxForFirstArticle() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		check_Checkbox(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		logger.info("Clicked in add article checkbox1");
	}
	
	public void addMultipleBasicArticles() {
		checkCheckBoxForFirstArticle();
		pause(1000);
		checkCheckBoxForSecondArticle();
		click_AddSelected();
		enter_OrderQty("100");
		enter_OrderQtyForSecondArticle("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
	}
	
	public void addBasicArticle() {
		click_CheckAddArticle();
		click_AddSelected();
		enter_OrderQty("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
	}
	
	public void update_OrderQty() {
		enter_OrderQty("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
		click_ConformationOK();
	}
	
	public void update_OrderQtySecondArticle() {
		enter_OrderQtyForSecondArticle("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
		click_ConformationOK();
	}
	
	public void update_OrderQtyMultipleBasicArticles() {
		enter_OrderQty("100");
		enter_OrderQtyForSecondArticle("100");
		click_ApplyChanges();
		click_SubmitOrder();
		click_Continue();
		click_ConformationOK();
	}
	
	public AirlineOwnedPurchasesPage navigate_AirlineOwnedPurchasesSearch() {
		click_PurchaseOrderRegistration();
		return click_AirlineOwnedPurchases();
	}
	
	public void very_PORegistartionSubmitted(String vendorname) {
		navigate_AirlineOwnedPurchasesSearch();
		click_OrderByVendorButton();
		vendorSearch(vendorname);
		click_SearchResult();
	}
	
	public void verfy_OrderSubmission(String ordernumber) {
		click_BackButton();
		searchOrdernumber(ordernumber);
	}
	
	public void click_OrderByVendorButton() {
		clickusingjavascript(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		logger.info("Clicked on View existing or create new purchase order by vendor button");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
	}
	
	public void vendorSearch(String vendorname) {
		enterText(VendorPriceAgreementPageObjects.searchtextbox, vendorname);
		logger.info("Entered Vendor name in text box is ::::"+vendorname);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		waitForElementPresent(BasicArticlesPageObjects.searchfirstgrid);
	}
	
	public void click_SearchResult() {
		pause(2000);
		click(BasicArticlesPageObjects.searchfirstgrid);
		doubleClick(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Double Clicked on search result");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.createoderbutton);
	}
	
	public void click_CreateOrderbutton() {
		click(PurchaseOrderRegistrationPageObjects.createoderbutton);
		logger.info("Clicked on Create Order button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.getarticlesdropdown);
	}
	
	public void select_GetArticlesFromDropDown(String value) {
		selectValuefromDropDown(PurchaseOrderRegistrationPageObjects.getarticlesdropdown, value);
		logger.info("Selected value from dropdown is ::::"+value);
	}
	
	public void click_OKButton() {
		click(PurchaseOrderRegistrationPageObjects.okbutton);
		logger.info("Clicked on Ok Button");
		//waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
	}
	
	public void click_OKButtonWithoutWaitforElement() {
		click(PurchaseOrderRegistrationPageObjects.okbutton);
		logger.info("Clicked on Ok Button");
	}
	
	public void click_AddArticle() {
		pause(3000);
		click(PurchaseOrderRegistrationPageObjects.addarticlebutton);
		logger.info("Clicked on Add Article");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlesearchtextbox);
	}
	
	public String verify_BasicArticleName() {
		return getText(PurchaseOrderRegistrationPageObjects.articlename);
	}
	
	public String verify_BasicArticleNameSecond() {
		return getText(PurchaseOrderRegistrationPageObjects.secondarticlename);
	} 

	public void click_CheckAddArticle() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		check_Checkbox(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		logger.info("Clicked in add article checkbox");
	}
	
	public void click_AddSelected() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		click(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		logger.info("Clicked on add selected button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.selectedrowgrid);
		logger.info("Selected Basic Article is present");
	}
	
	public void enter_OrderQty(String ordervalue) {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.orderqunatity);
		click(PurchaseOrderRegistrationPageObjects.orderqunatity);
		logger.info("Clicked on Order Qty text box");
		//String ordervalue="100";
		pause(2000);
		clickusingMouse(PurchaseOrderRegistrationPageObjects.orderqunatitytextbox);
		enterText(PurchaseOrderRegistrationPageObjects.orderqunatitytextbox, ordervalue);
		logger.info("Order Value entred is ::::"+ordervalue);
	}
	
	public void enter_OrderQtyForSecondArticle(String ordervalue) {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.secondorderqunantity);
		click(PurchaseOrderRegistrationPageObjects.secondorderqunantity);
		logger.info("Clicked on Order Qty text box for second article");
		//String ordervalue="100";
		pause(2000);
		enterText(PurchaseOrderRegistrationPageObjects.orderqunatitytextbox, ordervalue);
		logger.info("Order Value entred for second article is ::::"+ordervalue);
	} 
	
	public void click_ApplyChanges() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.applychangesbutton);
		logger.info("Apply Changes button is visible on the page");
		pause(3000);
		clickusingjavascript(PurchaseOrderRegistrationPageObjects.applychangesbutton);
		logger.info("Clicked on Apply changes button after focus");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersubmitbutton);
	}
	
	public void click_SubmitOrder() {
		pause(2000);
		click(PurchaseOrderRegistrationPageObjects.ordersubmitbutton);
		logger.info("Clicked on Order submit Button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.continuebutton);
	}
	
	public void click_Continue() {
		pause(2000);
		click(PurchaseOrderRegistrationPageObjects.continuebutton);
		logger.info("Clicked Continue Button for Purchase Order Submit Popup ");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.conformtionokbutton);
	}
	
	public void click_ConformationOK() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.conformtionokbutton);
		click(PurchaseOrderRegistrationPageObjects.conformtionokbutton);
		logger.info("Clicked  Ok button on Purchase Order Submitted Popup and Sucessfully submitted the Order");
		pause(3000);
		waitForElementPresent(BasicArticlesPageObjects.backtosearchbutton);
	}
	
	public String getOrderNumber() {
		pause(2000);
		return getAttribute(PurchaseOrderRegistrationPageObjects.ordernumber, "value");
		//return getText(PurchaseOrderRegistrationPageObjects.ordernumber);
	}
	
	public String get_TotalAmount() {
		return getAttribute(PurchaseOrderRegistrationPageObjects.totalamount, "value");
	}
	
	public void click_BackButton() {
		waitForElementPresent(BasicArticlesPageObjects.backtosearchbutton);
		click(BasicArticlesPageObjects.backtosearchbutton);
		logger.info("Clicked on Back button");
		waitForElementPresent(VendorPriceAgreementPageObjects.vendorsearchtextbox);
	}
	
	public void searchOrdernumber(String ordernumber) {
		enterText(VendorPriceAgreementPageObjects.vendorsearchtextbox, ordernumber);
		logger.info("Entered PO Number is ::::"+ordernumber);
		clickEnter(VendorPriceAgreementPageObjects.vendorsearchtextbox);
	}
	
	public String verify_SubmitText() {
		 return getText(PurchaseOrderRegistrationPageObjects.submittext);
	}
	
	public HomePage click_NavigateBack() {
		click(PurchaseOrderRegistrationPageObjects.navigatebackbutton);
		logger.info("Clicked on Naviagte back");
		return basePage.homepage(driver, customReport, basePage);
	}
	

	public int verify_AddArticleCheckbox() {
		return elements(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
	}
	
	public void click_PurchaseOrderRegistration() {
		waitForElementPresent(HomePageObjects.purchaseorderregidtrationlinktext);
		clickusingjavascript(HomePageObjects.purchaseorderregidtrationlinktext);
		logger.info("Clicked on Purchase Order Registration");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
	}
	
	public AirlineOwnedPurchasesPage click_AirlineOwnedPurchases() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.airlineownedpurchasesbutton);
		clickusingjavascript(PurchaseOrderRegistrationPageObjects.airlineownedpurchasesbutton);
		logger.info("Clicked on the Air Line Owned Purchases button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		return basePage.airlineOwnedPurchasesPage(driver, customReport, basePage);
	}
	
	
	public void create_MultiplePruchaseOrdes() {
		click_CreateMultiplePurchaseOrders();
		click_ViewPurchaseOrderProposal();
		enter_ProposalFromDate(10);
		enter_ProposalToDate(4);
		click_MultiPOOK();
		click_SearchVendor();
		enter_SelectVendorSearchTextBox();
		click_OKButtonForSearchVendorPopUp();
		click_OKButtonAfterMultiPOReg();
	}
	
	public void click_CreateMultiplePurchaseOrders() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.createmultiplepurchaseorderbutton);
		click(PurchaseOrderRegistrationPageObjects.createmultiplepurchaseorderbutton);
		logger.info("Clicked on the Create Multiple Purchase Orders Button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.createmultiplepurchaseordermenu);
		pause(1000);
	}
	
	public void click_ViewPurchaseOrderProposal() {
		pause(1000);
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.viewpurchaseorderproposal);
		click(PurchaseOrderRegistrationPageObjects.viewpurchaseorderproposal);
		logger.info("Clicked on View Purchase Order Proposal Menu");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.proposalfromdatetextbox);
	}
	
	public void enter_ProposalFromDate(int days) {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.proposalfromdatetextbox);
		String fromdate=DateTime.get_PreviousDateToCurrentDate(days);
		enterText(PurchaseOrderRegistrationPageObjects.proposalfromdatetextbox, fromdate);
		logger.info("The From Date Entered is ::::"+fromdate);
	}
	
	public void enter_ProposalToDate(int days) {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.proposaltodatetextbox);
		String todate=DateTime.get_PreviousDateToCurrentDate(days);
		enterText(PurchaseOrderRegistrationPageObjects.proposaltodatetextbox, todate);
		logger.info("The To Date Entered is ::::"+todate);
	}
	
	public void click_MultiPOOK() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.multipookbutton);
		click(PurchaseOrderRegistrationPageObjects.multipookbutton);
		logger.info("Clicked on OK button for Multi PO");
		if (isDisplayedWithoutException(PurchaseOrderRegistrationPageObjects.multiporegistrationvendortextbox)) {
			logger.info("To date is accepted and Vendor Text box is present on the page");
		}
		else {
			logger.info("To date is not accepted");
			enter_ProposalToDate(3);
			click(PurchaseOrderRegistrationPageObjects.multipookbutton);
			logger.info("Clicked on OK button for Multi PO");
		}
	}
	
	public void click_SearchVendor() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.vendorsearchbutton);
		click(PurchaseOrderRegistrationPageObjects.vendorsearchbutton);
		logger.info("Clicked on Vendor search Icon");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.vendoridcheckbox);
	}
	
	public void enter_SelectVendorSearchTextBox() {
		 Random r = new Random();
		  int Low = 1;
		  int High = 5;
		  int R = r.nextInt(High-Low) + Low;	
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
		String searchtext="a";
		enterText(VendorPriceAgreementPageObjects.searchtextbox, searchtext);
		logger.info("Search text entered for select vendor is ::::"+searchtext);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.vendorsearchresultscheckbox);
		By vendortoselect=By.xpath("//*[@id='POresults']/table/tbody/tr["+R+"]/td[1]/div/label/span");
		logger.info("Random R value picked is ::::"+R);
		logger.info("locator-------------------"+vendortoselect);
		pause(1000);
		clickUsingSwitch(vendortoselect);
		logger.info("Clicked check for vendor");
		 By selectedvendorname=By.xpath("//*[@id='POresults']/table/tbody/tr["+R+"]/td[3]");
		logger.info("Selected Vendor name is ::::::"+getText(selectedvendorname));
	}
	
	public void click_OKButtonForSearchVendorPopUp() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.vendorsearchcontinuebutton);
		click_ElementAfterFocus(PurchaseOrderRegistrationPageObjects.vendorsearchcontinuebutton);
		logger.info("Clicked on Ok Button");
		waitForElementPresent(AdditionalPurchasesPageObjects.okbutton);
	}
	
	public void click_OKButtonAfterMultiPOReg() {
		waitForElementPresent(AdditionalPurchasesPageObjects.okbutton);
		click(AdditionalPurchasesPageObjects.okbutton);
		logger.info("Clicked on OK button for Multi PO Reg");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.vendornotextbox);
	}

}
