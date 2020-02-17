package com.sacs.PageOjects;

public enum SystemArticleGroupsUpdateArticleEnum {
	//ARTICLE_SEARCH_GRID_FIRST_ROW("//div[@class='aticlegroup']","xpath"), 
	ARTICLE_SEARCH_GRID_FIRST_ROW("//div[contains(@class,'ticlegroup')]","xpath"), 
	ARTICLE_SEARCH_GRID_FIRST_COL(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	UPDATE_ARTICLE_GROUP_PAGE_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	ARTICLE_GROUP_DESC("//input[@id='Description']","xpath"), 
	ARTICLE_GROUP_FINANCE_PRODUCT_ID("//select[@id='FinanceGLAccount']","xpath"), 
	ARTICLE_GROUP_COST_CENTER(".//*[@id='CostCenterCode']","xpath"), 
	ARTICLE_GROUP_NON_MATERIAL_COST(".//*[@id='formBody']/div[1]/div[18]/label/span","xpath"),
	ARTICLE_GROUP_RESTITUTION(".//*[@id='formBody']/div[1]/div[19]/label/span","xpath"),
	ARTICLE_GROUP_INFLATIONRATE("InflationRate","id"),
	ARTICLE_GROUP_CCP1BEHAV("CCP1Ind","id"), 
	ARTICLE_GROUP_BACK_TO_SEARCH("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	//ARTICLE_GROUP_CONTINUE_BTN("//a[@class='largebtnSkin action-continue']","xpath"),
	ARTICLE_GROUP_CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	
	ARTICLE_GROUP_SEARCH_PAGE_TITLE("//h1[contains(.,'Article Groups')]","xpath"), 
	ARTICLE_GROUP_EXTENEDEDMENU(".//*[@id='nav']/li[1]/div","xpath"),
	ARTICLE_GROUP_REPLACE_ARTICLE_GROUP(".//*[@id='nav']/li[1]/ul/li/a","xpath"),
	ARTICLE_GROUP_REMOVE("//*[@id='removeArticleGrp']/a", "xpath"),
	//ARTICLE_GROUP_REMOVE_CTN_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[2]","xpath"), 
	ARTICLE_GROUP_REMOVE_CTN_BTN(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	SEARCH_DROPDOWN(".//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCH_DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"), 
	ADD_BASIC_ARTICLE_BTN(".//*[@id='contentHeader']/div[2]/a","xpath"),
	ARTICLE_GROUP_BACK_TO_SEARCH_ADD_PAGE(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SAVEICON("//*[@id='saveDepartment']/a", "xpath"),
	REMOVEICON("//*[@id='removeArticleGrp']/a", "xpath"),
	REMOVEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	;									   
	public String element,Identifier;
	private SystemArticleGroupsUpdateArticleEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsUpdateArticleEnum(String element, String Identifier){
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
