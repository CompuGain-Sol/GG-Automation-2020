package com.sacs.PageOjects;

public enum PurchaseRemoveVendorNotConnectedToBasicArticleEnum {
	
	REMOVE_VENDOR_LINK(".//*[@id='removeVendor']/a", "xpath"),
	REMOVE_VENDOR_POPUP_HEADING(".//*[@id='removeAlert']/div[1]", "xpath"),
	CONTINUE(".//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	CANCEL(".//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	
	;
	
public String element, identifier;
	
	private PurchaseRemoveVendorNotConnectedToBasicArticleEnum(String element){
		 this.element = element;
	 }
	
	private PurchaseRemoveVendorNotConnectedToBasicArticleEnum(String element, String identifier){
		 this.element = element;
		 this.identifier = identifier;
	 }
	
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return identifier;
	}
}
