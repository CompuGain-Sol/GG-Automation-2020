package com.sacs.PageOjects;

public enum ProductionPlanningUpdateProductionForecastEnum {
	
	
	PRODUCTION_PLANNING("productionplanning","id"),
	UPDATEPRODUCTIONFORECAST("//*[@id='productionfile']/a", "xpath"),
	DEPARTUREDATE("//*[@id='DepartureDate']", "xpath"),
	OK_BTN("//*[@id='processProdFile']", "xpath"),
	REFRESH_BTN("//*[@id='prodfileWrapper']/div[6]/div[1]/div[2]/a", "xpath"),
	CUSTOMERCODE_SEARCHICON("//*[@id='prodForm']/div[1]/div[2]/span[3]/a", "xpath"),
	CUSTOMER_SEARCHBOX("//*[@id='showParentCustomerSearch']/div/div/div/span[1]/input", "xpath"),
	CUSTOMER_SEARCHICON("//*[@id='showParentCustomerSearch']/div/div/div/span[2]/a/img", "xpath"),
	FLIGHT_SEARCHICON("//*[@id='prodForm']/div[1]/div[4]/span[3]/a", "xpath"),
	CONFIRMPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	UPF_HEADER("//div[@id='contentHeader']/div/h1","xpath"),
	REQ_TEXT("//div[@id='prodfileWrapper']/div[3]/div","xpath"),
	DEPDATE_TEXT("//form[@id='prodForm']/div[1]/div[1]/span[1]","xpath"),
	DEPDATE_FIELD("//input[@id='DepartureDate']","xpath"),
	DEPDAY("//span[@id='dispDepartureDay']","xpath"),
	CUSTOMERCODE_TEXT("//form[@id='prodForm']/div[1]/div[2]/span[1]","xpath"),
	CUSTOMERCODE_FIELD("//input[@id='CustomerCode']","xpath"),
    FLIGHT_TEXT("//form[@id='prodForm']/div[1]/div[4]/span[1]","xpath"),
    FLIGHT_FIELD("//input[@id='FlightNumber']","xpath"),
    DEP_TIMETEXT("//form[@id='prodForm']/div[1]/div[5]/span[1]","xpath"),
    DEPFROMTIME_FIELD("//input[@id='StartTime']","xpath"),
    DEPTOTIME_TEXT("//form[@id='prodForm']/div[1]/div[5]/span[3]","xpath"),
    DEPTOTIME_FIELD("//input[@id='EndTime']","xpath"),
    ALLDAY_TEXT("//form[@id='prodForm']/div[1]/div[5]/span[5]/label/span","xpath"),
    ALLDAY_CHECKBOX("//form[@id='prodForm']/div[1]/div[5]/span[5]/label/input","xpath"),
    UPDATEMENU_TEXT("//form[@id='prodForm']/div[2]/div[1]/label/span","xpath"),
    UPDATEMENU_CHECKBOX("//form[@id='prodForm']/div[2]/div[1]/label/input","xpath"),
    UPDATEBASIC_TEXT("//form[@id='prodForm']/div[2]/div[2]/label/span","xpath"),
    UPDATEBASIC_CHECKBOX("//form[@id='prodForm']/div[2]/div[2]/label/input","xpath"),
    NOTIFICATIONEMAIL_TEXT("//form[@id='prodForm']/div[2]/div[3]/label/span","xpath"),
    NOTIFICATIONEMAIL_CHECKBOX("//form[@id='prodForm']/div[2]/div[3]/label/input","xpath"),
    DD_HEADER("//div[@id='results']/table/thead/tr/th[1]","xpath"),
    STATUS_HEADER("//div[@id='results']/table/thead/tr/th[2]","xpath"),
    USER_HEADER("//div[@id='results']/table/thead/tr/th[3]","xpath"),
    CREATEDATE_HEADER("//div[@id='results']/table/thead/tr/th[4]","xpath"),
    PAGINATION("//div[@id='results']/div/div","xpath"),
    CC_SEARCHPOPUP_INPUT("//div[@id='showParentCustomerSearch']//input[@id='articlesearch']","xpath"),
    CC_SEARCHPOPUP_SICON("//div[@id='showParentCustomerSearch']//div[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
    CC_SEARCHPOPUP_FIRSTONE("//div[@id='parentcustomerSearchGrid']/table/tbody/tr[1]/td[2]","xpath"),
    CN_SEARCHICON("//form[@id='prodForm']/div[1]/div[2]/span[5]/a","xpath"),
    CN_SEARCHPOPUP_INPUT("//div[@id='showCustomerSearch']//input[@id='articlesearch']","xpath"),
    CN_SEARCHPOPUP_SICON("//div[@id='showCustomerSearch']//div[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
    CN_SEARCHPOPUP_FIRSTONE("//div[@id='customerSearchGrid']/table/tbody/tr[1]/td[3]","xpath"),
    CN("//input[@id='CustomerNo']","xpath"),
    FLIGHT_POPUP_FIRST("//div[@id='flightsGrid']/table/tbody/tr[1]/td[1]","xpath"),
    CONTINUE("//div[@id='removeAlert']/div[3]/a[1]","xpath"),
    GRID_DD("//div[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
    GRID_STATUS("//div[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
    GRID_USER("//div[@id='results']/table/tbody/tr[1]/td[3]","xpath"),
    GRID_CREATEDDATE("//div[@id='results']/table/tbody/tr[1]/td[4]","xpath"),
    GRID_INFO("//div[@id='results']/table/tbody/tr[1]/td[5]","xpath"),
    ENTRIES_TEXT("//div[@id='results']/div/span","xpath"),
    
    
;
	
	
	public String element,Identifier;
	private ProductionPlanningUpdateProductionForecastEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningUpdateProductionForecastEnum(String element, String Identifier){
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
