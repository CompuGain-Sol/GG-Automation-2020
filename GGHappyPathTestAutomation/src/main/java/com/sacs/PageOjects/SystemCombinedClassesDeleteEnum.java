package com.sacs.PageOjects;



public enum SystemCombinedClassesDeleteEnum {

	SYSTEM_MENUITEM("system","id"),
	TOAST_MESSAGE("toast-message","className"), 
	COMBINEDCLASSES("//*[@id='combinedclasses']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	APPLY_CHANGES("//*[@id='saveContainer']/a","xpath"),
	RESULT_GRID_FIRST_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	RESULT_GRID_FIRST_COLUMN_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	
	COMBINED_CLASS_CODE_SEARCH_CRITERION(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	CLASSES_SEARCH_CRITERION("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	DESCRIPTION_CRITERION("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	SEARCH_CONTAINER("//*[@id='searchContainer']/div[2]","xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SEARCH_BUTTON("//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SEARCH_BOX("//*[@id='articlesearch']","xpath"),
	BACK_TO_SEARCH("//*[@id='contentHeader']/div[2]/a","xpath"),
	TOASTCANCEL("//*[@id='toast-container']/div/button","xpath"), 
	CONFIRM_DELETE("//*[@id='loadingModal']","xpath"),
	CONTINUE("Continue","linkText"),
	CANCEL("Cancel","linkText"),
	
	DELETE("//*[@id='removeCombinedClass']/a","xpath"),
	WASTE("//*[@id='loadingModal']/div[1]/div","xpath"),
	POPUP_TEXT(".//*[@id='loadingModal']/div[1]/div","xpath"),
	CLOSE_BTN_ON_CANNOT_DELETE_POPUP("//*[@id='loadingModal']/div[2]/a","xpath"),
	
	;
	
public String element, identifier;
	
	private SystemCombinedClassesDeleteEnum(String element){
		 this.element = element;
	 }
	
	private SystemCombinedClassesDeleteEnum(String element, String identifier){
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
