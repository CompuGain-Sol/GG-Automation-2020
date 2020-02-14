package com.sacs.PageOjects;

public enum SystemFinanceProductsAddFinanceProductEnum {

	//2.1 and 2.2
	SYSTEM_MENUITEM(".//*[@id='system']/li/p","xpath"),
	FINANCE_PRODUCTS_MENUITEM(".//*[@id='sapglaccount']/a","xpath"),
	FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	
	SYSTEM_ADD_FINANCE_PRODUCT(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCTS_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_BACK_TO_SEARCH(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_PRODUCTID_TEXTFIELD(".//*[@id='GLAccountNumber']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_DESCRIPTION_TEXTFIELD(".//*[@id='Description']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_APPLY_CHANGES_BUTTON(".//*[@id='saveContainer']/a","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_ID_ALREADYPRESENT_MESSAGE(".//*[@id='toast-container']/div/div","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_ID_ALREADYPRESENT_DIV_CROSS_SYMBOL(".//*[@id='toast-container']/div/button","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_CREATED_SUCCESSFULLY(".//*[@id='toast-container']/div/div","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_APPLY_CHANGES_CONTINUE_BUTTON(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	//2.3
	SYSTEM_ADD_FINANCE_PRODUCT_USED_IN_DISPLAY_PANEL("//*[@id='connectedarticlegroupsResults']/table/tbody/tr/td","xpath"),
	
	//2.4
	SYSTEM_ADD_FINANCE_PRODUCT_REQUIRED_FIELD_VALIDATION(".//*[@id='toast-container']/div/div","xpath"),
	
	//2.5
	SYSTEM_ADD_FINANCE_PRODUCT_INVALID_NUMBER_PRODUCTID(".//*[@id='formBody']/div[1]/div[1]/div/span/span","xpath"),
	
	//2.8
	SYSTEM_ADD_FINANCE_PRODUCT_NO_VAT_ACCNO_TEXTFIELD(".//*[@id='NoVatAccountNumber']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_INVALID_NUMBER_NO_VAT_ACCNO(".//*[@id='formBody']/div[1]/div[3]/div/span/span","xpath"),
	
	//2.9
	SYSTEM_ADD_FINANCE_PRODUCT_VAT1_ACCNO_TEXTFIELD(".//*[@id='Vat1Account']","xpath"),
	DISCOUNT_ACCOUNT_NUMBER("//*[@id='DiscountAccountNumber']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_VAT2_ACCNO_TEXTFIELD(".//*[@id='Vat2Account']","xpath"),
	SYSTEM_ADD_FINANCE_PRODUCT_VAT3_ACCNO_TEXTFIELD(".//*[@id='Vat3Account']","xpath"),
	
	//2.11
	SYSTEM_FINANCE_PRODUCTS_SEARCH_TEXTFIELD_ID(".//*[@id='articlesearch']","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_BUTTON(".//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SYSTEM_FINANCE_PRODUCTS_SEARCH_GRID_FIRSTROW_SECONDVALUE_PID(".//*[@id='results']/table/tbody/tr[1]/td[2]/div","xpath")
	;

	public String element,Identifier;
	private SystemFinanceProductsAddFinanceProductEnum(String element){
		 this.element = element;
	 }
	private SystemFinanceProductsAddFinanceProductEnum(String element, String Identifier){
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
