package com.sacs.PageOjects;

public enum SystemCostCenterEnum {
	
	SYSTEM("//*[@id='system']/li/p","xpath"),
	COST_CENTER("//*[@id='costcenter']/a","xpath"),
	COST_CENTER_PAGE_HEADING("//*[@id='contentHeader']/div[1]/h1","xpath"),
	COST_CENTER_SEARCH("//*[@id='costCenterSearch']","xpath"),
	ADD_COST_CENTER_BTN("Add Cost Center","linkText"),
	COST_CENTER_DROPDOWN("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
	COST_CENTER_RESULT_GRID("//*[@id='results']/table/tbody/tr[3]/td[1]","xpath"),
	COST_CENTER_SEARCH_CLICK("//*[@id='searchContainer']/div[2]/span[3]/a/img","xpath"),
	COST_CENTER_SEARCH_BUTTON("//*[@id='searchContainer']/div[2]/span[2]/a/img","xpath"),
	COST_CENTER_SEARCH_OPTIONS("//*[@id='searchContainer']/div[3]","xpath"),
	ADD_COST_CENTER_PAGE(".//*[@id='contentHeader']/div[2]/a","xpath"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	BACK_COST_CENTER_BUTTON(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SEARCH_RESULT_GRID_ROW("//*[@id='results']/table/tbody/tr/td","xpath"),
	COST_CENTER_SEARCH_RESULT_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	COST_CENTER_SEARCH_RESULT_FIRST_DES_ROW("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	COST_CENTER_SEARCH_RESULT_AFTER_CLICK_FIRST_DES_ROW("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	COST_CENTER_SEARCH_RESULT_AFTER_CLICK_FIRST_ID_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	COST_CENTER_SEARCH_RESULT_NEXT_PAGE_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	COST_CENTER_SEARCH_RESULT_LAST_PAGE_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	COST_CENTER_SHOW_ENTERY_NEXT_BUTTON("//*[@id='pager_top']/div/a[3]/span","xpath"),
	COST_CENTER_SHOW_ENTERY_LAST_BUTTON("//*[@id='pager_top']/div/a[4]/span","xpath"),
	COST_CENTER_SHOW_ENTERY_PREV_BUTTON("//*[@id='pager_top']/div/a[2]/span","xpath"),
	COST_CENTER_SHOW_ENTERY_FIRST_BUTTON("//*[@id='pager_top']/div/a[1]/span","xpath"),
	COST_CENTER_SHOW_ENTERY_ARROW_BUTTON("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	COST_CENETER_RESULT_GRID_ROW_CLASS_NAME("articlerow","className"),
	COST_CENETER_RESULT_GRID_DES_HEADING_LINKTEXT("DESCRIPTION","linkText"),
	COST_CENETER_RESULT_GRID_ID_HEADING_LINKTEXT("ID","linkText"),
	SEARCH_RESULT_ROW("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	SEARCH_RESULT_DES_ROW("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	COST_CENTER_ID_CHECKBOX("//*[@id='searchContainer']/div[3]/div[1]/label/span","xpath"),
	COST_CENTER_DES_CHECKBOX("//*[@id='searchContainer']/div[3]/div[2]/label/span","xpath"),
	MESSAGE("toast-message","className"),
	RESULT_MESSAGE("//*[@id='results']/table/tbody/tr/td","xpath"),
	ROW_TO_DOUBLE_CLICK("//*[@id='results']/table/tbody/tr[2]/td[2]","xpath"),
	UPDATE_COST_CENTER_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	UNIT_LEVEL_SELECT_DROPDOWN("//*[@id='WorkingUnit']","xpath"),
	SEARCH_HEADING(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	GRID_FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	GRID_FIRST_ROW_SECOND_COL(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	;
	public String element,Identifier;
	private SystemCostCenterEnum(String element){
		 this.element = element;
	 }
	private SystemCostCenterEnum(String element, String Identifier){
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


