package com.sacs.PageOjects;

public enum SystemCombinedClassesAddEnum {

	
	SYSTEM_MENUITEM("system","id"),
	TOAST_MESSAGE("toast-message","className"), 
	COMBINEDCLASSES("//*[@id='combinedclasses']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	APPLY_CHANGES("//*[@id='saveContainer']/a","xpath"),
	ADD_NEW_COMBINED_CLASS("//*[@id='contentHeader']/div[2]/a","xpath"),
	BACK_TO_SEARCH("//*[@id='contentHeader']/div[2]/a","xpath"),
	RESULT_GRID_FIRST_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	COMBINED_CLASS_ID_TEXTBOX("//*[@id='CombinedClassId']","xpath"),
	DESCRIPTION_TESTBOX("//*[@id='Description']","xpath"),
	COMBINED_CLASSES_DROPDOWN("//*[@id='CombinedClasses']/span/div/div","xpath"),
	COMBINED_CLASSES_DROPDOWN_LIST("//*[@id='AirClassCode-list']","xpath"),
	APPLY_CHANGES_ICON("//*[@id='saveCombinedClass']/a","xpath"),
	LAST_UPDATED("//*[@id='lastUpdatedContainer']","xpath"),
	TOASTCANCEL("//*[@id='toast-container']/div/button","xpath"), 
	CONFIRM_CHANGES("//*[@id='confirmChangesAlert']","xpath"),
	CONTINUE("//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	;
	
	
	
public String element, identifier;
	
	private SystemCombinedClassesAddEnum(String element){
		 this.element = element;
	 }
	
	private SystemCombinedClassesAddEnum(String element, String identifier){
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
