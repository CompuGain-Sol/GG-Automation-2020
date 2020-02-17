package com.sacs.PageOjects;

public enum InvoicePriceandTurnoverGroupUpdateEnum {

	INVOICE("//*[@id='invoice']", "xpath"),
	IPTOG("//*[@id='priceandturnovergroupupdate']/a", "xpath"),
	IPTOG_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	SELECTSOURCE("//*[@id='InvoiceMonth']", "xpath"),
	OK_BTN("//*[@id='saveContainer']/a", "xpath"),
	PROCESS("//*[@id='SelectProcess']", "xpath"),
	STATUS("//*[@id='pastJobsGrid']/table/tbody/tr[1]/td[6]", "xpath"),
	PERIOD_FROMDATE("//*[@id='StartDate']", "xpath"),
	PERIOD_TODATE("//*[@id='EndDate']", "xpath"),
	CUSTOMER("//*[@id='CustomerCode']", "xpath"),
	CUSTOMER_SEARCHICON("//*[@id='ChildCustWrapper']/span[2]/a", "xpath"),
	CUST_CODE_FIRSTROW("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	CUST_NO_FIRSTROW("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[3]", "xpath"),
	CUST_NAME_FIRSTROW("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	CUSTOMER_SEARCH_CANCELBTN("//*[@id='childCustSearchCancel']", "xpath"),
	REFRESH("//a[@id='refresh']", "xpath"),
	;
	
	public String element,Identifier;
	private InvoicePriceandTurnoverGroupUpdateEnum(String element){
		 this.element = element;
	 }
	private InvoicePriceandTurnoverGroupUpdateEnum(String element, String Identifier){
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
