package com.sacs.PageOjects;

public enum InvoiceCustomerTurnOverGroupEnum {

INVOICE("//*[@id='invoice']", "xpath"),
CUSTTURNOVERGRP("//*[@id='customerturnovergroup']/a", "xpath"),
CTOGTITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
ADDCTOG("//*[@id='contentHeader']/div[2]/a", "xpath"),
CTOG_CUSTOMERCODE("//*[@id='CustomerCode']", "xpath"),
CTOG_CC_SEARCHICON("//*[@id='imagebtn']", "xpath"),
CTOG_SELECTCUSTOMER("//*[@id='customerSearchGrid']/table/tbody/tr/td[1]", "xpath"),
CTOG_CUSTTURNOVERGROUP("//*[@id='CustomerTurnoverGroupCode']", "xpath"),
CTOG_DESCRIPTION("//*[@id='Description1']", "xpath"),
CTOG_DESCRIPTION2(".//*[@id='Description2']", "xpath"),
CTOG_OK("//*[@id='btn-ok']", "xpath"),
CTOG_BACKTOSEARCH("//*[@id='contentHeader']/div[2]/a", "xpath"),
CTOG_FIRSTROW("//*[@id='CustTurnoverGrid']/table/tbody/tr/td[3]", "xpath"),
CTOG_DELICON("//*[@id='nav']/li[3]/a/div", "xpath"),
DELPOPOK("OK", "linkText"),
NODATATODISPLAY("//*[@id='CustTurnoverGrid']/table/tbody/tr/td", "xpath"),
APPLYCHANGES("//*[@id='applyChanges']", "xpath"),
SEARCHDD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
SEARCHOPTION_CUSTNAME("//*[@id='searchContainer']/div[2]/div[1]/div[1]/label/span", "xpath"),
SEARCHOPTION_CUSTOMERTG("//*[@id='searchContainer']/div[2]/div[2]/div[1]/label/span", "xpath"),
SEARCHOPTION_CUSTCODE("//*[@id='searchContainer']/div[2]/div[1]/div[2]/label/span", "xpath"),
SEARCHOPTION_DESC("//*[@id='searchContainer']/div[2]/div[2]/div[2]/label/span", "xpath"),
SEARCHDESCTEXT("//*[@id='CustTurnoverGrid']/table/tbody/tr[1]/td[4]", "xpath"),
SEARCHDESCTEXT2("//*[@id='CustTurnoverGrid']/table/tbody/tr/td[4]", "xpath"),
SEARCH_CUSTOMER_TG("//*[@id='CustTurnoverGrid']/table/tbody/tr[1]/td[3]", "xpath"),
SEARCH_CUST_CODE("//*[@id='CustTurnoverGrid']/table/tbody/tr[1]/td[2]", "xpath"),
SEARCH_CUSTNAME("//*[@id='CustTurnoverGrid']/table/tbody/tr[1]/td[1]", "xpath"),
FIRST_ROW_FIRST_COL("//*[@id='CustTurnoverGrid']/table/tbody/tr[1]/td[1]", "xpath"),
CUSTCODE_SEARCHICON_TITLE("//*[@id='showCustomerSearch_wnd_title']", "xpath"),
CUSTCODE_SEARCHPOPUP_OK("//*[@id='childCustSearchContinue']", "xpath"),
CUSTCODE_SEARCHPOPUP_CANCEL("//*[@id='childCustSearchCancel']", "xpath"),
CUSTCODE_SEARCHPOPUP_PAGINATION("//*[@id='customerSearchGrid']/div", "xpath"),
CC_SEARCHPOPUP_FIRSTCOL_SECROW("//*[@id='customerSearchGrid']/table/tbody/tr[2]/td[1]", "xpath"),
CC_SPP_SEARCHBOX("//*[@id='articlesearch']", "xpath"),
CC_SPP_SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
CC_SPP_NODATATODISPLAY("//*[@id='customerSearchGrid']/table/tbody/tr/td", "xpath"),
ADDCTOG_LASTUPDATED("//*[@id='lastUpdatedContainer']", "xpath"),
ADDCTOG_COPYICON("//*[@id='nav']/li[4]/a/div", "xpath"),
ADDCTOG_REMOVEICON("//*[@id='removeCustTrnGrp']/a/div", "xpath"),
ADDCTOG_SAVEICON("//*[@id='nav']/li[2]/a/div", "xpath"),
ADDCTOG_EXPORTBTN("//*[@id='exportCtogBtn']", "xpath"),
ADDCTOG_SHOWSOLDQTYS("//*[@id='custInvoice']/div[2]/div/label/span", "xpath"),
ADDCTOG_RELATECTOG_DD("//*[@id='RelateTurnoverClass']", "xpath"),
SEARCHEDITEM_DOUBLEDCLICK("//*[@id='CustTurnoverGrid']/table/tbody/tr/td[1]", "xpath"),
CTOG_MENU("//*[@id='nav']/li[1]/div", "xpath"),
WHERECTOGUSED("//*[@id='nav']/li[1]/ul/li/a", "xpath"),
WHERECTOGUSED_POPUP("//*[@id='loadingModal']/div[1]/div", "xpath"),
WWHERECTOGUSED_POPUP_OKBTN("//*[@id='loadingModal']/div[2]/a", "xpath"),
WHERESALESISUSEDPOPUP_SALESNUMBER("//*[@id='whereUsedGrid']/table/tbody/tr/td[2]", "xpath"),
WHERESALESNUMBERUSEDPOPUP_OKBTN("//*[@id='whereUsedPopup']/div[3]/a", "xpath"),
CTOG_DELETEPOPUP_OKBTN("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
CTOG_DELETEPOPUP_CANCELBTN("//*[@id='loadingModal']/div[2]/a[1]", "xpath"),
DETELE_CTOG_NODATATODISPLAY("//*[@id='CustTurnoverGrid']/table/tbody/tr/td", "xpath"),
BACKTOSEARCH("//*[@id='backToSearch']", "xpath"),
COPY_CTOG_OKBTN("//*[@id='btn-Copyok']", "xpath"),
COPYCTOG_CUSTCODE_SEARCHICON("//*[@id='imagebtn1']", "xpath"),
COPYCTOG_CUSTCODE_SEARCHBOX("//*[@id='articlesearch']", "xpath"),
COPYCTOG_CUSTCODE_SEARCHICON2("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
COPYCTOG_SELECTED_CUSTCODE("//*[@id='ToCustomerCode']", "xpath"),
	;
	public String element,Identifier;
	private InvoiceCustomerTurnOverGroupEnum(String element){
		 this.element = element;
	 }
	private InvoiceCustomerTurnOverGroupEnum(String element, String Identifier){
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
