package com.sacs.PageOjects;

public enum StoresInventoryRegistrationEnum {
	
	STORES(".//*[@id='stores']","xpath"),
	INVENTORY_REGISTRATION(".//*[@id='inventoryregistration']/a","xpath"),
	SUB_STORE_TEXTBOX(".//*[@id='SubStoreCode']","xpath"),
	SUB_STORE_DROPDOWN("html/body/ul/li","xpath"),
	OK_BTN(".//*[@id='btn-ok']","xpath"),
	TOAST_MSG("toast-message","className"),
	INVENTORY_COL(".//*[@id='invEditGrid']/div[7]/div/div/div[1]/div[7]","xpath"),
					
	INVENTORY_TEXTBOX(".//*[@id='invEditGrid']/div[7]/div/div/div[1]/div[7]/input","xpath"),
	APPLY_CHANGE("//*[@id='navSecond']/li[3]/a/div","xpath"),
	CONFIRMATION_BOX(".//*[@id='registerMenuUnit']","xpath"),
	YES_BUTTON(".//*[@id='registerMenuUnitOK']","xpath"),
	PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	SUB_STORE_DROPDOWN_SECOND_VALUE("html/body/ul/li[2]","xpath"),
	SUB_STORE_DROPDOWN_ACTUAL("html/body/ul","xpath"),
	APPLY_CHANGE_ON_UNIT_UPDATEBASICARTICLE("//*[@id='saveContainer']/a","xpath"),
	INVENTORY_QTY_OUTER("//*[@id='invEditGrid']/div[7]/div/div/div[1]/div[7]","xpath"),
	INVENTORY_QTY_INNER("//*[@id='invEditGrid']/div[7]/div/div/div[1]/div[7]/input","xpath"),
	HOVER_ELEMENT("//*[@id='invEditGrid']/div[6]/div/div/div[1]/div[1]/span[1]","xpath"),
	INFORMATION_ICON("//*[@id='invEditGrid']/div[6]/div/div/div[1]/div[1]/span[2]/a","xpath"),
	INFO_POPUP("//*[@id='inventoryRegInfo']","xpath"),
	CLOSE_BTN_ON_INFO_POPUP("//*[@id='secondInfo']/div[3]/a","xpath"),
	MENU("//*[@id='navSecond']/li[1]/div","xpath"),
	CLEAR_DATA("//*[@id='navSecond']/li[1]/ul/li[1]/a","xpath"),
	REMOVE_ALERT_POPUP("//*[@id='removeAlert']","xpath"),
	CONTINUE_ON_REMOVE_ALERT("//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	CANCEL_ON_REMOVE_ALERT("//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	INSERT_THEORETICAL_STOCK("//*[@id='navSecond']/li[1]/ul/li[2]/a","xpath"),
	THEORETICAL_STOCK_POPUP("//*[@id='theoreticalStock']","xpath"),
	THEORETICAL_STOCK_POPUP_DATE("//*[@id='TheoreticalStockDate']","xpath"),
	CANCEL_ON_THEORETICAL_POPUP("//*[@id='windowClose']","xpath"),
	OK_ON_THEORETICAL_POPUP("//*[@id='insertTheoreticalStockOK']","xpath"),
	
	
	;
	
	public String element, identifier;
	
	private StoresInventoryRegistrationEnum(String element){
		 this.element = element;
	 }
	
	private StoresInventoryRegistrationEnum(String element, String identifier){
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
