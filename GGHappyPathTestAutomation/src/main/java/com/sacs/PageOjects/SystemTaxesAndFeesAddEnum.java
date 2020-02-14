package com.sacs.PageOjects;

public enum SystemTaxesAndFeesAddEnum {
	
	SYSTEM_MENUITEM("system","id"),
	TAXES_FEES_MENUITEM("taxfeesurcharge","id"),
	ADD_TAX_CODE_BTN("//a[@class='addBtn btnSkin']","xpath"),
	TYPE("//select[@id='Type']","xpath"),
	DESCRIPTION_CODE("//input[contains(@id,'Code')]","xpath"),
	DESCRIPTION(".//*[@id='Description']","xpath"),
	APGL_ACCOUNT("//input[contains(@id,'APGLAccount')]","xpath"),
	ARGL_ACCOUNT("//input[contains(@id,'ARGLAccount')]","xpath"),
	
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	BACK_TO_SEARCH("//a[@id='backToSearch']","xpath"),
	CODE_ON_LANDING_PAGE("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	GROUPBY("//*[@id='GroupBy']", "xpath"),
	SAPTAXCODE("//*[@id='SAPTaxCode']", "xpath"),
	TYPE_DD("//*[@id='Type']", "xpath"),
	SEARCHEDRECORD("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	ADDLINE("//*[@id='addLine']/a", "xpath"),
	STARTDATE_CLICK("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[2]", "xpath"),
	STARTDATE_INPUT("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[2]/span/span/input", "xpath"),
	STOPDATE_CLICK("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[3]", "xpath"),
	STOPDATE_INPUT("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[3]/span/span/input", "xpath"),
	APPLYCHANGES("//*[@id=' applychanges']", "xpath"),
	SEARCH("//div[@id='searchContainer']","xpath"),
	SEARCHINVERTEDSYMBOL("//div[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SEARCH_TYPE("//input[@id='TaxFeeType']","xpath"),
	SEARCH_CODE("//input[@id='TaxFeeCode']","xpath"),
	SEARCH_DESCRIPTION("//input[@id='CCDescription']","xpath"),
	SEARCH_WHTCODE("//input[@id='WHTCode']","xpath"),
	SEARCH_ICON("//div[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SEARCH_RESULTS("//div[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	CODE_FIRST("//div[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	WHTCODE_FIRST("//div[@id='results']/table/tbody/tr[1]/td[3]","xpath"),
	DESC_FIRST("//div[@id='results']/table/tbody/tr[1]/td[4]","xpath"),
	PAGINATION_FIRST("//div[@id='results']/div/div/a[1]/span","xpath"),
	PAGINATION_PREV("//div[@id='results']/div/div/a[2]/span","xpath"),
	PAGINATION_NEXT("//div[@id='results']/div/div/a[3]/span","xpath"),
	PAGINATION_LAST("//div[@id='results']/div/div/a[4]/span","xpath"),
	TYPE_COL1("//div[@id='results']/table/thead/tr/th[1]/a","xpath"),
	CODE_COL2("//div[@id='results']/table/thead/tr/th[2]/a","xpath"),
	WHTCODE_COL3("//div[@id='results']/table/thead/tr/th[3]/a","xpath"),
	DESC_COL4("//div[@id='results']/table/thead/tr/th[4]/a","xpath"),
	ADDFINANCECOMPONENETBUTTON("//a[@id='addNew']","xpath"),
	FINANCECOMPONENET_OKBUTTON("//a[@id='okButton']","xpath"),
	FC_CODE("//input[@id='Code']","xpath"),
	FC_DESC("//input[@id='Description']","xpath"),
	SAVEICON("//div[@id='saveTaxFeesSurcharge']/a","xpath"),
	LASTUPDATED("//div[@id='lastUpdatedContainer']","xpath"),
	UNITCODE("//span[contains(text(),'UNIT CODE')]","xpath"),
	STARTDATE("//span[contains(text(),'Start Date')]","xpath"),
	STOPDATE("//span[contains(text(),'Stop Date')]","xpath"),
	VALUE("//span[text()='VALUE']","xpath"),
	VALUE_CLICK("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[4]","xpath"),
	VALUE_INPUT("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[4]/input","xpath"),
	VALUETYPE("//span[text()='VALUE TYPE']","xpath"),
	VALUETYPE_CLICK("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[5]","xpath"),
	VALUETYPE_SELECT("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[5]/select","xpath"),
	UNITCODE_CLICK("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[1]","xpath"),
	UNITCODE_SELECT(".//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[1]/select","xpath"),
	STARTDATEICON("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[2]/span/span/span/span","xpath"),
	STOPDATEICON("//*[@id='taxFeesSurchargeGrid']/div[6]/div/div/div/div[3]/span/span/span/span","xpath"),
	COPYICON_FIRSTLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[6]/span/a","xpath"),
	COPYICON_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[6]/span/a","xpath"),
	DELICON_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[7]/span/a","xpath"),
	DELICON_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[7]/span/a","xpath"),
	UNITCODE_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[1]/div","xpath"),
	UNITCODE_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[1]/div","xpath"),
	STARTDATE_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[2]","xpath"),
	STARTDATE_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[2]","xpath"),
	STOPDATE_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[3]","xpath"),
	STOPDATE_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[3]","xpath"),
	VALUE_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[4]","xpath"),
	VALUE_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[4]","xpath"),
	VALUETYPE_FIRLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[1]/div[5]","xpath"),
	VALUETYPE_SECLINE("//div[@id='taxFeesSurchargeGrid']/div[6]/div/div/div[2]/div[5]","xpath"),
	CALCEL_DELETE("//div[@id='removeAlert']/div[3]/a[2]","xpath"),
	CONTINUE_DELETE("//div[@id='removeAlert']/div[3]/a[2]","xpath"),
	SEARCH_INPUT("//input[@id='articlesearch']","xpath"),
	LASTUPDATEDBYANDDATE("//span[@id='lastUpdatedByAndDate']","xpath"),
	;
	
	public String element,Identifier;
	private SystemTaxesAndFeesAddEnum(String element){
		 this.element = element;
	 }
	private SystemTaxesAndFeesAddEnum(String element, String Identifier){
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
