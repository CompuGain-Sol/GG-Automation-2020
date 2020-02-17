package com.sacs.PageMethods;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.PurchaseOrderRecieptPageObjects;
import com.sacs.PageObjects.VendorInvoiceEntryPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class PurchaseOrderRecieptPage extends WebElements{
	private static Logger logger = Logger.getLogger(PurchaseOrderRecieptPage.class);
	private static PurchaseOrderRecieptPage purchaseOrderRecieptPage=null;
	 private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;
	

	public PurchaseOrderRecieptPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void submit_OrderReciept(String vendorname) {
		click_SearchOrderByVendor();
		searchVendor(vendorname);
		click_SearchResult();
		click_OrderNumber();
		enter_DeliveryNoteNumber();
		click_OK();
		click_ExpiryDate();
		enter_OrderQtyRecieved("100");
		enter_ExpiryDate();
		click_ContinueButton();
		click_SubmitReciept();
		click_popupContinue();
		click_OKPOlablePrintPopup();
		click_CloseOrderRecieptSubmitted();
	}
	
	public void submit_OrderRecieptForMultiPleArticles(String vendorname) {
		click_SearchOrderByVendor();
		searchVendor(vendorname);
		click_SearchResult();
		click_OrderNumber();
		enter_DeliveryNoteNumber();
		click_OK();
		click_ExpiryDate();
		enter_OrderQtyRecieved("100");
		enter_ExpiryDate();
		click_ContinueButton();
		click_ExpiryDateForSecondArticle();
		enter_OrderQtyRecieved("100");
		enter_ExpiryDate();
		click_ContinueButton();
		click_SubmitReciept();
		click_popupContinue();
		click_OKPOlablePrintPopup();
		click_CloseOrderRecieptSubmitted();
	}
	
	public void submit_OrderRecieptSplitQty(String vendorname, String returnqty) {
		click_SearchOrderByVendor();
		searchVendor(vendorname);
		click_SearchResult();
		click_OrderNumber();
		enter_DeliveryNoteNumber();
		click_OK();
		enter_ReturnQty(returnqty);
		click_ExpiryDate();
		enter_OrderQtyRecieved(returnqty);
		enter_ExpiryDate();
		click_ContinueButton();
		click_ApplyChanges();
		click_SubmitReciept();
		click_ContinuePopUp();
		click_CreateNewOrderPopUp();
		check_CheckBoxForArticleCheckBoxOnCreateOrderPopUp();
		click_ContinueForCreateOrderPopUp();
		submit_incident();
		click_OKButtonOnPOLabelPrintQtyPopUp();
		click_ClosebuttonOnCreateOrderPopUp();
		pause(3000);
	}
	
	public void submit_OrderRecieptForSplitArticle(String vendorname,String returnqty) {
		click_SearchOrderByVendor();
		searchVendor(vendorname);
		click_SearchResult();
		click_OrderNumber();
		enter_DeliveryNoteNumber();
		click_OK();
		enter_ReturnQty(returnqty);
		click_ExpiryDate();
		enter_OrderQtyRecieved(returnqty);
		enter_ExpiryDate();
		click_ContinueButton();
		pause(3000);
		enter_ReturnQtyforSecondArticle("0");
		click_SubmitReciept();
		click_ContinuePopUp();
		click_CreateNewOrderPopUp();
		check_CheckBoxForArticleCheckBoxOnCreateOrderPopUp();
		click_ContinueForCreateOrderPopUp();
		submit_incident();
		click_OKButtonOnPOLabelPrintQtyPopUp();
		click_ClosebuttonOnCreateOrderPopUp();
		pause(3000);
	}
	
	public void submit_OrderForSecondOrder(String orderqty) {
		click_OrderNumber();
		enter_DeliveryNoteNumber();
		click_OK();
		click_ExpiryDate();
		enter_OrderQtyRecieved(orderqty);
		enter_ExpiryDate();
		click_ContinueButton();
		click_SubmitReciept();
		click_popupContinue();
		click_OKPOlablePrintPopup();
		click_CloseOrderRecieptSubmitted();
	}
	
	
	public void click_SearchOrderByVendor() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.searchorderbyvendorbutton);
		click(PurchaseOrderRecieptPageObjects.searchorderbyvendorbutton);
		logger.info("Clicked on the search order by vendor button");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
	}
	
	public void searchVendor(String vendorname) {
		enterText(VendorPriceAgreementPageObjects.searchtextbox, vendorname);
		logger.info("Entered text for vendor is ::::"+vendorname);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		waitForElementPresent(BasicArticlesPageObjects.searchfirstgrid);
		pause(2000);
	}
	
	public void click_SearchResult() {
		click(BasicArticlesPageObjects.searchfirstgrid);
		doubleClick(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Double Clicked on search result");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.receivewithoutPObutton);
	}
	
	public void click_OrderNumber() {
		click(BasicArticlesPageObjects.searchfirstgrid);
		doubleClick(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Double Clicked on search result");
		//waitForElementPresent(PurchaseOrderRecieptPageObjects.receivewithoutPObutton);
	}
	
	public void enter_DeliveryNoteNumber() {
		String deliverynoteno=RandomStringUtils.randomNumeric(5);
		enterText(PurchaseOrderRecieptPageObjects.delivernotenumbertextbox, deliverynoteno);
		logger.info("entered Delivery Note Number is ::::"+deliverynoteno);
	}
	
	public void click_OK() {
		click(PurchaseOrderRecieptPageObjects.okbutton);
		logger.info("Clicked on OK button");
		//waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
	}
	
	public void click_ExpiryDate() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.expirydateeditbutton);
		click(PurchaseOrderRecieptPageObjects.expirydateeditbutton);
		logger.info("Clicked on Expiry Date Edit Button");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.continuebutton);
	}
	
	public void click_ExpiryDateForSecondArticle() {
		pause(3000);
		waitForElementPresent(PurchaseOrderRecieptPageObjects.expirydateeditbuttonsecondarticle);
		click(PurchaseOrderRecieptPageObjects.expirydateeditbuttonsecondarticle);
		logger.info("Clicked on Expiry Date Edit Button for second article");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.expirydateeditbuttonsecondarticle);
	}
	
	public void enter_OrderQtyRecieved(String qtyrecieved) {
		pause(2000);
		waitForElementPresent(PurchaseOrderRecieptPageObjects.orderqtyrecieved);
		doubleClick(PurchaseOrderRecieptPageObjects.orderqtyrecieved);
		logger.info("Double Clicked on Order Qunatity Recieved button");
		//String qtyrecieved="100";
		enterText(PurchaseOrderRecieptPageObjects.orderqtnrecievedtextbox, qtyrecieved);
		logger.info("Quantity recieved Entered is ::::"+qtyrecieved);
		pause(2000);
	}
	
	public void enter_ExpiryDate() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.expirydate);
		//clickusingjavascript(PurchaseOrderRecieptPageObjects.expirydate);
		doubleClick(PurchaseOrderRecieptPageObjects.expirydate);
		logger.info("Clicked on expiry date");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.expirydatetextbox);
		String date=DateTime.DDMMYYYY();
		enterText(PurchaseOrderRecieptPageObjects.expirydatetextbox, date);
		logger.info("Expiry Date Entered is ::::"+date);
		pause(2000);
	}
	
	public void click_ContinueButton() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.continuebutton);
		click(PurchaseOrderRecieptPageObjects.continuebutton);
		logger.info("Clicked on Continue Button");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.submitrecieptbutton);
	}
	
	public void click_SubmitReciept() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.submitrecieptbutton);
		pause(2000);
		click(PurchaseOrderRecieptPageObjects.submitrecieptbutton);
		logger.info("Clicked on Submit Reciept Button");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.popcontinuebutton);
	}
	
	public void click_ContinuePopUp() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.popcontinuebutton);
		click(PurchaseOrderRecieptPageObjects.popcontinuebutton);
		logger.info("Clicked on Continue popup");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.createneworderbutton);
	}
	
	public void click_popupContinue() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.popcontinuebutton);
		click(PurchaseOrderRecieptPageObjects.popcontinuebutton);
		logger.info("Clicked on Continue popup");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.ordersubmittedcontinue);
		pause(2000);
		click(PurchaseOrderRecieptPageObjects.ordersubmittedcontinue);
		logger.info("Clicked on Continue button");
		pause(2000);
		waitForElementPresent(PurchaseOrderRecieptPageObjects.recordincidentcancelbutton);
		click(PurchaseOrderRecieptPageObjects.recordincidentcancelbutton);
		logger.info("Clicked on Vendor incident cancel button");
	}
	
	public void click_OKPOlablePrintPopup() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.polabelprintbutton);
		click(PurchaseOrderRecieptPageObjects.polabelprintbutton);
		logger.info("Clicked on PO label Print OK button");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.closeordercancelbutton);
	}
	
	public void click_CloseOrderRecieptSubmitted() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.closeordercancelbutton);
		click(PurchaseOrderRecieptPageObjects.closeordercancelbutton);
		logger.info("Clicked on Close button for Order Reciept Submitted PopUp");
		pause(2000);
		waitForElementPresent(BasicArticlesPageObjects.searchfirstgrid);
	}
	
	public String verify_Status() {
		return getText(PurchaseOrderRecieptPageObjects.status);
	}
	
	public String verify_SecondStatus() {
		return getText(PurchaseOrderRecieptPageObjects.status2);
	}
	
	public HomePage click_NavigateBackButton() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.navigatebackbutton);
		pause(3000);
		click_ElementAfterFocus(PurchaseOrderRecieptPageObjects.navigatebackbutton);
		logger.info("Clicked on Navigate Back button");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void click_ApplyChanges() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.applychangesbutton);
		click(PurchaseOrderRecieptPageObjects.applychangesbutton);
		logger.info("Clicked on the Apply changes button");
	}
	
	public void enter_ReturnQty(String qty) {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.receiveqtybox);
		click(PurchaseOrderRecieptPageObjects.receiveqtybox);
		logger.info("Clicked on Received Qty box");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.receiveqtytextbox);
		enterText(PurchaseOrderRecieptPageObjects.receiveqtytextbox, qty);
		logger.info("Entered Qty for Return Qty text box ::::"+qty);
	}
	
	public void enter_ReturnQtyforSecondArticle(String qty) {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.receiveqtyboxsecondarticle);
		click(PurchaseOrderRecieptPageObjects.receiveqtyboxsecondarticle);
		logger.info("Clicked on Received Qty box for second article");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.receiveqtytextbox);
		enterText(PurchaseOrderRecieptPageObjects.receiveqtytextbox, qty);
		logger.info("Entered Qty for Return Qty text box ::::"+qty);
	}
	public void click_CreateNewOrderPopUp() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.createneworderbutton);
		click(PurchaseOrderRecieptPageObjects.createneworderbutton);
		logger.info("Clicked Create New Order button on Order Reciept Submitted PopUp ");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.articlenumbercheckbox);
	}
	
	public void check_CheckBoxForArticleCheckBoxOnCreateOrderPopUp() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicecheckbox);
		click(VendorInvoiceEntryPageObjects.invoicecheckbox);
		logger.info("Check Check box for Article on Create Order Popup");
	}
	
	public void click_ContinueForCreateOrderPopUp() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.createordercontinuebutton);
		click(PurchaseOrderRecieptPageObjects.createordercontinuebutton);
		logger.info("Clicked on Create Order Continue Button");
	}
	
	public void submit_incident() {
		String incidenttype=select_IncidentType();
		enter_IncidentType(incidenttype);
		String description="Incident Description "+RandomStringUtils.randomNumeric(6);
		enter_Description(description);
		click_AddIncidentButton();
	}
	
	public String select_IncidentType() {
		 Random r = new Random();
		  int Low = 1;
		  int High = 7;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);
		waitForElementPresent(PurchaseOrderRecieptPageObjects.incidenttypetextbox);
		enterText(PurchaseOrderRecieptPageObjects.incidenttypetextbox, "*");
		logger.info("Drop down values are present");
		WebElement select = driver.findElement(PurchaseOrderRecieptPageObjects.incidentlist);
		List<WebElement> options = select.findElements(By.tagName("a"));
		String incidenttype = options.get(R).getText();
		logger.info("IncidentType selected is ::::"+incidenttype);
		String[] element = incidenttype.split("-");
		return incidenttype;
	}
	
	public void enter_IncidentType(String incidenttype) {
		clearWebElementTextusingbackspaceUsingAttribute(PurchaseOrderRecieptPageObjects.incidenttypetextbox);
		logger.info("Cleared Incident type Textbox");
		enterText(PurchaseOrderRecieptPageObjects.incidenttypetextbox,incidenttype);
		logger.info("Entered Incident type is ::::"+incidenttype);
		pause(3000);
		click(PurchaseOrderRecieptPageObjects.descriptiontextbox);
	}
	
	public void enter_Description(String description) {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.descriptiontextbox);
		enterText(PurchaseOrderRecieptPageObjects.descriptiontextbox, description);
		logger.info("Description entered is ::::"+description);
	}
	
	public void click_AddIncidentButton() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.addincidentbutton);
		click(PurchaseOrderRecieptPageObjects.addincidentbutton);
		logger.info("Clicked on Add Incident Button");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.polabelprintbutton);
		pause(2000);
	}
	
	public void click_OKButtonOnPOLabelPrintQtyPopUp() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.polabelprintbutton);
		click(PurchaseOrderRecieptPageObjects.polabelprintbutton);
		logger.info("Clicked on OK button for Print PO Label Qty PopUp");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.closebuttoncreateorderpopup);
	}
	
	public void click_ClosebuttonOnCreateOrderPopUp() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.closebuttoncreateorderpopup);
		click(PurchaseOrderRecieptPageObjects.closebuttoncreateorderpopup);
		logger.info("Clicked on Close Button Create Order PopUp");
		waitForElementPresent(PurchaseOrderRecieptPageObjects.searchresultsecondone);
	}
	
	public String get_OrderNumber() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.orderid);
		return getText(PurchaseOrderRecieptPageObjects.orderid);
	}
	
	public String get_OrderNumber2() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.orderid2);
		return getText(PurchaseOrderRecieptPageObjects.orderid2);
	}
	
	public String get_PartialPO() {
		return getText(PurchaseOrderRecieptPageObjects.partialponumberpolabelprintqtypopup);
	}
	
	}


