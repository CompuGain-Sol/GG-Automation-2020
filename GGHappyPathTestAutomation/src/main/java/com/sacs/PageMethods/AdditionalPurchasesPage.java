package com.sacs.PageMethods;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.AdditionalPurchasesPageObjects;
import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.dao.BasicArticlesBeanPage;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class AdditionalPurchasesPage extends WebElements {
	private static Logger logger = Logger.getLogger(HomePage.class);
	private static AdditionalPurchasesPage additionalPurchasesPage=null;
	private CustomReport customReport;
	private BasePage basePage;
	private WebDriver driver;
	
	public AdditionalPurchasesPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void add_AdditionalPurchasesForExistingBasicArticle(String vendorname, String basicarticle) {
		click_SearchNewPruchaseOrderByVendor();
		searchVendor(vendorname);
		click_VendorSearchResult();
		click_CreateOrder();
		click_OkButton();
		click_AddArticleButton();
		search_ArticleToAdd(basicarticle);
		checkCheckBoxForFirstArticle();
		click_AddSelected();
		select_CostCenter();
		enter_OrderQty();
		enter_NetPrice();
		click_ApplyChanges();
		submit_Order();
		click_ContinueSubmitAdditionalPurchaseOrderPopUp();
		click_OkAdditionalPurchaseOrderSubmit();
		enter_DeliveryNoteNumber();
		enter_ReceivedDate();
		click_ReceiveOrder();
		click_YesReceivedOrderPopUp();
	}
	
	
	
	public void add_AdditionalPurchasesForNewBasicArticle(String vendorname,BasicArticlesBeanPage basicArticlesBeanPage) {
		click_SearchNewPruchaseOrderByVendor();
		searchVendor(vendorname);
		click_VendorSearchResult();
		click_CreateOrder();
		click_OkButton();
		click_AddLineButton();
		enter_VendorArticleNumber(basicArticlesBeanPage);
		enter_Description(basicArticlesBeanPage);
		select_PURUOMDropDown();
		select_ArticleGroup();
		select_CostCenter();
		enter_OrderQty();
		enter_NetPrice();
		click_ApplyChanges();
		submit_Order();
		click_ContinueSubmitAdditionalPurchaseOrderPopUp();
		click_OkAdditionalPurchaseOrderSubmit();
		enter_DeliveryNoteNumber();
		enter_ReceivedDate();
		click_ReceiveOrder();
		click_YesReceivedOrderPopUp();
	}
	
	public void click_SearchNewPruchaseOrderByVendor() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		click(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		logger.info("Clicked on View existing or create new purchase orders by vendor search button");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
	}
	
	public void searchVendor(String vendorname) {
		enterText(VendorPriceAgreementPageObjects.vendorsearchtextbox, vendorname);
		logger.info("Vendor Name Entered in Search box is ::::"+vendorname);
		clickEnter(VendorPriceAgreementPageObjects.vendorsearchtextbox);
		logger.info("Clicked on search text box");
	}
	
	public void click_VendorSearchResult() {
		waitForElementPresent(AdditionalPurchasesPageObjects.vendorsearchresult);
		pause(2000);
		doubleClick(AdditionalPurchasesPageObjects.vendorsearchresult);
		logger.info("Clicked on Vendor Search Result");
		waitForElementPresent(AdditionalPurchasesPageObjects.createorderbutton);
	}
	
	public void click_CreateOrder() {
		waitForElementPresent(AdditionalPurchasesPageObjects.createorderbutton);
		click(AdditionalPurchasesPageObjects.createorderbutton);
		logger.info("clicked on the Create Order button");
		waitForElementPresent(AdditionalPurchasesPageObjects.currencydropdown);
	}
	
	public void click_OkButton() {
		waitForElementPresent(AdditionalPurchasesPageObjects.okbutton);
		click(AdditionalPurchasesPageObjects.okbutton);
		logger.info("Clicked on Ok button on Additional Purchases");
		waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
	}
	
	public void click_AddArticleButton() {
		waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
		click(BasicArticlesPageObjects.addarticlebutton);
		logger.info("Clikced on Add Article Button");
		waitForElementPresent(AdditionalPurchasesPageObjects.searchaddarticletextbox);
	}
	
	// Need to add wait for element present. Search result is not displaying because of defect
	public void search_ArticleToAdd(String basicarticle) {
		waitForElementPresent(AdditionalPurchasesPageObjects.searchaddarticletextbox);
		enterText(AdditionalPurchasesPageObjects.searchaddarticletextbox, basicarticle);
		logger.info("Entered text for basic article to add :::::"+basicarticle);
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
	}
	
	
	public void click_AddLineButton() {
		waitForElementPresent(AdditionalPurchasesPageObjects.addlinebutton);
		pause(2000);
		click(AdditionalPurchasesPageObjects.addlinebutton);
		logger.info("Clicked on Add Line Button");
		waitForElementPresent(AdditionalPurchasesPageObjects.addlinerow);
	}
	
	public void enter_VendorArticleNumber(BasicArticlesBeanPage basicArticlesBeanPage) {
		waitForElementPresent(AdditionalPurchasesPageObjects.vendorarticlenumberbox);
		click(AdditionalPurchasesPageObjects.vendorarticlenumberbox);
		logger.info("Clicked on Vendor Article Number Box");
		waitForElementPresent(AdditionalPurchasesPageObjects.vendorarticlenumbertextbox);
		enterText(AdditionalPurchasesPageObjects.vendorarticlenumbertextbox, basicArticlesBeanPage.getArticlenumber());
		logger.info("Entered Vendor Article Number is ::::"+basicArticlesBeanPage.getArticlenumber());
	}
	
	public void enter_Description(BasicArticlesBeanPage basicArticlesBeanPage) {
		waitForElementPresent(AdditionalPurchasesPageObjects.descriptionbox);
		click(AdditionalPurchasesPageObjects.descriptionbox);
		logger.info("Clicked on Description Box");
		waitForElementPresent(AdditionalPurchasesPageObjects.descriptiontextbox);
		enterText(AdditionalPurchasesPageObjects.descriptiontextbox, basicArticlesBeanPage.getLocaldescription());
		logger.info("Entered Description is ::::"+basicArticlesBeanPage.getLocaldescription());
	}
	
	public void select_PURUOMDropDown() {
		waitForElementPresent(AdditionalPurchasesPageObjects.puruomdropbox);
		click(AdditionalPurchasesPageObjects.puruomdropbox);
		logger.info("Clicked on PUR UOM box");
		waitForElementPresent(AdditionalPurchasesPageObjects.puruomdropdown);
		logger.info("Clicked on PUR UOM box");
		 Random r = new Random();
		 int Low = 1;
		 int High = 10;
		 int R = r.nextInt(High-Low) + Low;	
		 logger.info("Random R value picked is ::::"+R);
		selectValuefromDropDown_ByIndex(AdditionalPurchasesPageObjects.puruomdropdown, R);
		logger.info("Selected PUR UOM random value from DropDown is ::::"+getDropDownSelectedOption(AdditionalPurchasesPageObjects.puruomdropdown));
	}
	
	public void select_ArticleGroup() {
		waitForElementPresent(AdditionalPurchasesPageObjects.articlegroupbox);
		click(AdditionalPurchasesPageObjects.articlegroupbox);
		logger.info("Clicked Article Group box");
		waitForElementPresent(AdditionalPurchasesPageObjects.articlegroupdropdown);
		 Random r = new Random();
		 int Low = 1;
		 int High = 10;
		 int R = r.nextInt(High-Low) + Low;	
		 logger.info("Random R value picked is ::::"+R);
		selectValuefromDropDown_ByIndex(AdditionalPurchasesPageObjects.articlegroupdropdown, R);
		logger.info("Selected PUR UOM random value from DropDown is ::::"+getDropDownSelectedOption(AdditionalPurchasesPageObjects.articlegroupdropdown));
	}
	
	public void select_CostCenter() {
		waitForElementPresent(AdditionalPurchasesPageObjects.costcenterdropbox);
		click(AdditionalPurchasesPageObjects.costcenterdropbox);
		logger.info("Clicked cost center box");
		waitForElementPresent(AdditionalPurchasesPageObjects.costcenterdropdown);
		 Random r = new Random();
		 int Low = 1;
		 int High = 10;
		 int R = r.nextInt(High-Low) + Low;	
		 logger.info("Random R value picked is ::::"+R);
		selectValuefromDropDown_ByIndex(AdditionalPurchasesPageObjects.costcenterdropdown, R);
		logger.info("Selected PUR UOM random value from DropDown is ::::"+getDropDownSelectedOption(AdditionalPurchasesPageObjects.costcenterdropdown));
	}
	
	public void enter_OrderQty() {
		waitForElementPresent(AdditionalPurchasesPageObjects.orderqtybox);
		doubleClick(AdditionalPurchasesPageObjects.orderqtybox);
		logger.info("Double Clicked on Order Qty box");
		waitForElementPresent(AdditionalPurchasesPageObjects.orderqtytextbox);
		pause(2000);
		String qty="100";
		enterText(AdditionalPurchasesPageObjects.orderqtytextbox, qty);
		logger.info("Entered Qty is ::::"+qty);
	}
	
	public void enter_NetPrice() {
		waitForElementPresent(AdditionalPurchasesPageObjects.netpricebox);
		doubleClick(AdditionalPurchasesPageObjects.netpricebox);
		logger.info("Double Clicked on Order Net Price box");
		waitForElementPresent(AdditionalPurchasesPageObjects.netpricetextbox);
		pause(2000);
		String qty="100";
		enterText(AdditionalPurchasesPageObjects.netpricetextbox, qty);
		logger.info("Entered Net Price is ::::"+qty);
	}
	
	public void click_ApplyChanges() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.applychangesbutton);
		click(PurchaseOrderRegistrationPageObjects.applychangesbutton);
		logger.info("Clicked on Apply Changes Button");
		waitForElementPresent(AdditionalPurchasesPageObjects.submitorderbutton);
	}
	
	public void submit_Order() {
		waitForElementPresent(AdditionalPurchasesPageObjects.submitorderbutton);
		click(AdditionalPurchasesPageObjects.submitorderbutton);
		logger.info("Clicked on Submit Order Button");
	}
	
	public void click_ContinueSubmitAdditionalPurchaseOrderPopUp() {
		pause(1000);
		waitForElement(AdditionalPurchasesPageObjects.sendemailnotificationtovendorcheckbox);
		click(AdditionalPurchasesPageObjects.sendemailnotificationtovendorcheckbox);
		logger.info("Clicked on Send emil to vendor check box ");
		click_ElementAfterFocus(AdditionalPurchasesPageObjects.continuebtnsubmitadditionalpurchaseorderpopup);
		logger.info("Clicked Continue button on Additional Purchase Order PopUp");
	}
	
	public void click_OkAdditionalPurchaseOrderSubmit() {

		waitForElementPresent(AdditionalPurchasesPageObjects.okbuttonadditionalpurchasesordersubmit);
		pause(1000);
		click_ElementAfterFocus(AdditionalPurchasesPageObjects.okbuttonadditionalpurchasesordersubmit);
		logger.info("Clicked Ok button on Additional Purchase Order Submit PopUp");
		waitForElementPresent(AdditionalPurchasesPageObjects.deliverynotenumbertextbox);
	}
	
	public void enter_DeliveryNoteNumber() {
		waitForElementPresent(AdditionalPurchasesPageObjects.deliverynotenumbertextbox);
		String delivernotenumber=RandomStringUtils.randomNumeric(6);
		enterText(AdditionalPurchasesPageObjects.deliverynotenumbertextbox, delivernotenumber);
		logger.info("Entered Delivery Note Number is ::::"+delivernotenumber);
	}
	
	public void enter_ReceivedDate() {
		pause(2000);
		waitForElementPresent(AdditionalPurchasesPageObjects.receiveddatetext);
		String receiveddate =DateTime.DDMMYYYY();
		click(AdditionalPurchasesPageObjects.receiveddatetext);
		pause(1000);
		enterText(AdditionalPurchasesPageObjects.receiveddatetext, receiveddate);
		logger.info("Entered Received Date is ::::"+receiveddate);
	}
	
	public void click_ReceiveOrder() {
		waitForElementPresent(AdditionalPurchasesPageObjects.receiveorderbutton);
		click(AdditionalPurchasesPageObjects.receiveorderbutton);
		logger.info("Clicked on Receive Order Button");
		waitForElementPresent(AdditionalPurchasesPageObjects.yesbuttonregisterorder);
	}
	
	public void click_YesReceivedOrderPopUp() {
		waitForElementPresent(AdditionalPurchasesPageObjects.yesbuttonregisterorder);
		click(AdditionalPurchasesPageObjects.yesbuttonregisterorder);
		logger.info("Clicked on YES Button for Received Order as Received PopUp");
		//waitForElementPresent(AdditionalPurchasesPageObjects.yesbuttonregisterorder);
	}
	
	public String getOrderNumber() {
		return getAttribute(AdditionalPurchasesPageObjects.ordernumber, "value");
	}
	
	public String get_TotalAmount() {
		return getAttribute(PurchaseOrderRegistrationPageObjects.totalamount, "value");
	}
	
	public HomePage click_navigateBack() {
		waitForElementPresent(AdditionalPurchasesPageObjects.navigatebackbutton);
		click(AdditionalPurchasesPageObjects.navigatebackbutton);
		logger.info("Clicked on navigate back button");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void checkCheckBoxForFirstArticle() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		check_Checkbox(PurchaseOrderRegistrationPageObjects.addarticlecheckbox);
		logger.info("Clicked in add article checkbox1");
	}
	
	public void click_AddSelected() {
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		click(PurchaseOrderRegistrationPageObjects.addselectedbutton);
		logger.info("Clicked on add selected button");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.selectedrowgrid);
		logger.info("Selected Basic Article is present");
	}
}
