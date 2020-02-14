package com.sacs.PageOjects;

public enum CostingPricingHTMLMenuSpecsEnum {
	COSTING_PRICING("//*[@id='costingpricing']","xpath"),
	HTML_MENU_SPECS("//*[@id='menuspecification']/a","xpath"),
	TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	CALCULATIONONDATE("//*[@id='CalculationOnDate']", "xpath"),
	INCLUDEITEMFORUNITS("//*[@id='IncludeItemsForUnit']", "xpath"),
	USEDESCRIPTIONNUMBER("//*[@id='UseDescriptionNumber']", "xpath"),
	INCLUDERECEIPTTEXT_CHKBOX("//*[@id='MiscWrapper']/div[2]/div[1]/div[4]/label/span", "xpath"),
	INCLUDEVENDORNAMES_CHKBOX("//*[@id='MiscWrapper']/div[2]/div[1]/div[6]/label/span", "xpath"),
	INCLUDELOCALDESC_CHKBOX("//*[@id='MiscWrapper']/div[2]/div[1]/div[8]/label/span", "xpath"),
	EFFECTIVEDATE("//*[@id='EffectiveDate']", "xpath"),
	CREATERECIPECARDS("//*[@id='MiscWrapper']/div[2]/div[1]/div[10]/label/span", "xpath"),
	SELECT_HTMLSOURCE("//*[@id='htmlSpecSource']", "xpath"),
	OK_BTN("//*[@id='MiscWrapper']/div[2]/div[2]/a", "xpath"),
	CUSTOMER_CODE("//*[@id='CustomerCode']", "xpath"),
	EFFECTIVEDATE_CALENDARICON("//*[@id='MiscWrapper']/div[2]/div[1]/div[9]/span[2]/span/span/span/span", "xpath"),
	EFFEDTIVEDATE_CALENDAR("EffectiveDate_dateview", "id"),
	CALCULATIONONDATE_CALENDAR("CalculationOnDate_dateview", "id"),
	CALCULATIONONDATE_CALENDARICON("//*[@id='MiscWrapper']/div[2]/div[1]/div[1]/span[2]/span/span/span/span", "xpath"),
	BACK_BTN("//*[@id='backBtn']/a", "xpath"),
	CUST_SELECTION_OKBTN("//*[@id='processHTMLMenuSpecifications']", "xpath"),
	INCLUDEINACTIVEPROD_CHECKBOX("//*[@id='MiscWrapper']/div[3]/div[3]/label/span", "xpath"),
	CUSTCODE_SEARCHICON("//*[@id='MiscWrapper']/div[3]/div[1]/span[3]/a", "xpath"),
	CUSTCODE_POPUP_TITLE("//*[@id='showParentCustomerSearch_wnd_title']", "xpath"),
	CUSTCODE_POPUP_CANCELBTN("//*[@id='parentCustSearchCancel']", "xpath"),
	CUSTCODE_POPUP_OKBTN("//*[@id='parentCustSearchContinue']", "xpath"),
	CODE_FIRSTROW("//*[@id='parentcustomerSearchGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	EXCLUDE_PRODUCTS("//*[@id='htmlSpecNoImageProductsPopup']/div[3]/a[2]", "xpath"),
	INCLUDE_PRODUCTS("//*[@id='htmlSpecNoImageProductsPopup']/div[3]/a[3]", "xpath"),
	EXISTINGMENUFILES_TEXT("//*[@id='menuTextWrapper']/div[2]/div[1]/div", "xpath"),
	EXISTINGMENUFILE_FIRSTROW("//*[@id='menutextfilesresults']/table/tbody/tr[1]/td[3]", "xpath"),
	DOWNLOAD_FILE_FIRSTROW("//*[@id='menutextfilesresults']/table/tbody/tr[1]/td[6]/div/span/a", "xpath"),
	EXISTINGMENU_FIRSTROW_FIRSTCOL("//*[@id='menutextfilesresults']/table/tbody/tr[1]/td[2]", "xpath"),
	;
	
	public String element,Identifier;
	private CostingPricingHTMLMenuSpecsEnum(String element){
		 this.element = element;
	 }
	private CostingPricingHTMLMenuSpecsEnum(String element, String Identifier){
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
