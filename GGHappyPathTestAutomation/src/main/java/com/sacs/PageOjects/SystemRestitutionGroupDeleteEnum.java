package com.sacs.PageOjects;

public enum SystemRestitutionGroupDeleteEnum {
	
	REMOVE_ICON(".//*[@id='removeRestitutionGrp']/a","xpath"),
	REMOVE_CONTINUE_BTN(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	REMOVE_ALERT("//*[@id='removeAlert']","xpath"),
	CANCEL_XPATH("//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	NO_DATA_TO_DISPLAY_XPATH("//*[@id='results']/table/tbody/tr/td","xpath"),
	BACKTOSEARCH("//*[@id='contentHeader']/div[3]/a", "xpath");
	;
	
	public String element,Identifier;
	private SystemRestitutionGroupDeleteEnum(String element){
		 this.element = element;
	 }
	private SystemRestitutionGroupDeleteEnum(String element, String Identifier){
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
