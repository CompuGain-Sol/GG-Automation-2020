package com.sacs.PageOjects;

public enum SystemWasteReasonEnum {
	SYSTEM("system","id"),
	WASTE_REASON("wastereason","id"),
	PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_REASON("//*[@id='addReason']","xpath"),
	REASON_ON_SEARCH_GRID("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	ADD_REASON_POPUP("//*[@id='addReasonPopup']","xpath"),
	WASTE_REASON_TEXT_BOX("//*[@id='wReason']","xpath"),
	CONTINUE("//*[@id='continueButton']","xpath"),
	ADD_REASON_POPUP_TITLE("//*[@id='addReasonPopup_wnd_title']","xpath"), 
	REMOVE_POPUP("//*[@id='removeAlert']","xpath"),
	DELETE(".//*[@id='results']/table/tbody/tr/td[3]/span[2]/a","xpath"),
	CONTINUE_ON_REMOVE_POPUP("//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	NO_DATA_TO_DISPLAY(".//*[@id='results']/table/tbody/tr/td","xpath"),
	FIRSTRECORD("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	SEARCH_DD("//*[@id='searchContainer']/div[2]/span[3]/a/img", "xpath"),
	CODE_SEARCHCRITERIA_CHKBOX("//*[@id='searchContainer']/div[3]/div[1]/label/span", "xpath"),
	REASON_SEARCHCRITERIA_CHKBOX("//*[@id='searchContainer']/div[3]/div[2]/label/span", "xpath"),
	SEARCH_BOX("//*[@id='articlesearch']", "xpath"),
	SEARCH_ICON("//*[@id='searchContainer']/div[2]/span[2]/a/img", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	REASON_FIRSTRECORD("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	CODE_SECONDROW("//*[@id='results']/table/tbody/tr[2]/td[1]", "xpath"),
	SEARCHRECORD_FIRSTCOL("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCHRECORD_SECONDCOL("//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	ADDWASTEREASON_TITLE("//*[@id='addReasonPopup_wnd_title']", "xpath"),
	ADDWASTEREASON_CANCELBTN("//*[@id='cancelButton']", "xpath"),
	ADDWASTEREASON_CONTINUEBTN("//*[@id='continueButton']", "xpath"),
	EDITICON_SEARCHGRID("//*[@id='results']/table/tbody/tr/td[3]/span[1]/a", "xpath"),
	;
	
	
	public String element,Identifier;
	private SystemWasteReasonEnum(String element){
		 this.element = element;
	 }
	private SystemWasteReasonEnum(String element, String Identifier){
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
