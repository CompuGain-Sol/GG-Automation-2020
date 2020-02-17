package com.sacs.PageOjects;

public enum VerifyUOMOnAddBasicArticlePageEnum {
	
	SYSTEM_MENUITEM("system","id"),
	PURCHASE_MENUITEM("//*[@id='purchase']/li","xpath"),
	BASIC_ARTICLE_MENUITEM("//*[@id='basicarticle']/a","xpath"),
	
	UOM_MENUITEM("unitofmeasure","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_UOM_BTN("//a[@class='addBtn btnSkin']","xpath"),
	UOM_ID(".//*[@id='UnitofMeasure']","xpath"),
	UOM_DESC(".//*[@id='Description']","xpath"),
	RC_UNIT(".//*[@id='RcUnit']","xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	DESCRIPTION_ON_ADD_BASIC_ARTICLE_XPATH("//*[@id='PrimaryDesc']","xpath"),
	ADD_ARTICLE_XPATH("//*[@id='contentHeader']/div[2]/a","xpath"),
	PURCHASE_UOM_XPATH("//*[@id='PurchaseUOM']", "xpath"),
	PURCHASE_TO_UOM_ID("PurchaseUOM","id"),
	STORE_UOM_XPATH("//*[@id='StoreUOM']","xpath"),
	MENU_UOM_XPATH("//*[@id='MenuUOM']","xpath"),
	ARTICLE_GROUP_LABEL("//*[@id='formBody']/div[1]/div[4]/span/label","xpath"),							
	RESTITUTION_UOM_XPATH("//*[@id='RestitutionUOM']","xpath"),
	ARTICLE_GROUP_XPATH(".//*[@id='ArticleGroupCode']", "xpath"),
	
	PURCHASE_TO_UOM_DROPDOWN_XPATH("html/body/ul[2]", "xpath"),
	PURCHASE_TO_UOM_DROPDOWN_FIRST_ITEM_XPATH("html/body/ul[2]/li", "xpath"),
	PURCHASE_TO_RESTITUTION_UOM_DROPDOWN_FIRST_ITEM_XPATH("html/body/ul[6]/li","xpath"),
	DROPDOWN_ITEMS_CLASSNAME("ui-menu-item","className"),
	DEPARTMENT_DROPDOWN_ID(".//*[@id='DepartmentCode']","xpath")
	;
	
	
	public String element,Identifier;
	private VerifyUOMOnAddBasicArticlePageEnum(String element){
		 this.element = element;
	 }
	private VerifyUOMOnAddBasicArticlePageEnum(String element, String Identifier){
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
