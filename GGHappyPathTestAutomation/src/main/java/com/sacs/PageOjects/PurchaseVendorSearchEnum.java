package com.sacs.PageOjects;

public enum PurchaseVendorSearchEnum {
	PURCHASE("purchase","id"),
	STORES("stores","id"),
	VENDORS_LINKTEXT("Vendors","linkText"),
	VENDOR_SEARCH_FILTER_CLASS("searchFilter","className"),
	ADDVENDOR_LINKTEXT("Add Vendor","linkText"),
	VENDOR_SERACH_FILTER_VENDOR_NAME_XPATH(".//*[@id='searchContainer']/div[2]/div[2]/div/label/span","xpath"),									
	VENDOR_SERACH_FILTER_VENDOR_NAME_XPATH_AP(".//*[@id='searchContainer']/div[2]/div/div/label[2]/span","xpath"),
	VENDOR_SEARCH_BACK_TO_SEARCH_LINK_TEXT("Back to Search","linkText"),
	VENDOR_SERACH_FILTER_VENDOR_ID_XPATH(".//*[@id='searchContainer']/div[2]/div[1]/div/label/span","xpath"),
	VENDOR_SERACH_FILTER_VENDOR_ID_XPATH_AP(".//*[@id='searchContainer']/div[2]/div/div/label[1]/span","xpath"),
	VENDORS_TEXT_XPATH(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_VENDOR_TITLE_XPATH("/html/body/div/div/div[2]/section/div/div/div/h1","xpath"),
	VENDOR_SEARCH_FIELD_ID("articlesearch","id"),
	//VENDOR_SEARCH_NO_ITEMS_TO_DISPLAY_XPATH(".//*[@id='results']/div/span","xpath"),
											
	VENDOR_SEARCH_NO_ITEMS_TO_DISPLAY_XPATH(".//*[@id='results']/table/tbody/tr/td","xpath"),
	VENDOR_SEARCH_NO_ITEMS_TO_DISPLAY_XPATH_NAME("/html/body/div/div/div[2]/section/div[4]/div[3]/span","xpath"),
	VENDOR_SEARCH_SUBMIT_CLASS("searchSubmit","className"),
	VENDOR_SEARCH_SUBMIT_XPATH("/html/body/div/div/div[2]/section/div[3]/div/span[2]/a","xpath"),
	VENDOR_SEARCH_TOTAL_PAGE_ENTRIES_XPATH("/html/body/div/div/div[2]/section/div[4]/div[3]/span","xpath"),
//	VENDOR_SEARCH_GRID_FIRST_COLUMN_XPATH("/html/body/div/div/div[2]/section/div[4]/div[4]/table/tbody/tr/td","xpath"),
	VENDOR_SEARCH_GRID_FIRST_COLUMN_XPATH("//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	VENDOR_SEARCH_GRID_FIRST_COLUMN_XPATH_AP("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	VENDOR_SEARCH_GRID_VENDOR_ID_LINK_TEXT("VENDOR ID","linkText"),
	VENDOR_SEARCH_GRID_VENDOR_ID_LINK_XPATH("/html/body/div/div/div[2]/section/div[4]/div[4]/table/thead/tr/th/a","xpath"),
	VENDOR_SEARCH_GRID_VENDOR_NAME_LINK_TEXT("NAME","linkText"),	
	VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	//VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_XPATH("/html/body/div/div/div[2]/section/div[4]/div[4]/table/tbody/tr/td[2]","xpath"),
	VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_XPATH("//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	VENDOR_SEARCH_GRID_VENDOR_NAME_COLUMN_XPATH_AP(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	VENDOR_SEARCH_TOAST_MSG_CLASS("toast-message","className"),
	//VENDOR_SEARCH_GRID_FRIST_ROW_XPATH("/html/body/div/div/div[2]/section/div[4]/div[4]/table/tbody/tr","xpath"),
	VENDOR_SEARCH_GRID_FRIST_ROW_XPATH(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	GRID_VENDOR_NAME_COLUMN_ON_LANDING(".//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	GRIDARROW("//*[@id='results']/table/tbody/tr[1]/td[3]/a", "xpath"),
	
	VENDOR_SEARCH_COPY_VENDOR_LINK_TEXT("C","linkText"),
	VENDOR_SEARCH_CANCEL_LINK_TEXT("Cancel","linkText"),
	VENDOR_SEARCH_COPY_VENDOR_POPUP_HEADER_XPATH(".//*[@id='copyAlert']/div[1]","xpath"),
	VENDOR_SEARCH_REMOVE_VENDOR_LINK_TEXT("X","linkText"),
	VENDOR_SEARCH_REMPVE_VENDOR_POPUP_HEADING_XPATH(".//*[@id='removeAlert']/div[1]","xpath"),
	VENDOR_SEARCH_EDIT_VENDOR_LINK_TEXT("//*[@id='results']/table/tbody/tr[1]/td[3]/div/div[2]/a","xpath"),
	VENDOR_SEARCH_EDIT_VENDOR_PAGE_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	VENDOR_SEARCH_GRID_SELECT_ITEMS_PER_PAGE_XPATH("//*[@class='itemCountContainer fr']/span","xpath"),
	VENDOR_SEARCH_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item","className"),
	VENDOR_SEARCH_GRID_VENODR_ID_COLUMN_CLASS("articlenumber","className"),
	VENDOR_SEARCH_GRID_SHOWING_ENTRIES_XPATH("//*[@id='gridWrapper']/div[3]/div","xpath"),
	VENDOR_SEARCH_GRID_NEXT_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[3]/span","xpath"),
	VENDOR_SEARCH_GRID_PREV_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[2]/span","xpath"),
	VENDOR_SEARCH_GRID_LAST_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[4]/span","xpath"),
	VENDOR_SEARCH_GRID_FIRST_LINK_XPATH("//*[@id='gridWrapper']/div[3]/div/a[1]/span","xpath"),
	VENDOR_SEARCH_GRID_SELECTED_PAGE_VALUE_CLASS("k-state-selected","className"),
	VENDOR_SEARCH_GRID_PAGINATION_OPTIONS_CLASS("pagContainerTop","className"),
	VENDOR_SEARCH_GRID_CONTINUE_LINK_TEXT("Continue","linkText"),
	APPLY_CHANGES_LINK_TEXT(".//*[@id='applyChanges']","xpath"),
	
	EDIT_VENDOR_NAME_ID("Name","id"),
	EDIT_VENDOR_ACCOUNT_OWNER_ID("ContractRepName","id"),
	VENDOR_SEARCH_GRID_FIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	DELETE_VENDOR_LINK(".//*[@id='removeVendor']/a", "xpath"),
	DELETE_VENDOR_CONTINUE_BTN(".//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	SEE_MORE_OPTIONS("//*[@id='results']/table/tbody/tr/td[3]", "xpath"),
	VENDORDESC_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	VENDORDESC_SEARCHRECORD("//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	VENDORID_FIRSTROW("//*[@id='results']/table/tbody/tr[2]/td[1]", "xpath"),
	VENDORID_SEARCHRECORD("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	VENDOR_NO("//*[@id='VendorNumber']", "xpath"),
	VIEW_EXISTING_ORDER_BTN("//*[@id='searchExistingVendor']/li/div", "xpath"),
	;
	
	public String element,Identifier;
	private PurchaseVendorSearchEnum(String element){
		 this.element = element;
	 }
	private PurchaseVendorSearchEnum(String element, String Identifier){
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
