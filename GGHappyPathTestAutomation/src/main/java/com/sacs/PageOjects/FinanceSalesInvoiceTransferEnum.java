package com.sacs.PageOjects;

public enum FinanceSalesInvoiceTransferEnum {
	FINACE(".//*[@id='finance']","xpath"),
	SALESINVOICETRANSFER("//*[@id='salesinvoicetransfer']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div/h1","xpath"),
	SELECTMONTH_DD("//*[@id='InvoiceMonth']", "xpath"),
	OK_BTN("//*[@id='ok']", "xpath"),
	FLIGHT_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[5]", "xpath"),
	DATE_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[6]", "xpath"),
	INVOICENO_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[3]", "xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	SEARCHROW_CHKBOX("//*[@id='results']/table/tbody/tr/td[1]/div/label/span", "xpath"),
	ADD_SELECTED("//*[@id='AddSearchWrapper']/div[2]/a", "xpath"),
	INVOICEGRID_INVOICENO("//*[@id='OPoResult']/div[6]/div/div/div/div[2]", "xpath"),
	REMOVEICON("//*[@id='OPoResult']/div[6]/div/div/div/div[1]/span/a", "xpath"),
	TRANSFERTENDERINVOICE("//*[@id='TransferInvoice']", "xpath"),
	POSTINGDATE("//*[@id='postingDate']", "xpath"),
	CONTINUEBTN("//*[@id='transferInvoice']/div[4]/a[2]", "xpath"),
	CONFIRM_YESBTN("//*[@id='transFormConfirm']/div[2]/a[1]", "xpath"),
	CONFIRM_POPUPTITLE("//*[@id='noInvoices_wnd_title']", "xpath"),
	POPUP_OKBTN("//*[@id='noInvoices']/div[2]/a", "xpath"),
	SEARCHINVOICE_NO("//*[@id='results']/table/tbody/tr/td[3]", "xpath"),
	FIRSTROW_CHKBOX("//*[@id='results']/table/tbody/tr[1]/td[1]/div/label/span", "xpath"),
	SECONDROW_CHKBOX("//*[@id='results']/table/tbody/tr[2]/td[1]/div/label/span", "xpath"),
	CLOSE_BTN("//*[@id='AddSearchWrapper']/div[3]/a", "xpath"),
	ADDINVOICE_BTN("//*[@id='AddPo']", "xpath"),
	INVOICEGRID_FIRSTROW("//*[@id='OPoResult']/div[6]/div/div/div[1]/div[2]", "xpath"),
	INVGRID_REMOVEICON2("//*[@id='OPoResult']/div[6]/div/div/div[2]/div[1]/span/a", "xpath"),
	TRANSFERINVOICE_TITLE("//*[@id='transferInvoice_wnd_title']", "xpath"),
	TRANSFERINVOICE_POPUP_CANCELBTN("//*[@id='transferInvoice']/div[4]/a[1]", "xpath"),
	POSTINGDATE_ICON("//*[@id='transferInvoice']/div[3]/span[2]/span/span/span/span", "xpath"),
	TRANSFERINVOICE_POPUP_CONTINUEBTN("//*[@id='transferInvoice']/div[4]/a[2]", "xpath"),
	CONFIRMTRANSFER_POPUP_TITLE("//*[@id='transFormConfirm_wnd_title']", "xpath"),
	CONFIRMTRANSFER_POPUP_NOBTN("//*[@id='transFormConfirm']/div[2]/a[2]", "xpath"),
	CONFIRMTRANSFER_POPUP_YESBTN("//*[@id='transFormConfirm']/div[2]/a[1]", "xpath"),
	SUUCESSFULCREATED_POPUP_TITLE("//*[@id='noInvoices_wnd_title']", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	;
	public String element,Identifier;
	/*private FinanceSalesInvoiceTransferEnum(String element){
		 this.element = element;
	 }*/
	private FinanceSalesInvoiceTransferEnum(String element, String Identifier){
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
