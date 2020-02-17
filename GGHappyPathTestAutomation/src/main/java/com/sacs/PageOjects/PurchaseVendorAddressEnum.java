package com.sacs.PageOjects;

public enum PurchaseVendorAddressEnum {
	
	
	VENDOR_ADDRESS_XPATH(".//*[@id='upLoad']/div", "xpath"),
	BILLING_ADDRESS_TITLE(".//*[@id='addWrapper']/div[1]/h2", "xpath"),
	ORDERING_ADDRESS_TITLE(".//*[@id='addWrapper']/div[2]/h2", "xpath"),
	RETURNS_ADDRESS_TITLE(".//*[@id='addWrapper']/div[3]/h2", "xpath"),
	
	BILLING_ADDRESS(".//*[@id='Billing_Address1']", "xpath"),
	BILLING_CITY(".//*[@id='Billing_City']", "xpath"),
	BILLING_STATE(".//*[@id='Billing_StateOrProvince']", "xpath"),
	BILLING_COUNTRY(".//*[@id='Billing_Country']", "xpath"),
	BILLING_ZIPCODE(".//*[@id='Billing_ZipCode']", "xpath"),
	
	ORDERING_ADDRESS(".//*[@id='Ordering_Address1']", "xpath"),
	ORDERING_CITY(".//*[@id='Ordering_City']", "xpath"),
	ORDERING_STATE(".//*[@id='Ordering_StateOrProvince']", "xpath"),
	ORDERING_COUNTRY(".//*[@id='Ordering_Country']", "xpath"),
	ORDERING_ZIPCODE(".//*[@id='Ordering_ZipCode']", "xpath"),
	
	RETURNS_ADDRESS(".//*[@id='Return_Address1']", "xpath"),
	RETURNS_CITY(".//*[@id='Return_City']", "xpath"),
	RETURNS_STATE(".//*[@id='Return_StateOrProvince']", "xpath"),
	RETURNS_COUNTRY(".//*[@id='Return_Country']", "xpath"),
	RETURNS_ZIPCODE(".//*[@id='Return_ZipCode']", "xpath"),
	
	TOAST_MESSAGE("toast-message","className"),
	APPLYCHANGES("(//div[@id='saveContainer']/a)[2]", "xpath"),
	
	ORDERING_CHECKBOX("//*[@id='addWrapper']/div[1]/div[6]/div[1]/label/span", "xpath"),
	RETURNS_CHECKBOX(".//*[@id='addWrapper']/div[1]/div[6]/div[2]/label/span", "xpath"),
	;
	private String element;
	private String Identifier;
	
	private PurchaseVendorAddressEnum(String element){
		 this.element = element;
	 }
	private PurchaseVendorAddressEnum(String element, String Identifier){
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
