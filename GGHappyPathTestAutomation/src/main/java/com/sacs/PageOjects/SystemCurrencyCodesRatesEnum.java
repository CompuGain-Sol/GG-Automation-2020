package com.sacs.PageOjects;

public enum SystemCurrencyCodesRatesEnum {
	SYSTEM("system","id"),
	CDR("//*[@id='currencycodesrates']/a","xpath"),
	PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADDCURRENCY("//*[@id='contentHeader']/div[2]/a", "xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[2]/span[2]/a/img", "xpath"),
	SEARCHRECORD("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	CODE("//*[@id='Code']", "xpath"),
	DESCRIPTION("//*[@id='Description']", "xpath"),
	OK_BTN("//*[@id='saveContainer']/a", "xpath"),
	;
	
	
	public String element,Identifier;
	private SystemCurrencyCodesRatesEnum(String element){
		 this.element = element;
	 }
	private SystemCurrencyCodesRatesEnum(String element, String Identifier){
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
