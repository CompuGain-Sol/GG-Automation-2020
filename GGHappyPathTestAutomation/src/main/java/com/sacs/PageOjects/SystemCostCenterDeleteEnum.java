package com.sacs.PageOjects;

public enum SystemCostCenterDeleteEnum {
	
	REMOVE_ICON("removeCostCenter","id"),
	REMOVE_CONTINUE(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	
	
	;
	
	public String element,Identifier;
	private SystemCostCenterDeleteEnum(String element){
		 this.element = element;
	 }
	private SystemCostCenterDeleteEnum(String element, String Identifier){
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
