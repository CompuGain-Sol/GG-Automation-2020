package com.sacs.PageOjects;

public enum SystemCostCenterSearchPageEnum {
	
	SYSTEM_MENUITEM("system","id"),
	
	COSTCENTER_MENUITEM("costcenter","id"),
	COSTCENTER_PAGETITLE("//h1[contains(.,'Cost Center ')]","xpath"),
	
	SEARCH_BOX("//input[@id='costCenterSearch']","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"), 
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	UPDATE_COSTCENTER_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	//BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[2]/a","xpath"),
	UPDATE_APPY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	SEARCH_FILTER_BUTTON("action-searchFilter", "className"),
	SEARCH_FILTER_DESC_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[2]/label/span", "xpath"),
	SEARCH_FILTER_DESC_CHECKBOX_2(".//*[@id='searchContainer']/div[3]/div[2]/label/span", "xpath"),
	SEARCH_FILTER_EXPAND_BTN(".//*[@id='searchContainer']/div[2]/span[3]/a/img", "xpath"),
	SEARCH_FILTER_MAIN_STR_CODE_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[1]/label[2]/span", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	
	
	;
	
	public String element,Identifier;
	private SystemCostCenterSearchPageEnum(String element){
		 this.element = element;
	 }
	private SystemCostCenterSearchPageEnum(String element, String Identifier){
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
