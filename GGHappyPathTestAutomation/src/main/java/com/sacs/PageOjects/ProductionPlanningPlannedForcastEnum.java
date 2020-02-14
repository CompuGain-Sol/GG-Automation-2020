package com.sacs.PageOjects;

public enum ProductionPlanningPlannedForcastEnum {
	PRODUCTION_PLANNING("//*[@id='productionplanning']","xpath"),
	FORCAST_PLANNING(".//*[@id='forecastplanning']/a","xpath"),
	PAGETITILE("//*[@id='contentHeader']/div/h1","xpath"),
	FLIGHT_SEARCH_("//*[@id='paxfiguresByFlightGrid']/div[4]/div[1]/div[2]/div[2]/input","xpath"),
	SEARCH_RESULT("//*[@id='paxfiguresByFlightGrid']/div[6]/div/div/div/div[2]","xpath"),
	SEARCH_RESULT_CHECKBOX(".//*[@id='paxfiguresByFlightGrid']//div[starts-with(@class,'grid-canvas')]/div[1]/div/input","xpath"),
	SELECTED("//*[@id='nav']/li[1]/div","xpath"),
	UPDATE_SELECTED("Update Selected","linkText"),
	ADJUST_FIGURE(".//*[@id='LastIncPercent']","xpath"),
	CONTINUE("Continue","linkText"),
	START_UPDATE("Start update","linkText"),
	SEARCH_RESULT_CHECKBOX1(".//*[@id='paxfiguresByFlightGrid']//div[starts-with(@class,'grid-canvas')]/div[2]/div/input","xpath"),
	SET_SELECTED_TO_ZERO("//*[@id='nav']/li[1]/ul/li[2]/a","xpath"),
	OK("OK","linkText"),
	SELECT_ALL_CHECKBOX("//div[@id='figuresGrid']//span[@class='slick-column-name']/input","xpath")
	
	;
	public String element,Identifier;
	private ProductionPlanningPlannedForcastEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningPlannedForcastEnum(String element, String Identifier){
		 this.element = element;
		 this.Identifier = Identifier;
	 }
	public String getElementPath(){
		return element;
	}
	public String getIdentifier(){
		return Identifier;
	}
	
}
