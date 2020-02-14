package com.sacs.PageOjects;

public enum InvoiceInvoiceGenerationEnum {

	INVOICE("//*[@id='invoice']", "xpath"),
	INVOICEGENERATION("//*[@id='invoicegeneration']/a", "xpath"),
	INVOICEGENERATION_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	CORRECTINVOICEDATA("//*[@id='correct']/a", "xpath"),
	CORRECTFLIGHTDATA("//span[contains(text(),'Correct Flight Data / Invoices')]", "xpath"),
	CORRECTINVOICENUMBERSANDDATES("//span[contains(text(),'Correct invoice numbers and  dates ')]", "xpath"),
	//CORRECTFLIGHTNUMBERINPUT("//div[@class='slick-headerrow-columns slick-headerrow-columns-left']/div[3]/input", "xpath"),
	CORRECTFLIGHTNUMBERINPUT("//*[@id='CorrectInvoiceDateGrid']/div[4]/div[1]/div[2]/div[4]/input", "xpath"),
	//CORRECTINVOICEDATEINPUTINACTIVE("//div[@class='ui-widget-content slick-row even']/div[7]", "xpath"),
	CORRECTINVOICEDATEINPUTINACTIVE("//*[@id='CorrectInvoiceDateGrid']/div[6]/div/div/div/div[8]", "xpath"),
	CORRECTINVOICEDATEINPUT("//*[@id='CorrectInvoiceDateGrid']/div[6]/div/div/div/div[8]/span/span/input", "xpath"),
	CORRECTINVOICESTATUSINACTIVE("//*[@id='CorrectInvoiceDateGrid']/div[6]/div/div/div/div[9]", "xpath"),
	CORRECTINVOICESTATUSINPUT("//*[@id='CorrectInvoiceDateGrid']/div[6]/div/div/div/div[9]/select", "xpath"),
	
	
	CORRECTFLIGHTSTATUSINPUT("//div[@class='slick-cell l7 r7 editableCell active editable']/select/option", "xpath"),
	OK_BTN("//*[@id='selSourceWrapper']/div[2]/span/a", "xpath"),
	ADDLINE_BTN("//*[@id='addLine']", "xpath"),
	STARTDATE_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[1]", "xpath"),
	STARTDATE_INPUT("//*[@id='invGenGrid']/div[6]/div/div/div/div[1]/span/span/input", "xpath"),
	STOPDATE_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[2]", "xpath"),
	STOPDATE_INPUT("//*[@id='invGenGrid']/div[6]/div/div/div/div[2]/span/span/input", "xpath"),
	CUSTCODE_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[3]", "xpath"),
	CUSTCODE_INPUT("//*[@id='invGenGrid']/div[6]/div/div/div/div[3]/input", "xpath"),
	CUSTNO_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[4]", "xpath"),
	CUSTNO_INPUT("//*[@id='invGenGrid']/div[6]/div/div/div/div[4]/input", "xpath"),
	FLIGHT_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[5]", "xpath"),
	FLIGHT_INPUT("//*[@id='invGenGrid']/div[6]/div/div/div/div[5]/input", "xpath"),
	CREATEINVOICE("//*[@id='invGridSection']/div[2]/div[2]/span/a", "xpath"),
	JOBSTATUS("//*[@id='pastJobsGrid']/table/tbody/tr[1]/td[10]", "xpath"),
	REFRESH("//*[@id='refresh']", "xpath"),
	SEARCH_INVOICE("//*[@id='searchInvoice']", "xpath"),
	SELECTSOURCE("//*[@id='InvoiceMonth']", "xpath"),
	PASTINVOICEJOBS_GRID("//*[@id='pastJobsGrid']/table/tbody/tr/td[1]", "xpath"),
	MENU("//*[@id='nav']/li/div", "xpath"),
	BACK("//*[@id='backToSearch']", "xpath"),
	INVOICETYPE_CLICK("//*[@id='invGenGrid']/div[6]/div/div/div/div[6]", "xpath"),
	CUSTCODE_SEARCHICON("//*[@id='invGenGrid']/div[6]/div/div/div/div[3]/a/span", "xpath"),
	CUSTCODE_SEARCHPOPUP_FIRSTROWSECONDCOL("//*[@id='parentcustomerSearchGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	CUSTCODE_SEARCHPOPUP_CANCELBTN("//*[@id='parentCustSearchCancel']", "xpath"),
	CUSTNO_SEARCHICON("//*[@id='invGenGrid']/div[6]/div/div/div/div[4]/a/span", "xpath"),
	CUSTNO_SEARCHPOPUP_THIRDCOL("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[3]", "xpath"),
	CUSTNO_SEARCHPOPUP_CANCELBTN("//*[@id='childCustSearchCancel']", "xpath"),
	SEARCH_CUSTCODE_SEARCHBOX("//*[@id='showParentCustomerSearch']/div/div/div/span[1]/input", "xpath"),
	SEARCH_CUSTCODE_SEARCHBTN("//*[@id='showParentCustomerSearch']/div/div/div/span[2]/a/img", "xpath"),
	SINGLEROW_SECONDCOL("//*[@id='parentcustomerSearchGrid']/table/tbody/tr/td[2]", "xpath"),
	CUSTCODE_SEARCHPOPUP_OKBTN("//*[@id='parentCustSearchContinue']", "xpath"),
	FLIGHT_SEARCHICON("//*[@id='invGenGrid']/div[6]/div/div/div/div[5]/a/span", "xpath"),
	FLIGHT_SEARCHPOPUP_TITLE("//*[@id='showFlightSearch_wnd_title']", "xpath"),
	FLIGHT_SEARCHPOPUP_CANCELBTN("//*[@id='cancelActFltSearch']", "xpath"),
	FLIGHT_SEARCHPOPUP_CONTINUEBTN("//*[@id='selActFltContinue']", "xpath"),
	FLIGHT_SEARCHPOPUP_SEARCHBOX("//*[@id='showFlightSearch']/div/div/span[1]/input", "xpath"),
	FLIGHT_SEARCHPOPUP_SEARCHICON("//*[@id='showFlightSearch']/div/div/span[2]/a/img", "xpath"),
	FLIGHT_SEARCHPOPUP_PAGINATION("//*[@id='actFlightsGrid']/div", "xpath"),
	FLIGHT_CUSTCODE("//*[@id='actFlightsGrid']/table/tbody/tr/td[1]", "xpath"),
	FLIGHT_CUSTNO("//*[@id='actFlightsGrid']/table/tbody/tr/td[2]","xpath"),
	FLIGHT_DEPDATE("//*[@id='actFlightsGrid']/table/tbody/tr/td[3]", "xpath"),
	FLIGHT_FLIGHT("//*[@id='actFlightsGrid']/table/tbody/tr/td[4]", "xpath"),
	FLIGHT_ARRDEP("//*[@id='actFlightsGrid']/table/tbody/tr/td[5]", "xpath"),
	FLIGHT_ARRDEPTIME("//*[@id='actFlightsGrid']/table/tbody/tr/td[6]", "xpath"),
	FLIGHT_ACVERSION("//*[@id='actFlightsGrid']/table/tbody/tr/td[7]", "xpath"),
	FLIGHT_SEARCH_DD("//*[@id='showFlightSearch']/div/div/span[3]/a/img", "xpath"),
	FLIGHT_SEARCHDD_FLIGHTNO("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span", "xpath"),
	FLIGHT_SEARCHDD_CUSTCODE("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span", "xpath"),
	FLIGHT_SEARCHDD_CUSTNO("//*[@id='searchContainer']/div[2]/div[1]/label[3]/span", "xpath"),
	SAVEICON("//div[@class='IconSet']", "xpath"),
	START_DATE("//input[@id='startDate']", "xpath"),
	END_DATE("//input[@id='endDate']", "xpath"),
	DATECHECK("//span[contains(text(),'Datecheck:')]", "xpath"),
	CUSTNUMBER_SEARCHPOPUP_OKBUTTON("//a[@id='childCustSearchContinue']", "xpath"),
	
	SEARCHCUSTOMERS_INVERTEDARROW("//div[@id='childCustWrapper']//img[@class='searchFilter']","xpath"),
	SEARCHCUSTOMERS_CUSTOMERCODE("//input[@id='CustomerCodePop']/following-sibling::span","xpath"),
	SEARCHCUSTOMERS_CUSTOMERNAME("//label[@for='CustomerNamePop']/span","xpath"),
	SEARCHCUSTOMERS_CUSTOMERNO("//label[@for='CustomerNumberPop']/span","xpath"),
	SEARCHCUSTOMERS_CANCELBTN("//a[@id='childCustSearchCancel']","xpath"),
	SEARCHCUSTOMERS_POPUPSEARCHICON("//div[@id='showCustomerSearch']//img[@class='searchSubmit']","xpath"),
	SEARCH_NODATADISPALY("//div[@id='customerSearchGrid']/table/tbody/tr/td","xpath"),
	FLIGHT_POPUP_FLIGHTNOCHECKBOX("//label[@for='actFlightNum']/span","xpath"),
	FLIGHT_POPUP_CUSTOMERCODECHECKBOX("//label[@for='actFltCustCode']/span","xpath"),
	FLIGHT_POPUP_CUSTOMERNOCHECKBOX("//label[@for='actFltcustNumber']/span","xpath"),
	FLIGHT_POPUP_INVERTEDARROW("//div[@id='showFlightSearch']//img[@class='searchFilter']","xpath"),
	FLIGHT_POPUP_SEARCHINPUT("//div[@id='showFlightSearch']//input[@id='articlesearch']","xpath"),
	
	INVOICEGENERATION_ADDLINECOPYBUTTON("//div[@id='invGenGrid']/div[6]/div/div/div/div[10]/div/span[1]/a","xpath"),
	INVOICEGENERATION_ADDLINEDELETEBUTTON("//div[@id='invGenGrid']/div[6]/div/div/div/div[10]/div/span[2]/a","xpath"),
	COPYADDLINE1_STARTDATE("//*[@id='invGenGrid']/div[6]/div/div/div[1]/div[1]","xpath"),
	COPYADDLINE2_STARTDATE("//*[@id='invGenGrid']/div[6]/div/div/div[2]/div[1]","xpath"),
	COPYADDLINE1_STOPDATE("//*[@id='invGenGrid']/div[6]/div/div/div[1]/div[2]","xpath"),
	COPYADDLINE2_STOPTDATE("//*[@id='invGenGrid']/div[6]/div/div/div[2]/div[2]","xpath"),
	COPYADDLINE1_CUSTCODE("//*[@id='invGenGrid']/div[6]/div/div/div[1]/div[3]","xpath"),
	COPYADDLINE2_CUSTCODE("//*[@id='invGenGrid']/div[6]/div/div/div[2]/div[3]","xpath"),
	COPYADDLINE1_CUSTNO("//*[@id='invGenGrid']/div[6]/div/div/div[1]/div[4]","xpath"),
	COPYADDLINE2_CUSTNO("//*[@id='invGenGrid']/div[6]/div/div/div[2]/div[4]","xpath"),
	COPYADDLINE1_FLIGHT("//*[@id='invGenGrid']/div[6]/div/div/div[1]/div[5]","xpath"),
	COPYADDLINE2_FLIGHT("//*[@id='invGenGrid']/div[6]/div/div/div[2]/div[5]","xpath"),
	
	DELETEADDLINE_POPUP_TITLE("//span[@id='loadingModal_wnd_title']","xpath"),
	DELETEADDLINE_POPUP_DESC("//div[@class='alertText cb']","xpath"),
	DELETEADDLINE_POPUP_CLOSEBTN("//a[@class='largebtnSkin btn-close']","xpath"),
	DELETEADDLINE_POPUP_CONTINUEBTN("//a[@class='largebtnSkin btn-Continue']","xpath"),
	FIRSTRECORD_REMOVED(".//*[@id='invGenGrid']/div[6]/div/div","xpath"),
	
	INVOICE_PDFDOWNLOADICON("//div[@id='pastJobsGrid']/table/tbody/tr[1]/td[12]/div/a[@title='Download']","xpath"),
	
	
	INVOICEGENERATION_MENU("//div[@class='extendedMenu']","xpath"),
	INVOICEGENETATION_MENU_SAVE("//ul[@id='nav']/li/ul/li[1]/a","xpath"),
	INVOICEGENETATION_MENU_READ("//ul[@id='nav']/li/ul/li[2]/a","xpath"),
	INVOICEGENETATION_MENU_ERASE("//ul[@id='nav']/li/ul/li[3]/a","xpath"),
	
	
	INVOICEGENETATION_MENU_SAVETITLE("//span[@id='batchList_wnd_title']","xpath"),
	INVOICEGENETATION_MENU_SAVEBATCH("//div[@id='batchList']/div[1]/div/span[1]","xpath"),
	INVOICEGENETATION_MENU_SAVEBATCHINPUT("//input[@id='batchFileName']","xpath"),
	INVOICEGENETATION_MENU_SAVECANCEL("//div[@id='batchList']/div[3]/a[1]","xpath"),
	INVOICEGENETATION_MENU_SAVECONTINUE("//div[@id='batchList']/div[3]/a[2]","xpath"),
	
	INVOICEGENETATION_MENU_READTITLE("//span[@id='batchList_wnd_title']","xpath"),
	INVOICEGENETATION_MENU_READBATCHLIST("//div[@id='batchgrid']/table/thead/tr/th/a","xpath"),
	INVOICEGENETATION_MENU_READBATCHLISTARROW("//div[@id='batchgrid']/table/thead/tr/th/a/span","xpath"),
	INVOICEGENETATION_MENU_READBATCHLISTTABLE("//div[@id='batchgrid']/table/tbody","xpath"),
	SEARCH_STARTDATE("//*[@id='startDate']", "xpath"),
	
	
	;
	
	public String element,Identifier;
	private InvoiceInvoiceGenerationEnum(String element){
		 this.element = element;
	 }
	private InvoiceInvoiceGenerationEnum(String element, String Identifier){
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
