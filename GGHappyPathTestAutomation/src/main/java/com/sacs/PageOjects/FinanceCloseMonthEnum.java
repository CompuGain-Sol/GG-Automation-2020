package com.sacs.PageOjects;

public enum FinanceCloseMonthEnum {
	FINANCE(".//*[@id='finance']", "xpath"),
	CLOSEMONTH("//*[@id='subNav-finance']/li[1]", "xpath"),
	PAGETITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	;
	public String element,Identifier;
	/*private FinanceSalesInvoiceTransferEnum(String element){
		 this.element = element;
	 }*/
	private FinanceCloseMonthEnum(String element, String Identifier){
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
