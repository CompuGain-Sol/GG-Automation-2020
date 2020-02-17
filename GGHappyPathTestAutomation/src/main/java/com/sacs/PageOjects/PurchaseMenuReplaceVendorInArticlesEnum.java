package com.sacs.PageOjects;

public enum PurchaseMenuReplaceVendorInArticlesEnum {
	
	EXTENEDEDMENU(".//*[@id='nav']/li[5]/div", "xpath"),
	//REPLACE_VENDOR_ARTICLE("//a[contains(.,'Replace vendor in articles')]", "xpath"), 
	REPLACE_VENDOR_ARTICLE(".//*[@id='nav']/li[5]/ul/li/a", "xpath"),
	OK(".//*[@id='saveContainer']/a[1]", "xpath"),
	CANCEL(".//*[@id='saveContainer']/a[2]", "xpath"),
	VENDORNAME("//div[@id='articleTitle']", "xpath"),
	
	
	;
	
	
	public String element, identifier;
	private PurchaseMenuReplaceVendorInArticlesEnum(String element){
		 this.element = element;
	 }
	private PurchaseMenuReplaceVendorInArticlesEnum(String element, String identifier){
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
