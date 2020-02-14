package com.sacs.PageOjects;

public enum SystemClassesEnums {
	SYSTEM_MENUITEM("system","id"),
	APPLY_CHANGES_BTN("//*[@id='nav']/li[1]/a/div","xpath"),
	APPLY_CHANGES_BTN1("applyChanges","id"),
	
	SYSTEM("//*[@id='system']/li", "xpath"),					
	LAST_UPDATED("//*[@id='lastUpdatedContainer']","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	CLASSES_TITLE(".//*[@id='contentHeader']/div/h1","xpath"),
	CLASSES("//*[@id='airclasses']/a","xpath"),
	CODE("//*[@id='Code']","xpath"),
	UNIT_FIRST_DESCRIPTION("//*[@id='acdescription_0']","xpath"),
	CCR_XPATH(".//tr[@id='airClassesDiv_0']//span[@class='formDropDown']/select","xpath"),
	//PAX_RELATED_XPATH("//*[@id='IsPaxRelated0']/span","xpath"),
	PAX_RELATED_XPATH("//*[@id='ACType0']/span","xpath"),
	ON_PROD_PLAN_XPATH("//*[@id='IsProductionPlanRelated']","xpath"),
	COMBINED_CLASSES("//*[@id='combinedclasses']/a","xpath"),
	ADD_COMBINED_CLASS(".//*[@id='contentHeader']/div[2]/a","xpath"),
	COMBINED_CLASSES_DROPDOWN_FIRST_ITEM("//*[@id='AirClassCode_option_selected']","xpath"),
	COMBINED_CLASSES_DROPDOWN("//*[@id='CombinedClasses']/div/div/div","xpath"),
	CODE_FIRSTROW("//*[@id='airClassesDiv_0']/td[2]", "xpath"),
	DESC_FIRSTROW("//*[@id='acdescription_0']", "xpath"),
;
	
	public String element, identifier;
	
	private SystemClassesEnums(String element){
		 this.element = element;
	 }
	
	private SystemClassesEnums(String element, String identifier){
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
