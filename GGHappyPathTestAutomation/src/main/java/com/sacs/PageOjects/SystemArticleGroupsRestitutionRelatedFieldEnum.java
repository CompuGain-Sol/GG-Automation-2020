package com.sacs.PageOjects;

public enum SystemArticleGroupsRestitutionRelatedFieldEnum {
	
	TOAST_MESSAGE("toast-message","className"), 
	MENU_NAVIGATION_ARROW("/html/body/div/div/div/div[4]/ul/ul[10]/span","xpath"), 
	
	PURCHASE_MENUITEM("/html/body/div/div/div/div[4]/ul/a[3]/li/div","xpath"), 
	MENU_ITEM_BASICARTICLE("//a[contains(.,'Basic Articles')]","xpath"),
	BASIC_ARTICLE_PAGE_TITLE("//h1[contains(.,'Basic Articles')]","xpath"), 
	UPDATE_ARTICLE_GROUP_PAGE_TITLE("//h1[contains(.,'Update Basic Article')]","xpath"), 
	UPDATE_ARTICLEGROUP_FIELD("//input[contains(@name,'ArticleGroupCode')]","xpath"), 
	AUTO_COMPLETE_ITEMS("ui-menu-item","className"),
	UPDATE_ARTICLE_GROUP_PAGE_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	UPDATE_ARTICLEGROUP_RESTITUTIONUOM_QTY("//input[@id='StoreToRestUOC']","xpath"),
	UPDATE_ARTICLEGROUP_RESTITUTIONUOM_QTYTYPE("//input[@id='RestitutionUOM']","xpath"),
	UPDATE_ARTICLEGROUP_RESTITUTION_GROUPID("//select[@id='RestitutionGroupId']","xpath"),
	UPDATE_ARTICLEGROUP_RESTITUTION_NUMBER("//input[@id='RestitutionNumber']","xpath"),
	UPDATE_ARTICLEGROUP_REFUND("//input[@id='RestitutionRefundAmt']","xpath"),
	
	UPDATE_ARTICLEGROUP_COUNTRYOFORIGIN("//input[@id='CountryOfOrigin']","xpath"),
	UPDATE_ARTICLEGROUP_EXCISEDUTYNUMBER("//input[@id='ExciseDutyNumber']","xpath"),
	UPDATE_ARTICLEGROUP_TAXCODE("//input[@id='TaxCode']","xpath"),
	UPDATE_ARTICLEGROUP_EXCISEDUTYRATE("//input[@id='ExciseDutyCostPrice']","xpath"),
	
	CONNECTEDPANEL(".//*[@id='connectedArticlesResults']/table/tbody/tr/td[2]","xpath"), 
	ARTICLENUMBER_DATA(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	RESTITUTION_GROUP_ID("RestitutionGroupId","id"),
	;
	public String element,Identifier;
	private SystemArticleGroupsRestitutionRelatedFieldEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsRestitutionRelatedFieldEnum(String element, String Identifier){
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
