package com.sacs.PageOjects;

public enum OperationsRotationPlansAddEnum {
	OPERATIONS("operations","id"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	TOAST_MESSAGE("toast-message","className"), 
	ROTATION_PLANS_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"), 
	ADD_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	ROTATION_PLANS_XPATH("//*[@id='rotationplan']/a","xpath"),
	
	ROTATION_PLAN_CODE("//*[@id='Code']","xpath"),
	DESCRIPTION("//*[@id='Description']","xpath"),
	ROTATION_UNIT("//*[@id='RotationUnits']","xpath"),
	CHANGE_DAY("//*[@id='RotChangeDay']","xpath"),
	OK_BTN("//*[@id='okButton']","xpath"),
	RESULT_GRID_FIRSTCOLUMN_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	
	RESULT_GRID_FIRSTCOLUMN_BEFORE_SEARCH("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	EDIT_BTN("//*[@id='btnEditChanges']","xpath"),
	GENERATE_NEW_CHART_POPUP("//*[@id='rotPlanEditConfirm']","xpath"),
	CONTINUE_ON_GENERATE_NEW_CHART_POPUP("//*[@id='rotPlanEditConfirm']/div/a[2]","xpath"),
	DELETEICON(".//*[@id='removePoLink']/div", "xpath"),
	POPUPCONTINUE("//*[@id='deleteConfirm']/div/a[2]", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	TOAST_MSG("toast-message","className"),
	GRID_RESULTS("//*[@id='gridWrapper']","xpath"),
	RESULT_GRID_SECOND_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	ROTATION_PLAN_CRITERIA("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	DESCRIPTION_CRITERIA("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	BACK_TO_SEARCH("Back to Search","linkText"),
	FIRST_ROW_FIR_COL("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	LAST_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[4]/span","xpath"),
	FIRST_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[1]/span","xpath"),
	PREVIOUS_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[2]/span","xpath"),
	NEXT_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[3]/span","xpath"),
	START_DATE("//*[@id='StartDate']","xpath"),
	STOP_DATE("//*[@id='StopDate']","xpath"),
	FREQUENCY_OF_ROTATION("//*[@id='RotationFrequency']","xpath"),
	NUMBER_OF_ROTATIONS("//*[@id='NumberOfRotations']","xpath"),
	EDIT_ROTATION_POPUP("//*[@id='rotationNumberEdit']","xpath"),
	START_ROTATION("//*[@id='StartRotation']","xpath"),
	MENU("//*[@id='menuContainer']/div","xpath"), 
	CANCEL_ON_GENERATE_NEW_CHART_POPUP("//*[@id='rotPlanEditConfirm']/div/a[1]","xpath"),
	LAST_UPDATED("//*[@id='lastUpdatedContainer']","xpath"),
	WHERE_ROTATIONPLAN_IS_USED("//*[@id='menuContainer']/ul/li/a","xpath"),
	USED_IN_PANEL("//*[@id='rotationPlanUsedIn']","xpath"),
	NO_DATA_TO_DISPLAY_InUSED_IN_PANEL("//*[@id='rotationPlanUsed']/table/tbody/tr/td","xpath"),
	CLOSE_BUTTON("//*[@id='closeButton']","xpath"),
	CANCEL_DELETE("//*[@id='deleteConfirm']/div/a[1]","xpath"), 
	CANCEL_BUTTON("Cancel","linkText"),
	ITEMS_DD("//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[2]", "xpath"),
	ITEMS_DD2("//*[@id='count_option_selected']", "xpath"),
	GENERATE_ORDER_POPUP_TITLE("//*[@id='rotPlanEditConfirm_wnd_title']", "xpath"),
	;
	
	public String element,Identifier;
	private OperationsRotationPlansAddEnum(String element){
		 this.element = element;
	 }
	private OperationsRotationPlansAddEnum(String element, String Identifier){
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
