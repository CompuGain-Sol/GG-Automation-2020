package com.sacs.PageOjects;

public enum PurchaseAdditionalPurchasesEnums {
	
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	SEARCH_FILTER("searchFilter", "className"),
	ADDITIONAL_PURCHASES_LINK(".//*[@id='additionalpurchase']/a", "xpath"),
	ADDITIONAL_PURCHASES_TITLE(".//*[@id='additionalpurchase']/a", "xpath"),
	CREATE_NEW_PURCHASE_ORDERS_LINK(".//*[@id='searchExistingVendor']", "xpath"),
	GRID_VENDOR_ID_FIRST_COLUMN_VALUE_XPATH(".//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	VENDOR_NAME(".//*[@id='vendorTitle']/span", "xpath"),
	CREATE_ORDER_BTN(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	CURRENCY_DROPDOWN("Currency", "id"),
	ORDER_DATE_(".//*[@id='OrderDate']","xpath"),
	ORDER_BY(".//*[@id='OrderedBy']","xpath"),
	GRID(".//*[@id='myGrid']/div[2]", "xpath"),
	OK_BTN(".//*[@id='btnContainer']/a","xpath"),
	APPLY_CHANGES(".//*[@id='adBtnContainer']/span[6]/a", "xpath"),
	GRID_VENDOR_ARTICLE_NO("//*[@id='myGrid']/div[6]/div/div/div/div[2]", "xpath"),
	GRID_VENDOR_ARTICLE_NO_INPUT(".//*[@id='myGrid']/div[6]/div/div/div/div[2]/input", "xpath"),
	GRID_DESCRIPTION(".//*[@id='myGrid']/div[5]/div/div/div[3]", "xpath"),
	GRID_ORDER_QUANTITY(".//*[@id='myGrid']/div[6]/div/div/div/div[8]", "xpath"),
	GRID_ORDER_QUANTITY_INPUT("//*[@id='myGrid']/div[6]/div/div/div/div[8]/input", "xpath"),
	SUBMIT_ORDER("//*[@id='submitOrder']", "xpath"),
	EXPECTED_DELIVERY_DATE(".//*[@id='ExpectedDeliveryDate']", "xpath"),
	SUBMIT_PURCHASE_ORDER_POPUP_HEADING(".//*[@id='detailsTitle']", "xpath"),
	SUBMIT_PURCHASE_ORDER_POPUP_CONTINUE_BTN(".//*[@id='submitOrderContainer']/a[2]", "xpath"),
	SUBMIT_PURCHASE_ORDER_POPUP_OK_BTN(".//*[@id='poConfirmInfo']/div/a[3]", "xpath"),
	RECEIVE_ORDER("//*[@id='orderReceiptSubmitted']/a", "xpath"),
	TOAST_MESSAGE("toast-message", "className"),
	ORDER_STATUS("OrderStatusDescp", "id"),
	ORDER_STATUS1("//*[@id='statusDiv']/span[2]","xpath"),
	GRID_COST_CENTER("//*[@id='myGrid']/div[6]/div/div/div/div[5]","xpath"),
	GRID_COST_CENTER_SELECT("//*[@id='myGrid']/div[6]/div/div/div/div[5]/select","xpath"),
	GRID_ARTICLE_GROUP_DROPDOWN("editor-select","className"),
	INTORD_DROPDOWN("//*[@id='myGrid']/div[6]/div/div/div/div[7]/select", "xpath"),
	ARTICLE_GROUP("//*[@id='myGrid']/div[6]/div/div/div/div[6]","xpath"),
	ARTICLE_GROUP_SELECT("//*[@id='myGrid']/div[6]/div/div/div/div[6]/select","xpath"),
	INTORD_SELECT("//*[@id='myGrid']/div[6]/div/div/div/div[7]", "xpath"),
	NET_PRICE("//*[@id='myGrid']/div[6]/div/div/div/div[9]","xpath"),
	NET_PRICE_INPUT("//*[@id='myGrid']/div[6]/div/div/div/div[9]/input","xpath"),
	GRID_UOM("//*[@id='myGrid']/div[6]/div/div/div/div[4]","xpath"),
	GRID_ARTICLE_GROUP("//*[@id='myGrid']/div[6]/div/div/div/div[6]","xpath"),
	EXISTING_ORDER_BTN(".//*[@id='searchExistingOrder']","xpath"),
	BACK(".//*[@id='contentHeader']/div[2]/a","xpath"),
	ORDER_FORM("//*[@id='orderFormHeader']/div[1]","xpath"),
	SEARCH_RESULT(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	INFO_BUTTON(".//*[@id='results']/table/tbody/tr[1]/td[2]/div/a","xpath"),
	POPUP_LABEL(".//*[@id='poDetilasContainer_wnd_title']","xpath"),
	CANCEL_BTN(".//*[@id='poDetilasContainer']/div/div[3]/a[1]","xpath"),
	CREATE_ORDER(".//*[@id='createOrderByForm']","xpath"),
	PAGE_TITLE(".//*[@id='apvendorTitle']","xpath"),
	
	TABLE_HEADING1(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	TABLE_HEADING2(".//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	CHANGE_VENDOR(".//*[@id='contentBody']/section/div[3]/a","xpath"),
	CHANGE_VENDOR_LINK(".//*[@id='vendorBlock']/div/div[2]/a","xpath"),
	SELECT_VENDOR(".//*[@id='searchContainer']/label","xpath"),
	ORDER_NUMBER(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	ORDER_DATE(".//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	ITEMS(".//*[@id='results']/table/thead/tr/th[3]/a","xpath"),
	STATUS(".//*[@id='results']/table/thead/tr/th[4]","xpath"),
	
	PENDING_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	PENDING_APPROVAL_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	SUBMITTED_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[3]/span","xpath"),
	CLOSED_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[4]/span","xpath"),
	CANCELLED_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[1]/span","xpath"),
	RECIEVED_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[2]/span","xpath"),
	REJECTED_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[3]/span","xpath"),
	SEARCH_REASULT_FIRST_COL(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	EDIT_BUTTON(".//*[@id='results']/table/tbody/div/div[2]/a","xpath"),
	CANCEL_BUTTON("//*[@id='results']/table/tbody/tr/td[5]/div/div[3]/a","xpath"),
	DELETE_PO("//*[@id='results']/table/tbody/tr/td[5]/div/div[3]/a","xpath"),
	CONFIRMATION_POPUP(".//*[@id='removeAlert']/div[1]","xpath"),
	POPUP_CANCEL_BUTTON(".//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	POPUP_CONTINUE_BUTTON(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	CANCEL_PO_BUTTON(".//*[@id='cancelPo']","xpath"),
	CONTINUE(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	ORDER_STATUS_AP(".//*[@id='OrderNumber']","xpath"),
	VENDORNAME(".//*[@id='apvendorTitle']/span","xpath"),
	RECIEVE_DATE(".//*[@id='ReceivedDate']","xpath"),
	DELIVERY_NOTES(".//*[@id='DeliveryNoteNumber']","xpath"),
	RECIEVE_ORDER_BUTTON(".//*[@id='orderReceiptSubmitted']/a","xpath"),
	YES_BUTTON(".//*[@id='receivePO']","xpath"),
	STATUS_COLUMN(".//*[@id='results']/table/tbody/tr/td[4]","xpath"),
	STATUSCOLUMN2("//*[@id='results']/table/tbody/tr/td[6]", "xpath"),
	USER("//*[@id='mainNav']/div[1]/div[1]","xpath"),
	ADD_LINE("//*[@id='nav']/li[2]/a","xpath"),
	SEARCHEXISTINGORDER("//*[@id='searchExistingOrder']/li/div", "xpath"),
	SEARCH_KORDER("//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	MENU("//*[@id='nav']/li[1]/div", "xpath"),
	SAVEORDERFORM("//*[@id='nav']/li[1]/ul/li/a", "xpath"),
	FORMNAME("//*[@id='orderFormName']", "xpath"),
	ORDRFORM_SAVEBTN("//*[@id='saveOrderForm']", "xpath"),
	EDIT_BUTTON2("//*[@id='results']/table/tbody/tr[1]/td[5]/div/div[2]/a","xpath"),
	;
	
	public String element, identifier;
	private PurchaseAdditionalPurchasesEnums(String element){
		 this.element = element;
	 }
	private PurchaseAdditionalPurchasesEnums(String element, String identifier){
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
