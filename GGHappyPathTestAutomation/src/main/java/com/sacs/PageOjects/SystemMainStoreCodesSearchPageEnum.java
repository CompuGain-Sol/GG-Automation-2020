package com.sacs.PageOjects;

public enum SystemMainStoreCodesSearchPageEnum {
	
	SYSTEM_MENUITEM("system","id"),
	STORECODE_MENUITEM("//*[@id='subNav-system']/li[14]/a","xpath"),
	STORECODE_PAGEHEADER(".//*[@id='contentHeader']/div/h1","xpath"),
	ADD_MAINSTORE_CODE("//a[@class='addBtn btnSkin']","xpath"),
	SEARCH_BOX("//input[@id='articlesearch']","xpath"),
	
	PAGINATION_NEXT_LINK("//span[contains(.,'NEXT')]","xpath"),
	SEARCH_GRID_TABLE(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	PAGINATION_OPTIONS("//span[contains(.,'10')]","xpath"),
	//BACK_TO_SEARCH_BTN("//a[contains(@href,'/SacsQA/System/StoreCode/MainStoreSearch')]","xpath"),
	BACK_TO_SEARCH_BTN_AT_UNIT(".//*[@id='contentHeader']/div[3]/a","xpath"),
	BACK_TO_SEARCH_BTN(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SEARCH_SUBMIT_CLASS("searchSubmit","className"), 
	NO_DATA_TO_DISPLAY(".//*[@id='results']/table/tbody/tr/td","xpath"),
	
	//SELECT_ITEMS_PER_PAGE_XPATH(".//*[@id='gridWrapper']/div[2]/div[2]/span/span[1]/span[2]","xpath"), 
	SELECT_ITEMS_PER_PAGE_XPATH(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"), 
	GRID_FIRST_ROW_DESCRIPTION(".//*[@id='results']/table/tbody/tr[1]/td[2]/div","xpath"),
	SUB_GRID_FIRST_ROW_DESCRIPTION("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	
	UNIT_STORE_CODE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	MAIN_STORE_CODE_COLUMN_HEADING(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"), 
	MAIN_STORE_CODE_COLUMN_CLASS("articlerow","className"),
	ADD_MAIN_STORE_CODE_FIELD("//input[@id='Code']","xpath"),
	ADD_MAIN_STORE_CODE_DESC_FIELD("//input[@id='Description']","xpath"),
	ADD_MAIN_STORE_CLOSINGDAY_FIELD("//input[@id='ClosingDay']","xpath"),
	ADD_MAIN_STORE_APPLY_CHANGES_BTN("//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"), 
//	SEARCH_RESULT_FIRST_ROW("//div[@class='articlenumber']","xpath"),
	SEARCH_RESULT_FIRST_ROW(".//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCH_RESULT_FIRST_ROW_1(".//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SEARCH_DROPDOWN_ICON("//img[contains(@class,'searchFilter')]","xpath"),
	SEARCH_OPTION_DESCRIPTION("//span[contains(.,'Description  ')]","xpath"),
	SUB_SEARCH_OPTION_DESCRIPTION(".//*[@id='searchContainer']/div[3]/div[1]/label[1]/span","xpath"),
	SEARCH_OPTION_MAINSTORECODE(".//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"), 
	SUB_MAINSTORECODE_CRITERIA("//*[@id='searchContainer']/div[3]/div[1]/label[2]/span","xpath"),
	SUB_SUBSTORECODE_CRITERIA("//*[@id='searchContainer']/div[3]/div[2]/label/span","xpath"),
	UPDATE_MAINSTORE_CODE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SEARCH_RESULT_FIRST_COLUMN_VALUE(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	MAIN_STORE_CODE_DRPDWN("//select[@id='MainStoreCode']","xpath"),
	SEARCH_DROPDOWN(".//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCH_DROPDOWN_SUBSTORE(".//*[@id='searchContainer']/div[2]/span[3]/a/img", "xpath"),
	DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label/span", "xpath"),
	DESCRIPTION_CHECKBOX_SUBSTORE(".//*[@id='searchContainer']/div[3]/div[1]/label[1]/span","xpath"),
	SUB_SEARCH_CONTAINER("//*[@id='searchContainer']/div[3]","xpath"),
	SUB_FIRSTROW_MAINSTORECODE("//*[@id='results']/table/tbody/tr[1]/td[3]","xpath"),
	SUB_NO_DATA_TO_DISPLAY_ON_ADD_PAGE("//*[@id='connectedArticlesResults']/table/tbody/tr/td","xpath"),
	SUB_APPLY_CHANGES("//*[@id='saveContainer']/a","xpath"),
	SUB_CODE_FIELD("//*[@id='Code']","xpath"),
	SUB_DESCRIPTION("//*[@id='Description']","xpath"),
	SUB_PICKINGLIST_CHECKBOX("//*[@id='formBody']/div[1]/label/span","xpath"),
	SUB_PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	PAGINATION("pagContainerTop","className"),
	CONFIRMATION_POPUP("removeHeader","className"), 
	CANCEL_CONFIRMATION_POPUP(".//*[@id='removeMSAlert']/div[3]/a[2]","xpath"),
	SUB_MENU("//*[@id='nav']/li[1]/div","xpath"),
	SUB_REMOVE("//*[@id='removeArticleGrp']/a","xpath"),
	SUB_CANCEL_ON_REPLACE_PAGE("//*[@id='storesaveContainer']/a[2]","xpath"),
	SUB_OK_ON_REPLACE_PAGE("//*[@id='storesaveContainer']/a[1]","xpath"),
	SUB_REPLACE_SUB_STORE_CODE_POPUP("//*[@id='replaceSubstoreCodeAlert']","xpath"),
	SUB_CONTINUE_ON_REPLACE_SUB_STORE_CODE_POPUP("//*[@id='replaceSubstoreCodeAlert']/div[3]/a[1]","xpath"),
	MANAGE_UNIT_BUTTON(".//*[@id='manageUnits']","xpath"),
	UNIT_CHECKBOX(".//div[@id='linkToUnitsGrid']//div[@class='checkBoxStyle']/label","xpath"),
	MANAGE_UNIT_CONTINUE(".//div[@class='detailsBtns']//a[@id='continueButton']","xpath"),
	SUBSTORE_DESC("//*[@id='results']/table/tbody/tr[4]/td[1]", "xpath"),
	SUBSTORE("//*[@id='subNav-system']/li[15]/a", "xpath"),
	MAINSTORECODE("//*[@id='MainStoreCode']", "xpath"),
	CODE("//*[@id='Code']", "xpath"),
	SUBSTORE_CODE("//*[@id='results']/table/tbody/tr[4]/td[2]", "xpath"),
	BASICARTICLE_DESC("//*[@id='connectedArticlesResults']/table/tbody/tr[1]/td[2]", "xpath"),
	WASTEREASON("//*[@id='wastereason']/a", "xpath"),
	ACTIVE_CHKBOX("//*[@id='formBody']/div[1]/div[9]/label/span", "xpath"),
	SAVE_ICON("//*[@id='saveArticleGrp']/a", "xpath"),
	DESCRIPTION_2("//*[@id='Description']", "xpath"),
	APPLYCHANGESBTN("//*[@id='applyMainStoreCode']", "xpath"),
	;
	
	public String element,Identifier;
	private SystemMainStoreCodesSearchPageEnum(String element){
		 this.element = element;
	 }
	private SystemMainStoreCodesSearchPageEnum(String element, String Identifier){
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
