package com.sacs.PageOjects;

public enum ProductionPlanningUpdateHTMLProductionForecastEnum {
	
	
	PRODUCTION_PLANNING("productionplanning","id"),
	UPDATEHTMLPRODUCTIONFORECAST("//*[@id='subNav-pp']/li[6]/a", "xpath"),
	DEPARTMENT_CHKBOX("//*[@id='departmentResults']/div/div/div/div/span/input", "xpath"),
	OK_BTN("//*[@id='htmlpfWrapper']/div[2]/div[4]/a", "xpath"),
	CODE_FIRSTITEM("//div[@id='departmentResults']/div[6]/div/div/div[1]/div[2]","xpath"),
	DEPARTMENT_FIRSTITEM("//div[@id='departmentResults']/div[6]/div/div/div[1]/div[3]","xpath"),
	
;
	
	
	public String element,Identifier;
	private ProductionPlanningUpdateHTMLProductionForecastEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningUpdateHTMLProductionForecastEnum(String element, String Identifier){
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
