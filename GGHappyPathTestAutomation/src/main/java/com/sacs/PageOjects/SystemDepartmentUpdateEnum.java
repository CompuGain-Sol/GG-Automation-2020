package com.sacs.PageOjects;

public enum SystemDepartmentUpdateEnum {
	BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[3]/a","xpath"),
	BACK_TO_SEARCH_BTN_ADD_PAGE(".//*[@id='contentHeader']/div[2]/a","xpath"),
	//BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']", "xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[2]/label/span","xpath"),
	SEARCH_TRIANGLE(".//*[@id='searchContainer']/div[2]/span[3]/a/img","xpath"),
	SEARCH_BOX("//input[@placeholder='Search']", "xpath"),
	SEARCH_SUBMIT_CLASS("//img[contains(@class,'searchSubmit')]", "xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE("//*[@id='results']/table/tbody/tr/td[1]", "xpath"), 
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	TOAST_MSG_CANCEL("//*[@id='toast-container']/div/button.","xpath"),
	
	SEARCH_CRITERIA_OPTION(".//*[@id='searchContainer']/div[3]","xpath"),
	SEARCH_OPTION_BUTTON(".//*[@id='searchContainer']/div[2]/span[3]/a/img","xpath"),
	TOAST_MESSAGE("toast-message", "className"),
	
	
	
	;
	
	public String element,Identifier;
	private SystemDepartmentUpdateEnum(String element){
		 this.element = element;
	 }
	private SystemDepartmentUpdateEnum(String element, String Identifier){
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
