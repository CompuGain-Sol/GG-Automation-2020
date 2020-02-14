package com.sacs.PageOjects;

public enum SystemDepartmentAddEnum {
	
	/*SYSTEM_MENUITEM("system","id"),
	DEPARTMENT_MENUITEM("department","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_DEPARTMENT_BTN("//a[@class='addBtn btnSkin']","xpath"),
	DEPARTMENT_CODE("Code","id"),
	DEPARTMENT_DESCRIPTION("Name","id"),
	APPLY_CHANGES_BTN(".//*[@id='saveContainer']/a","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	DEPARTMENT_COST_CENTER_XPATH(".//*[@id='CostCenterCode']","xpath"),
	
	Add Department Page identifier
	CODE_REQUIRED_FIELD_MSG("//*[@id='formBody']/div[1]/div[1]/div/span/span","xpath"),
	
	
	
	
	Search Page Element identifier
	PAGINATION_OPTION("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
	SEARCH_RESULT_GRID("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	SEARCH_RESULT("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	BACK_TO_SEARCH_BUTTON("//*[@id='contentHeader']/div[2]/a","xpath"),
	NO_DATA_TO_DISPLAY("//*[@id='results']/table/tbody/tr/td","xpath"), */
	DEPARTMENT_SHOW_ENTERY_NEXT_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[3]/span"), 
	DEPARTMENT_SHOW_ENTERY_PREV_BUTTON("//*[@id='gridWrapper']/div[3]/div/a[2]/span"),
	DEPARTMENT_SHOW_ENTERY_LAST_BUTTON(".//*[@id='gridWrapper']/div[3]/div/a[4]/span"),
	
	/*DEPARTMENT_SEARCH_RESULT_LAST_PAGE_FIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	DEPARTMENT_SEARCH_RESULT_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"), 
	DEPARTMENT_SEARCH_RESULT_NEXT_PAGE_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),*/
	DEPARTMENT_SHOW_ENTERY_FIRST_BUTTON("//*[@id='gridWrapper']/div[3]/div/a[1]/span"),
	SHOW_ENTRY_DROPDOWN("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]"),
	/*DEPARTMENT_RESULT_GRID_ROW_CLASS_NAME("articlenumber","className"),
	SHOWENTRIES("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]", "xpath"),
	GRID_HEADING_DEPARTMENT(".//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	GRID_HEADING_CODE(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	DEPARTMENT_SEARCH_RESULT_CODE_FIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCH_OPTION_CODE(".//*[@id='searchContainer']/div[3]/div[1]/label/span","xpath"),
	SEARCH_OPTION_DESC("//*[@id='searchContainer']/div[3]/div[2]/label/span","xpath"),
	DESC_REQUIRED_FIELD_MSG("//*[@id='formBody']/div[1]/div[2]/div/span/span","xpath"),
	CPC_DROPDOWN(".//*[@id='CateringPointGroup']","xpath"),
	COST_CENTER_DROPDOWN(".//*[@id='CostCenterCode']","xpath"),
	DEPARTMENT_DESCRIPTION_UPDATE(".//*[@id='Name']","xpath"),*/
	SHOWING_ENTRIES("//*[@id='gridWrapper']/div[3]/span"),
	NEXT_REPLACEWHEREUSED("//*[@id='replaceClearGrid']/div[1]/div/a[3]/span"),
	PREV_REPLACEWHEREUSED("//*[@id='replaceClearGrid']/div[1]/div/a[2]/span"),
	FIRST_REPLACEWHEREUSED("//*[@id='replaceClearGrid']/div[1]/div/a[1]/span"),
	LAST_REPLACEWHEREUSED("//*[@id='replaceClearGrid']/div[1]/div/a[4]/span"),
	SHOWING_ENTRIES_CUSTOMER("//*[@id='customerSearchGrid']/div/span"), 
	/*DEPARTMENT_SHOW_ENTERY_NEXT_BUTTON1("//*[@id='customerSearchGrid']/div/div/a[3]/span","xpath"),
	ADDAGREEMENT_NEXTBTN("//*[@id='customerSearchGrid']/div/div/a[3]/span", "xpath"),
	ADDAGREEMENT_FIRSTBTN("//*[@id='customerSearchGrid']/div/div/a[1]/span", "xpath"),
	ADDGREEMENT_PREVBTN("//*[@id='customerSearchGrid']/div/div/a[2]/span", "xpath"),
	ADDAGREEMENT_LASTBTN("//*[@id='customerSearchGrid']/div/div/a[4]/span", "xpath"),
	SHOWING_ENTRIES_2("//*[@id='customerSearchGrid']/div/span", "xpath"),
	SHOWING_ENTRIES_3("//*[@id='contentHeader']/div[6]/div[5]/span", "xpath"),
	NEXT_BTN("//*[@id='contentHeader']/div[6]/div[5]/div/a[3]/span", "xpath"),
	PREV_BTN("//*[@id='contentHeader']/div[6]/div[5]/div/a[2]/span", "xpath"),
	LAST_BTN("//*[@id='contentHeader']/div[6]/div[5]/div/a[4]/span", "xpath"),
	FIRST_BTN("//*[@id='contentHeader']/div[6]/div[5]/div/a[1]/span", "xpath"),
	SHOWING_ENTRIES_4("//*[@id='formBody']/div[4]/span", "xpath"),
	NEXT_BTN_2("//*[@id='formBody']/div[4]/div/a[3]/span", "xpath"),
	PREV_BTN_2("//*[@id='formBody']/div[4]/div/a[2]/span", "xpath"),
	LAST_BTN_2("//*[@id='formBody']/div[4]/div/a[4]/span", "xpath"),
	FIRST_BTN_2("//*[@id='formBody']/div[4]/div/a[1]/span", "xpath"),
	SNO_SHOWENTRIES("//*[@id='addSalesNumber']/div/span", "xpath"),
	SNO_NEXTPAGINATION("//*[@id='addSalesNumber']/div/div/a[3]/span", "xpath"),
	SNO_PREVPAGINATION("//*[@id='addSalesNumber']/div/div/a[2]/span", "xpath"),
	SNO_LASTPAGINATION("//*[@id='addSalesNumber']/div/div/a[4]/span", "xpath"),
	SNO_FIRSTPAGINATION("//*[@id='addSalesNumber']/div/div/a[1]/span", "xpath"),
	PRODCALC_SHOWENTRIES("//*[@id='addProductCalculation']/div/span", "xpath"),
	PRODCALC_NEXTPAGINATION("//*[@id='addProductCalculation']/div/div/a[3]/span", "xpath"),
	PRODCALC_PREVPAGINATION("//*[@id='addProductCalculation']/div/div/a[2]/span", "xpath"),
	PRODCALC_LASTPAGINATION("//*[@id='addProductCalculation']/div/div/a[4]/span", "xpath"),
	PRODCALC_FIRSTPAGINATION("//*[@id='addProductCalculation']/div/div/a[1]/span", "xpath"),*/
	;
	
	public String element;
	private SystemDepartmentAddEnum(String element){
		 this.element = element;
	 }
	public String getElementPath(){
		return element;
	}

}
