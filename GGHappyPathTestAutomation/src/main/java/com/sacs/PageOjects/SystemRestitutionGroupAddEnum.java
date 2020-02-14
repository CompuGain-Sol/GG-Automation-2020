package com.sacs.PageOjects;

public enum SystemRestitutionGroupAddEnum {
	
	SYSTEM_MENUITEM("system","id"),
	RESTITUTION_GROUP_MENUITEM("restitutiongroup","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_RESTITUTION_GROUP_BTN("//a[@class='addBtn btnSkin']","xpath"),
	RESTITUTION_GROUP_CODE_FIELD("Code","id"),
	RESTITUTION_GROUP_DESC_FIELD("Description","id"),
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	
	RESTITUTION_GROUP_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[1]/div/span/span","xpath"),
	DESCRIPTION_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[2]/div/span/span","xpath"),
	CONECTED_ARTICLES_NODATA_XPATH("//*[@id='connectedArticlesResults']/table/tbody/tr/td","xpath"),
	BACKTOSEARCH_BTN_XPATH("//*[@id='contentHeader']/div[2]/a","xpath"),
	POP_UP_XPATH("//*[@id='confirmChangesAlert']","xpath"),
	CONTINUE_XPATH("//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
					
	;
	
	public String element,Identifier;
	private SystemRestitutionGroupAddEnum(String element){
		 this.element = element;
	 }
	private SystemRestitutionGroupAddEnum(String element, String Identifier){
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
