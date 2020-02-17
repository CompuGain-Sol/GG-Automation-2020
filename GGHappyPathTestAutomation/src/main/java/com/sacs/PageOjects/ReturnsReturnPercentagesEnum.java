package com.sacs.PageOjects;

public enum ReturnsReturnPercentagesEnum {

	RETURNS("returns","id"),
	RETURNPERCENTAGES("//*[@id='returnpercentage']/a", "xpath"),
	PAGE_TITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	OK_BTN("//*[@id='searchCriteria']/div[3]/a", "xpath"),
	GRIDFIRSTROW("//*[@id='retPercentageEditGrid']/div[6]/div/div/div[1]/div[1]", "xpath"),
	MENU("//*[@id='nav']/li[1]/div", "xpath"),
	CALC_ADJUSTPERCENTAGE("//*[@id='nav']/li[1]/ul/li/a", "xpath"),
	ADJUSTPERCENTBY("//*[@id='AdjustPercentBy']", "xpath"),
	CRP_POPUP_OK_BTN("//*[@id='adjustPercent']/div[3]/a[2]", "xpath"),
	URP_YES_BTN("//*[@id='confirmUpdateForm']/div[3]/a[1]", "xpath"),
	SHOW_DD("//*[@id='selectCriteria']", "xpath"),
	SHOWONLY_BONDARTICLES_TEXT("//*[@id='returnPercentage']/div[3]", "xpath"),
	OBA_DESC_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[2]/span[1]", "xpath"),
	OBA_VENDORNO_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[3]/span[1]", "xpath"),
	OBA_UOM_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[4]/span[1]", "xpath"),
	OBA_ARTGROUP_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[5]/span[1]", "xpath"),
	OBA_PRIMARYSTORECODE_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[6]/span[1]", "xpath"),
	OBA_RETURNPERCENTAGE_HEADER("//*[@id='retPercentageEditGrid']/div[2]/div/div/div[7]/span[1]", "xpath"),
	STARTDATE("//*[@id='StartDate']", "xpath"),
	TODATE("//*[@id='EndDate']", "xpath"),
	CALCRETPER_POPUP_CANCELBTN("//*[@id='adjustPercent']/div[3]/a[1]", "xpath"),
	CALCRETPER_POPUP_OKBTN("//*[@id='adjustPercent']/div[3]/a[2]", "xpath"),
	CALCRETPER_POPUP_TITLE("//*[@id='adjustPercent_wnd_title']", "xpath"),
	UPDATERETPERCENTAGE_POPUP_YESBTN("//*[@id='confirmUpdateForm']/div[3]/a[1]", "xpath"),
	SHOWARTICLEFORSUBSTORES_TEXT("//*[@id='subCategory']/div[1]", "xpath"),
	ART_SUBSTORES_BACKBTN("//*[@id='subCategory']/div[7]/a[1]", "xpath"),
	ART_SUBSTORES_OKBTN("//*[@id='subCategory']/div[7]/a[2]", "xpath"),
	ART_SUBSTORES_DESC_FIRSTROW("//*[@id='subStoresGrid']/div[6]/div/div/div[1]/div[2]", "xpath"),
	ART_SUBSTORES_CHECKBOX_FIRSTROW("//*[@id='checkSelBox00']", "xpath"),
	BA_SUBSTORECODE_SECONDROW("//*[@id='retPercentageEditGrid']/div[6]/div/div/div[2]/div[7]", "xpath"),
	BA_SUBSTORECODE_SECONDROW_INPUT("//*[@id='retPercentageEditGrid']/div[6]/div/div/div[2]/div[7]/input", "xpath"),
	BA_SUBSTORECODE_SAVEICON("//*[@id='nav']/li[2]/a/div", "xpath"),
	ARTGRP_DESC_FIRSTROW("//*[@id='articleGroupGrid']/div[6]/div/div/div[1]/div[2]", "xpath"),
	 ;
		
	 public String element, identifier;
	 	
	 	private ReturnsReturnPercentagesEnum(String element){
	 		 this.element = element;
	 	 }
	 	
	 	private ReturnsReturnPercentagesEnum(String element, String identifier){
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
