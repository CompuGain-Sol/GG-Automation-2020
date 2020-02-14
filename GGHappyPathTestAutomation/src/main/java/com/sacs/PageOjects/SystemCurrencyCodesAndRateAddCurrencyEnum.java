package com.sacs.PageOjects;

public enum SystemCurrencyCodesAndRateAddCurrencyEnum {
	
	SYSTEM("//*[@id='system']/li/p","xpath"),
	CURRENCY_CODES_AND_RATES("Currency Codes and Rates","linkText"),
	CURRENCY_CODES_AND_RATES_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	SEARCH_BAR("//*[@id='searchContainer']", "xpath"),
	Add_Button("//*[@id='contentHeader']/div[2]/a", "xpath"),
	PAGINATION_OPTION("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]", "xpath"),
	SEARCH_RESULT_GRID("//*[@id='results']/table/tbody/tr[2]/td[1]", "xpath"),
	
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[2]/span[3]/a/img", "xpath"),
	SEARCH_ENTERIES_INVERTER_SYMBOL("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	SEARCH_CONTAINER("//*[@id='searchContainer']/div[3]","xpath"),
	
	ADD_CURRENCY_CODE_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	UPDATE_CURRENCY_CODE_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	BACK_TO_SEARCH_BUTTON("//*[@id='contentHeader']/div[3]/a", "xpath"),
	SEARCH_BOX("//*[@id='articlesearch']", "xpath"),
	SEARCH_ENTER_BUTTON("//*[@id='searchContainer']/div[2]/span[2]/a/img", "xpath"),
	NO_DATA_DISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH_3("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH_1("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH_2("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//*[@id='pager_top']/div/a[3]/span", "xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='pager_top']/div/a[2]/span", "xpath"),
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='pager_top']/div/a[1]/span", "xpath"),
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='pager_top']/div/a[4]/span", "xpath"),
	SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item"),
	SEARCH_RESULT_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[1]/a", "xpath"),
	SEARCH_RESULT_GRID_DESCRIPTION_COLUMN_CLASS("articlerow","className"),
	SEARCH_CONTAINER_CURRENCY_CODE_CHECKBOX_XPATH("//*[@id='searchContainer']/div[3]/div[1]/label/span", "xpath"),
	SEARCH_CONTAINER_DESCRIPTION_CHECKBOX_XPATH("//*[@id='searchContainer']/div[3]/div[2]/label/span", "xpath"),
	TOAST_CONTAINER_XPATH("//*[@id='toast-container']/div/div", "xpath"),
	TOAST_CONTAINER_CLASS_NAME("toast-message", "className"),	
	;
	
	
	public String element,Identifier;
	private SystemCurrencyCodesAndRateAddCurrencyEnum(String element){
		 this.element = element;
	 }
	private SystemCurrencyCodesAndRateAddCurrencyEnum(String element, String Identifier){
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
