package com.sacs.PageMethods;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.PurchaseOrderRecieptPageObjects;
import com.sacs.PageObjects.VendorInvoiceEntryPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.Reportinglib.DateTime;
import com.sacs.dao.AddCreditDebitNoteBeanPage;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class VendorInvoiceEntryPage extends WebElements {

	private static Logger logger = Logger.getLogger(VendorInvoiceEntryPage.class);
	private static VendorInvoiceEntryPage vendorInvoiceEntryPage=null;
	private CustomReport customReport;
	private BasePage basePage;
	private WebDriver driver;
	
	public VendorInvoiceEntryPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public void enter_InvoiceEntry(String vendorname,String invoiceamount) {
		click_EnterDocument();
		enter_VendorNameUnitLevel(vendorname);
		enter_Invoice(invoiceamount);
		enter_ReferenceNo();
		click_OK();
		click_AddPoToInvoiceCheckBox();
		click_ContinueButtonOnAddPOToInvoice();
		click_Save();
	}
	
	public void enter_InvoiceEntryForMultipleBasicArticles(String vendorname,String invoiceamount) {
		click_EnterDocument();
		enter_VendorNameUnitLevel(vendorname);
		enter_Invoice(invoiceamount);
		enter_ReferenceNo();
		click_OK();
		click_AddPoToInvoiceCheckBox();
		click_AddsecondPoToInvoiceCheckBox();
		click_ContinueButtonOnAddPOToInvoice();
		click_Save();
	}
	
	public void click_EnterDocument() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.enterdocumnetbutton);
		click(VendorInvoiceEntryPageObjects.enterdocumnetbutton);
		logger.info("Clicked on the Enter Document button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendortextbox);
	}
	
	public void CreatePostingReportForSelectedInvoice(String vendorname,String menuitem) {
		pause(3000);
		click_OKMissMatchVendorInvoicePostingReport();
		enter_VendorSearchPostingReport(vendorname,menuitem);
		click_CheckBoxForInvoice();
		click_CreatePostingReportSelectedInvoice();
	}
	
	public void checkforApprovedInvoices(String vendorname,String menuitem) {
		pause(3000);
		click_OKMissMatchVendorInvoicePostingReport();
		enter_VendorSearchPostingReport(vendorname,menuitem);
		//click_CheckBoxForInvoice();
		//click_CreatePostingReportSelectedInvoice();
	}
	public int verify_InvoicesCheckbox() {
		return elements(VendorInvoiceEntryPageObjects.invoicecheckbox);
	}
	
	/*public void selectTransferVendorInvoice(String menuitem, String vendorname) {
		click_SuccessfullyCreatedPopupOK();
		click_BackButton();
		select_MenuItems(menuitem);
		enter_VendorSearchForTransfervendorinvoices(vendorname);
	}*/
	public void TransferInvoiceCreatePLTforSAP(String menuitem,String vendorname){
		click_SuccessfullyCreatedPopupOK();
		click_BackButton();
		select_MenuItems(menuitem);
		click_OKMissMatchVendorInvoiceTransferVendorInvoice();
		enter_VendorSearchForTransfervendorinvoices(vendorname);
		click_CheckBoxForInvoice();
		click_TransferSelectedInvoice();
		enter_PostingDate();
		click_PostingDateContinueButton();
		click_ConfirmationYesButton();
	}
	public void TransferInvoiceandCreditorDebit_CreatePLTforSAP(String menuitem,String vendorname){
		click_SuccessfullyCreatedPopupOK();
		click_BackButton();
		select_MenuItems(menuitem);
		click_OKMissMatchVendorInvoiceTransferVendorInvoice();
		enter_VendorSearchForTransfervendorinvoices(vendorname);
		click_CheckBoxForInvoice();
		click_CheckBoxForInvoiceSecond();
		click_TransferSelectedInvoice();
		enter_PostingDate();
		click_PostingDateContinueButton();
		click_ConfirmationYesButton();
	}
	
	public void AddCreditNote(String menuitem, String vendorname,AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		click_BackButton();
		select_MenuItems(menuitem);
		enter_SearchForCreditDebitVendor(vendorname);
		click_addcreditdebitsearchresultbutton();
		click_AddNew();
		enter_AddCreditNote(addCreditDebitNoteBeanPage);
		click_OKSubmitAddCreditDebit();
		enter_CN_DNQty();
		enter_CN_DNPrice();
		click_SaveForAddCreditDebit();
	}
	
	public void AddCreditNoteBeforeInvoiceTransfer(String menuitem, String vendorname,AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		click_addCreditDebitNotebutton();
		click_AddNew();
		enter_AddCreditNote(addCreditDebitNoteBeanPage);
		click_OKSubmitAddCreditDebit();
		enter_CN_DNQty();
		enter_CN_DNPrice();
		click_SaveForAddCreditDebit();
	}
	
	public void AddDebitNoteBeforeInvoiceTransfer(String menuitem, String vendorname,AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		click_addCreditDebitNotebutton();
		click_AddNew();
		click_Debit();
		enter_AddCreditNote(addCreditDebitNoteBeanPage);
		click_OKSubmitAddCreditDebit();
		enter_CN_DNQty();
		enter_CN_DNPrice();
		click_SaveForAddCreditDebit();
	}
	
	public void AddDebitNote(String menuitem, String vendorname,AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		click_BackButton();
		select_MenuItems(menuitem);
		enter_SearchForCreditDebitVendor(vendorname);
		click_addcreditdebitsearchresultbutton();
		click_AddNew();
		click_Debit();
		enter_AddCreditNote(addCreditDebitNoteBeanPage);
		click_OKSubmitAddCreditDebit();
		enter_CN_DNQty();
		enter_CN_DNPrice();
		click_SaveForAddCreditDebit();
	}
	
	public void TransferInvoiceCreatePLTforSAPReturn(String menuitem,String vendorname){
		click_SuccessfullyCreatedPopupOK();
		click_BackButton();
		select_MenuItems(menuitem);
		click_OKMissMatchVendorInvoiceTransferVendorInvoice();
		enter_VendorSearchForTransfervendorinvoices(vendorname);
		click_CheckBoxForInvoice();
		click_CheckBoxForInvoiceSecond();
		click_TransferSelectedInvoice();
		enter_PostingDate();
		click_PostingDateContinueButton();
		click_ConfirmationYesButton();
	}
	
	public void enter_VendorNameUnitLevel(String vendorname) {
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendortextbox);
		enterText(VendorInvoiceEntryPageObjects.vendortextbox, vendorname);
		logger.info("Entered vendor name is ::::"+vendorname);
		pause(3000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendordropdownmenuitem);
		click(VendorInvoiceEntryPageObjects.vendordropdownmenuitem);
		logger.info("Clicked on Vendor Dropdown menu item");
	}
	
	public void enter_Invoice(String invoiceamount) {
	//	String invoiceamount="20";
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicetextbox);
		enterText(VendorInvoiceEntryPageObjects.invoicetextbox, invoiceamount);
		logger.info("Entered Invoice amount is ::::"+invoiceamount);
	}
	
	public void clear_InvoiceAmountTextBox() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicetextbox);
		clearWebElementTextusingbackspace(VendorInvoiceEntryPageObjects.invoicetextbox, 10);
		logger.info("Cleared Invoice Amount Textbox");
		}
	
	public void enter_ReferenceNo() {
		String referenceno=RandomStringUtils.randomNumeric(6);
		waitForElementPresent(VendorInvoiceEntryPageObjects.referencenumbertextbox);
		enterText(VendorInvoiceEntryPageObjects.referencenumbertextbox, referenceno);
		logger.info("Entered reference / Invoice number is ::::"+referenceno);
	}
	
	public void click_OK() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.okbutton);
		click(VendorInvoiceEntryPageObjects.okbutton);
		logger.info("Clicked on OK Button");
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.addpotoinvoicecheckbox);
	}
	
	public void click_AddPoToInvoiceCheckBox() {
		check_Checkbox(VendorInvoiceEntryPageObjects.addpotoinvoicecheckbox);
		logger.info("Clicked on the check box for Add PO To Invoice PopUp");
	}
	
	public void click_AddsecondPoToInvoiceCheckBox() {
		check_Checkbox(VendorInvoiceEntryPageObjects.addsecondpotoinvoicecheckbox);
		logger.info("Clicked on the check box for Second Add PO To Invoice PopUp");
	}
	
	public void click_ContinueButtonOnAddPOToInvoice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.continuebuttonforaddpotoinvoice);
		click(VendorInvoiceEntryPageObjects.continuebuttonforaddpotoinvoice);
		logger.info("Clicked on Continue Button For Add PO To Invoice");
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.editbutton);
	}
	
	public void click_Save() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.savebutton);
		click(VendorInvoiceEntryPageObjects.savebutton);
		logger.info("Clicked on Save Button");
		pause(4000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.addpurchaseorderbutton);
	}
	
	public void click_BackButton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.backbutton);
		click(VendorInvoiceEntryPageObjects.backbutton);
		logger.info("Clicked on Back Button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.menu);
	}
	
	public void select_MenuItems(String menuitem) {
		waitForElementPresent(VendorInvoiceEntryPageObjects.menu);
		pause(3000);
		mouseOver(VendorInvoiceEntryPageObjects.menu);
		logger.info("Done MouseHover on Menu");
		pause(3000);
		By menu=By.xpath("//*[contains(text(),'"+menuitem+"')]");
		waitForElementPresent(menu);
		click(menu);
		logger.info("Selected Menu item is ::::"+menuitem);
		//waitForElementPresent(VendorInvoiceEntryPageObjects.vendorsearchtextbox);
	}
	
	public void click_OKMissMatchVendorInvoicePostingReport() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.missmatchvendornamesearchbox);
		waitForElementPresent(VendorInvoiceEntryPageObjects.okbuttonmissmatchvendorinvoices);
		pause(2000);
		click(VendorInvoiceEntryPageObjects.okbuttonmissmatchvendorinvoices);
		logger.info("Clicked OK button for Miss Match Vendor Invoices- Posting Report");
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.createpostingreportforinvoicediasabledbutton);
	}
	
	public void click_OKMissMatchVendorInvoiceTransferVendorInvoice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.missmatchvendornamesearchbox);
		waitForElementPresent(VendorInvoiceEntryPageObjects.okbuttonmissmatchvendorinvoices);
		click(VendorInvoiceEntryPageObjects.okbuttonmissmatchvendorinvoices);
		logger.info("Clicked OK button for Miss Match Vendor Invoices- Transfer Vendor Invoice");
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.transferslectedinvoicebutton);
	}
	
	public void enter_VendorSearchPostingReport(String vendorname,String menuitem) {
		/*if (isDisplayedWithoutException(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox)) {*/
			enterText(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox, vendorname);
			logger.info("Approved Vendor Search box for Posting Report is visible on the page");
		/*	logger.info("The Vendor name entered in vendor search text box is :::::"+vendorname);
		}
		else {
			logger.info("Approved Vendor Search box for Posting Report is not visible on the page");
			refreshBrowser();
			click_BackButton();
			select_MenuItems(menuitem);
			click_OKMissMatchVendorInvoicePostingReport();
			waitForElementPresent(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox);
			enterText(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox, vendorname);
			logger.info("The Vendor name entered in vendor search text box is :::::"+vendorname);
		}*/
	}
	
	public String verify_VendorSearchResult() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendorsearchresultgrid);
		return getText(VendorInvoiceEntryPageObjects.vendorsearchresultgrid);
	}
	
	public void click_Editbutton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendorinvoiceeditbutton);
		click(VendorInvoiceEntryPageObjects.vendorinvoiceeditbutton);
		logger.info("Clicked on Venndor invoice Edit button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.addpurchaseorderbutton);
	}

	public String verify_LineItemDifferenceText() {
		pageUp();
		pause(2000);
	return	getText(VendorInvoiceEntryPageObjects.lineitemdifferencetext);
	}
	
	public void click_CheckBoxForInvoice() {
		check_Checkbox(VendorInvoiceEntryPageObjects.invoicecheckbox);
		logger.info("Clicked on Check box for searched invoice");
		//waitForElementEnable(VendorInvoiceEntryPageObjects.createreportforpostinginvoicebutton);
	}
	
	public void click_CheckBoxForInvoiceSecond() {
		check_Checkbox(VendorInvoiceEntryPageObjects.invoicecheckbox2);
		logger.info("Clicked on Second Check box for searched invoice");
		//waitForElementEnable(VendorInvoiceEntryPageObjects.createreportforpostinginvoicebutton);
	}
	
	public void click_CreatePostingReportSelectedInvoice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.createreportforpostinginvoicebutton);
		click(VendorInvoiceEntryPageObjects.createreportforpostinginvoicebutton);
		logger.info("Clicked on Create Posting Report For Selected Invoices");
	}
	
	public void click_SuccessfullyCreatedPopupOK() {
		pause(5000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.oksuccessfullycreatedpopup);
		click(VendorInvoiceEntryPageObjects.oksuccessfullycreatedpopup);
		logger.info("Clicked on OK button for Successfully Created PopUp");
		pause(5000);
	}
	
	public void enter_VendorSearchForTransfervendorinvoices(String vendorname) {
		waitForElementPresent(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox);
		enterText(VendorInvoiceEntryPageObjects.approvedvendorsearchtextbox, vendorname);
		logger.info("Entered Vendor name for transfer vendor invoice is ::::"+vendorname);
	}
	
	public void click_SuccessfullyCreatedOK() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.oksuccessfullycreatedpopup);
		click(VendorInvoiceEntryPageObjects.oksuccessfullycreatedpopup);
		logger.info("Clicked on Successfullt Created OK button");
	}
	
	public void click_TransferSelectedInvoice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.transferslectedinvoicebutton);
		click(VendorInvoiceEntryPageObjects.transferslectedinvoicebutton);
		logger.info("Clicked on Transfer Selected Invoice Button ");
	}
	
	public void enter_PostingDate(){
		waitForElementPresent(VendorInvoiceEntryPageObjects.postingdatetextbox);
		String postingdate=DateTime.DDMMYYYY();
		enterText(VendorInvoiceEntryPageObjects.postingdatetextbox, postingdate);
		logger.info("Entered Posting Date is ::::"+postingdate);
		pause(5000);
	}
	
	public void click_PostingDateContinueButton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.postingdatecontinuebutton);
		click(VendorInvoiceEntryPageObjects.postingdatecontinuebutton);
		logger.info("Clicked on Posting Date Continue button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.confirmtransferyesbutton);
	}
	
	public void click_ConfirmationYesButton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.confirmtransferyesbutton);
		click(VendorInvoiceEntryPageObjects.confirmtransferyesbutton);
		logger.info("Clicked on Yes button on Conformation Popup button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.successfullycreatedtext);
	}
	
	public String verify_PLTSuccessfullyCreated() {
		//By sucessfullycreated=By.xpath("(//*[contains(text(),'"+message+"')])[1]");
		waitForElementPresent(VendorInvoiceEntryPageObjects.successfullycreatedtext);
		return getText(VendorInvoiceEntryPageObjects.successfullycreatedtext);
	}
	
	public void get_PLTFileName() {
		String filename=getText(VendorInvoiceEntryPageObjects.invoicefilenametext);
		logger.info("PLT file successfully created is ::::"+filename);
	}
	
	public void click_OKbutton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.successfullcreatedpltpopupokbutton);
		click(VendorInvoiceEntryPageObjects.successfullcreatedpltpopupokbutton);
		logger.info("Clicked on Ok Button for Successfully Created PopUp");
	}
	
	public void accept_SuccessfullPopup() {
		get_PLTFileName();
		click_OKbutton();
	}
	
	public void enter_SearchForCreditDebitVendor(String vendorname) {
		waitForElementPresent(VendorInvoiceEntryPageObjects.addcreditdebitvendorsearchtextbox);
		enterText(VendorInvoiceEntryPageObjects.addcreditdebitvendorsearchtextbox, vendorname);
		logger.info("Entered vendor for add credit / debit for transfered invoice vendor search is ::::"+vendorname);
		waitForElementPresent(VendorInvoiceEntryPageObjects.addcreditdebitnotebutton);
	}
	
	public void click_addcreditdebitsearchresultbutton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.addcreditdebitnotebutton);
		click(VendorInvoiceEntryPageObjects.addcreditdebitnotebutton);
		logger.info("Clicked on add credit debit button for vendor search result");
		waitForElementPresent(VendorInvoiceEntryPageObjects.addnewbutton);
	}
	
	public void click_AddNew() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.addnewbutton);
		click(VendorInvoiceEntryPageObjects.addnewbutton);
		logger.info("Clicked on Add new button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.referencenumbertextboxaddcreditdebit);
	}
	
	public void enter_AddCreditNote(AddCreditDebitNoteBeanPage addCreditDebitNoteBeanPage) {
		enterText(VendorInvoiceEntryPageObjects.referencenumbertextboxaddcreditdebit, addCreditDebitNoteBeanPage.getReferencenumber());
		logger.info("Entered Text for Reference Number is :::::"+addCreditDebitNoteBeanPage.getReferencenumber());
		enterText(VendorInvoiceEntryPageObjects.invoiceamount, addCreditDebitNoteBeanPage.getInvoiceamount());
		logger.info("Entered Text for Invoice amount  is :::::"+addCreditDebitNoteBeanPage.getInvoiceamount());
		enterText(VendorInvoiceEntryPageObjects.documnetdate, addCreditDebitNoteBeanPage.getDocumentdate());
		logger.info("Entered Text for Invoice amount is :::::"+addCreditDebitNoteBeanPage.getDocumentdate());
	}
	
	public void click_OKSubmitAddCreditDebit() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.okbutton);
		click(VendorInvoiceEntryPageObjects.okbutton);
		logger.info("Clicked on OK button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.addcreditdebiteditbutton);
	}
	
	public void enter_CN_DNQty() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.cndnqtybox);
		click(VendorInvoiceEntryPageObjects.cndnqtybox);
		logger.info("Clicked on CN DN Qty box");
		waitForElementPresent(VendorInvoiceEntryPageObjects.cndnqtytextbox);
		String qty="100";
		enterText(VendorInvoiceEntryPageObjects.cndnqtytextbox, qty);
		logger.info("Entered N DN Qty is ::::"+qty);
	}
	
	public void enter_CN_DNPrice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.cndnpricebox);
		click(VendorInvoiceEntryPageObjects.cndnpricebox);
		logger.info("Clicked on CN DN price box");
		waitForElementPresent(VendorInvoiceEntryPageObjects.cndnpricetextbox);
		String qty="100";
		enterText(VendorInvoiceEntryPageObjects.cndnpricetextbox, qty);
		logger.info("Entered N DN Price is ::::"+qty);
		click(VendorInvoiceEntryPageObjects.cndnqtybox);
	}
	
	public void click_SaveForAddCreditDebit() {
		pause(4000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.savebutton);
		clickUsingSwitch(VendorInvoiceEntryPageObjects.savebutton);
		logger.info("Clicked on save button for add credit debit note");
	}
	
	public void click_EditButtonInvoice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.addcreditdebiteditbutton);
		click(VendorInvoiceEntryPageObjects.addcreditdebiteditbutton);
		logger.info("Clicked on Edit Button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicetextbox);
	}
	
	public void click_VendorInvoiceEntry() {
		click(HomePageObjects.vendorinvoiceentrylinktext);
		logger.info("Clicked on Vendor Invoice Entry Link ");
	}
	
	public void click_Debit() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.debitbutton);
		click(VendorInvoiceEntryPageObjects.debitbutton);
		logger.info("Clicked on Debit Button");
		pause(2000);
	}

	public HomePage click_NavigateBack() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.navigatebackbutton);
		click(VendorInvoiceEntryPageObjects.navigatebackbutton);
		logger.info("Clicked on Navigate Back button");
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void CreatePostingReportForSelectedInvoiceForReturn(String vendorname,String menuitem) {
		pause(3000);
		click_OKMissMatchVendorInvoicePostingReport();
		enter_VendorSearchPostingReport(vendorname,menuitem);
		click_CheckBoxForInvoice();
		click_CheckBoxForInvoiceSecond();
		click_CreatePostingReportSelectedInvoice();
	}
	
	public void Add_AdditionalCosts(String vendorname,String netamount,String additionalamount) {
		search_Vendor(vendorname);
		click_InvoiceDetails();
		click_AdditionalCostsbutton();
		select_CostPrice();
		enter_NetAmount(netamount);
		click_ApplyChanges();
		pause(20000);
		click_BackToSearch();
		click_EditButtonInvoice();
		clear_InvoiceAmountTextBox();
		enter_Invoice(additionalamount);
		pause(1000);
		click_Save();
	}
	
	public void search_Vendor(String vendorname) {
		waitForElementPresent(VendorInvoiceEntryPageObjects.vendorsearchtextbox);
		enterText(VendorInvoiceEntryPageObjects.vendorsearchtextbox, vendorname);
		logger.info("Entered vendor name in vendor search is :::::"+vendorname);
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicedetailsbutton);
	}
	
	public void click_InvoiceDetails() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.invoicedetailsbutton);
		click(VendorInvoiceEntryPageObjects.invoicedetailsbutton);
		logger.info("Clicked on the invoice details button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.additionalcostsbutton);
	}
	
	public void click_AdditionalCostsbutton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.additionalcostsbutton);
		click(VendorInvoiceEntryPageObjects.additionalcostsbutton);
		logger.info("Clicked on Additional Costs Button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.addlinebutton);
	}
	
	public void select_CostPrice() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.costpricebox);
		click(VendorInvoiceEntryPageObjects.costpricebox);
		logger.info("Clicked on Cost Price box");
		waitForElementPresent(VendorInvoiceEntryPageObjects.costpricedropdown);
		selectValuefromDropDown_ByIndex(VendorInvoiceEntryPageObjects.costpricedropdown, 6);
	}
	
	public void enter_NetAmount(String amount) {
		pause(2000);
		waitForElementPresent(VendorInvoiceEntryPageObjects.netamountbox);
		click(VendorInvoiceEntryPageObjects.netamountbox);
		logger.info("Clicked on the net amount box");
		waitForElementPresent(VendorInvoiceEntryPageObjects.netamounttextbox);
		enterText(VendorInvoiceEntryPageObjects.netamounttextbox, amount);
		logger.info("Entered net amount is ::::"+amount);
	}
	
	public void click_ApplyChanges() {
		waitForElementPresent(PurchaseOrderRecieptPageObjects.applychangesbutton);
		click(PurchaseOrderRecieptPageObjects.applychangesbutton);
		logger.info("Clicked on apply changes button");
	}
	
	public void click_BackToSearch() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.backbutton);
		click(VendorInvoiceEntryPageObjects.backbutton);
		logger.info("Clicked on Back Button");
		waitForElementPresent(VendorInvoiceEntryPageObjects.editbutton);
	}
	public void click_addCreditDebitNotebutton() {
		waitForElementPresent(VendorInvoiceEntryPageObjects.addCreditDebitNotebuttonInvoiceEntrypage);
		click(VendorInvoiceEntryPageObjects.addCreditDebitNotebuttonInvoiceEntrypage);
		logger.info("Clicked on addCreditDebitNote Button");
	}
	
}