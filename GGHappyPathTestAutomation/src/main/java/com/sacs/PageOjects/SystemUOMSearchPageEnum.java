package com.sacs.PageOjects;

public enum SystemUOMSearchPageEnum {
	
	SYSTEM_MENUITEM("system","id"),
	UOM_MENUITEM("unitofmeasure","id"),
	ADD_UOM_BTN("//a[@class='addBtn btnSkin']","xpath"),
	UOM_PAGETITLE("//h1[contains(.,'Unit of Measure')]","xpath"),
	//ADD_UOM_BTN("//a[contains(.,'Add UOM')]","xpath"),
	
	UOM_ID(".//*[@id='UnitofMeasure']","xpath"),
	UOM_DESC(".//*[@id='Description']","xpath"),
	RC_UNIT(".//*[@id='RcUnit']","xpath"),
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	SEARCH_BOX("//input[@id='articlesearch']","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[2]"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	PAGINATION_OPTIONS("//*[@id='pager_top']/div","xpath"),
	SEARCH_CONTAINER("//*[@id='searchContainer']/div[2]","xpath"),
	ADD_UOM_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	NO_DATA_XPATH("//*[@id='results']/table/tbody/tr/td","xpath"),
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//*[@id='pager_top']/div/a[3]/span", "xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='pager_top']/div/a[2]/span", "xpath"),
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='pager_top']/div/a[1]/span", "xpath"),
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='pager_top']/div/a[4]/span", "xpath"),
	
	SEARCH_ENTERIES_INVERTER_SYMBOL("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item"),
	SEARCH_RESULT_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[1]/a", "xpath"),
	SEARCH_RESULT_GRID_DESCRIPTION_COLUMN_CLASS("articlerow,className"),
	UOM_ID_CHECK_BOX_XPATH("//*[@id='searchContainer']/div[2]/div[1]/label/span","xpath"),
	DESCRIPTION_CHECK_BOX_XPATH("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	TOAST_CONTAINER_CLASS_NAME("toast-message", "className"),
	
	;
	
	public String element,Identifier;
	private SystemUOMSearchPageEnum(String element){
		 this.element = element;
	 }
	private SystemUOMSearchPageEnum(String element, String Identifier){
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
