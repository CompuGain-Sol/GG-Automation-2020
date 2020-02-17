package com.sacs.PageOjects;

public enum SystemArticleGroupsReplaceGroupInArticleEnum {
	
	ARTICLE_GROUP_EXTENEDEDMENU(".//*[@id='nav']/li[1]/div","xpath"),
	//ARTICLE_GROUP_REPLACE_ARTICLE_GROUP(".//*[@id='nav']/li[1]/ul/li/a","xpath"), 
	ARTICLE_GROUP_REPLACE_ARTICLE_GROUP("Replace Group in Articles","linkText"), 
	
	ARTICLE_GROUP_PAGE_TITLE("//h1[contains(.,'Article Groups')]","xpath"), 
	OK_BTN("//a[@class='btnSkin action-ReplaceAg']","xpath"),
	CANCEL_BTN("//a[@class='btnSkin action-Cancel']","xpath"), 
	UPDATE_ARTICLE_GROUP_PAGE_TITLE("//h1[contains(.,'Update Article Group')]","xpath"), 
	CONTINUE_BTN(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	CONNECTED_ARTICLE_NUMBER(".//*[@id='connectedArticlesResults']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCH_GRID(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	;
	public String element,Identifier;
	private SystemArticleGroupsReplaceGroupInArticleEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsReplaceGroupInArticleEnum(String element, String Identifier){
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
