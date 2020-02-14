package com.sacs.PageOjects;

public enum DespatchDelayLogEnum {

DESPATCH(" //*[@id='dispatch']", "xpath"),
DELAYLOG("//*[@id='delaylogs']/a", "xpath"),
ACTUALIZATION("//*[@id='actualization']/a", "xpath"),
ACT_ICON("//*[@id='results']/table/tbody/tr[1]/td[2]/div/a", "xpath"),
ACT_DATE("//*[@id='incidentView']/div/div[1]/div[1]/div", "xpath"),
ACT_DATE1("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
ACT_DATE_POPUPCANCEL("//*[@id='viewInfoClose']", "xpath"),
ADDNEWDELAYLOG("//*[@id='contentHeader']/div[2]/a", "xpath"),
DEPARTUREDATE("//*[@id='DepartureDate']", "xpath"),
FLIGHTSEARCHICON("//*[@id='formBody']/div[2]/div[2]/a/img", "xpath"),
SELECTFIRSTROWFLIGHT("//*[@id='flightSearchResults']/table/tbody/tr[1]/td[2]", "xpath"),
DELAYLOGOK("//*[@id='SaveDelayLogHeader']", "xpath"),
ADDDELAYMINUTES("//*[@id='Delay']", "xpath"),
ESTIMATEDDELAYCOST("//*[@id='EstimatedDelayCost']", "xpath"),
DELAYAPPLYCHAGES(".//*[@id='applyChanges']", "xpath"),
DELAYBACKTOSEARCH("//*[@id='backToSearch']", "xpath"),
DELAYLOGTITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
DELAYLOGFLIGHTFIRSTROW("//*[@id='delayLogsResults']/table/tbody/tr/td[2]", "xpath"),
DELAYLOGFLIGHTFIRSTROW1("//*[@id='delayLogsResults']/table/tbody/tr[1]/td[2]", "xpath"),
DELAYLOGDELETE("//*[@id='removeDuty']/div", "xpath"),
DELETEPOPUPCONTINUE("Continue", "linkText"),
NODATATODISPLAY("//*[@id='delayLogsResults']/table/tbody/tr/td", "xpath"),
SEARCH_BOX(".//*[@id='articlesearch']","xpath"),
SEARCH_SUBMIT(".//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
SEARCH_FILTER(".//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
SEARCH_CONTAINER(".//*[@id='searchContainer']/div[2]","xpath"),
GRID_RESULTS(".//*[@id='delayLogsResults']/table","xpath"),
SHOW_ENTERIES(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
DEPARTURE_DATE_CRITERIA("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
CUSTOMER_CODE_CRITERIA("//*[@id='searchContainer']/div[2]/div[2]/label[2]/span","xpath"),
FLIGHT_CRITERIA("//*[@id='searchContainer']/div[2]/div[2]/label[1]/span","xpath"),
CUSTOMER_NUMBER_CRITERIA("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
RESULT_GRID_FLIGHT(".//*[@id='delayLogsResults']/table/tbody/tr[1]/td[2]","xpath"),
RESULT_GRID_DATE(".//*[@id='delayLogsResults']/table/tbody/tr[1]/td[1]","xpath"),
SEARCH_ENTERIES_INVERTER_SYMBOL("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
SEARCH_RESULT_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item"),
SEARCH_RESULT_GRID_CLASS_COLUMN_CLASS("articlenumber","className"),
PAGE_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
DEPARTURE_DAY(".//*[@id='formBody']/div[2]/div[1]/span[2]","xpath"),
PAGINATION_ON_SEARCH_FLIGHT_POPUP("//*[@id='flightSearchResults']/div/div","xpath"),
OK("OK","linkText"),
CANCEL("//*[@id='cancelButton']","xpath"),
FLIGHT_ON_SEARCHFLIGHT_POPUP("//*[@id='flightSearchResults']/table/tbody/tr[1]/td[2]","xpath"),
FLIGHT_NUMBER("//*[@id='FlightNumber']","xpath"),
SECTION("//*[@id='Section']","xpath"),
DELAYTIME(".//*[@id='DelayTime']","xpath"),
DELAY_MINUTES("//*[@id='Delay']","xpath"),
LEFT_RAMP("//*[@id='TimeTruck1LeftRamp']","xpath"),
PASSED_SECURITY("//*[@id='TimeTruck1PassedSecurity']","xpath"),
ARRIVED_AT_AC("//*[@id='TimeTruck1ArrivedAtAC']","xpath"),
ACCESS_TO_AC(".//*[@id='TimeTruck1AccessedAC']","xpath"),
CATERING_COMPLETION("//*[@id='TimeTruck1CompletedCatering']","xpath"),
FINAL_COMMENTS(".//*[@id='FinalComment']","xpath"),
DISPATCHER(".//*[@id='Dispatcher']","xpath"),
TEAM_LEADER(".//*[@id='TeamLeader']","xpath"),
DUTY_MANAGER1("//*[@id='DutyManager1']","xpath"),
DUTY_MANAGER2("//*[@id='DutyManager2']","xpath"),
DUTY_MANAGER3("//*[@id='DutyManager3']","xpath"),
DUTY_MANAGER4("//*[@id='DutyManager4']","xpath"),
LASTUPDATED(".//*[@id='lastUpdatedByAndDate']","xpath"),
CUSTOMER_CODE("//*[@id='CustomerCode']","xpath"),
CUSTOMER_NUMBER("//*[@id='CustomerNumber']","xpath"),
STAND("//*[@id='Stand']","xpath"),
TERMINAL("//*[@id='Terminal']","xpath"), 
DESCRIPTION("//*[@id='EventDescription']","xpath"),
TEXT_ON_POPUP("//*[@id='loadingModal']/div[1]/div","xpath"),
CANCEL_ON_DELETE("//*[@id='loadingModal']/div[2]/a[1]","xpath"),
MENU("//*[@id='nav']/li[1]/div","xpath"),
EXPORT("//*[@id='nav']/li[1]/ul/li/a","xpath"),
EXPORT_FROM("//*[@id='exportDelay']/div[1]/span[2]/span/input","xpath"),
EXPORT_TO("//*[@id='exportDelay']/div[1]/span[4]/span/input","xpath"),
EXPORT_OK("//*[@id='closeButton']","xpath"),
EXPORT_POPUP("//*[@id='exportDelay']","xpath"),
SEARCHGRID_FIRSTROW("//*[@id='delayLogsResults']/table/tbody/tr/td[1]", "xpath"),
	;
	public String element,Identifier;
	private DespatchDelayLogEnum(String element){
		 this.element = element;
	 }
	private DespatchDelayLogEnum(String element, String Identifier){
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
