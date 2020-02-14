package com.sacs.PageOjects;

public enum SystemFinanceProductsUpdateEnum {
	//BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[3]/a", "xpath"),
	BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[2]/a","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	SEARCH_BOX("//input[@placeholder='Search']", "xpath"),
	SEARCH_SUBMIT_CLASS("//img[contains(@class,'searchSubmit')]", "xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE("//*[@id='results']/table/tbody/tr/td[1]", "xpath"), 
	NO_DATA_TO_DISPLAY("//*[@id='results']/table/tbody/tr/td","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	DELETE("//*[@id='removeSAPGLAccount']/a","xpath"),
	CONFIRM_POPUP("//*[@id='loadingModal']","xpath"),
	OK_ON_CONFIRM_POPUP("//*[@id='loadingModal']/div[2]/a[2]","xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE2("//*[@id='results']/table/tbody/tr/td[2]", "xpath"), 
	
;
	
	public String element,Identifier;
	private SystemFinanceProductsUpdateEnum(String element){
		 this.element = element;
	 }
	private SystemFinanceProductsUpdateEnum(String element, String Identifier){
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
