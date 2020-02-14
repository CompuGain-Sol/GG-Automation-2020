package com.sacs.PageOjects;

public enum ReturnsCloseDateEnum {

	
	 RETURNS("returns","id"),
	 CLOSEDATE("//*[@id='subNav-returns']/li[3]","xpath"),
	 PAGE_TITLE("//*[@id='contentHeader']/div/h1","xpath"),
	 SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	 SEARCH_ICON("//*[@id='searchContainer']/div/span[2]/a/img", "xpath"),
	 SHOWING_ENTRIES("//*[@id='gridWrapper']/div[3]/span", "xpath"),
	 CLOSEDATE_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	 NEXT("//*[@id='gridWrapper']/div[3]/div/a[3]/span", "xpath"),
	 PREV("//*[@id='gridWrapper']/div[3]/div/a[2]/span", "xpath"),
	 LAST("//*[@id='gridWrapper']/div[3]/div/a[4]/span", "xpath"),
	 FIRST("//*[@id='gridWrapper']/div[3]/div/a[1]/span", "xpath"),
	 CLOSEDATE_ICON("//*[@id='editCheckout']", "xpath"),
	 SEARCHRECORD_RETCOUNTFLIGHT("//*[@id='results']/table/tbody/tr/td[3]", "xpath"),
	 CONFIRM_CLOSEDATE_TEXT("//*[@id='removeAlert']/div[1]", "xpath"),
	 CONFIRM_CLOSEDATE_POPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	 CONFIRM_CLOSEDATE_POPUP_CANCELBTN("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	 NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	 CHECKOUT("//*[@id='checkout']/a", "xpath"),
	 CHECKOUT_SEARCHICON("//*[@id='gridWrapper']/div[1]/div/span[2]/a/img", "xpath"),
	 RETURNCOUNTING("//*[@id='returnscounting']/a", "xpath"),
	 CLOSEDATECORRECTION("//*[@id='closedatescorrections']/a", "xpath"),
	 SEARCHRECORD_DATES("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	;
	
public String element, identifier;
	
	private ReturnsCloseDateEnum(String element){
		 this.element = element;
	 }
	
	private ReturnsCloseDateEnum(String element, String identifier){
		 this.element = element;
		 this.identifier = identifier;
	 }
	
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return identifier;
	}
}
