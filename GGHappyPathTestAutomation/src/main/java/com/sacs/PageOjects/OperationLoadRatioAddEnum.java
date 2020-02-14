package com.sacs.PageOjects;

public enum OperationLoadRatioAddEnum {
	
		OPERATIONS("operations","id"),
		LOAD_RATIO("Load Ratios","linkText"),
		ADD_LOAD_RATIO("Add Load Ratio","linkText"),
		LOAD_RATIO_TEXTBOX(".//*[@id='Code']","xpath"),
		DESCRIPTION(".//*[@id='Description']","xpath"),
		OK("//*[@id='okButton']","xpath"),
		APPLY_CHANGES(".//*[@id='saveContainer']/a","xpath"),
		APPLYCHANGES("Apply Changes", "linkText"),
		TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
		BACK_TO_SEARCH("Back to Search","linkText"),
		SEARCH_TRIANGLE(".//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
		DESCRIPTION_CHECKBOX("//*[@id='searchContainer']/div[2]/div[1]/label/span","xpath"),
		LOADRATIO_SEARCHCHK("//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
		SEARCH_BTN("//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
		SEARCH_BAR(".//*[@id='articlesearch']","xpath"),
		GRID_FIRST_ROW_SECOND_COL(".//*[@id='results']/table/tbody/tr/td[2]","xpath"),
		DELETEICON("//*[@id='deleteContainer']/a/div", "xpath"),
		POPUPOK(".//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
		NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
		SEARCHCONTAINER("//*[@id='searchContainer']/div[1]", "xpath"),
		DESCRIPTIONHEADING("//*[@id='results']/table/thead/tr/th[1]/a", "xpath"),
		LOADRATIOHEADING("//*[@id='results']/table/thead/tr/th[2]/a", "xpath"),
		ITEMSDD("//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[1]", "xpath"),
		PAGINATIONLINKS("//*[@id='results']/div", "xpath"),
		FIRSTRECORD("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
		FIRSTCOLSECONDROW("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
		QTYWITHPAX("//*[@id='LoadQty']", "xpath"),
		FIRSTRECORDDCLICK("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
		DOUBLECLICKFIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[1]"),
		MENU("//*[@id='menuContainer']/div", "xpath"),
		LASTUPDATED("//*[@id='lastUpdatedContainer']", "xpath"),
		COPYICON("//*[@id='copyContainer']/a/div", "xpath"),
		APPLYCHANGESICON("//*[@id='nav']/li[2]/a/div", "xpath"),
		U_LOADRATIO("//*[@id='lrForm']/div[1]/div[1]", "xpath"),
		U_DESCRIPTION("//*[@id='lrForm']/div[1]/div[2]", "xpath"),
		U_QTYWITHPAX("//*[@id='lrForm']/div[1]/div[3]", "xpath"),
		U_EFFECTIVEDATE("//*[@id='lrForm']/div[2]/div[2]/div[2]", "xpath"),
		U_MAXPAX("//*[@id='gridWrapper']/div[2]", "xpath"),
		ADDLINE("Add Line", "linkText"),
		U_PAX("//*[@id='ratioGrid']/div[6]/div/div/div/div[2]", "xpath"),
		U_PAXINPUT("//*[@id='ratioGrid']/div[6]/div/div/div/div[2]/input", "xpath"),
		U_QTYPAX("//*[@id='ratioGrid']/div[6]/div/div/div/div[3]", "xpath"),
		U_QTYPAXINPUT("//*[@id='ratioGrid']/div[6]/div/div/div/div[3]/input", "xpath"),
		U_FIXEDQTY("//*[@id='ratioGrid']/div[6]/div/div/div/div[4]", "xpath"),
		U_FIXEDQTYINPUT("//*[@id='ratioGrid']/div[6]/div/div/div/div[4]/input", "xpath"),
		U_ROUNDING("//*[@id='ratioGrid']/div[6]/div/div/div/div[5]", "xpath"),
		ROUNDINGDD("//*[@id='ratioGrid']/div[6]/div/div/div/div[5]/select", "xpath"),
		U_FACTOR("//*[@id='ratioGrid']/div[6]/div/div/div/div[6]", "xpath"),
		U_FACTORINPUT("//*[@id='ratioGrid']/div[6]/div/div/div/div[6]/input", "xpath"),
		U_MAXQTY("//*[@id='ratioGrid']/div[6]/div/div/div/div[7]", "xpath"),
		U_COPY("//*[@id='ratioGrid']/div[6]/div/div/div/div[9]/span/a", "xpath"),
		U_REMOVEICON("//*[@id='ratioGrid']/div[6]/div/div/div/div[10]/span/a", "xpath"),
		ADDLOADRATIO("//*[@id='addNew']", "xpath"),
		U_APPLYCHANGES("//*[@id='applyChanges']", "xpath"),
		U_LOADRATIOTEXT("//*[@id='lrForm']/div[1]/div[1]/span[2]", "xpath"),
		U_DESCRIPTIONUNIT("//*[@id='lrForm']/div[1]/div[2]/div", "xpath"),
		EFFECTIVEDATE("//*[@id='effectiveDate']", "xpath"),
		U_PAX2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[2]", "xpath"),
		U_PAX2INPUT("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[2]/input", "xpath"),
		U_QTYPAX2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[3]", "xpath"),
		U_FIXEDQTY2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[4]", "xpath"),
		U_ROUNDING2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[5]", "xpath"),
		U_FACTOR2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[6]", "xpath"),
		U_MAXQTY2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[7]", "xpath"),
		U_COPY2("//*[@id='ratioGrid']/div[6]/div/div/div/div[9]/span/a", "xpath"),
		U_REMOVEICON2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[10]/span/a", "xpath"),
		U_PAX3("//*[@id='ratioGrid']/div[5]/div/div[3]/div[2]", "xpath"),
		U_PAX3INPUT("//*[@id='ratioGrid']/div[5]/div/div[3]/div[2]/input", "xpath"),
		BLANKCLICK("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[1]", "xpath"),
		MAXPAXQTY("//*[@id='maxPax']", "xpath"),
		TEXT1("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[2]", "xpath"),
		TEXT2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[2]", "xpath"),
		DELPOPUPOK("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
		DELPOPUPCANCEL("//*[@id='msgWindow']/div[2]/a[1]", "xpath"),
		DELPOPUPCANCEL2("//*[@id='loadingModal']/div[2]/a[1]", "xpath"),
		U_ROUNDING1("//*[@id='ratioGrid']/div[5]/div/div[1]/div[5]", "xpath"),
		SECONDROW("//*[@id='ratioGrid']/div[5]/div/div[2]/div[1]", "xpath"),
		SECONDROW2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[1]", "xpath"),
		PAX2ROWINPUT("//*[@id='ratioGrid']/div[5]/div/div[2]/div[2]/input", "xpath"),
		DELPOPUPTEXT("//*[@id='loadingModal']/div[1]/div", "xpath"),
		DELPOPUPTEXT2("//*[@id='msgWindow']/div[1]", "xpath"),
		POPUP("//*[@id='removeAlert']/div[2]","xpath"),
		DELIVERYPLAN("//*[@id='deliveryplan']/a", "xpath"),
		//DELLR("//*[@id='myGrid']/div[5]/div/div/div[14]", "xpath"),
		DELLR("//*[@id='myGrid']/div[7]/div/div/div/div[9]", "xpath"),
		DELLRSERACHICON("//*[@id='myGrid']/div[7]/div/div/div/div[9]/a/span", "xpath"),
		ROWCLICK("//*[@id='loadInsSearchGrid']/table/tbody/tr/td[1]", "xpath"),
		LRCONTINUE("//*[@id='selLoadInsContinue']", "xpath"),
		DEL_APPLYCHANGES("//*[@id='applyChanges']", "xpath"),
		DELSALESNUM("//*[@id='myGrid']/div[6]/div/div/div/div[4]/a/span", "xpath"),
		SELECTSALES("//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
		SSCONTINUE("//*[@id='selSalesNoContinue']", "xpath"),
		DELSEARCH("//*[@id='loadInsWrapper']/div/div[@class='searchInput']/span/input[@id='articlesearch']", "xpath"),
		COPYBTN("//*[@id='btnLRCopy']", "xpath"),
		VIEWLOADRATIO("//*[@id='menuContainer']/ul/li[1]/a", "xpath"),
		WHERELOADRATIOUSED("//*[@id='menuContainer']/ul/li[2]/a", "xpath"),
		COPYEFFECTIVEDATE("//*[@id='menuContainer']/ul/li[3]/a", "xpath"),
		VLR_TITLE("//*[@id='viewLoadRatioContainer_wnd_title']", "xpath"),
		VLR_EXPORT("//*[@id='action_ExportLR']", "xpath"),
		VLR_CLOSE("Close", "linkText"),
		VLR_SHOWENTRIES("//*[@id='loadRatioPax']/div/span", "xpath"),
		VLR_LOADRATIOHEAD("//*[@id='loadRatioPax']/table/thead/tr/th[1]", "xpath"),
		VLR_PAXHEAD("//*[@id='loadRatioPax']/table/thead/tr/th[2]", "xpath"),
		VLR_LOADHEAD("//*[@id='loadRatioPax']/table/thead/tr/th[4]", "xpath"),
		VLR_TABLE("//*[@id='loadRatioPax']/table/tbody/tr", "xpath"),
		VLR_TABLEENTRIES("//*[@id='loadRatioPax']/div/span", "xpath"),
		DP_SEARCHTEXT("//*[@id='loadInsWrapper']/div[1]/div[1]/span[1]/input", "xpath"),
		DP_SEARCHICON("//*[@id='loadInsWrapper']/div[1]/div[1]/span[2]/a/img", "xpath"),
		CANCEL("Cancel", "linkText"),
		WLRU_LOCATION("//*[@id='loadRatioUsedIn']/table/thead/tr/th[1]/a", "xpath"),
		WLRU_ID("//*[@id='loadRatioUsedIn']/table/thead/tr/th[2]/a", "xpath"),
		WLRU_EXPORT("//*[@id='action_lsUsedExport']", "xpath"),
		WLRU_TITLE("//*[@id='viewLoadRatioUsedIn_wnd_title']", "xpath"),
		WLRU_DPID("//*[@id='loadRatioUsedIn']/table/tbody/tr/td[2]", "xpath"),
		NFD_TITLE("//*[@id='loadingModalLR_wnd_title']", "xpath"),
		NFD_EFFECTICEDATE("//*[@id='toEffectiveDate']", "xpath"),
		NFD_EFFECTICEDATE2("//*[@id='EffectiveDate']", "xpath"),
		NFD_CANCEL("Cancel", "linkText"),
		NFD_OK("OK", "linkText"),
		EFFECTIVEDATE1("//*[@id='EffectiveDate']", "xpath"),
		DELPLAN_LR("//*[@id='loadInsSearchGrid']/table/tbody/tr/td[2]", "xpath"),
		DP_CANCEL("//*[@id='cancelLoadIns']", "xpath"),
		QPAX1("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[3]", "xpath"),
		QPAX2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[3]", "xpath"),
		FQTY1("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[4]", "xpath"),
		FQTY2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[4]", "xpath"),
		ROUND1("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[5]", "xpath"),
		ROUND2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[5]", "xpath"),
		FACT1("//*[@id='ratioGrid']/div[6]/div/div/div[1]/div[6]", "xpath"),
		FACT2("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[6]", "xpath"),
		PAX2INPUT("//*[@id='ratioGrid']/div[6]/div/div/div[2]/div[2]/input", "xpath"),
		FIRST_ROW_FIRST_COL("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
		SHOW_ENTRY_DROPDOWN("//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[2]","xpath"),
		D_LOADRATIO_CLICK("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]", "xpath"),
		D_LOADRATIO_SEARCHICON("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]/a/span", "xpath"),
		DEL_LOADRATIO_OK("//*[@id='removeAlert']/div[3]/a", "xpath"),
		DEL_COPYLR_CANCELBTN("//*[@id='msgWindow']/div[2]/a[1]", "xpath"),
		CONTINUE_BTN("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	;
	
	
	public String element, identifier;
		
		private OperationLoadRatioAddEnum(String element){
			 this.element = element;
		 }
		
		private OperationLoadRatioAddEnum(String element, String identifier){
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