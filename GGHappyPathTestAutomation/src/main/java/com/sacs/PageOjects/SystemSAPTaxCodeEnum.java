package com.sacs.PageOjects;

public enum SystemSAPTaxCodeEnum {
	SYSTEM("system","id"),
	SAPTAXCODE("//*[@id='saptaxcodes']/a","xpath"),
	PAGE_TITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADDTAXCODE("//*[@id='contentHeader']/div[2]/a", "xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	SAPTAXCODE_TEXTBOX("//*[@id='SAPCode']", "xpath"),
	EFFECTIVEENDDATE("//*[@id='EffectiveEndDate']", "xpath"),
	OK_BTN("//*[@id='saveContainer']/a", "xpath"),
	SEARCH_DD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	
	SAPTAXCODELINK("//a[text()='SAP TAX CODE']", "xpath"),
	SAPTAXCODEDEFAULTSORTING("//div[@id='results']/table/thead/tr/th[1]/a/span","xpath"),
	SAPTAXCODEAPPLYCHAGES("//div[@id='saveSAPTaxCodeDetail']/a","xpath"),
	INPUTLINK("//a[text()='INPUT']", "xpath"),
	INPUTLINK_FIRST("//div[@id='results']/table/tbody/tr[1]/td[2]/div", "xpath"),
	OUTPUTLINK("//a[text()='OUTPUT']", "xpath"),
	OUTPUTLINK_FIRST("//div[@id='results']/table/tbody/tr[1]/td[3]/div", "xpath"),
	ADDTAXCODEBUTTON("//a[@class='addBtn btnSkin']", "xpath"),
	UPDATESAPTAXCODE_INPUT("//a[@id='inputType']","xpath"),
	UPDATESAPTAXCODE_INPUTACTIVE("//a[@id='inputType' and @class='btnSlide selectActive']","xpath"),
	UPDATESAPTAXCODE_OUTPUT("//a[@id='outputType']","xpath"),
	UPDATESAPTAXCODE_OUTPUTACTIVE("//a[@id='outputType' and @class='btnSlide selectActive']","xpath"),
	
	;
	
	
	public String element,Identifier;
	private SystemSAPTaxCodeEnum(String element){
		 this.element = element;
	 }
	private SystemSAPTaxCodeEnum(String element, String Identifier){
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
