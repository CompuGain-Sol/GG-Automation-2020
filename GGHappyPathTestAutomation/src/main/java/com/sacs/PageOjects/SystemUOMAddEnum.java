package com.sacs.PageOjects;

public enum SystemUOMAddEnum {
	
	SYSTEM_MENUITEM("system","id"),
	UOM_MENUITEM("unitofmeasure","id"),
	ADD_UOM_BTN("//a[@class='addBtn btnSkin']","xpath"),
	UOM_ID(".//*[@id='UnitofMeasure']","xpath"),
	UOM_DESC(".//*[@id='Description']","xpath"),
	RC_UNIT(".//*[@id='RcUnit']","xpath"),
	
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	RC_UNIT_CONVERSION_FACTOR("//*[@id='RcUnitConvFactor']", "xpath"),
	CP_UNIT_CONVERSION_FACTOR("//*[@id='CPCUnitConvFactor']", "xpath"),
	CP_UNIT_CONVERSION_FACTOR_ID("CPCUnitConvFactor", "id"),
	RC_UNIT_CONVERSION_FACTOR_ID("RcUnitConvFactor","id"),
	RC_UOM_ID("CPCUnit","id"),
	UOM_ID_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[1]/div/span/span","xpath"),
	DESCRIPTION_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[2]/div/span/span","xpath"),
	RC_UNIT_CONVERSION_FACTOR_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[3]/div[1]/div/span/span","xpath"),
	CONFIRMATION_POP_UP("//*[@id='confirmChangesAlert']","xpath"),
	CONTINUE_BUTTON("//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	BACK_TO_SEARCH_BUTTON("//*[@id='contentHeader']/div[2]/a","xpath"),						
	SEARCH_BAR("//*[@id='articlesearch']","xpath"),
	ENTER_SEARCH_BTN("//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SEARCH_RESULT_FIRST_COLUMN("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCH_GRID_UOMID("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	CPC_UNIT("//*[@id='CPCUnit']", "xpath"),
	SELECT_CPCUNIT("html/body/ul[2]/li[2]/a", "xpath"),
    ;
	
	public String element,Identifier;
	private SystemUOMAddEnum(String element){
		 this.element = element;
	 }
	private SystemUOMAddEnum(String element, String Identifier){
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
