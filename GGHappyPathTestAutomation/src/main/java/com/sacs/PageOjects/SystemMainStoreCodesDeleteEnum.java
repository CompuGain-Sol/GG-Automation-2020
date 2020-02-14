package com.sacs.PageOjects;

public enum SystemMainStoreCodesDeleteEnum {
	
	REMOVE_ICON("//a[@id='removeIcon']","xpath"),
	CONTINUE_BTN("//a[@class='largebtnSkin action-continue']","xpath"),
	CONTINUE_BTN_2(".//*[@id='removeMSAlert']/div[3]/a[1]", "xpath"),
					
	STORECODE_PAGEHEADER(".//*[@id='contentHeader']/div/h1","xpath"),
	SUB_CANCEL_BTN("//*[@id='removeSCAlert']/div[3]/a[2]","xpath"),
	SUB_CONTINUE("//*[@id='removeSCAlert']/div[3]/a[1]","xpath"),
	SUB_CONFIRMATION_POPUP("//*[@id='removeSCAlert']","xpath"),
	SUB_REMOVE_ICON("//*[@id='removeArticleGrp']/a","xpath"),
	;
	
	public String element,Identifier;
	private SystemMainStoreCodesDeleteEnum(String element){
		 this.element = element;
	 }
	private SystemMainStoreCodesDeleteEnum(String element, String Identifier){
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
