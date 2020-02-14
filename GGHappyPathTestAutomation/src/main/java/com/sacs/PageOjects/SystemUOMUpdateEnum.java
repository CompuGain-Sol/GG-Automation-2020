package com.sacs.PageOjects;

public enum SystemUOMUpdateEnum {
	
	SYSTEM_MENUITEM("system","id"),
	UOM_MENUITEM("unitofmeasure","id"),
	ADD_UOM_BTN("//a[@class='addBtn btnSkin']","xpath"),
	UOM_ID(".//*[@id='UnitofMeasure']","xpath"),
	UOM_DESC(".//*[@id='Description']","xpath"),
	RC_CONVERSION_FACTOR("//*[@id='RcUnitConvFactor']","xpath"),
	CP_CONVERSION_FACTOR("//*[@id='CPCUnitConvFactor']","xpath"),
	RC_UNIT(".//*[@id='RcUnit']","xpath"),
	CP_UNIT("//*[@id='CPCUnit']","xpath"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	
	SEARCH_BOX("//input[@id='articlesearch']","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	
	
    ;
	
	public String element,Identifier;
	private SystemUOMUpdateEnum(String element){
		 this.element = element;
	 }
	private SystemUOMUpdateEnum(String element, String Identifier){
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
