package com.sacs.PageOjects;

public enum StoresWithdrawalsAndTransferEnum {

	STORES_MENUITEM(".//*[@id='stores']","xpath"),
	W_A_T_MENUITEM(".//*[@id='withdrawsandtransfer']/a","xpath"),
	CREATE_ORDER(".//*[@id='createOrder']","xpath"),
	FROM_SUBSTORE_TEXTBOX(".//*[@id='SubStoreCode']","xpath"),
	REQUIRED_BY_TEXTBOX(".//*[@id='ReqSubStoreCode']","xpath"),
	OK_BTN(".//*[@id='btn-ok']","xpath"),
	ORDER_QUANTITY(".//*[@id='resultsroEditGrid']/div[6]/div/div/div[1]/div[8]","xpath"),
	ORDER_QUANTITY_TEXTBOX(".//*[@id='resultsroEditGrid']/div[6]/div/div/div[1]/div[8]/input","xpath"),
	ORDER_QUANTITY1(".//*[@id='resultsroEditGrid']/div[5]/div/div[2]/div[8]","xpath"),
	ORDER_QUANTITY1_TEXTBOX(".//*[@id='resultsroEditGrid']/div[5]/div/div[2]/div[8]/input","xpath"),
	APPLY_CHANGE_BTN("Apply Changes","linkText"),
	GENERATE_ORDER(".//*[@id='generateOrder']","xpath"),
	CONTINUE_BTN(".//*[@id='generateRO']","xpath"),
	CLOSE_BTN(".//*[@id='closeInfoWindow']","xpath"),
	TRANSFER_TYPE_LABLE(".//*[@id='vendorTitle']/div[2]","xpath"),
	FROM_VALUE_TO_SELECT("html/body/ul[1]/li/a","xpath"),
	REQ_VALUE_TO_SELECT("html/body/ul[2]/li/a","xpath"),
	WAT_TITLE(".//*[@id='contentHeader']/div/h1","xpath"),
	ORDER_STATUS(".//div[@class='transWrapper']//Span[@ class='orderStatus']","xpath"),
	APPLY_CHANGES("Apply Changes","linkText"),
	SEARCH_EXISTING_ORDER(".//*[@id='searchExistingOrder']","xpath"),
	BACK("Back","linkText"),
	FIRST_ROW_SEC_COL(".//*[@id='requisitionResults']/table/tbody/tr[1]/td[2]","xpath"),
	FIRST_ROW_SIXTH_COL(".//*[@id='pickingListResults']/table/tbody/tr[1]/td[6]","xpath"),
	DETAIL_PAGE_TABLE(".//*[@id='formBody']","xpath"),
	THIRD_ROW(".//*[@id='requisitionResults']/table/tbody/tr[3]/td[1]","xpath"),
	THIRD_ROW_SEC_COL(".//*[@id='requisitionResults']/table/tbody/tr[3]/td[2]","xpath"),
	SEARCH_RESULT_FIRST_COL(".//*[@id='requisitionResults']/table/tbody/tr/td[1]","xpath"),
	SEARCH_RESULT_SEC_COL(".//*[@id='requisitionResults']/table/tbody/tr/td[2]","xpath"),
	THIRD_ROW_FIFTH_COL(".//*[@id='requisitionResults']/table/tbody/tr[3]/td[5]","xpath"),
	SEARCH_RESULT_FIFTH_COL(".//*[@id='requisitionResults']/table/tbody/tr/td[5]","xpath"),
	REQUISITION_NUMBER_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[1]/div/label[1]/span","xpath"),
	CANCELLED_ORDER_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[1]/div/label[2]/span","xpath"),
	ISSUED_ORDER_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[1]/div/label[3]/span","xpath"),
	FROM_STORE_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[2]/div/label[1]/span","xpath"),
	REQUIRED_BY_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[2]/div/label[2]/span","xpath"),
	SUBMITTED_CHECKBOX(".//*[@id='searchContainer']/div[3]/div[2]/div/label[3]/span","xpath"),
	LABEL(".//*[@id='contentHeader']/div[6]/div[1]","xpath"),
	ARTICLE_NUMBER("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[2]/span[1]","xpath"),
	DESCRIPTION("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[3]","xpath"),
	POP_UP(".//*[@id='inventoryRegInfo_wnd_title']/div[1]","xpath"),
	CLOSE("Close","linkText"),
	CORRECT_ORDER_BTN("Correct Order","linkText"),
	QNTY_ISSUED("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[7]","xpath"),
	QNTY_ISSUED_TEXTBOX("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[7]/input","xpath"),
	CREATE_PICKING_LIST("//*[@id='createPickList']/li/div","xpath"),
	EXPORT_SELECTED_BTN(".//*[@id='exportPickList']","xpath"),
	LOT_NUMBER("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[8]","xpath"),
	LOT_NUMBER_TEXTBOX("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[8]/input","xpath"),
	CREATE_PICKING_LIST_TEXT(".//a[@id='createPickList']/li"),
	OK("ok","id"),
	RESET("Reset","linkText"),
	NOTES(".//*[@id='AdditionalInfo']","xpath"),
	STOCK_DATE(".//*[@id='StockDate']","xpath"),
	ROW(".//*[@id='requisitionResults']/table/tbody/tr[3]/td[5]","xpath"),
	ARTICLE(".//*[@id='resultsEditGrid']/div[5]/div/div/div[1]/div/span[2]","xpath"),
	POPUP_TITLE(".//*[@id='removeAlert']/div[1]","xpath"),
	CANCEL("Cancel","linkText"),
	CONTINUE("Continue","linkText"),
	ORDER_NUMBER(".//*[@id='vendorTitle']/div[1]/span","xpath"),
	STATUS(".//*[@id='requisitionResults']/table/tbody/tr/td[7]","xpath"),
	INTERNAL_REQUISITION_ORDER(".//*[@id='requisitionorder']/a","xpath"),
	SEARCHEXISTINGOREDR(".//*[@id='searchExistingOrder']/li","xpath"),
	RESULT(".//*[@id='results']/table/tbody/tr/td[8]","xpath"),
	RESULTS2("//*[@id='resultsReqO']/table/tbody/tr/td[11]/div", "xpath"),
	ADD_ARTICLE("Add Articles","linkText"),
	ADD_ARTICLE1("Add Articles","linkText"),
	ADD_ARTICLE_GRID(".//*[@id='addArticlesWrapper']","xpath"),
	REMOVE_ARTICLE(".//div[@class='grid-canvas']//div[@class='wtTools']/span/a","xpath"),
	REMOVE_ARTICLE2("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[1]/div/span[1]/a", "xpath"),
	ARTICLE_HOVER("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[2]/span[1]","xpath"),
	ARTICLE_TO_ADD("//*[@id='addArticles']/table/tbody/tr/td[1]/div/label/span","xpath"),
	ARTICLENAME(".//*[@id='addArticles']/table/tbody/tr[1]/td[2]/span[1]","xpath"),
	ADD_SELECTED("Add Selected","linkText"),
	SLIKGRID_ARTICLE("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[2]/span[1]","xpath"),
	QUANTITY_REQ("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[8]","xpath"),
	QUANTITY_REQ_TEXTBOX("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[8]/input","xpath"),
	LOTNUMBER("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[9]","xpath"),
	LOTNUMBER_TEXTBOX("//*[@id='resultsEditGrid']/div[6]/div/div/div/div[9]/input","xpath"),
	ISSUE_ORDER("Issue Order","linkText"),
	SEARCHED_DATA("//*[@id='requisitionResults']/table/tbody/tr/td[2]/span", "xpath"),
	;	
	public String element, identifier;
	
	private StoresWithdrawalsAndTransferEnum(String element){
		 this.element = element;
	 }
	
	private StoresWithdrawalsAndTransferEnum(String element, String identifier){
		 this.element = element;
		 this.identifier = identifier;
	 }
	
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return identifier;
	}
}
