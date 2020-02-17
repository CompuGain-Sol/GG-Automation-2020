package com.sacs.PageOjects;

public enum SystemArticleGroupsRemoveArticleGroupEnum {
	
	ARTICLE_GROUP_REMOVE(".//*[@id='removeArticleGrp']/a","xpath"),
	ARTICLE_GROUP_REMOVE_CONF_POPUP(".//*[@id='removeAlert']/div[1]","xpath"),
	ARTICLE_GROUP_CANCEL_BUTTON(".//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	ARTICLE_GROUP_CONTINUE_BUTTON(".//*[@id='removeAlert']/div[3]/a[1]","xpath"), 
	ARTICLE_GROUP_SEARCH_PAGE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	ARTICLE_GROUP_UPDATE_PAGE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	NO_DATA_TO_DISPLAY(".//*[@id='results']/table/tbody/tr/td","xpath"), 
	SEARCH_DROPDOWN(".//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCH_DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
	
	;
	public String element,Identifier;
	private SystemArticleGroupsRemoveArticleGroupEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsRemoveArticleGroupEnum(String element, String Identifier){
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
