package com.sacs.PageOjects;


public enum SystemArticleGroupsCostCenterAssociationWithArticleGroupEnum {
	
	SYSTEM_MENUITEM_ID("system","id"),
	TOAST_MESSAGE("toast-message","className"), 
	SYSTEM_COST_CENTER_MENU_ITEM("//a[@href='/SacsQA/System/Costcenter']","xpath"), 
	COST_CENTER_PAGE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	ADD_COST_CENTER_BTN("//a[contains(@class,'addBtn btnSkin')]","xpath"), 
	COST_CENTER_ID("//input[@id='CostCenterCode']","xpath"),
	COST_CENTER_DESC("//input[@id='Description']","xpath"),
	COST_CENTER_APPLY_CHANGES_BTN("//a[@data-bind='click: addCostCenter']","xpath"),
	//COST_CENTER_DROPDWN("div.fr.agddMargin2 > div.formDropDown > #FinanceGLAccount","css"), 
	COST_CENTER_DROPDWN("CostCenterCode","id"),
	
	BACK_TO_SEARCH("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[3]/a[1]","xpath"),	
	
;
	
	public String element,Identifier;
	private SystemArticleGroupsCostCenterAssociationWithArticleGroupEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsCostCenterAssociationWithArticleGroupEnum(String element, String Identifier){
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
