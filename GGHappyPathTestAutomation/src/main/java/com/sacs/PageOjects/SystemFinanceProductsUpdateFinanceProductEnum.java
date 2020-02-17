package com.sacs.PageOjects;

public enum SystemFinanceProductsUpdateFinanceProductEnum {
	
	//3.1
	SYSTEM_MENUITEM(".//*[@id='system']/li/p","xpath"),
	FINANCE_PRODUCTS_MENUITEM(".//*[@id='sapglaccount']/a","xpath"),
	FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_BACK_TO_SEARCH(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SYSTEM_UPDATE_FINANCE_PRODUCT_BACK_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_PRODUCTID_TEXTFIELD(".//*[@id='GLAccountNumber']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_DESCRIPTION_TEXTFIELD(".//*[@id='Description']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_APPLY_CHANGES_BUTTON(".//*[@id='saveContainer']/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_SUCCESS_MESSAGE(".//*[@id='toast-container']/div/div","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_ID_ALREADYPRESENT_DIV_CROSS_SYMBOL(".//*[@id='toast-container']/div/button","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_APPLY_CHANGES_CONTINUE_BUTTON(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_NO_VAT_ACCNO_TEXTFIELD(".//*[@id='NoVatAccountNumber']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_VAT1_ACCNO_TEXTFIELD(".//*[@id='Vat1Account']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_VAT2_ACCNO_TEXTFIELD(".//*[@id='Vat2Account']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_VAT3_ACCNO_TEXTFIELD(".//*[@id='Vat3Account']","xpath"),
	
	SYSTEM_FINANCE_PRODUCTS_SEARCH_TEXTFIELD_ID(".//*[@id='articlesearch']","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_BUTTON(".//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_FIRSTROW_FIRSTVALUE_DESC(".//*[@id='results']/table/tbody/tr[1]/td[1]/div","xpath"),
	SYSTEM_UPDATE_FINANCE_PRODUCT_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	GROUP_ID_IN_CONNECTED_PANEL("//*[@id='connectedarticlegroupsResults']/table/thead/tr/th[1]/a","xpath"),
	DESCRIPTION_IN_CONNECTED_PANEL("//*[@id='connectedarticlegroupsResults']/table/thead/tr/th[2]/a","xpath"),
	FIRST_DESCRIPTION_IN_CONNECTED_PANEL("//*[@id='connectedarticlegroupsResults']/table/tbody/tr/td[2]/span","xpath"),
									
	NO_DATA_XPATH("//*[@id='connectedarticlegroupsResults']/table/tbody/tr/td","xpath"),
	
	;
	
	public String element,Identifier;
	private SystemFinanceProductsUpdateFinanceProductEnum(String element){
		 this.element = element;
	 }
	private SystemFinanceProductsUpdateFinanceProductEnum(String element, String Identifier){
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
