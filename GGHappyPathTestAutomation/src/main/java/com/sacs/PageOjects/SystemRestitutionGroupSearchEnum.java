package com.sacs.PageOjects;

public enum SystemRestitutionGroupSearchEnum {
	
	
	
	SYSTEM_MENUITEM("system","id"),
	RESTITUTION_GROUP_MENUITEM("restitutiongroup","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SEARCH_DROPDOWN_ICON("//img[contains(@class,'searchFilter')]","xpath"),
	SEARCH_OPTION_DESCRIPTION("//span[contains(.,'Description  ')]","xpath"),
	SEARCH_OPTION_RESTITUTION_GROUP("//span[contains(.,'Restitution Group')]","xpath"),
	
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	
	SEARCH_BOX("//*[@id='articlesearch']","xpath"),
	ADD_RESTITUTION_GROUP_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	PAGINATION_OPTIONS("//*[@id='pager_top']/div","xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SEARCH_CONTAINER("//*[@id='searchContainer']/div[2]","xpath"),
	BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	NO_DATA_XPATH("//*[@id='results']/table/tbody/tr/td","xpath"),
	
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//*[@id='pager_top']/div/a[3]/span", "xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='pager_top']/div/a[2]/span", "xpath"),
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='pager_top']/div/a[1]/span", "xpath"),
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='pager_top']/div/a[4]/span", "xpath"),
	
	SEARCH_ENTERIES_INVERTER_SYMBOL("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item"),
	SEARCH_RESULT_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[1]/a", "xpath"),
	SEARCH_RESULT_GRID_DESCRIPTION_COLUMN_CLASS("articlerow","className"),
	
	RESTITUTION_GROUP_CHECK_BOX_XPATH("//*[@id='searchContainer']/div[2]/div[1]/label/span","xpath"),
	DESCRIPTION_CHECK_BOX_XPATH("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	TOAST_CONTAINER_CLASS_NAME("toast-message", "className"),
	TOAST_MESSAGE("toast-message","className"), 
	ARTICLENUMBER_ON_PANEL("//*[@id='connectedArticlesResults']/table/thead/tr/th[1]/a","xpath"),
	DESCRIPTION_ON_PANEL("//*[@id='connectedArticlesResults']/table/thead/tr/th[2]","xpath"),
	UOM_ON_PANEL("//*[@id='connectedArticlesResults']/table/thead/tr/th[3]","xpath"),
	
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	;
	
	public String element,Identifier;
	private SystemRestitutionGroupSearchEnum(String element){
		 this.element = element;
	 }
	private SystemRestitutionGroupSearchEnum(String element, String Identifier){
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
