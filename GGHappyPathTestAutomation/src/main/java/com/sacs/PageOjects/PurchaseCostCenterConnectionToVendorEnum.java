package com.sacs.PageOjects;

public enum PurchaseCostCenterConnectionToVendorEnum {
	
	VENDORNAME("//div[@id='articleTitle']", "xpath"),
	SYSTEM_LINK("//*[@id='system']/p", "xpath"),
	COSTCENTER_LINK(".//*[@id='costcenter']/a", "xpath"),
	COST_CENTER_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ADDCOSTCENTER(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	COSTCENTER_ID(".//*[@id='CostCenterCode']", "xpath"),
	DESCRIPTION(".//*[@id='Description']", "xpath"),
	SAP_COSTCENTER(".//*[@id='FinCostCenter']", "xpath"),
	APPLYCHANGES(".//*[@id='saveContainer']/a", "xpath"),
	ADD_COST_CENTER_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	BACKE_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a", "xpath"),
	NEW_COST_CENTER_TITLE(".//*[@id='defaultTitle']", "xpath"),
	TOAST_MESSAGE("toast-message", "className"),
	TOAST_CLOSE_BTN("//button[@class='toast-close-button']", "xpath"),
	TITLE_CLASS("title", "className"),
	GRID_FIRST_ROW(".//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCH_FIELD(".//*[@id='costCenterSearch']", "xpath"),
	SEARCH_SUBMIT(".//*[@id='searchContainer']/div[2]/span[2]/a/img", "xpath"),
	UPDATE_COST_CENTER_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	
	
	
	;
	
	public String element, identifier;
	
	private PurchaseCostCenterConnectionToVendorEnum(String element){
		 this.element = element;
	 }
	
	private PurchaseCostCenterConnectionToVendorEnum(String element, String identifier){
		 this.element = element;
		 this.identifier = identifier;
	 }
	
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return identifier;
	}
}
