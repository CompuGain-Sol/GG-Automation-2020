package com.sacs.PageOjects;

public enum StoresCloseMonthEnum {

STORES("//*[@id='stores']", "xpath"),
FINANCE("//*[@id='finance']","xpath"),

CLOSEMONTH("//*[@id='closemonth']/a", "xpath"),

	
	;
	public String element,Identifier;
	private StoresCloseMonthEnum(String element){
		 this.element = element;
	 }
	private StoresCloseMonthEnum(String element, String Identifier){
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
