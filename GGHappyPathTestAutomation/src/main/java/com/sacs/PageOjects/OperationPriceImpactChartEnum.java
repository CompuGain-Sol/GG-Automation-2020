package com.sacs.PageOjects;

public enum OperationPriceImpactChartEnum {
	
		OPERATIONS("operations","id"),
		PIC("//*[@id='priceimpactchart']/a", "xpath"),
		ADD_PIC("//*[@id='addNew']", "xpath"),
		CUSTOMER_CODE("//*[@id='ParentCustomerId']", "xpath"),
		SALESNUMBER_SEARCHICON("//*[@id='picForm']/div[1]/div[2]/span[4]/a", "xpath"),
		DESCRIPTION("//*[@id='PICDescription']", "xpath"),
		OK_BTN("//*[@id='picForm']/div[2]/div[3]/a", "xpath"),
		SEARCHPOPUP_FIRSTROW("//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
		SEARCHPOPUP_SECONDCOLUMN("//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[2]", "xpath"),
		SEARCHPOPUP_THIRDCOLUMN("//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[3]", "xpath"),
		SEARCHPOPUP_CONTINUE("//*[@id='selSalesNoContinue']", "xpath"),
		SEARCHPOPUP_CANCEL("//*[@id='cancelSalesNo']", "xpath"),
		SEARCH_BOX("//*[@id='articlesearch']", "xpath"),
		SEARCH_ICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
		SALENO_FIRSTROW("//*[@id='picSearchResults']/table/tbody/tr/td[1]", "xpath"),
		APPLYCHANGES("//*[@id='applyChanges']", "xpath"),
		REMOVE_ICON("//*[@id='nav']/li[3]/a", "xpath"),
		REMOVEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
		NODATATODISPLAY("//*[@id='picSearchResults']/table/tbody/tr/td", "xpath"),
		SALESNO_POPUP_SEARCHBOX("//*[@id='showSalesNoSearchPopup']/div/div/div/span[1]/input", "xpath"),
		SALESNO_POPUP_SEARCHICON("//*[@id='showSalesNoSearchPopup']/div/div/div/span[2]/a/img", "xpath"),
		SALESNO_SINGLESEARCH("//*[@id='salesNumberSearchGrid']/table/tbody/tr/td[1]", "xpath"),
		PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
		SEARCH_DD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
		SEARCHOPTION_DESC("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span", "xpath"),
		SEARCHOPTION_SALESNUMBER("//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
		SEARCHOPTION_CUSTCODE("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span", "xpath"),
		SALESNO_FIRSTROW("//*[@id='picSearchResults']/table/tbody/tr[1]/td[1]", "xpath"),
		DESC_FIRSTROW("//*[@id='picSearchResults']/table/tbody/tr[1]/td[2]", "xpath"),
		DESC_FIRSTROW2("//*[@id='picSearchResults']/table/tbody/tr/td[2]", "xpath"),
		UPDATE_TITLE("//*[@id='lblUpdatePic']/h1", "xpath"),
		ADD_TITLE("//*[@id='lblNewPic']/h1", "xpath"),
		SALESNUMBER("//*[@id='SalesNumber']", "xpath"),
		SEARCHSALESNO_TITLE("//*[@id='showSalesNoSearchPopup_wnd_title']", "xpath"),
		SALESNO_SEARCHBOX("//*[@id='showSalesNoSearchPopup']/div/div/div/span/input", "xpath"),
		SALESNO_SEARCHICON("//*[@id='showSalesNoSearchPopup']/div/div/div/span[2]/a/img", "xpath"),
		EFFECTIVEDATE("//*[@id='EffectiveDate']", "xpath"),
		MAXPAXQTY("//*[@id='MaximumQty']", "xpath"),
		ADDLINE_BTN("//*[@id='picCreateWrapper']/div[5]/span[1]/a", "xpath"),
		SALESNO_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[4]", "xpath"),
		ADDLINE_SALES_SEARCHICON("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[4]/a/span", "xpath"),
		ADDLINE_DESCRIPTION("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[6]", "xpath"),
		ADDLINE_UOM("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[7]", "xpath"),
		ADDLINE_LOADRATIO_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[8]", "xpath"),
		ADDLINE_LOADRATIO_SEARCHICON("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[8]/a/span", "xpath"),
		LOADRATIO_POPUP_TITLE("//*[@id='showloadInsSearch_wnd_title']", "xpath"),
		LOADRATIO_POPUP_CANCEL("//*[@id='cancelLoadIns']", "xpath"),
		LOADRATIO_SEARCHBOX("//*[@id='showloadInsSearch']/div/div/div/span/input", "xpath"),
		LOADRATIO_SEARCHICON("//*[@id='showloadInsSearch']/div/div/div/span[2]/a/img", "xpath"),
		LOADRATIO_SEARCHROW("//*[@id='loadInsSearchGrid']/table/tbody/tr/td[2]", "xpath"),
		LOADRATIO_SEARCH_DESC("//*[@id='loadInsSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
		LOADRATIO_DESC_SEARCHEDROW("//*[@id='loadInsSearchGrid']/table/tbody/tr/td[1]", "xpath"),
		LOADRATIO_NODATATODISPLAY("//*[@id='loadInsSearchGrid']/table/tbody/tr/td", "xpath"),
		LOADRATIO_SEARCH_SECONDCOL("//*[@id='loadInsSearchGrid']/table/tbody/tr[1]/td[2]", "xpath"),
		LOADRATIO_INFOICON("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[9]/span/a", "xpath"),
		INFOICON_POPUP_TITLE("//*[@id='viewLoadRatioContainer_wnd_title']", "xpath"),
		INFOICON_POPUP_CLOSEBTN("//*[@id='viewLoadRatio']/div[3]/a", "xpath"),
		C_FIELD_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[11]", "xpath"),
		C_DROPDOWN("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[11]/select", "xpath"),
		CC_FIELD_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[12]", "xpath"),
		CC_DROPDOWN("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[12]/select", "xpath"),
		STARTDATE_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[13]", "xpath"),
		STARTDATE_INPUT("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[13]/span/span/input", "xpath"),
		STOPDATE_CLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[14]", "xpath"),
		STOPDATE_INPUT("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[14]/span/span/input", "xpath"),
		ADDLINE_QTYCLICK("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[10]", "xpath"),
		ADDLINE_QTYINPUT("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[10]/input", "xpath"),
		ADDLINE_COPYICON("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[1]/span/a", "xpath"),
		ADDLINE_SALESNO_SECONDROW("//*[@id='salesNumPriceChart']/div[6]/div/div/div[2]/div[4]", "xpath"),
		ADDLINE_DESC_SECONDROW("//*[@id='salesNumPriceChart']/div[6]/div/div/div[2]/div[6]", "xpath"),
		ADDLINE_UOM_SECONDROW("//*[@id='salesNumPriceChart']/div[6]/div/div/div[2]/div[7]", "xpath"),
		ADDLINE_DELETEICON("//*[@id='salesNumPriceChart']/div[6]/div/div/div/div[2]/span/a", "xpath"),
		DELETEPOPUP_CANCELBTN("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
		DELETEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
		HIDEINACTIVELINES("//*[@id='hideInActiveLines']/a", "xpath"),
		SHOWINACTIVELINES("//*[@id='showInActiveLines']/a", "xpath"),
		MENU("//*[@id='menuContainer']/div", "xpath"),
		MENUOPTION("//*[@id='menuContainer']/ul/li/a", "xpath"),
		EXPORT_BTN("//*[@id='menuContainer']/a", "xpath"),
		EXPORT_PIC_LINK("//*[@id='menuContainer']/ul/li/a/div", "xpath"),
		EXPORT_PIC_SUBLINK1("//*[@id='menuContainer']/ul/li/ul/li[1]/a", "xpath"),
		EXPORT_PIC_SUBLINK2("//*[@id='menuContainer']/ul/li/ul/li[2]/a", "xpath"),
		STARTPAXQTY("//*[@id='StartPaxQty']", "xpath"),
		PAXINTERVAL("//*[@id='PaxInterval']", "xpath"),
		EXPORT_MAXPAXQTY("//*[@id='MaximumPaxQty']", "xpath"),
		PRICESPERPAXINTERVAL_CANCELBTN("//*[@id='pricesPerPaxIntervalForm']/div[2]/a[1]", "xpath"),
		PRICESPERPAXINTERVAL_OKBTN("//*[@id='pricesPerPaxIntervalForm']/div[2]/a[2]", "xpath"),
		UPDATEPAGE_SALESNO("//*[@id='picForm']/div[1]/div[2]/span[3]", "xpath"),
		LASTUPDATED("//*[@id='lastUpdatedContainer']", "xpath"),
		DELETEICON("//*[@id='nav']/li[3]/a", "xpath"),
		DELETEPOPUP_TEXT("//*[@id='removeAlert']/div[2]", "xpath"),
		DELETEPOPUP_CANCEL("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
		DELETEPOPUP_CONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	;
	
	
	public String element, identifier;
		
		private OperationPriceImpactChartEnum(String element){
			 this.element = element;
		 }
		
		private OperationPriceImpactChartEnum(String element, String identifier){
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
