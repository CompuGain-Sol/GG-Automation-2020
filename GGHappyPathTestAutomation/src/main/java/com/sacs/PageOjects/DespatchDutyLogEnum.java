package com.sacs.PageOjects;

public enum DespatchDutyLogEnum {

DESPATCH("//*[@id='dispatch']", "xpath"),
DUTYLOG("//*[@id='dutylogs']/a", "xpath"),
CLOSEDATE("//*[@id='subNav-dispatch']/li[6]", "xpath"),
ACTDATE("//*[@id='results']/table/tbody/tr[1]/td", "xpath"),
ADDDUTYLOG("//*[@id='contentHeader']/div[2]/a", "xpath"),
DUTYLOGDATE("//*[@id='LogDate']", "xpath"),
DUTYLOGOK("//*[@id='dutylogForm']/div[3]/a", "xpath"),
ADDLINE("//*[@id='addLineContainer']/a", "xpath"),
SEARCHFLIGHTICON("//*[@id='addSection']/div[1]/div[1]/span/a/img", "xpath"),
SELECTFLIGHTFIRSTROW("//*[@id='searchForFlightResults']/table/tbody/tr[1]/td[1]", "xpath"),
SELECTFLIGHTPOPUPOK("//*[@id='searchforFlight']/div[5]/a[2]", "xpath"),
DUTYLOGSAVE("Save", "linkText"),
DUTYLOGTITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
ADDLINEFIRSTROW("//*[@id='dlvResults']/table/tbody/tr/td[1]", "xpath"),
SEARCHFIRSTROW("//*[@id='dutyGrid']/table/tbody/tr[1]/td[1]", "xpath"),
DUTYLOGEDIT("//*[@id='dlvResults']/table/tbody/tr/td[8]/span[1]/a", "xpath"),
NOTICETIME("//*[@id='NoticeTime']", "xpath"),
ADDLINENOTICETIME("//*[@id='dlvResults']/table/tbody/tr/td[2]", "xpath"),
ADDLINEADHOC("//*[@id='dlvResults']/table/tbody/tr[1]/td[3]", "xpath"),
WATCHICON("//*[@id='addSection']/div[1]/div[2]/span/span/span", "xpath"),
TIME("//*[@id='NoticeTime_timeview']/li[4]", "xpath"),
ADHOCREQUEST("//*[@id='AdhocRequest']", "xpath"),
DUTYLOGDELETE("//*[@id='removeDuty']/div", "xpath"),
DELETEPOPUPYES("Yes", "linkText"),
FLIGHTPICK("//*[@id='dutyGrid']/table/tbody/tr[1]/td[3]", "xpath"),
NODATATODISPLAY("//*[@id='dutyGrid']/table/tbody/tr/td", "xpath"),
ADDNEWDUTYLOG("//*[@id='addNew']", "xpath"),
SEARCHBOX("//*[@id='articlesearch']", "xpath"),
SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
SEARCHDD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
SEARCHRESULTSTEXT("//*[@id='gridWrapper']/div[1]/div[1]", "xpath"),
PAGINATION("//*[@id='dutyGrid']/div", "xpath"),
ITEMS_DD("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]", "xpath"),
DATESEARCH("//*[@id='searchContainer']/div[2]/div[1]/div/label/span", "xpath"),
FLIGHTSEARCH("//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
SHOWINGENTRIES("//*[@id='gridWrapper']/div[3]/span", "xpath"),
SEARCHTEXT("//*[@id='dutyGrid']/table/tbody/tr/td[1]", "xpath"),
FLIGHTTEXT("//*[@id='dutyGrid']/table/tbody/tr/td[3]", "xpath"),
BACKTOSEARCH("Back to Search", "linkText"),
ADDLINE2("//*[@id='addLine']", "xpath"),
CONTINUE("Continue", "linkText"),
FLIGHT("//*[@id='FlightNumber']", "xpath"),
SALESORDER("//*[@id='addSection']/div[1]/div[4]/label/span", "xpath"),
LABELSREPRINT("//*[@id='addSection']/div[1]/div[5]/label/span", "xpath"),
MISSINGTELEX("//*[@id='addSection']/div[1]/div[6]/label/span", "xpath"),
CANCEL("//*[@id='addSection']/div[2]/div[2]/span[1]/a", "xpath"),
ADDLINE_NODATATODISPLAY("//*[@id='dlvResults']/table/tbody/tr/td", "xpath"),
SEARCHFLIGHT_TITLE("//*[@id='searchforFlight_wnd_title']", "xpath"),
SEARCHFLIGHT_CANCEL("//*[@id='cancelButton']", "xpath"),
SEARCHFLIGHT_OK("//*[@id='okButton']", "xpath"),
SEA_FLI_POPUP_PAGINATION("//*[@id='searchForFlightResults']/div", "xpath"),
SF_FLIGHT_HEADER("//*[@id='searchForFlightResults']/table/thead/tr/th[1]/a","xpath"),
DUTYLOGCOPYICON("//*[@id='dlvResults']/table/tbody/tr/td[8]/div[2]/a", "xpath"),
FLIGHT1("//*[@id='dlvResults']/table/tbody/tr[1]/td[1]", "xpath"),
FLIGHT2("//*[@id='dlvResults']/table/tbody/tr[2]/td[1]", "xpath"),
ADHOC1("//*[@id='dlvResults']/table/tbody/tr[1]/td[3]", "xpath"),
ADHOC2("//*[@id='dlvResults']/table/tbody/tr[2]/td[3]", "xpath"),
DELETEICON("//*[@id='dlvResults']/table/tbody/tr/td[8]/div[3]/a", "xpath"),
NDTD("//*[@id='dlvResults']/table/tbody/tr/td", "xpath"),
DELETETEXT("//*[@id='loadingModal']/div[1]/div/div", "xpath"),
DELETEYES("YES", "linkText"),
DELETENO("NO", "linkText"),
APPLYCHANGES_POPUP_CONTINUEBTN("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	
	;
	public String element,Identifier;
	private DespatchDutyLogEnum(String element){
		 this.element = element;
	 }
	private DespatchDutyLogEnum(String element, String Identifier){
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
