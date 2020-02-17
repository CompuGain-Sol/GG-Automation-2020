package com.sacs.PageOjects;

public enum DespatchTruckBayAssignmentEnum {

DESPATCH("//*[@id='dispatch']", "xpath"),
TRUCKBAYASSIGNMENT("//*[@id='truckandbay']/a", "xpath"),
TBA_FROMDATE("//*[@id='StartDate']", "xpath"),
TBA_TODATE("//*[@id='EndDate']","xpath"),
TBA_PICKASSIGNMENT("//*[@id='PickAssignmentSelectList']","xpath"),
TBA_OK(".//*[@id='okButton']", "xpath"),
TBA_APPLYCHANGES("//*[@id='saveContainer']/a", "xpath"),
TBA_POPUPOK("OK", "linkText"),
TBA_POPUPCANCEL("//*[@id='attentionModal']/div[2]/a[1]", "xpath"),
TBA_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
FROMDATEICON("//*[@id='formBody']/div[2]/div[1]/span[2]/span/span/span", "xpath"),
TODATEICON("//*[@id='formBody']/div[2]/div[2]/span[2]/span/span/span", "xpath"),
OKBTN("//*[@id='okButton']", "xpath"),
DATEPERIODPOPUP("//*[@id='loadingModal']/div[1]/div", "xpath"),
OK("//*[@id='loadingModal']/div[2]/a", "xpath"),
RESTART("//*[@id='restartButton']", "xpath"),
SAVEICON("//*[@id='nav']/li[1]/a/div", "xpath"),
APPLYCHANGES("//*[@id='applyChanges']", "xpath"),
TBGRID("//*[@id='truckandbayGrid']", "xpath"),
FLIGHT_NONEDITABLE("//*[@id='truckandbayGrid']/table/tbody/tr[1]/td[1]", "xpath"),
CUSTCODE_NONEDITABLE("//*[@id='truckandbayGrid']/table/tbody/tr[1]/td[2]", "xpath"),
CUSTNO_NONEDITABLE("//*[@id='truckandbayGrid']/table/tbody/tr[1]/td[3]", "xpath"),
FLIGHT2("//*[@id='truckandbayGrid']/table/tbody/tr[2]/td[1]", "xpath"),
CUSTCODE2("//*[@id='truckandbayGrid']/table/tbody/tr[2]/td[2]", "xpath"),
FLIGHT_GRIDHEAD("//*[@id='tbGrid']/tbody[1]/tr[1]/th[1]", "xpath"),
CUSTCODE_GRIDHEAD("//*[@id='tbGrid']/tbody[1]/tr[1]/th[2]", "xpath"),
POPUP_OK("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
POPUP_CANCEL("//*[@id='loadingModal']/div[2]/a[1]", "xpath"),
	
	;
	public String element,Identifier;
	private DespatchTruckBayAssignmentEnum(String element){
		 this.element = element;
	 }
	private DespatchTruckBayAssignmentEnum(String element, String Identifier){
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
