package com.sacs.PageOjects;

public enum SystemCombinedClassesUpdateEnum {

	SYSTEM_MENUITEM("system","id"),
	TOAST_MESSAGE("toast-message","className"), 
	COMBINEDCLASSES("//*[@id='combinedclasses']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	APPLY_CHANGES("//*[@id='saveContainer']/a","xpath"),
	BACK_TO_SEARCH("//*[@id='contentHeader']/div[2]/a","xpath"),
	RESULT_GRID_FIRST_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	RESULT_GRID_FIRST_COLUMN_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
			
	COMBINED_CLASS_ID_TEXTBOX("//*[@id='CombinedClassId']","xpath"),
	DESCRIPTION_TESTBOX("//*[@id='Description']","xpath"),
	COMBINED_CLASSES_DROPDOWN("//*[@id='CombinedClasses']/div/div/div","xpath"),
	COMBINED_CLASSES_DROPDOWN_LIST("//*[@id='AirClassCode-list']","xpath"),
	APPLY_CHANGES_ICON("//*[@id='saveCombinedClass']/a","xpath"),
	LAST_UPDATED("//*[@id='lastUpdatedContainer']","xpath"),
	
	MENU_XPATH("//*[@id='menuContainer']/div","xpath"),
	DELETE_CLASSES("//*[@id='AirClassCode_taglist']/li[1]/span[2]","xpath"),
	DELETE_LAST_CLASS("//*[@id='AirClassCode_taglist']/li/span[2]","xpath"),
	
	
	;
	public String element, identifier;
	
	private SystemCombinedClassesUpdateEnum(String element){
		 this.element = element;
	 }
	
	private SystemCombinedClassesUpdateEnum(String element, String identifier){
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
