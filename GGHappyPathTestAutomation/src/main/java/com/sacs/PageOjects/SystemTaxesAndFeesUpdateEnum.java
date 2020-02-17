package com.sacs.PageOjects;

public enum SystemTaxesAndFeesUpdateEnum {
	
	SYSTEM_MENUITEM("system","id"),
	TAXES_FEES_MENUITEM("taxfeesurcharge","id"),
	
	ADD_TAX_CODE_BTN("//a[@class='addBtn btnSkin']","xpath"),
	TYPE("//select[@id='Type']","xpath"),
	DESCRIPTION_CODE("//input[contains(@id,'Code')]","xpath"),
	APGL_ACCOUNT("//input[contains(@id,'APGLAccount')]","xpath"),
	ARGL_ACCOUNT("//input[contains(@id,'ARGLAccount')]","xpath"),
	
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[3]/a[1]","xpath"),
	SEARCH_BOX("//input[@id='articlesearch']","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	
	;
	
	public String element,Identifier;
	private SystemTaxesAndFeesUpdateEnum(String element){
		 this.element = element;
	 }
	private SystemTaxesAndFeesUpdateEnum(String element, String Identifier){
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
