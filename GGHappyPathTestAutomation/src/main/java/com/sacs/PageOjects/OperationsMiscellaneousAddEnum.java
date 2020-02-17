package com.sacs.PageOjects;

public enum OperationsMiscellaneousAddEnum {
	
	OPERATIONS("operations","id"),
	MISCELLANEOUS("Miscellaneous","linkText"),
	TITLE("//div[@id='reportsHeader']/div/h1","xpath"),
	DELIVERYPLANS("//div[@id='reportsBlock']/a[contains(@href,'deliveryPlans')]/div/span","xpath"),
	LOADRATIO("//div[@id='reportsBlock']/a[contains(@href,'loadRatio')]/div/span","xpath"),
	BOXCODES("//div[@id='reportsBlock']/a[contains(@href,'boxCodes')]/div/span","xpath"),
	CATERINGSTOWAGEPLANS("//div[@id='reportsBlock']/a[contains(@href,'csp')]/div/span","xpath"),
	FLIGHTTIMETABLE("//div[@id='reportsBlock']/a[contains(@href,'flightTimetable')]/div/span","xpath"),
	MC_FTT_IMPORTTIMETABLEDATA("//ul[@id='flightTimetable']/li/a[text()='Import timetable data']","xpath"),
	MC_FTT_IMPORT_FTT_ADDDELIVERYPLAN("//ul[@id='flightTimetable']/li/a[text()='Import Flight Time Table Additional Delivery Plans']","xpath"),
	MC_FTT_IMPORT_FTT_CATERINGSTOWAGEPLANS("//ul[@id='flightTimetable']/li/a[text()='Import Flight TimeTable CateringStowagePlans']","xpath"),
	MC_FTT_IMPORT_BACKARROW("//ul[@id='flightTimetable']/li[1]/sup[text()='B']","xpath"),
	MC_FTT_IMPORT_BACKARROW_MODULEBLOCK("//div[@id='reportsBlock']/a/div[@class='reportModuleBlock']","xpath"),
	IMPORT_FTT_HEADER("//div[@id='reportsHeader']/div/h1","xpath"),
	FTT_SELECTFILE("//select[@id='ddlFileType']","xpath"),
	FTT_IMPORTFILE("//span[@id='upLoadFiles']/span/input","xpath"),
	FTT_IMPORTBUTTON("//a[@id='upload']","xpath"),
	FTT_DOWNLOADTEMPLATE("//a[@id='btnImporttemplate']","xpath"),
	;
	
	public String element,Identifier;
	private OperationsMiscellaneousAddEnum(String element){
		 this.element = element;
	 }
	private OperationsMiscellaneousAddEnum(String element, String Identifier){
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
