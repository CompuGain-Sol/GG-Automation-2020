package com.sacs.PageOjects;

public enum CostingPricingMenuTextFileEnum {
	
	COSTINGPRICING("costingpricing","id"),
	MTF("//*[@id='menutextfiles']/a","xpath"),
	CHOOSEFILE_BTN("//*[@id='upLoadFiles']/span/a", "xpath"),
	CHOOSEFILE_TXTBOX("", "xpath"),
	STARTDATE("//*[@id='StartDate']", "xpath"),
	STOPDATE("//*[@id='StopDate']", "xpath"),
	OK_BTN("//*[@id='processProdFile']", "xpath"),
	EDITICON_FIRSTROW("//*[@id='MenuTextFileResults']/div[6]/div/div/div[6]/div[7]/div/span[3]/a", "xpath"),
	EDITFILE_POPUP_CONTINUEBTN("//*[@id='editFileDates']/div[3]/a[2]", "xpath"),
	REMOVEICON_FIRSTROW("//*[@id='MenuTextFileResults']/div[6]/div/div/div[6]/div[7]/div/span[1]/a", "xpath"),
	REMOVEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	DOWNLOADLINK_FIRSTROW("//*[@id='MenuTextFileResults']/div[6]/div/div/div[1]/div[7]/div/span[2]/a", "xpath"),
	TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	EDIT_STARTDATE("//*[@id='editFileDates']/div[1]/span/span/span[1]/input", "xpath"),
	EDIT_STOPDATE("//*[@id='editFileDates']/div[2]/span/span/span[1]/input", "xpath"),
	CONTINUE("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
	UNIT("//*[@id='SelectedUnits']/span/div/div", "xpath"),
	UNIT_LIST("//*[@id='UnitNames_option_selected']", "xpath"),
	UNITSELECTED("//*[@id='UnitNames_taglist']/li/span[1]", "xpath"),
	USEDINESPECS_CHKBOX("//*[@id='prodForm']/div[2]/div[1]/div[2]/label/span", "xpath"),
	EDIT_POPUP_TITLE("//*[@id='editFileDates_wnd_title']", "xpath"),
	EDIT_POPUP_CANCELBTN("//*[@id='editFileDates']/div[3]/a[1]", "xpath"),
	EDITPOPUP_STARTDATE("//*[@id='editFileDates']/div[1]/span[2]/span/span/input", "xpath"),
	EDUTPOPUP_STOPDATE("//*[@id='editFileDates']/div[2]/span[2]/span/span/input", "xpath"),
	STARTDATE_FIRSTROW("//*[@id='MenuTextFileResults']/div[6]/div/div/div[1]/div[3]", "xpath"),
	STOPDATE_FIRSTROW("//*[@id='MenuTextFileResults']/div[6]/div/div/div[1]/div[4]", "xpath"),
	FILENAME("//*[@id='FileName']", "xpath"),
	;
	
	public String element,Identifier;
	private CostingPricingMenuTextFileEnum(String element){
		 this.element = element;
	 }
	private CostingPricingMenuTextFileEnum(String element, String Identifier){
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
