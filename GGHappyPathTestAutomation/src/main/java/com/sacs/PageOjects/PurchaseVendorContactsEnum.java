package com.sacs.PageOjects;

public enum PurchaseVendorContactsEnum {
	
	VENDOR_CONTACTS_BTN(".//*[@id='nav']/li[3]/a/div", "xpath"),
	ADD_CONTACT_BTN(".//*[@id='addNewContact']", "xpath"),
	SET_PREFERRED_PANEL(".//*[@id='setPreferred']", "xpath"),
	SET_PREFERRED_PANEL_TEXT(".//*[@id='setPreferred']/div[1]/span", "xpath"),
	ADD_CONTACT_POPUP_TITLE(".//*[@id='addContact_wnd_title']", "xpath"),
	NAME(".//*[@id='ContactName']", "xpath"),
	PHONE_NO(".//*[@id='PhoneNumber']", "xpath"),
	FAX_NO(".//*[@id='FaxNumber']", "xpath"),
	EMAIL(".//*[@id='EmailAddress']", "xpath"),
	CANCEL(".//*[@id='btn-cancel']", "xpath"),
	APPLY_CHANGES(".//*[@id='btn-vendorContactUpdate']", "xpath"),
	FAX_SEND_OREDERS("//*[@id='formBody']/div[1]/div[4]/label[2]/span/label", "xpath"),
	EMAIL_SEND_ORDERS("//*[@id='formBody']/div[1]/div[5]/label[2]/span/label", "xpath"),
	TOAST_MESSAGE("toast-message", "className"),
	EDIT_CONTACT(".//*[@id='editContactContainer0']/a", "xpath"),
	REMOVE_CONTACT(".//*[@id='removeArticleGrp']/a", "xpath"),
	BILLING("ddlPrefBilling", "id"),
	ORDERING("ddlPrefOrdering", "id"),
	RETURN("ddlPrefReturn", "id"),
	CANNOT_DELETE(".//*[@id='deleteContactCheck_wnd_title']", "xpath"),
	OK_BTN(".//*[@id='btn-OK']", "xpath"),
	REMOVE_CONTACT_TITLE(".//*[@id='removeAlert']/div[1]", "xpath"),
	REMOVE_CONTINUE_BTN(".//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	REMOVE_CANCEL_BTN(".//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	
	
	
	
	
	
	
	
	
	;
	
	private String element;
	private String Identifier;
	
	private PurchaseVendorContactsEnum(String element){
		 this.element = element;
	 }
	private PurchaseVendorContactsEnum(String element, String Identifier){
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
