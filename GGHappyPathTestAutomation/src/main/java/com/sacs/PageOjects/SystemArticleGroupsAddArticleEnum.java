package com.sacs.PageOjects;

public enum SystemArticleGroupsAddArticleEnum {
	
	
	
	ARTICALGROUP_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SYSTEM_MENUITEM_ID("system","id"),
	//SYS_ARTICLEGROUP_LINKTEXT("//a[contains(@href,'/SacsQA/System/ArticleGroup')]","xpath"), 
	SYS_ADD_ARTICLE_GROUP_BUTTON("//*[@id='addNew']","xpath"),
	SYS_ADD_ARTICLE_GROUP_CODE_ID("ArticleGroupCode","id"),
	SYS_ADD_ARTICLE_GROUP_DESC_ID("Description","id"),
	SYS_ADD_ARTICLE_GROUP_FINPRODID_ID("FinanceGLAccount","id"),
	SYS_ADD_ARTICLE_GROUP_INVENTORY_ACCT("InventoryAccount","id"),
	SYS_ADD_ARTICLE_GROUP_GRNI_ACCT("GRNIAccount","id"),
	SYS_ADD_ARTICLE_GROUP_STOCK_ACCT("StockDiffAccount","id"),
	SYS_ADD_ARTICLE_GROUP_MATERIAL_ACCT("MaterialWastageAccount","id"),
	SYS_ADD_ARTICLE_GROUP_GOODS_ISSUE_ACCT("GoodsIssueAccount","id"),
	SYS_ADD_ARTICLE_GROUP_GOODS_INVOICE_ACCT("InvoiceObsolescence","id"),
	SYS_ADD_ARTICLE_GROUP_COSTCENTER_CSS(".//*[@id='CostCenterCode']","xpath"),
	SYS_ADD_ARTICLE_GROUP_NONMATERIALCOST_XPATH("//span[contains(.,' Non material cost:')]","xpath"),
	SYS_ADD_ARTICLE_GROUP_RESTITUTION_XPATH(".//*[@id='formBody']/div[1]/div[19]/label/span","xpath"),
	SYS_ADD_ARTICLE_GROUP_INFLATIONRATE_ID("InflationRate","id"),
	SYS_ADD_ARTICLE_GROUP_CCP1BEHAV_ID("CCP1Ind","id"),
	
	SYS_ADD_ARTICLE_GROUP_APPLYCHANGESBTN(".//*[@id='saveContainer']/a","xpath"), 
	SYS_ADD_ARTICLE_GROUP_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	SYS_BACKTOSEARCH_BUTTON("//a[contains(@class,'btnSkin backBtn action-trackChanges')]","xpath"), 
	TOAST_MESSAGE("toast-message","className"), 
	TOAST_MESSAGE_ERROR("toast toast-error","className"), 
	TOAST_MESSAGE_CLOSE("//button[@class='toast-close-button']","xpath"),
	SYS_ADD_ARTICLE_GROUP_CONNECTEDARTICLE_PANEL("//div[@class='caCountText']","xpath"),
	SYS_ADD_ARTICLE_GROUP_COSTCENTER_CSS_OPTIONS("div.fr.agddMargin2 > div.formDropDown > #FinanceGLAccount > option","css"),
	SYS_ARTICLE_GROUP_SEARCH_RESULT_GRID_ROW(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	ARTICLE_GROUP_LABEL("//*[@id='formBody']/div[1]/div[4]/span/label","xpath"), 
	FINANCIALID("/html/body/div/div/div[2]/section/div/div[5]/form/div/div/div[3]/div/div/select","xpath"),
	RESTITUTION_CHECK_BOX(".//*[@id='formBody']/div[1]/div[19]/label/span","xpath"),
	ARTGRP_SEARCHBOX("//*[@id='articleSearch']", "xpath"),
	ARTGRP_SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	
	;
	
	public String element,Identifier;
	private SystemArticleGroupsAddArticleEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsAddArticleEnum(String element, String Identifier){
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
