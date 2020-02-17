package com.sacs.PageOjects;

public enum InvoiceCloseMonthEnum {

	INVOICE("//*[@id='invoice']", "xpath"),
	CLOSEMONTH("//*[@id='closemonth']/a", "xpath"),
	CLOSEMONTH_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	;
	
	public String element,Identifier;
	private InvoiceCloseMonthEnum(String element){
		 this.element = element;
	 }
	private InvoiceCloseMonthEnum(String element, String Identifier){
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
