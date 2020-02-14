package com.sacs.PageOjects;

public enum OperationAircraftVersionSearchPageEnum {
	
	
	//OPERATION("//*[@id='operations']","xpath"),
	AIRCRAFT_VERSIONS(".//*[@id='aircraftversions']/a"),
	AIRCRAFT_VERSION_TITLE(".//*[@id='contentHeader']/div[1]/h1"),
	ADD_AIRCRAFT_BUTTON("//*[@id='contentHeader']/div[2]/a"),
	AIRCRAFT_SEARCHBOX("articlesearch"),
	AIRCRAFT_ACTYPE("//*[@id='results']/table/thead/tr/th[1]/a"),
	AIRCRAFT_DESC("//*[@id='results']/table/thead/tr/th[2]/a"),
	//*[@id='searchContainer']/div[4]/div[1]/label[2]/span
	AIRCRAFT_ACVERSION("//*[@id='results']/table/thead/tr/th[3]"),
	AIRCRAFT_CUSTOMERCODE("//*[@id='results']/table/thead/tr/th[4]"),
	AIRCRAFT_ACTIVE("//*[@id='results']/table/thead/tr/th[5]/a"),
	AIRCRAFT_EQUIPMENTTYPE("//*[@id='results']/table/thead/tr/th[6]"),
	AIRCRAFT_SHOWENTRIES("//*[@id='gridWrapper']/div[1]/div[2]"),
	/*REPLACESHOWENTRIES("//*[@id='replaceGridContainer']/div[3]/div[2]", "xpath"),
	AIRCRAFT_SHOWINGENTRIES("//*[@id='results']/div/span","xpath"),*/
	AV_BELOWPAGINATION("//*[@id='results']/div"),
	/*AIRCRAFT_NEXT("//*[@id='pager_top']/div/a[3]/span","xpath"),
	AIRCRAFT_PREV("//*[@id='pager_top']/div/a[2]/span","xpath"),
	AIRCRAFT_FIRST("//*[@id='pager_top']/div/a[1]/span","xpath"),
	AIRCRAFT_LAST("//*[@id='pager_top']/div/a[4]/span","xpath"),*/
	AIRCRAF_DELPLANS("//*[@id='deliveryplan']/a"),
	AIRCRAFT_LOADSETUP("//*[@id='loadingsetup']/a"),
	AIRCRAFT_LOADRATIO("//*[@id='loadratio']/a"),
	AIRCRAFT_TIMETABLE("//*[@id='flighttimetable']/a"),
	AIRCRAFT_DISTCODES("//*[@id='distributioncodes']/a"),
	//AIRCRAFT_BOXCODES("//*[@id='boxcodes']/a", "xpath"),
	AIRCRAFT_CAT_STOWPLAN("//*[@id='cateringstowageplan']/a"),
	AIRCRAFT_ROTATIONPLAN("//*[@id='rotationplan']/a"),
	//AIRCRAFT_MISCELLANEOUS("//*[@id='miscellaneous']/a", "xpath"),
	PRICEIMPACTCHARTS("//*[@id='priceimpactchart']/a"),
	AIRCRAFT_FIRSTARTICLE("//*[@id='results']/table/tbody/tr[1]/td[2]"),
	AV_SEARCHRESULTS("//*[@id='gridWrapper']/div[3]/span"),
	//REPLACESEARCH("//*[@id='replaceGridContainer']/div[3]/div[1]", "xpath"),
	AV_PAGE("//*[@id='gridWrapper']/div[3]/div/ul/li[3]/a"),
	//AV_PAGE_RWU("//*[@id='replaceClearGrid']/div[1]/div/ul/li[3]/a", "xpath"),
	//PAGE3("//*[@class='pagContainerTop']//*[@class='k-state-selected']", "xpath"),
	PAGE3_LINK("//*[@id='replaceClearGrid']/div[1]/div/ul/li[3]/a"),
	/*BACKTOSEARCH("Back to Search", "linkText"),
	RWU_ENTRIES("//*[@id='replaceClearGrid']/div[1]/span", "xpath"),
	SHOWENTRIES("//*[@id='replaceClearGrid']/div[1]/span", "xpath"),
	SHOWENTRIES_2("//*[@id='gridWrapper']/div[3]/span", "xpath"),*/
	SHOWENTRIES_3("//*[@id='replaceClearGrid']/div[1]/span"),
	//Update
	UAV_ACTYPE("//*[@id='AircraftType']"),
	UAV_ACVERSION("//*[@id='AircraftVersion']"),
	UAV_CUSTOMERCODE("//*[@id='CustomerId']"),
	UAV_DESCRIPTION("//*[@id='Description']"),
	UAV_EQUIPMENTTYPE("//*[@id='EquipmentType']"),
	UAV_CONFIG("//*[@id='acconfig_0']"),
	/*UAV_ACTIVE("Active", "id"),
	UAV_ADDVERSION("//*[@id='addAircraftContainter']/a", "xpath"),
	
	AV_DELETE("X", "linkText"),*/
	
	//Search
	AV_SEARCHFIELD("//*[@id='articlesearch']"),
	AV_SEARCHDD("//*[@class='searchFilter']"),
	AV_SP_AIRCRAFTTYPE("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span"),
	AV_SP_DESCRIPTION("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span"),
	AV_SP_AIRCRAFTVERSION("//*[@id='searchContainer']/div[2]/div[1]/label[3]/span"),
	AV_SP_CUSTOMERCODE("//*[@id='searchContainer']/div[2]/div[2]/label[1]/span"),
	AV_SP_ACTIVE("//*[@id='searchContainer']/div[2]/div[2]/label[2]/span"),
	AV_SP_EQUIPMENTTYPE("//*[@id='searchContainer']/div[2]/div[2]/label[3]/span"),
//	AV_SEARCHDESCVALUE("//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	AV_SEARCHACTYPE("//*[@id='results']/table/tbody/tr[1]/td[1]"),
	AV_SEARCHACVERSION("//*[@id='results']/table/tbody/tr[1]/td[3]"),
	AV_SEARCHCUSTOMERCODE("//*[@id='results']/table/tbody/tr[1]/td[4]"),
	AV_SEARCHEQUIPMETTYPE("//*[@id='results']/table/tbody/tr[1]/td[6]"),
	AV_SEARCHICON("searchSubmit"),
	AV_SEARCHNODATA("//*[@id='results']/table/tbody/tr/td"),
	//TOASTMSG("toast-message","className"),
	AV_ACVERSION("//*[@id='results']/table/tbody/tr/td[3]"),
	SHOWDD("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]"),
	/*SELECT20("//*[@id='count_listbox']/li[2]", "xpath"),
	SELECT50("//*[@id='count_listbox']/li[3]", "xpath"),
	SELECT100("//*[@id='count_listbox']/li[4]", "xpath"),*/
	ACTYPEHEADARROW("//*[@id='results']/table/thead/tr/th[1]/a/span"),
	DESCHEADARROW("//*[@id='results']/table/thead/tr/th[2]/a/span"),
	ACTIVEEHEADARROW("//*[@id='results']/table/thead/tr/th[5]/a/span"),
	/*AVDELETE("//*[@id='btnDelete']/div", "xpath"),
	AVDELDAYS("//*[@id='loadingModal']/div[1]/span/input", "xpath"),
	AVDELPOPUP("//*[@id='loadingModal']/div[2]/div/span[1]/a", "xpath"),
	AV_MENU("//*[@id='menuContainer']/div", "xpath"),
	AV_MENUITEM("//*[@id='menuContainer']/ul/li/a", "xpath"),
	MENUITEM1("//*[@id='menuContainer']/ul/li[1]/a", "xpath"),
	MENUITEM2("//*[@id='menuContainer']/ul/li[2]/a", "xpath"),
	AV_LOCATION("//*[@id='aircraftUsed']/table/thead/tr/th[1]/a", "xpath"),
	AV_ID("//*[@id='aircraftUsed']/table/thead/tr/th[2]", "xpath"),
	AV_CLOSE("//*[@id='aircraftUsedIn']/div[3]/a", "xpath"),
	LASTUPDATED("//*[@id='nav']/li[4]", "xpath"),
	ARTICLESEARCH("//*[@id='lblArticleSearch']", "xpath"),
	UAV_ACTYPE_S1("//*[@id='searchContainer']/div[4]/div[1]/label[1]/span", "xpath"),
	UAV_DESC_S2("//*[@id='searchContainer']/div[4]/div[1]/label[2]/span", "xpath"),
				   
	UAV_AVVERSION_S3("//*[@id='searchContainer']/div[4]/div[1]/label[3]/span", "xpath"),
	UAV_CUSTCODE_S4("//*[@id='searchContainer']/div[4]/div[2]/label[1]/span", "xpath"),
	UAV_EQPTYPE_S5("//*[@id='searchContainer']/div[4]/div[2]/label[2]/span", "xpath"),
	UAV_DESC("//*[@id='searchContainer']/div[4]/div[1]/label[2]/span", "xpath"),
	FIRST("//*[@id='aircraftUsed']/div/div/a[1]/span", "xpath"),
	PREV("//*[@id='aircraftUsed']/div/div/a[2]/span", "xpath"),
	NEXT("//*[@id='aircraftUsed']/div/div/a[3]/span", "xpath"),
	LAST("//*[@id='aircraftUsed']/div/div/a[4]/span", "xpath"),
	REPLACEBTNAPPLY("//*[@id='btnReplaceApply']", "xpath"),
	CONFIRMREPLACEMENT("//*[@id='aircraftConfirmReplace_wnd_title']", "xpath"),
	CONFIRMREPLACEPOPUPMSG("//*[@id='lblAircraftReplaceConfirm']", "xpath"),
	REPLACEVERSION("//*[@id='aircraftConfirmReplace']/div[3]/a[1]", "xpath"),
	REPLACEVERSIONCANCEL("//div[@id='aircraftConfirmReplace']//div[@class='detailsBtns']/a[2]", "xpath"),
	NOTHINGREPLACE("//*[@id='loadingModal']/div[1]/div", "xpath"),
	NOTHINGREPLACEPOPUPCLOSE("//*[@id='loadingModal']/div[2]/a", "xpath"),
	WHEREACVERSIONUSEDPOPUP("//*[@id='aircraftUsed']/table/tbody/tr/td[1]", "xpath"),
	REPLACEWHEREUSEDENTRIES("//*[@id='replaceClearGrid']/div[1]/span", "xpath"),
	MANAGE_UNIT_CHECKBOX("//*[@id='linkToUnitsGrid']//span/input","xpath"),
	NOTASSOCIATED_POPUP("//*[@id='loadingModal']/div[1]","xpath"),
	
	CLASS_CONFIG_INPUTBOXES("//div[@id='aircraftGrid']//input","xapth"),
	UNIT_CHECKBOX("//*[@id='checkSelBox80']", "xpath"),
	CONTINUE_BTN("//*[@id='continueButton']", "xpath"),*/
	;
	


	
	public String element;
	private OperationAircraftVersionSearchPageEnum(String element){
		 this.element = element;
	 }
	
	public String getElementPath() {
		return element;
	}
	
	

}
