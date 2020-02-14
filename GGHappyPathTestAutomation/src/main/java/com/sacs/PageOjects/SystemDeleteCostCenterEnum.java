package com.sacs.PageOjects;

public enum SystemDeleteCostCenterEnum {
	
	ROW_TO_DELETE("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	REMOVE_BUTTON("//*[@id='removeCostCenter']/a","xpath"),
	CONFIRMATION_WINDOW("//*[@id='removeAlert']/div[1]","xpath"),
	CONFIRMATION_WINDOW_CANCEL_BTN("//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	CONFIRMATION_WINDOW_CONTINUE_BTN("//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	UPDATE_COST_CENTER_PAGE_HEADING("//*[@id='contentHeader']/div[1]/h1","xpath"),
	COST_CENTER_PAGE_HEADING("//*[@id='contentHeader']/div[1]/h1","xpath"),
	SEARCH_BOX("//*[@id='costCenterSearch']","xpath"),
	SEARCH_BUTTON("//*[@id='searchContainer']/div[2]/span[2]/a/img","xpath"),
	NO_DATA_TO_DISPLAY("//*[@id='results']/table/tbody/tr/td","xpath"),
	TOASTMESSAGECANCEL(".//*[@id='toast-container']/div/button","xpath"),
	
	;
	public String element,Identifier;
	private SystemDeleteCostCenterEnum(String element){
		 this.element = element;
	 }
	private SystemDeleteCostCenterEnum(String element, String Identifier){
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
