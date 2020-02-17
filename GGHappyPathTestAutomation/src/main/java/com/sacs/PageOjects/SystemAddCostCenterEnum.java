package com.sacs.PageOjects;

public enum SystemAddCostCenterEnum {
	SYSTEM("//*[@id='system']/p","xpath"),
	COST_CENTER("//*[@id='costcenter']/a","xpath"),
	ADD_COST_CENTER_BTN("Add Cost Center","linkText"),
	ADD_COST_CENTER_PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	COST_CENTER_ID_TEXTBOX("//*[@id='CostCenterCode']","xpath"),
	COST_CENTER_DES_TEXTBOX("//*//*[@id='Description']","xpath"),
	SUCCESS_MESSAGE("//*[@id='toast-container']/div/div","xpath"),
	ADD_NEW_COST_CENTER_BUTTON("//*[@id='saveContainer']/a","xpath"),
	COST_CENTER_FIELD_REQUIRED_MSG_XPATH("//*[@id='formBody']/div[1]/div[1]/div/span/span","xpath"),
	COST_CENTER_FIELD_REQUIRED_MSG_DES("//*[@id='formBody']/div[1]/div[2]/div/span/span","xpath"),
	SAP_COSTCENTER_OPTIONAL_FIELD("//*[@id='FinCostCenter']","xpath"),
	COST_CENTER_DISPLAY_PANEL("//*[@id='formBody']/div[2]/div[1]","xpath"),
	//DISPLAY_PANEL_MESSAGE("//*[@id='connectedVendorCCResults']/div/span","xpath"),
	DISPLAY_PANEL_MESSAGE("//*[@id='connectedVendorCCResults']/table/tbody/tr/td","xpath"),
	ERROR_MSG_ID_ALREADY_EXIST("toast-message","className"),
	SEARCH_BOX("//*[@id='costCenterSearch']","xpath"),
	SEARCH_BUTTON("//*[@id='searchContainer']/div[2]/span[2]/a/img","xpath"),
	SEARCH_RESULT_ROW("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	BACK_ADD_COST_CENTER("//*[@id='contentHeader']/div[3]/a","xpath")
	
	
	;
	
	
	public String element,Identifier;
	private SystemAddCostCenterEnum(String element){
		 this.element = element;
	 }
	private SystemAddCostCenterEnum(String element, String Identifier){
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
