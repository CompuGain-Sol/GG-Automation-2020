package com.sacs.PageOjects;

public enum SystemRestitutionGroupUpdateEnum {
	
	SYSTEM_MENUITEM("system","id"),
	RESTITUTION_GROUP_MENUITEM("restitutiongroup","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_RESTITUTION_GROUP_BTN("//a[@class='addBtn btnSkin']","xpath"),
	RESTITUTION_GROUP_CODE_FIELD("Code","id"),
	RESTITUTION_GROUP_DESC_FIELD("Description","id"),
	
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
	//BACK_TO_SEARCH_BTN("//a[@class='btnSkin backBtn action-trackChanges']","xpath"),
	//BACK_TO_SEARCH_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	BACK_TO_SEARCH_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	UPDATE_BACK_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a","xpath"),
	CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	SEARCH_BOX("//input[@id='articlesearch']","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT_SECOND_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	
	NO_DATA("//*[@id='results']/table/tbody/tr/td","xpath"),
	
	RESTITUTION_REMOVAL_POP_TITLE(".//*[@id='removeAlert']/div[1]", "xpath"),
	RESTITUTION_REMOVAL_POPUP_CONTINUE_BTN(".//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	REMOVE_RESTITUTION_GROUP_LINK(".//*[@id='removeRestitutionGrp']/a", "xpath"),
	;
	
	public String element,Identifier;
	private SystemRestitutionGroupUpdateEnum(String element){
		 this.element = element;
	 }
	private SystemRestitutionGroupUpdateEnum(String element, String Identifier){
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
