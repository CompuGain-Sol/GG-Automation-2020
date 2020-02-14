package com.sacs.PageOjects;

public enum OperationLoadingSetupEnum {

ADDLOADINGSETUP("//*[@id='contentHeader']/div[2]/a", "xpath"),
LOADINGSETUP("//*[@id='LoadingSetupCode']", "xpath"),
LOADDESCRIPTION("//*[@id='Description']", "xpath"),
CUSTOMERCODE("//*[@id='CustomerCode']", "xpath"),
MANAGEUNITS("//*[@id='manageUnits']", "xpath"),
POPUPUNITSELECT("//*[@id='linkToUnitsGrid']/div[2]/div[1]/div/div[1]//input", "xpath"),
MANAGEUNITPOPUPCONTINUE("Continue", "linkText"),
MANAGEUNITPOPUPCANCEL("//*[@id='linkToUnitsModal']/div[3]/a[1]", "xpath"),
ADDLOADSETUPOK("//*[@id='okBtn']", "xpath"),
LOADSETUPADDLINE("//*[@id='action-addLine']", "xpath"),
ADDLINEAIRCLASS("//*[@id='ClassCode']", "xpath"),
ADDLINEDELPLANCODE("//*[@id='DelPlanCode']", "xpath"),
ADDLINEACVERSION("//*[@id='AircraftVersionCode']", "xpath"),
ADDLINEADD("//*[@id='addBtn']", "xpath"),
ADDLINEDESCSEARCHICON("//*[@id='addLineContainer']/div[1]/div[2]/a/img", "xpath"),
SELECTDELPLAN("//*[@id='deliveryPlanGrid']/table/tbody/tr[1]/td[1]", "xpath"),
SELECTAIRVERSION("//*[@id='aircraftSearchGrid']/table/tbody/tr[1]/td[1]","xpath"),
LSACVERSIONSEARCHICON("//*[@id='addLineContainer']/div[1]/div[3]/a/img", "xpath"),
LSACVERSIONSEARCHBOX("//*[@id='acarticlesearch']", "xpath"),
LSACVERSIONSEARCHICONPOPUP("//*[@id='airCraftSearchPopup']/div[1]/div/span[2]/a/img", "xpath"),
LSACVERSIONSEARCHPOPUPRESULT("//*[@id='aircraftSearchGrid']/table/tbody/tr/td", "xpath"),
LSACVERSIONSEARCHPOPUPRESULT1("//*[@id='aircraftSearchGrid']/table/tbody/tr/td[1]", "xpath"),
LSACVERSIONSEARCHPOPUPCANCEL("//*[@id='airCraftSearchPopup']/div[4]/a[1]", "xpath"),
LSACVERSIONSEARCHPOPUPOK("//*[@id='airCraftSearchPopup']/div[4]/a[2]", "xpath"),
APPLYCHANGECONTINUE("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
DLVPLAN_SEARCHBAR(".//*[@id='articlesearch']","xpath"),
SEARCH_SUBMITE(".//*[@id='deliveryPlanSearchPopup']/div[1]/div/span[2]/a/img","xpath"),
DPLAN_FIRSTROW("//*[@id='loadingSetupDetailsGrid']/div[6]/div/div/div/div[2]", "xpath"),
SEARH_LOADINGSETUP("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
RESULT_FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
;

public String element, identifier;

private OperationLoadingSetupEnum(String element){
	 this.element = element;
 }

private OperationLoadingSetupEnum(String element, String identifier){
	 this.element = element;
	 this.identifier = identifier;
 }
public String getElement() {
	return element;
}

public String getIdentifier() {
	return identifier;
}
}
