package com.sacs.PageOjects;

public enum SystemCostCenterSearchAddEnum {
	
	SYSTEM_MENUITEM("system","id"),
	COSTCENTER_MENUITEM("costcenter","id"),
	COSTCENTER_PAGETITLE("//h1[contains(.,'Cost Center ')]","xpath"),
	ADD_COSTCENTER_BTN("//a[contains(@class,'addBtn btnSkin')]","xpath"),
	ADD_COSTCENTER_PAGETITLE("//h1[contains(.,'Add Cost Center')]","xpath"),
	
	COST_CENTER_ID("//input[@id='CostCenterCode']","xpath"),
	COST_CENTER_DESC("//input[@id='Description']","xpath"),
	COST_CENTER_APPLY_CHANGES_BTN("//a[@data-bind='click: addCostCenter']","xpath"),
	APPLY_CHANGES(".//*[@id='saveContainer']/a", "xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	
	
	
	;
	
	public String element,Identifier;
	private SystemCostCenterSearchAddEnum(String element){
		 this.element = element;
	 }
	private SystemCostCenterSearchAddEnum(String element, String Identifier){
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
