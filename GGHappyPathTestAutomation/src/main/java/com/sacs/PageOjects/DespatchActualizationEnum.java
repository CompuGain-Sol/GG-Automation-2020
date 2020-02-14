package com.sacs.PageOjects;

public enum DespatchActualizationEnum {

DESPATCH("//*[@id='dispatch']", "xpath"),
ACTUALIZATION("//*[@id='actualization']/a", "xpath"),
ACT_TITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
REFRESH("//*[@id='contentHeader']/div[3]/a", "xpath"),
CREATEACTUALIZATION("//*[@id='contentHeader']/div[2]/a", "xpath"),
ACT_OK("//*[@id='processActu']", "xpath"),
POPUPCONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
POPUPOK("//*[@id='errorAlert']/div[3]/a", "xpath"),
READSTATUS("//*[@id='results']/table/tbody/tr[1]/td[6]", "xpath"),
FROMDATE("//*[@id='StartDate']", "xpath"),
TODATE("//*[@id='EndDate']", "xpath"),
REACTUALIZE_OPTIONSCONTINUE("//*[@id='contOptions']", "xpath"),
TABLE_HEADING(".//*[@id='results']/table/thead/tr/th","xpath"),
RTN_ACTUALIZATIOn_CHECKBOX(".//*[@id='actForm']/div[2]/span[2]/label/span","xpath"),
FLIGHT_TEXT("//*[@id='FlightNumber']", "xpath"),
CUST_CODE("//*[@id='CustomerCode']", "xpath"),
FLIGHT_SEARCH_ICON("//*[@id='searchFlight']","xpath"),
CUST_CODE_SEARCH_ICON(".//*[@id='actForm']/div[5]/span/a","xpath"),
CUST_NO_TEXTBOX(".//*[@id='CustomerNo']","xpath"),
OK("OK","linkText"),
EMAIL_NOTIFICATION(".//*[@id='actForm']/div[7]/label/span","xpath"),
TO_SEARCH_ICON("//*[@id='actDateSearch']","xpath"),
TO_SEARCH_POPUP_TITLE("//*[@id='actFltWrapper_wnd_title']","xpath"),
TO_SEARCH_BOX_POPUP(".//*[@id='actFltWrapper']//div[@id='searchContainer']/div[1]","xpath"),
CANCEL("Cancel","linkText"),
CONTINUE("Continue","linkText"),
GRID("k-selectable","className"),
INVERTED_SYMBOL_ON_SEARCH_FLIGHT_POPUP("//*[@id='showFlightSearch']/div//div[@id='searchContainer']//div[@class='searchInput']/span[3]/a/img","xpath"),
SEARCH_SUBMIT_ON_SEARCH_FLIGHT_POPUP("//*[@id='showFlightSearch']/div//div[@id='searchContainer']//div[@class='searchInput']/span[2]/a/img","xpath"),
SEARCH_BOX_ON_SEARCH_FLIGHT_POPUP("//*[@id='showFlightSearch']/div//div[@id='searchContainer']//div[@class='searchInput']/span[1]/input[@id='articlesearch']","xpath"),
CONTINUE_ON_SEARCH_FLIGHT_POPUP("//*[@id='selFltContinue']","xpath"),
DATE_POPUP_FIELD("//*[@id='actFlightsGrid']/table/tbody/tr[1]/td[2]","xpath"),
SHOWING_ENTRIES("//*[@id='actFlightsGrid']/div/span","xpath"),
RESULT_GRID_FIRSTCOLUMN_BEFORE_SEARCH(".//*[@id='actFlightsGrid']/table/tbody/tr[1]/td[3]","xpath"),
SEARCH_RESULT_GRID_NEXT_LINK_XPATH(".//*[@id='actFlightsGrid']/div/div/a[3]/span","xpath"),
SEARCH_RESULT_GRID_PREVIOUS_LINK_XPATH("//*[@id='actFlightsGrid']/div/div/a[2]/span","xpath"),
SEARCH_RESULT_GRID_LAST_LINK_XPATH("//*[@id='actFlightsGrid']/div/div/a[4]/span","xpath"),
SEARCH_RESULT_GRID_FIRST_LINK_XPATH("//*[@id='actFlightsGrid']/div/div/a[1]/span","xpath"),
SEARCH_BAR("//div[@id='actFltWrapper']//*[@id='articlesearch']","xpath"),
SEARCHSUBMITE("//div[@id='actFltWrapper']//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
NO_DATA_DISPLAY(".//*[@id='actFlightsGrid']/table/tbody/tr/td","xpath"),
FLIGHT_POPUP_TIT(".//*[@id='showFlightSearch_wnd_title']","xpath"),
FLIGHT_POPUP_SEARCH_BAR("//div[@id='fltWrapper']//*[@id='articlesearch']","xpath"),
FLIGHT_POPUP_SEARCHSUBMITE("//div[@id='fltWrapper']//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
FLIGHT_POPUP_SEARCHRESULT(".//*[@id='flightsGrid']/table/tbody/tr[1]/td[1]","xpath"),
SHOWING_ENTRIES_FLIGHTPOPUP("//*[@id='flightsGrid']/div/span","xpath"),
FLIGHT_POPUP_NEXT_LINK_XPATH("//*[@id='flightsGrid']/div/div/a[3]/span","xpath"),
FLIGHT_POPUP_PREV_LINK_XPATH("//*[@id='flightsGrid']/div/div/a[2]/span","xpath"),
FLIGHT_POPUP_FIRST_LINK_XPATH(".//*[@id='flightsGrid']/div/div/a[1]/span","xpath"),
FLIGHT_POPUP_LAST_LINK_XPATH("//*[@id='flightsGrid']/div/div/a[4]/span","xpath"),
ACTUALIZATION_CHECKBOX("//*[@id='actForm']/div[2]/span[1]/label/span","xpath"),
CUST_CODE_POPUP_TIT("//*[@id='showCustomerSearch_wnd_title']","xpath"),
CUST_CODE_SEARCH_BAR("//div[@id='childCustWrapper']//*[@id='articlesearch']","xpath"),
CUST_CODE_SEARCH_RESULT("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]","xpath"),
CUST_CODE_PAGINATION("//*[@id='customerSearchGrid']/div/div","xpath"),
ACTUALIZATION_POPUP("//*[@id='removeAlert']/div[2]","xpath"),
REACTUALIZATION_POPUP("//*[@id='textInfo']","xpath"),
REACTUALIZATION_POPUP_TITLE("//*[@id='showReActList_wnd_title']","xpath"),
KEEP_EXISTING_AME(".//*[@id='reactOptions']/div[3]/div[1]/label/span","xpath"),
KEEP_EXISTING_PAX("//*[@id='reactOptions']/div[3]/div[2]/label/span","xpath"),
KEEP_EXISTING_ACVERSION(".//*[@id='reactOptions']/div[3]/div[3]/label/span","xpath"),
CANCEL1("//*[@id='cancelOptions']","xpath"),
CONTINUE1("//*[@id='contOptions']","xpath"),
POPUP_TEXT("//div[@id='reactOptions']//div[@class='alertText']","xpath"),
SEARCHRESULT("//*[@id='flightsGrid']/table/tbody/tr/td[1]","xpath"),
SHOWING_ENTRIES1("//*[@id='childCustWrapper']/div[4]/span","xpath"),
RESULT_GRID_FIRSTCOLUMN_CUSTCODE("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]","xpath"),
CC_NEXT("//*[@id='childCustWrapper']/div[4]/div/a[3]/span"),
CC_PREV("//*[@id='childCustWrapper']/div[4]/div/a[2]/span"),
CC_FIRST("//*[@id='childCustWrapper']/div[4]/div/a[1]/span"),
CC_LAST("//*[@id='childCustWrapper']/div[4]/div/a[4]/span"),
SEARCHFLIGHT_INPUT("//*[@id='showFlightSearch']/div/div/div/span[1]/input", "xpath"),
SEARCHFLIGHT_ICON("//*[@id='showFlightSearch']/div/div/div/span[2]/a/img", "xpath"),
SEARCHFLIGHT_DD("//*[@id='showFlightSearch']/div/div/div/span[3]/a/img", "xpath"),
SEARCHFLIGHT_STARTDATE("//*[@id='fltStartDate']", "xpath"),
SEARCHFLIGHT_ENDDATE("//*[@id='fltEndDate']", "xpath"),
;
	public String element,Identifier;
	private DespatchActualizationEnum(String element){
		 this.element = element;
	 }
	private DespatchActualizationEnum(String element, String Identifier){
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
