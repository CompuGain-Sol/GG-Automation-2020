package com.sacs.PageOjects;

public enum OperationAircraftVersionAddEnum {
	
	ADDAIRCRAFT("//*[@id='contentHeader']/div[2]/a"),
	AIRCRAFT_TYPE_DROPDOWN("//*[@id='AircraftType']"),
	AIRCRAFT_VERSION_TEXTBOX(".//*[@id='AircraftVersion']"),
	CUSTOMER_CODE(".//*[@id='CustomerId']"),
	DESCRIPTION("//*[@id='Description']"),
	EQUIPMENT_TYPE(".//*[@id='EquipmentType']"),
	ACTIVE("//*[@id='aircraftVersionForm']/div[2]/div[4]/label/span"),
	CONFIG_1(".//*[@id='acconfig_1']"),
	/*CONFIG_2(".//*[@id='acconfig_3']","xpath"),
	CONFIG_3(".//*[@id='acconfig_7']","xpath"),*/
	APPLY_CHANGE("//*[@id='btnApplyChanges']"),
	TOAST_MSG("toast-message"),
	BACK_TO_SEARCH("//*[@id='contentHeader']/div[3]/a"),
	//BACK2SEARCH_UNIT("//*[@id='contentHeader']/div[2]/a", "xpath"),
	SEARCH_BAR(".//*[@id='articlesearch']"),
	SEARCH_OPTION_TRIANGLE(".//*[@id='searchContainer']/div[1]/span[3]/a/img"),
	OPTION_DESC(".//*[@id='searchContainer']/div[2]/div[1]/label[2]/span"),
	OPTION_AC_TYPE(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span"),
	OPTION_CUSTOMER_CODE(".//*[@id='searchContainer']/div[2]/div[2]/label[1]/span"),
	//OPTION_ACTIVE(".//*[@id='searchContainer']/div[2]/div[2]/label[2]/span","xpath"),
	OPTION_EQUIPMENT_TYPE(".//*[@id='searchContainer']/div[2]/div[2]/label[3]/span"),
	/*SEARCH_BUTTON(".//*[@id='searchContainer']/div[1]/span[2]/a/img","xpath"),
	SEARCH_RESULT_AC_VERSION(".//*[@id='results']/table/tbody/tr/td[3]","xpath"),*/
	REGISTRATIONNUMBER("//*[@id='txtAddRegNum']"),
	REGADDNUMBER("//*[@id='btnAddNumbers']"),
	REGADDNUMPOPUP("//*[@id='loadingModal']/div[1]"),
	CLOSEPOPUP("//*[@id='loadingModal']/div[2]/a"),
	REGNUMLIST("//*[@id='regNumList']"),
	CONFIGTOP("//*[@id='acconfig_1']"),
	CONFIGMID("//*[@id='acconfig_2']"),
	CONFIGLAST("//*[@id='acconfig_3']"),
	TOASTCLOSE("//*[@id='toast-container']/div/button"),
	CONFIGDESC("//*[@id='airClassDiv_0']/div[2]"),
	/*CLASSDESC("//*[@id='acdescription_0']", "xpath"),
	CLASSESCHK("//input[@name='IsPaxRelated']", "xpath"),
	REGNUMDELETE("//*[@id='regNumList']/li[1]", "xpath"),
	DESCFIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),*/
	CONFIG_4(".//*[@id='acconfig_0']"),
	;
	public String element;
	private OperationAircraftVersionAddEnum(String element){
		 this.element = element;
	 }
	
	public String getElement() {
		return element;
	}
	
	

}
