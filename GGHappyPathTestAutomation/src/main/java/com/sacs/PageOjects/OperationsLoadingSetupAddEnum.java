package com.sacs.PageOjects;

public enum OperationsLoadingSetupAddEnum {
	OPERATIONS("operations","id"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	LOADING_SETUP_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"), 
	SEARCH_SUBMIT("searchSubmit", "className"),
	TOAST_MESSAGE("toast-message","className"),
	LOADING_SETUP_XPATH("//*[@id='loadingsetup']/a","xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	ADD_BTN("//*[@id='contentHeader']/div[2]/a","xpath"),
	BACK_TO_SEARCH("//*[@id='contentHeader']/div[3]/a","xpath"), 
	LOADING_SETUP_CODE("//*[@id='LoadingSetupCode']","xpath"),
	DESCRIPTION("//*[@id='Description']","xpath"), 
	CUSTOMER_CODE_DROPDOWN("//*[@id='CustomerCode']","xpath"),
	MANAGE_UNIT("Manage Units","linkText"),
	AUS_SYD_CHECKBOX_XPATH(".//*[@id='linkToUnitsGrid']//div[starts-with(@class,'grid-canvas')]//input[@type='checkbox']","xpath"),
	UNIT_CHECKBOX("//*[@id='slickgrid_993111_checkbox_selector']/span/div/label/span","xpath"),
	CONTINUE_ON_LINK_TO_UNIT("//*[@id='continueButton']","xpath"),
	CANCEL_ON_LINK_TO_UNIT("Cancel","linkText"),
	LINK_TO_UNITS_POPUP("//*[@id='linkToUnitsModal']","xpath"),
	OK_BTN("//*[@id='okBtn']","xpath"),
	RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	RESULT_GRID_FIRST_ROW_LOADING_SETUP_BEFORE_SEARCH("//*[@id='results']/table/tbody/tr/td","xpath"),
	RESULT_GRID_FIRST_ROW_DESCRIPTION_BEFORE_SEARCH("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	RESTART("//*[@id='restartBtn']","xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	DELETEICON("//*[@id='nav']/li[2]/a/div", "xpath"),
	POPUP("//*[@id='loadingModal']","xpath"),
	YES("//*[@id='loadingModal']/div[2]/a[1]","xpath"),
	NO("//*[@id='loadingModal']/div[2]/a[2]","xpath"),
	DELETE_POPUP_CANCEL("//*[@id='loadingModal']/div[2]/a[2]","xpath"),
	POPUPDELETE("//*[@id='loadingModal']/div[2]/a[1]", "xpath"),
	LOADING_SETUP_CRITERIA("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	DESCRIPTION_CRITERIA("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	RESULT_GRID_FIRST_ROW_CUSTOMER_CODE_BEFORE_SEARCH("//*[@id='results']/table/tbody/tr[1]/td[3]","xpath"),
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[3]/span","xpath"), 
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[4]/span","xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[2]/span","xpath"), 
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[1]/span","xpath"),
	SEARCH_ENTERIES_INVERTER_SYMBOL("k-select","className"),
	SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item","xpath"),
	
	LAST_UPDATED_ID("lastUpdatedContainer","id"),
	LOADSETUPADDLINE("//*[@id='action-addLine']", "xpath"),
	ADDLINEAIRCLASS("//*[@id='ClassCode']", "xpath"),
	ADDLINEDELPLANCODE("//*[@id='DelPlanCode']", "xpath"),
	ADDLINEACVERSION("//*[@id='AircraftVersionCode']", "xpath"),
	ADDLINEADD("//*[@id='addBtn']", "xpath"),
	ADDLINEDESCSEARCHICON("//*[@id='addLineContainer']/div[1]/div[2]/a/img", "xpath"),
	SELECTDELPLAN("//*[@id='deliveryPlanGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	SELECTDELPLAN_2("//*[@id='deliveryPlanGrid']/table/tbody/tr[2]/td[1]", "xpath"),
	AIRCRAFT_VERSION_POPUP_OPEN_ICON("//*[@id='addLineContainer']/div[1]/div[3]/a/img","xpath"),
	ADD_LINE_REMOVE_ICON("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[8]/span/a","xpath"),
	CANCEL("//*[@id='deliveryPlanSearchPopup']/div[4]/a[1]","xpath"),
	CANCEL_ON_AIRCRAFT_VERSION_POPUP("//*[@id='airCraftSearchPopup']/div[4]/a[1]","xpath"),
	START_DATE("//*[@id='StartDate']","xpath"),
	STOP_DATE("//*[@id='EndDate']","xpath"),
	COPY_LINE("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[9]/span/a","xpath"),
			   
	ADD_LINE_CONTAINER("//*[@id='addLineContainer']","xpath"),
	ADD_LINE_DEL_PLAN("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[2]","xpath"),
					  
	EDIT_BUTTON_ON_ADDLINE(".//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[10]/span/a","xpath"),
	UPDATE_BTN("//*[@id='updateBtn']","xpath"),
	DEL_PLAN_ON_ADD_LINE("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[2]","xpath"),
							
	CLASS_ON_ADD_LINE("//*[@id='loadingSetupDetailsGrid']/div[5]/div/div/div[1]","xpath"),
	CLASS_ON_ADD_LINE1("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[1]","xpath"),
	AC_VERSION_ONADD_LINE("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[4]","xpath"),
	AC_VERSION_ONADD_LINE1("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[4]","xpath"),
	ADD_LINE_DEL_PLAN_SECOND_ROW("//*[@id='loadingSetupDetailsGrid']/div[5]/div/div[2]/div[2]","xpath"),
	ADD_LINE_DEL_PLAN_SECOND_ROW1("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div[2]/div[2]","xpath"),
	MENU("//*[@id='nav']/li[1]/div","xpath"),
	MENU_WHERE_LS_USED("//*[@id='nav']/li[1]/ul/li[1]/a","xpath"),
	MENU_COPY_LOADING_SETUP("//*[@id='nav']/li[1]/ul/li[2]/a","xpath"),
	WHERE_USED_POPUP("//*[@id='whereIsLSUsedModal']","xpath"),
	TEXT_ON_WHERE_USED_POPUP("//*[@id='whereIsLSUsedModal']/div[1]/div[4]","xpath"),
	CLOSE_BTN("//*[@id='closeButton']","xpath"), 
	COPY_POPUP("//*[@id='attentionModalPopup']","xpath"),
	CANCEL_ON_COPY_POPUP("Cancel","linkText"),
	COPY_ON_COPY_POPUP("//*[@id='attentionModalPopup']/div[2]/a[2]","xpath"), 
	ATTENTION_POPUP_TEXT("//*[@id='loadingModal']/div[1]/div","xpath"),
	LOCATION_XPATH("//*[@id='lsUsedInGrid']/table/thead/tr/th[1]","xpath"),
	SEARCHDP("//*[@id='deliveryPlanSearchPopup']/div[1]/div/span[2]/a/img", "xpath"),
	SELECTDP("//*[@id='deliveryPlanGrid']/table/tbody/tr/td[1]", "xpath"),
	CLOSEBTN("//*[@id='loadingModal']/div[2]/a", "xpath"),
	SELECT_ALL("//*[@id='linkToUnitsGrid']/div/div/div/div[1]/span/input", "xpath"),
	;

	public String element,Identifier;
	private OperationsLoadingSetupAddEnum(String element){
		 this.element = element;
	 }
	private OperationsLoadingSetupAddEnum(String element, String Identifier){
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
