package com.sacs.PageOjects;

public enum SystemFinanceProductsEnum {

	//1.1
	SYSTEM_MENUITEM(".//*[@id='system']/li/p","xpath"),
	FINANCE_PRODUCTS_MENUITEM(".//*[@id='sapglaccount']/a","xpath"),
	FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	//1.2
	SYSTEM_FINANCE_PRODUCTS_SEARCHBAR(".//*[@id='searchContainer']/div[1]","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCEPRODUCT(".//*[@id='contentHeader']/div[2]/a","xpath"),   //1.5
	SYSTEM_FINANCE_PRODUCTS_PAGINATION_OPTION(".//*[@id='pager_top']/div","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_RESULT_GRID(".//*[@id='results']/table","xpath"),
	
	//1.3
	SYSTEM_FINANCE_PRODUCTS_INVERTED_SYMBOL(".//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_CRITERIA_PANEL(".//*[@id='searchContainer']/div[2]","xpath"), 
	
	//1.5
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	//1.6
	SYSTEM_FINANCE_PRODUCTS_BACK_TO_SEARCH("//*[@id='contentHeader']/div[2]/a","xpath"),
	
	//1.7
	SYSTEM_FINANCE_PRODUCTS_SEARCH_TEXTFIELD_ID(".//*[@id='articlesearch']","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_BUTTON(".//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SYSTEM_FINANCE_PRODUCTS_NO_DATA_TO_DISPLAY(".//*[@id='results']/table/tbody/tr/td","xpath"),
	
	//1.8
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_FIRSTROW_FIRSTVALUE_DESC(".//*[@id='results']/table/tbody/tr[1]/td[1]/div","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_FIRSTROW_SECONDVALUE_PID(".//*[@id='results']/table/tbody/tr[1]/td[2]/div","xpath"),
	
	
	//1.9
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_FIRST_LINK(".//*[@id='pager_top']/div/a[1]","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_PREVIOUS_LINK(".//*[@id='pager_top']/div/a[2]","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_NEXT_LINK(".//*[@id='pager_top']/div/a[3]","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_LAST_LINK(".//*[@id='pager_top']/div/a[4]","xpath"),
	
	//1.10
	SYSTEM_FINANCE_PRODUCTS_SHOW_ENTRIES_DROPDOWN_BUTTON(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item","className"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_COLUMN_HEADING_PRODUCTID(".//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SHOW_ENTRIES(".//*[@id='pager_top']/span","xpath"),
	LIST_XPATH(".//*[@id='count-list']","xpath"),
	
	//1.12
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_PRODUCTID_TEXTFIELD(".//*[@id='GLAccountNumber']","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_DESCRIPTION_TEXTFIELD(".//*[@id='Description']","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_APPLY_CHANGES_BUTTON(".//*[@id='saveContainer']/a","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_ID_ALREADYPRESENT_MESSAGE(".//*[@id='toast-container']/div/div","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_ID_ALREADYPRESENT_DIV_CROSS_SYMBOL(".//*[@id='toast-container']/div/button","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_CREATED_SUCCESSFULLY(".//*[@id='toast-container']/div/div","xpath"),
	SYSTEM_FINANCE_PRODUCTS_ADD_FINANCE_PRODUCT_APPLY_CHANGES_CONTINUE_BUTTON(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	
	//1.14
	SYSTEM_FINANCE_PRODUCTS_DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label/span","xpath"),
	SYSTEM_FINANCE_PRODUCTS_PRODUCTID_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	SYSTEM_FINANCE_PRODUCTS_CHECKBOX_ERROR_MESSAGE(".//*[@id='toast-container']/div/div","xpath"),
	
	//1.18
	SYSTEM_FINANCE_PRODUCTS_UPDATE_FINANCE_PRODUCT_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath")
	;
	public String element,Identifier;
	private SystemFinanceProductsEnum(String element){
		 this.element = element;
	 }
	private SystemFinanceProductsEnum(String element, String Identifier){
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
