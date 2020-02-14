package com.sacs.PageOjects;

public enum PurchaseReturnToVendorEnum {
	RETURN_TO_VENDOR_LINK(".//*[@id='returntovendor']/a", "xpath"),
	RETURN_TO_VENDOR_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	CREATE_RETURN_BTN(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	BACK_BTN(".//*[@id='contentHeader']/div[2]/a[2]", "xpath"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT(".//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	APPLYCHANGES(".//*[@id='action-addIncident']", "xpath"),
	TOAST_MESSAGE("toast-message","className"),
	BACK_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a", "xpath"),
	SUBMIT_RETURN_ORDER_POPUP_HEADING("detailsTitle", "id"),
	SUBMIT_RETURN_ORDER_POPUP_CONTINUE_BTN("Continue","linkText"),
	RETURN_TO_SUBMITTED_POPUP_HEADING("detailsTitle", "id"),
	RETURN_TO_SUBMITTED_POPUP_OK_BTN("okReturnOrder", "id"),
	ADD_VENDOR_INCIDENT_POPUP_HEADING("recordVendorIncident_wnd_title", "id"),
	ADD_VENDOR_INCIDENT_POPUP_CANCEL_BTN("noRecVendInfo", "id"),
	ADD_VENDOR_INCIDENT_POPUP_YES_BTN("openRecVendInfo", "id"),
	
	TO_VENDOR(".//*[@id='ToVendor']", "xpath"),
	STOCK_DATE(".//*[@id='StockDate']", "xpath"),
	OK_BTN(".//*[@id='btn-ok']", "xpath"),
	ADD_ARTICLE(".//*[@id='addart']", "xpath"),
	GRID_ARTICLE_DETAILS(".//*[@id='returnToVendorGrid']/div[2]", "xpath"),
	GRID_CHECKBOX(".//*[@id='addArticles']/table/tbody/tr/td[1]/div/label/span", "xpath"),
	ADD_SELECTED_BTN(".//*[@id='addArticlesWrapper']/div[1]/div[2]/a", "xpath"),
	GRID_RETURN_QUANTITY(".//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[4]", "xpath"),
	GRID_RETURN_QUANTITY_INPUT(".//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[4]/input", "xpath"),
	ISSUE_RETURN(".//*[@id='saveContainer']/a", "xpath"),
	UI_MENU_ITEM("ui-menu-item", "className"),
	VENDOR_DROPDOWN("html/body/ul", "xpath"),
	GRID_OF_SELECTED_ARTICLE(".//*[@id='returnToVendorGrid']/div[6]/div/div/div/div[2]", "xpath"),
	GRID_FRIRST_COLUMN(".//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	GRID_VENDOR_NAME_COLUMN_XPATH(".//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	SAVE_CHANGES_CONTINUE_BTN(".//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	GRID_SEARCH_FRIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"), 
	RESULT_GRID_FIRSTCOLUMN_BEFORE_SEARCH("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCH_RESULT_GRID_NEXT_LINK_XPATH("//div[@id='results']/div/div/a[3]/span","xpath"),
	SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//div[@id='results']/div/div/a[2]/span","xpath"),
	SEARCH_RESULT_GRID_LAST_LINK_XPATH("//div[@id='results']/div/div/a[4]/span","xpath"),
	SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//div[@id='results']/div/div/a[1]/span","xpath"), 
	SHOW_ENTRY_DROPDOWN("k-select","className"),
	REMARKS("//*[@id='Remarks']","xpath"),
	ARTICLE_LIST_FIRST_ROW_ARTICLE_NUMBER("//*[@id='addArticles']/table/tbody/tr[1]/td[2]","xpath"),
	ADD_ARTICLE_SEARCH("//*[@id='addArticlesearch']","xpath"),
	ADD_ARTICLE_SEARCH_BUTTON("//*[@id='addArticlesWrapper']/div[1]/div[1]/div[1]/span[2]/a/img","xpath"),
	ARTICLE_LIST_FIRST_ROW_ARTICLE_NUMBER_AFTER_SEARCH("//*[@id='addArticles']/table/tbody/tr/td[2]","xpath"),
	CLOSE_BTN("//*[@id='addArticlesWrapper']/div[1]/div[3]/a","xpath"),
	EDIT_BTN("//*[@id='btn-edit']","xpath"),
	REMOVE_ARTICLE("//*[@id='returnToVendorGrid']/div[5]/div/div/div[1]/span/a","xpath"),
	POPUP_ICON_ON_RETURN_GRID_ROW("//*[@id='returnToVendorGrid']/div[5]/div/div/div[2]/span[2]/a","xpath"),
	ARTICLE_INFO_POPUP("//*[@id='inventoryRegInfo']","xpath"),
	CLOSE_ON_ARTICLE_INFO_POPUP("//*[@id='secondInfo']/div[3]/a","xpath"),
	GRID_OF_SELECTED_ARTICLE_SPAN("//*[@id='returnToVendorGrid']/div[5]/div/div/div[2]/span[1]", "xpath"),
	PO_NUMBER("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[5]","xpath"),
	PO_NUMBER_INPUT("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[5]/input","xpath"),
	DELIVERY_NOTE_NO("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[6]","xpath"),
	DELIVERY_NOTE_NO_INPUT("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[6]/input","xpath"),
	DAY_PRICE("//*[@id='returnToVendorGrid']/div[5]/div/div/div[10]","xpath"),
	CANCEL_BUTTON_ON_CREATE_ORDER_POPUP("//*[@id='generateOrderContainer']/a[1]","xpath"),
	INCIDENT_TYPE("//*[@id='IncidentType']","xpath"),
	DESCRIPTION("//*[@id='Description']","xpath"),
	ADD_INCIDENT_BUTTON("//*[@id='action-addIncident']","xpath"),
	CANCEL_ON_ADD_INCIDENT_POPUP("//*[@id='vinfoClose']","xpath"),
	INCIDENT_TYPE_DROPDOWN("/html/body/ul[2]","xpath"),
	REMOVE_ICON_FIRSTROW("//*[@id='returnToVendorGrid']/div[6]/div/div/div/div[1]/span/a", "xpath"),
	ARTINFO_POPUP_TITLE("//*[@id='inventoryRegInfo_wnd_title']/div[1]", "xpath"),
	DESC_FIRSTROW("//*[@id='returnToVendorGrid']/div[6]/div/div/div/div[3]", "xpath"),
	ARTINFO_ICON("//*[@id='addArticles']/table/tbody/tr/td[2]/span[2]/a", "xpath"),
	ARTNUM_FIRSTROW("//*[@id='returnToVendorGrid']/div[6]/div/div/div/div[2]/span[1]", "xpath"),
	DAYPRICE("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[7]", "xpath"),
	TOTALPRICE("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[8]", "xpath"),
	VENDORARTNUM("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[9]", "xpath"),
	
	;
	
	
	public String element,Identifier;
	private PurchaseReturnToVendorEnum(String element){
		 this.element = element;
	 }
	private PurchaseReturnToVendorEnum(String element, String Identifier){
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
