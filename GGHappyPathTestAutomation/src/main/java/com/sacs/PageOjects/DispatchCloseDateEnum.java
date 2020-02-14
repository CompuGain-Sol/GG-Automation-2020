package com.sacs.PageOjects;

public enum DispatchCloseDateEnum {

	DESPATCH("//*[@id='dispatch']/p", "xpath"),
	CLOSEDATE("//*[@id='subNav-dispatch']/li[6]", "xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div/span[2]/a/img", "xpath"),
	SEARCH_SINGLEROW("//*[@id='results']/table/tbody/tr/td", "xpath"),
	CLOSEDATE_BTN("//*[@id='formBody']/div[2]/a", "xpath"),
	CLOSEDATE_CONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	CLOSECONFIRMDATE_POPUPTEXT("//*[@id='invConfAlert']/div[2]", "xpath"),
	CLOSECONFIRMDATE_CONTINUEBTN("//*[@id='invConfAlert']/div[3]/a[1]", "xpath"),
	PAGE_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	SEARCH_GRID("//*[@id='results']/table", "xpath"),
	PAGINATION("//*[@id='results']/div", "xpath"),
	HEADER("//*[@id='results']/table/thead/tr/th/a", "xpath"),
	FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td", "xpath"),
	PAGE_TEXT("//*[@id='formBody']/div[1]/h4", "xpath"),
	HEADER_CLOSEDATEDETAIL("//*[@id='formBody']/div[2]", "xpath"),
	BODY_CLOSEDATEDETAIL("//*[@id='formBody']/div[3]", "xpath"),
	PRINT_DISPATCH_CONTROL_LIST("//*[@id='closeFlightsNav']/li[1]/a", "xpath"),
	CLOSE_FLIGHT_BY_CUSTOMER("//*[@id='closeFlightsNav']/li[2]/a", "xpath"),
	REOPEN_FLIGHT_BY_CUSTOMER("//*[@id='closeFlightsNav']/li[3]/a", "xpath"),
	CREATE_CLOSEDATE_DOCUMENT("//*[@id='closeFlightsNav']/li[4]/a", "xpath"),
	OK_BTN("//*[@id='okButton']", "xpath"),
	CANCELLED_FLIGHT_ICON("//*[@id='formBody']/div[2]/div[1]/div[2]/a", "xpath"),
	OPEN_FLIGHT_ICON("//*[@id='formBody']/div[2]/div[1]/div[3]/span[2]/a", "xpath"),
	CANCELLED_FLIGHT_TITLE_POPUP("//*[@id='viewflightStatusContainer_wnd_title']", "xpath"),
	CANCELLEDFLIGHT_POPUP_CLOSEBTN("//*[@id='closeButton']", "xpath"),
	CLOSE_FLIGHT_BY_CUST_POPUP_TITLE("//*[@id='showcloseFltbyCust_wnd_title']", "xpath"),
	CLOSE_FLIGHT_BY_CUST_POPUP_CONTINUEBTN("//*[@id='openFlightWrapper']/div[3]/a[1]", "xpath"),
	CLOSE_FLIGHT_BY_CUST_POPUP_CANCELBTN("//*[@id='openFlightWrapper']/div[3]/a[2]", "xpath"),
	SELECT_CUST_CHECKBOX("//*[@id='openFlights']/table/tbody/tr/td[1]/div/label/span", "xpath"),
	ATTENTION_POPUP_CLOSEBTN("//*[@id='loadingModal']/div[2]/a", "xpath"),
	CLOSEDFLIGHTS_COUNT("//*[@id='formBody']/div[2]/div[1]/div[1]/span", "xpath"),
	REOPEN_FLIGHTS_BYCUST_POPUP_TITLE("//*[@id='showReopenFltbyCust_wnd_title']", "xpath"),
	REOPEN_FLIGHTS_BYCUST_POPUP_CONTINUEBTN("//*[@id='reopenFlightWrapper']/div[3]/a[1]", "xpath"),
	REOPEN_FLIGHTS_BYCUST_POPUP_CANCELBTN("//*[@id='reopenFlightWrapper']/div[3]/a[2]", "xpath"),
	REOPEN_FLIGHTS_SELECT_CUST_CHECKBOX("//*[@id='reOpenFlights']/table/tbody/tr[1]/td[1]/div/label/span", "xpath"),
	CONFIRM_REOPEN_FLIGHTS_POPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	CREATECLOSEDATE_OKBTN("//*[@id='okButton']", "xpath"),
	;
	public String element,Identifier;
	private DispatchCloseDateEnum(String element){
		 this.element = element;
	 }
	private DispatchCloseDateEnum(String element, String Identifier){
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
