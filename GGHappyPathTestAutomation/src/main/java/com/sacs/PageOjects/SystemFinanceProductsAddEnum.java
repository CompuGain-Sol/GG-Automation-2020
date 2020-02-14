package com.sacs.PageOjects;

public enum SystemFinanceProductsAddEnum {
	
	SYSTEM_MENUITEM("system","id"),
	FINANCE_PRODUCTS_MENUITEM("sapglaccount","id"),
	PAGE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_FIN_PROD_BTN("//a[@class='addBtn btnSkin']","xpath"),
	PRODUCT_ID(".//*[@id='GLAccountNumber']","xpath"),
	//PRODUCT_ID(".//*[@id='ProductID']","xpath"),
	PRODUCT_DESC(".//*[@id='Description']","xpath"),
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	OK_BTN("//*[@id='okBtn']", "xpath"),
	RESTART_BTN("//*[@id='restartBtn']", "xpath"),
	
	;
	
	public String element,Identifier;
	private SystemFinanceProductsAddEnum(String element){
		 this.element = element;
	 }
	private SystemFinanceProductsAddEnum(String element, String Identifier){
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
