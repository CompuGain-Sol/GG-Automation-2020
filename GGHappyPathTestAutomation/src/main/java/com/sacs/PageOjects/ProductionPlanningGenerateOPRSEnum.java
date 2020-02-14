package com.sacs.PageOjects;

public enum ProductionPlanningGenerateOPRSEnum {
	
	
	PRODUCTION_PLANNING("//*[@id='productionplanning']/p", "xpath"),
	GENERATEOPRS("Generate OPRS", "linkText"),
	PAGETITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	CUSTOMERCODE("//*[@id='CustomerCode']", "xpath"),
	DOWNLOADXML("//*[@id='processProdFileXml']", "xpath"),
	UPDATEOPRS("//*[@id='saveContainer']/a", "xpath"),
	UPLOAD_CPC_CHECKBOX("//*[@id='oprsForm']/div[4]/label/span", "xpath"),
;
	
	
	public String element,Identifier;
	private ProductionPlanningGenerateOPRSEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningGenerateOPRSEnum(String element, String Identifier){
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
