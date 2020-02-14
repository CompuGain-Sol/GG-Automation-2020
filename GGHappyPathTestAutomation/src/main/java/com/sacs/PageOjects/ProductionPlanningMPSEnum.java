package com.sacs.PageOjects;

public enum ProductionPlanningMPSEnum {
	
	
	PRODUCTION_PLANNING("productionplanning","id"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	TOAST_MESSAGE("toast-message","className"), 
	PAGETITILE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	MPS("//*[@id='productionschedule']/a","xpath"), 
	ADD_LINE("Add Line","linkText"),
	FLIGHT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[3]","xpath"),
	FLIGHT_INPUT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[3]/input","xpath"),
	APPLY_CHANGES("//*[@id='saveChanges']/div","xpath"),
	ATTENTION_POPUP("//*[@id='removeAlert']","xpath"),
	CONTINUE_ON_ATTENTION_POPUP("//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	DAYS_AHEAD("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[9]","xpath"),
	DAYS_AHEAD_INPUT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[9]/input","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	ADDLINE("//*[@id='addgridLine']", "xpath"),
	MPSSEARCH("//*[@id='mpsSearch']", "xpath"),
	GRID("//*[@id='mpsResults']/div[2]/div[1]", "xpath"),
	MENU("//*[@id='nav']/li[1]/div", "xpath"),
	REMOVE_NONRELEVANTDATA("//*[@id='nav']/li[1]/ul/li/a", "xpath"),
	GRID_FLIGHT("//span[contains(text(),'Flight')]", "xpath"),
	GRID_STARTDATE("//div[contains(@id,'slickgrid')]/span[contains(text(),'Start Date')]", "xpath"),
	GRID_STOPDATE("//div[contains(@id, 'slickgrid')]/span[contains (text(),'Stop')]", "xpath"),
	GRID_DEADLINE("//*[contains(@id, 'Deadline0')]/span", "xpath"),
	GRID_DAYSAHEAD("//*[contains(@id, 'Daysahead0')]/span", "xpath"),
	GRID_EXCS("//*[contains(@id, 'ProductionDeadLineDetailId0')]/span", "xpath"),
	GRIDFIRSTROW_FLIGHT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[3]", "xpath"),
	GRIDFIRSTROW_FLIGHTINPUT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[3]/input", "xpath"),
	GRIDFIRSTROW_DAYS("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[4]", "xpath"),
	GRIDFIRSTROW_DAYSINPUT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[4]/input", "xpath"),
	GRIDTHIRDROW_FLIGHT("//*[@id='mpsResults']/div[6]/div/div/div[3]/div[3]", "xpath"),
	ALERT_MSG("//*[@id='removeAlert']/div[2]", "xpath"),
	ALERT_CANCELBTN("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	TOASTMSG1("//*[@id='toast-container']/div[1]/div", "xpath"),
	TOASTMSG2("//*[@id='toast-container']/div[2]/div", "xpath"),
	TOASTMSG3("//*[@id='toast-container']/div[3]/div", "xpath"),
	GRIDFIRSTROW_EXCS("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[10]/div/a", "xpath"),
	GRIDFIRSTROW_DEADLINECLICK("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[8]/div", "xpath"),
	GRIDFIRSTROW_DEADLINEINPUT("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[8]/span/span/input", "xpath"),
	EXCS_WORKCENTERHEADER("//*[contains(@id, 'WorkCenterId')]", "xpath"),
	EXCS_DAYSAHEADHEADER("//*[contains(@id, 'DaysAhead')]/span", "xpath"),
	EXCS_CONTINUEBTN("//*[@id='continueButton']", "xpath"),
	EXCS_CANCELBTN("//*[@id='cancelButton']", "xpath"),
	EXCS_DEADLINECLICK("//*[@id='workCenterEditGrid']/div[6]/div/div/div[1]/div[2]/div", "xpath"),
	EXCS_DEADLINEINPUT("//*[@id='workCenterEditGrid']/div[6]/div/div/div[1]/div[2]/span/span/input", "xpath"),
	EXCS_DAYSAHEADCLICK("//*[@id='workCenterEditGrid']/div[6]/div/div/div[1]/div[3]", "xpath"),
	EXCS_DAYSAHEADINPUT("//*[@id='workCenterEditGrid']/div[6]/div/div/div[1]/div[3]/input", "xpath"),
	POPUP_OKBTN("//*[@id='loadingModal']/div[2]/a", "xpath"),
	POPUP_TEXT("//*[@id='loadingModal']/div[1]/div", "xpath"),
	GRIDFIRSTROW_ONLYFLIGHT("//*[@id='mpsResults']/div[6]/div/div/div/div[3]", "xpath"),
	DEPT_HEADER("//*[@id='mpsResults']/div[2]/div[1]/div[1]", "xpath"),
	DEPT("//div[contains(@class,'left')]//span[contains(text(),'LP5')]","xpath"),
	REMOVEICON_SEARCHROW("//*[@id='mpsResults']/div[6]/div/div/div/div[2]/span/a", "xpath"),
	DELETEICON("//*[@id='mpsResults']/div[6]/div/div/div[1]/div[2]/span/a", "xpath"),
	
;
	
	
	public String element,Identifier;
	private ProductionPlanningMPSEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningMPSEnum(String element, String Identifier){
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
