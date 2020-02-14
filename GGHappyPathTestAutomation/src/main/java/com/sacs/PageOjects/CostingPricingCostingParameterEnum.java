package com.sacs.PageOjects;

public enum CostingPricingCostingParameterEnum {
COSTING_PRICING("//*[@id='costingpricing']","xpath"),
ADD_COSTING_PARAMETER("//*[@id='addNew']","xpath"),
COSTING_PARAMETER("//*[@id='costingparameter']/a","xpath"),
PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
PARAMETER_CODE_TEXTBOX("//*[@id='Code']","xpath"),
STORAGE_OVERHEAD("//*[@id='StorageOverhead']","xpath"),
MATERIAL_OVERHEAD_TEXTBOX("//*[@id='PurchaseOverhead']","xpath"),
MANAGE_UNIT("//*[@id='manageUnits']","xpath"),
UNIT_CHECKBOX(".//*[@id='linkToUnitsGrid']//span[@class='slick-column-name']/input","xpath"),
CONTINUE("Continue","linkText"),
OK("OK","linkText"),
FIRST_ROW_FIRST_COL("//*[@id='gridResults']/div[6]/div/div/div[1]/div[2]","xpath"),
FIRST_ROW_SECOND_COL("//*[@id='gridResults']/div[6]/div/div/div[1]/div[3]","xpath"),
FIRST_ROW_FIRST_COL_TEXT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[2]/input","xpath"),
FIRST_ROW_SECOND_COL_TEXT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[3]/input","xpath"),
						  
APPLY_CHANGES("Apply Changes","linkText"),
BACK_TO_SEARCH("Back to Search","linkText"),
SEARCH_RESULT("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
TOASTMSG("toast-message","className"),
RESTART("Restart","linkText"),
LINK_TO_UNIT("//*[@id='LinkedToUnits']","xpath"),
REMOVE("X","linkText"),
SEARCH_BOX("//*[@id='articlesearch']","xpath"),
FIND_ICON("//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
PAGINATION("//*[@id='gridWrapper']/div[3]/div","xpath"),
SHOW_ENTERIES("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
PARAMETER_CODE_CRITERIA("//*[@id='searchContainer']/div[2]/div/label/span","xpath"),
NO_DATA_TO_DISPLAY("//*[@id='results']/table/tbody/tr/td","xpath"),
LINK_TO_UNIT_POPUP("//*[@id='linkToUnitsModal']","xpath"),
CANCEL_ON_MANAGEUNIT("//*[@id='linkToUnitsModal']/div[3]/a[1]","xpath"),
FIRST_CHECK_BOX_ON_LINKTO_UNIT("//*[@id='linkToUnitsGrid']/div[6]/div/div/div/div[1]/input","xpath"),
FIRST_ROW_THIRD_COLUMN("//*[@id='gridResults']/div[6]/div/div/div[1]/div[4]","xpath"),
FIRST_ROW_THIRD_COLUMN_TEXT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[4]/input","xpath"),
FIRST_ROW_FOURTH_COLUMN("//*[@id='gridResults']/div[6]/div/div/div[1]/div[5]","xpath"),
FIRST_ROW_FOURTH_COLUMN_TEXT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[5]/input","xpath"),
FIRST_ROW_FIFTH_COLUMN("//*[@id='gridResults']/div[6]/div/div/div[1]/div[6]","xpath"),
FIRST_ROW_FIFTH_COLUMN_TEXT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[6]/input","xpath"),
COPY_BUTTON("//*[@id='nav']/li[4]/a/div","xpath"),
COPY_POPUP("//*[@id='loadingModal']","xpath"),
COPY_POPUP_TITLE("//*[@id='loadingModal_wnd_title']","xpath"),
CANCEL_ON_COPY_POPUP("//*[@id='loadingModal']/div[2]/a[1]","xpath"),
CONTINUE_ON_COPY_POPUP("//*[@id='loadingModal']/div[2]/a[2]","xpath"),


DELETE_BUTTON("//*[@id='removeCostingParam']/a/div","xpath"),
DELETE_POPUP("//*[@id='loadingModal']","xpath"),
DELETE_POPUP_TITLE("//*[@id='loadingModal_wnd_title']","xpath"),
CANCEL_ON_DELETE_POPUP("//*[@id='loadingModal']/div[2]/a[1]","xpath"),
CONTINUE_ON_DELETE_POPUP("//*[@id='loadingModal']/div[2]/a[2]","xpath"),

UNIT_DEFAULT("//*[@id='formBody']/div[2]/div[5]/label/span","xpath"),
USER_DEFAULT("//*[@id='formBody']/div[2]/div[6]/label/span","xpath"),	
OK_ON_ACTIONCANNOT_PERFORMED_POPUP("//*[@id='loadingModal']/div[2]/a","xpath"),

DELETE_ON_SEARCH_GRID(".//*[@id='results']/table/tbody/tr/td[4]/div/a","xpath"),
UNIT_DEFAULT_ID("//*[@id='unitDefault']","xpath"),
USER_DEFAULT_ID("//*[@id='userDefault']","xpath"),


;
	
public String element,Identifier;
private CostingPricingCostingParameterEnum(String element){
	 this.element = element;
 }
private CostingPricingCostingParameterEnum(String element, String Identifier){
	 this.element = element;
	 this.Identifier = Identifier;
 }
public String getElementPath(){
	return element;
}
public String getIdentifier(){
	return Identifier;
}
}
