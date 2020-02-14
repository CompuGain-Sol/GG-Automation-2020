package com.sacs.PageOjects;

public enum PurchaseAddVendorEnum {
	
	
	PURCHASE("purchase","id"),
	STORES("stores","id"),
	VENDORS_LINKTEXT("Vendors","linkText"),
	ADD_VENDOR_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ADDVENDOR_LINKTEXT("Add Vendor", "linkText"),
	VENDOR_NAME_ID("Name","id"),
	VENDOR_NUMBER_ID("VendorNumber", "id"),
	ACCOUNT_OWNER_TEXT_ID("ContractRepName","id"),
	AREA_CATEGORY_CODE_SLCT_ID("AreaCode","id"),
	AREA_CATEGORY_CODE_NAME("AreaCode_input","name"),
	AREA_CATEGORY_CODE_XPATH(".//*[@id='formBody']/div[1]/div[4]/div/span/span/span[1]","xpath"),
	//AREA_CATEGORY_CODE_XPATH("/html/body/div/div/div[2]/section/div/div[7]/form/div/div/div[4]/span/span/span"),
	ORD_DESCRIPTION_ID("OrderDescription","id"),
	BATCH_CONTROL_XPATH("//*[@id='formBody']/div[1]/div[9]/label/span","xpath"),
	//BATCH_CONTROL_XPATH(".//*[@id='formBody']/div[1]/label[1]/span"),
	CUSTOMER_ID("CustomerId","id"),
	ORD_DESC_ERROR_MSG_XPATH("//span[@for='OrderDescription']", "xpath"),
	PAYMENT_TERMS_SLCT_ID("PaymentTerms","id"),
	PAYMENT_TERMS_SLCT_XPATH(".//*[@id='PaymentTerms']","xpath"),
	PAYMENT_DAYS_ID("PaymentDays","id"),
	CURRENCY_CODE_ID("CurrencyCode","id"),
	CURRENCY_CODE_XPATH(".//*[@id='CurrencyCode']", "xpath"),
	VAT_CODE_ID("VATId","id"),
	COST_CENTER_CODE_ID("CostCenterCode","id"),
	COST_CENTER_CODE_XPATH(".//*[@id='CostCenterCode']", "xpath"),
	ACCOUNT_NUMBER_ID("FinanceVendorId","id"),
	FINANCE_SYS_ID("FinanceVendorId","id"),
	VENDOR_REBATE("VendorRebate","id"),
	NOTES_ID("Notes","id"),
	LAST_AUDIT_DATE("LastAuditDate","id"),
	AUDIT_BY_ID("AuditedBy","id"),
	AUDIT_COMMENTS_ID("AuditComment","id"),
	//APPLY_CHANGES_LINK_TEXT("SApply Changes","linkText"),
	//APPLY_CHANGES_LINK_TEXT(".//*[@id='saveContainer']/a","xpath"),
	APPLY_CHANGES_LINK_TEXT(".//*[@id='applyChanges']","xpath"),
	VALIDATION_ERROR_MSG_CLASS("toast-top-right","className"),
	TOAST_MESSAGE("toast-message","className"),
	VALIDATOR_FOR_VENDOR_CONTRACT_DATE(".//*[@id='formBody']/div[1]/div[22]/div/span/span","xpath"),
	BACK_TO_SEARCH_LINK_TEXT("Back to Search","linkText"),
	ADD_VENDOR_BATCH_CONTROL_XPATH("/html/body/div/div/div[2]/section/div/div[7]/form/div/div/label/span","xpath"),
	ADD_VENDOR_PAYMENT_DAYS_ERR_MSG_XPATH(".//*[@id='formBody']/div[1]/div[11]/div/span/span","xpath"),
	//ADD_VENDOR_PAYMENT_DAYS_ERR_MSG_XPATH("/html/body/div/div/div[2]/section/div/div[7]/form/div/div/div[11]/span/span"),
	VENDOR_SEARCH_GRID_NEXT_LINK_XPATH("/html/body/div/div/div[2]/section/div[4]/div[3]/div/a[3]/span","xpath"),
	VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_HEADING_XPATH(".//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	
	VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_XPATH(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	//VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_XPATH("/html/body/div/div/div[2]/section/div[4]/div[4]/table/tbody/tr/td[2]","xpath"),
	VENDOR_SEARCH_GRID_SHOWING_ENTRIES_XPATH("//*[@id='gridWrapper']/div[1]/div[3]","xpath"),
	EDIT_VENDOR_PAGE_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	VENDORSTITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	VENDOR_ADDRESS(".//*[@id='upLoad']/div", "xpath"),
	VENDOR_CONTACT(".//*[@id='nav']/li[3]/a/div", "xpath"),
	VENDOR_COPY(".//*[@id='copyVendor']/div/a", "xpath"),
	VENDOR_REMOVE(".//*[@id='removeVendor']/a", "xpath"),
	CONTRACT_START_DATE_FIELD("ContractStartDate", "id"),
	CONTRACT_END_DATE_FIELD("ContractEndDate", "id"),
	START_DATE_XPATH(".//*[@id='formBody']/div[1]/div[20]/span[2]/span/span", "xpath"),
	END_DATE_XPATH(".//*[@id='formBody']/div[1]/div[21]/span[2]/span/span", "xpath"),
	DATEPICKER_NEXT_XPATH("/html/body/div[8]/div/div/div/a[3]/span", "xpath"),
	DATEPICKER_PREV_XPATH("/html/body/div[8]/div/div/div/a", "xpath"),
	DATEPICKER_MONTH_YEAR_TEXT_XPATH("//a[@aria-atomic='true']", "xpath"),
	CONNECTEDBASICARTICLES(".//*[@id='conbasicArticles']", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	FIRSTROW_FIRSTCOL("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	REMOVEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	VENDOR_NO("//*[@id='VendorNumber']", "xpath"),
	BACKTOSEARCH("//*[@id='backToSearch']", "xpath"),
	SEARCHRESULTS_TEXT("//*[@id='gridWrapper']/div[3]/span", "xpath"),
	SAP_NUMBER_FIELD("//*[@id='FinanceVendorId']", "xpath"),
	CONTINUE_CHANGES_BTN("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	;
	public String element,Identifier;
	private PurchaseAddVendorEnum(String element){
		 this.element = element;
	 }
	private PurchaseAddVendorEnum(String element, String Identifier){
		 this.element = element;
		 this.Identifier = Identifier;
	 }
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return Identifier;
	}

}
