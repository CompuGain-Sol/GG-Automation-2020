package com.sacs.PageOjects;

public enum SystemCombinedClassesSearchEnum {

	SYSTEM_MENUITEM("system","id"),
	TOAST_MESSAGE("toast-message","className"), 
	COMBINEDCLASSES("//*[@id='combinedclasses']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	PAGINATION_LINKS_XPATH("//*[@id='pager_top']/div","xpath"),
	ADD_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	ITEMS_PER_PAGE_DROP_DOWN_BTN("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	
	RESULT_GRID_FIRST_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	RESULT_GRID_FIRST_COLUMN_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	
	
	RESULT_GRID_FIRST_COLUMN_FIFTH_ROW("//*[@id='results']/table/tbody/tr[5]/td[1]","xpath"),
	
	RESULT_GRID_SECOND_COLUMN_FIFTH_ROW("//*[@id='results']/table/tbody/tr[5]/td[2]","xpath"),
	RESULT_GRID_SECOND_COLUMN_FIFTH_ROW_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	
	RESULT_GRID_THIRD_COLUMN_FIFTH_ROW("//*[@id='results']/table/tbody/tr[5]/td[3]","xpath"),
	RESULT_GRID_THIRD_COLUMN_FIFTH_ROW_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[3]","xpath"),
	
	APPLY_CHANGES("//*[@id='saveContainer']/a","xpath"),
	
	COMBINED_CLASS_CODE_SEARCH_CRITERION(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	CLASSES_SEARCH_CRITERION("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	DESCRIPTION_CRITERION("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	SEARCH_CONTAINER("//*[@id='searchContainer']/div[2]","xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SEARCH_BUTTON("//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SEARCH_BOX(".//*[@id='articlesearch']","xpath"),
	NO_DATA_TO_DISPLAY("//*[@id='results']/table/tbody/tr/td","xpath"),
	
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//*[@id='pager_top']/div/a[3]/span","xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='pager_top']/div/a[2]/span","xpath"),
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='pager_top']/div/a[4]/span","xpath"),
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='pager_top']/div/a[1]/span","xpath"),
	SEARCH_ENTERIES_INVERTER_SYMBOL("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item"),
	SEARCH_RESULT_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	SEARCH_RESULT_GRID_CLASS_COLUMN_CLASS("articlerow","className"),
	CLOSE_BTN_ON_CANNOT_DELETE_POPUP("//*[@id='loadingModal']/div[2]/a","xpath"),
	COMBINEDCLASSES_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	DESCRIPTION_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	CLASSES_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[3]", "xpath"),
;
	
	public String element, identifier;
	
	private SystemCombinedClassesSearchEnum(String element){
		 this.element = element;
	 }
	
	private SystemCombinedClassesSearchEnum(String element, String identifier){
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
