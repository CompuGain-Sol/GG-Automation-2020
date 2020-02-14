package com.sacs.PageOjects;

public enum InvoiceTransferforGovernmentApprovalEnum {

	INVOICE("//*[@id='invoice']", "xpath"),
	TRANSFERGOVTAPPROVAL("//*[@id='approval']/a", "xpath"),
	TRANSFERGOVTAPPROVAL_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	OK_BTN("//*[@id='selSourceWrapper']/div[2]/span/a", "xpath"),
	FLIGHT_TEXTBOX("//*[@id='invGenGrid']/div[4]/div[1]/div[2]/div[6]/input", "xpath"),
	CHECKBOX("//*[@id='checkSelBox00']", "xpath"),
	SUBMIT_FOR_APPROVAL("//*[@id='submitApproval']", "xpath"),
	CONFIRM_CONTINUBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	;
	
	public String element,Identifier;
	private InvoiceTransferforGovernmentApprovalEnum(String element){
		 this.element = element;
	 }
	private InvoiceTransferforGovernmentApprovalEnum(String element, String Identifier){
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
