package com.sacs.PageOjects;

public enum PurchaseVendorIncidentsEnum {
	
	MATERIALMGMT("//*[@id='purchase']/p", "xpath"),
	VENDOR_INCIDENTS_LINK(".//*[@id='vendorincident']/a", "xpath"),
	VENDOR_INCIDENTS_TITLE(".//*[@id='contentHeader']/div/h1", "xpath"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT(".//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	GRID_FIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	INCIDENT_TYPE(".//*[@id='IncidentType']", "xpath"),
	INCIDENT_TYPE_DROPDOWN("html/body/ul[1]", "xpath"),
	RELATED_TO_CUSTOMER(".//*[@id='CustomerCode']", "xpath"),
	DESCRIPTION("//*[@id='Description']", "xpath"),
	ACTIONTAKEN("//*[@id='ActionTaken']", "xpath"),
	OUTCOME("//*[@id='Outcome']", "xpath"),
	APPLYCHANGES(".//*[@id='action-addIncident']", "xpath"),
	TOAST_MESSAGE("toast-message","className"),
	BACK_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a", "xpath"),
	ADD_INCIDENT(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	CREATE_VENDOR_INCIDENT_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	VENDOR_INCIDENT_GRID_FIRST_ROW("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	UI_ACTIVE_MENUITEMS("ui-menu-item", "className"),
	GRID_DESC_FIRST_ROW(".//*[@id='results']/table/tbody/tr/td[3]/div", "xpath"),
	SELECTVENDORID("//*[@id='results']/table/tbody/tr[10]/td[2]", "xpath"),
	SEARCHVID("//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	SELECTVENDORNAME("//*[@id='results']/table/tbody/tr[9]/td[1]", "xpath"),
	SEARCHVNAME("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	SETTINGICON("//*[@id='results']/table/tbody/tr[1]/td[4]/a", "xpath"),
	ADDINCIDENT("//*[@id='copyUnits']", "xpath"),
	BACKTOSEARCH("Back to Search", "linkText"),
	BACKTOSEARCH2("//*[@id='backToSearch']", "xpath"),
	VIEWEXISTING("//*[@id='results']/table/tbody/tr[1]/td[4]/div/div[3]/a", "xpath"),
	EXISTINGVITEXT("//*[@id='vpaheaderContainer']/div", "xpath"),
	VIPOPUPTEXT("//*[@id='addVendorIncident']/div/div[1]", "xpath"),
	VIPOPUPCANCEL("//*[@id='addIncidentCancel']", "xpath"),
	VIPOPUPADDINCIDENT("//*[@id='addIncidentOk']", "xpath"),
	INCIDENTTYPE("//*[@id='IncidentType']", "xpath"),
	INCIDENTDATE("//*[@id='IncidentDate']", "xpath"),
	SEARCHORDER("//*[@id='action-getpurchaseOrder']", "xpath"),
	SEARCHORDERPOPUPCANCEL("//*[@id='relatedToOrder']/div[4]/a[1]", "xpath"),
	SEARCHORDERPOPUPATTACHTOINCIDENT("//*[@id='relatedToOrder']/div[4]/a[2]", "xpath"),
	RETURNTOVENDORCHK("//*[@id='recordVendorInfo']/div[5]/label/span", "xpath"),
	INCIDENTDESCTXT("//*[@id='results']/table/tbody/tr/td[3]", "xpath"),
	ADDVENDOR("Add New Vendor", "linkText"),
	VENDORNAME("//*[@id='VendorName_0']", "xpath"),
	SETPRIMARY("//*[@id='vendorContainer']/div[2]/div[1]/div[3]/label/span", "xpath"),
	ADDVENDORAPPLYCHANGES("//*[@id='saveContainer']/a", "xpath"),
	ADDSUBSTORE("Add Sub Store", "linkText"),
	STORECODE("//*[@id='StoreCode_0']", "xpath"),
	ORDERNUMBER("//*[@id='OrderNumber']", "xpath"),
	SEARCHEXISTINGORDER("//*[@id='contentHeader']/div[2]/a", "xpath"),
	DC_ORDERNUMBER("//*[@id='results']/table/tbody/tr/td[4]", "xpath"),
	SUBMITORDER("//*[@id='submitOrder']", "xpath"),
	PURCHASEORDERCONTINUE("//*[@id='submitOrderContainer']/a[2]", "xpath"),
	PURCHASEORDEROK("//*[@id='poConfirmInfo']/div/a[3]", "xpath"),
	ORDERCANCELLED("//*[@id='removePoLink']", "xpath"),
	CANCELCONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	CANCELREASONCONTINUE("//*[@id='cancelPo']", "xpath"),
	SEARCHORDERBYVENDOR("//*[@id='searchExistingVendor']/li/div", "xpath"),
	DELIVERYNOTE("//*[@id='DeliveryNoteNumber']", "xpath"),
	RECEIPTOK("//*[@id='receiptbtnContainer']/a", "xpath"),
	STOCKDATE("//*[@id='StockDate']", "xpath"),
	ORDERECEIPTCONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	EXPIRYDATE("//*[@id='myGrid']/div[5]/div/div/div[9]", "xpath"),
	EXPIRYDATEINPUT("//*[@id='myGrid']/div[5]/div/div/div[9]/span/span/input", "xpath"),
	VI_POPUPCANCEL("//*[@id='noRecVendInfo']", "xpath"),
	ORDERRECEIPTPOPUPCLOSE("//*[@id='closeOrder']", "xpath"),
	ORDERRECIPTCONTINUE2("//*[@id='poConfirmInfo']/div/a[2]", "xpath"),
	RELATEDORDERSTATUS("//*[@id='results']/table/tbody/tr/td[8]", "xpath"),
	RELATEDTOORDER("//*[@id='RelatedToOrder']", "xpath"),
	SEARCHEXISTINGORDER_PO("//*[@id='searchExistingOrder']/div/div", "xpath"),
	VIEWLINK("//*[@id='viewLink']", "xpath"),
	POVIEWINCIDENTPOPUPTEXT("//*[@id='vendorIncidentsListGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	POVIEWLINKPOPUPCANCEL("//*[@id='vendorIncidents']/div[2]/a", "xpath"),
	INCIDENTSETTINGICON("//*[@id='results']/table/tbody/tr[1]/td[5]/a", "xpath"),
	EDITINCIDENT("//*[@id='results']/table/tbody/tr[1]/td[4]/div/div[2]/a", "xpath"),
	REMOVEINCIDENT("//*[@id='copyUnits']", "xpath"),
	REMOVEINCIDENTTEXT("//*[@id='removeAlert']/div[1]", "xpath"),
	REMOVEINCIDENTCANCEL("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	REMOVEINCIDENTCONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	POR("//*[@id='purchaseorder']/a", "xpath"),
	VIEWINCIDENTS("//*[@id='vendorIncidentView']", "xpath"),
	SEARCHVENDOR("//*[@id='searchContainer']/label[2]", "xpath"),
	SLIDE_ARROW(".//*[@class='settings']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	ADDNEWINCIDENT("//*[@id='addNew']", "xpath"),
	BA_ACTIVE("//*[@id='formBody']/div[1]/div[14]/label/span", "xpath"),
	VIEW_EXISTINGINCIDENT("//*[@id='results']/table/tbody/tr[1]/td[4]/div/div[3]/a", "xpath"),
	SEARCH_DD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCHDD_RECEIVEDCHKBOX("//*[@id='searchContainer']/div[2]/div[2]/label[3]/span", "xpath"),
	SEARCHEXISTINGORDER_PORECEIPT("//*[@id='searchExistingOrder']/li/div", "xpath"),
	INCIDENTTYPE_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[2]/div", "xpath"),
	;
	
	
	public String element,Identifier;
	private PurchaseVendorIncidentsEnum(String element){
		 this.element = element;
	 }
	private PurchaseVendorIncidentsEnum(String element, String Identifier){
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
