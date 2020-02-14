package com.sacs.PageOjects;

public enum CommonObjectPageEnum {
	
	/*NEXT("//*[@id='gridWrapper']/div[3]/div/a[3]/span","xpath"),
	LAST("//*[@id='gridWrapper']/div[3]/div/a[4]/span","xpath"),
	FIRST("//*[@id='gridWrapper']/div[3]/div/a[1]/span","xpath"),
	PREV("//*[@id='gridWrapper']/div[3]/div/a[2]/span","xpath"),*/
	SEARCH_FIELD("//*[@id='articlesearch']"),
	/*SEARCH_SUBMIT("searchSubmit", "className"),
	ITEM_PER_PAGE(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
	FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	SAVE_ICON("S","linkText"),
	SEARCHFIELD("//*[@id='articlesearch']", "xpath"),*/
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img"),
	
				
	;
	public String element;
	private CommonObjectPageEnum(String element){
		 this.element = element;
	 }
	public String getElementPath(){
		return element;
	}
}
