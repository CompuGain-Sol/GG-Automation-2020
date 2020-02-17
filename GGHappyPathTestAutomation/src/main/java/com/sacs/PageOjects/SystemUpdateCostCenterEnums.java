package com.sacs.PageOjects;

public enum SystemUpdateCostCenterEnums 
{	UPDATE_COST_CENTER_DES("//*[@id='Description']","xpath"),
	UPDATE_COST_CENTER_SAP("//*[@id='FinCostCenter']","xpath"),
	REMOVE_COST_CENTER_LINK("//*[@id='removeCostCenter']/a","xpath"),
	CONNECTED_VENDOR_ID("//*[@id='connectedVendorCCResults']/table/tbody/tr[2]/td[1]","xpath"),
	RESULT_ROW_XPATH("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	APPLY_CHANGE_BUTTON("//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	BACK_SAERCH_PAGE_BTN("//*[@id='contentHeader']/div[3]/a","xpath"),
	SEARCH_BOX("//*[@id='costCenterSearch']","xpath"),
	SEARCH_BUTTON("//*[@id='searchContainer']/div[2]/span[2]/a/img","xpath"),
	RESULT_ROW_DES("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	;

	public String element,Identifier;
	private SystemUpdateCostCenterEnums(String element){
		 this.element = element;
	 }
	private SystemUpdateCostCenterEnums(String element, String Identifier){
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
