package com.sacs.PageOjects;

public enum InvoiceTurnoverGroupEnum {

	INVOICE("//*[@id='invoice']", "xpath"),
	TURNOVERGRP("//*[@id='turnovergroup']/a", "xpath"),
	ADDTURNOVERGRP("//*[@id='addNew']", "xpath"),
	TOGTITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	DESCRIPTION_FIRSTROW("//*[@id='turnoverGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	DESCRIPTION_SINGLEROW("//*[@id='turnoverGrid']/table/tbody/tr/td[2]", "xpath"),
	OK_BTN("//*[@id='btn-save']", "xpath"),
	ADDLINE_BTN("//*[@id='addLine']", "xpath"),
	SUBGROUP("//*[@id='SubTurnoverGrpCode']", "xpath"),
	DESCRIPTION("//*[@id='SubGroupDescription']", "xpath"),
	SAPGLACCOUNT("//*[@id='SapGlAccount']", "xpath"),
	SALESCATEGORY("//*[@id='SalesCategory']", "xpath"),
	ADDLINE_OKBTN("//*[@id='okButtonDtl']", "xpath"),
	ADDLINE_CANCELBTN("//*[@id='cancelButton']", "xpath"),
	GRIDCOUNT("//*[starts-with(@class,'ui-widget-content')]", "xpath"),
	DIVISION("//*[@id='Division']", "xpath"),
	PAGINATION_CONTROLS("//*[@id='turnoverGrid']/div/div", "xpath"),
	ITEMPERPAGE("//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[1]", "xpath"),
	SEARCH_DD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCH_TURNOVERGRP_CHK("//*[@id='searchContainer']/div[2]/div[1]/div[1]", "xpath"),
	SEARCH_DIVISION_CHK("//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
	SEARCH_DESC_CHK("//*[@id='searchContainer']/div[2]/div[1]/div[2]/label/span", "xpath"),
	NODATATODISPLAY("//*[@id='turnoverGrid']/table/tbody/tr/td", "xpath"),
	SHOWINGENTRIES("//*[@id='gridWrapper']/div[3]/span", "xpath"),
	TURNOVERGRP_FIRSTROW("//*[@id='turnoverGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	MAINTURNOVERGROUP_FIELD("//*[@id='Code']", "xpath"),
	MTG_DESCRIPTION("//*[@id='Description']", "xpath"),
	SUBGROUP_FIRSTROW("//*[@id='gridResults']/div[6]/div/div/div[1]/div[1]/span[1]", "xpath"),
	DETAILGRID_DESCRIPTION("//*[@id='gridResults']/div[6]/div/div/div[1]/div[2]", "xpath"),
	DETAILGRID_EDIT("//*[@id='gridResults']/div[6]/div/div/div[1]/div[5]/div/span[1]/a", "xpath"),
	DETAILGRID_UPDATEBTN("//*[@id='updateBtn']", "xpath"),
	DETAILGRID_REMOVE("//*[@id='gridResults']/div[6]/div/div/div[1]/div[5]/div/span[4]/a", "xpath"),
	REMOVE_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	DETAILGRID_COPYICON("//*[@id='gridResults']/div[6]/div/div/div[1]/div[5]/div/span[2]/a", "xpath"),
	SUBGROUP_INFOICON("//*[@id='gridResults']/div[6]/div/div/div[1]/div[1]/span[2]/a", "xpath"),
	INFORPOPUP_TEXT("//*[@id='loadingModal']/div[1]/div", "xpath"),
	INFOPOPUP_OKBTN("//*[@id='loadingModal']/div[2]/a", "xpath"),
	INFO_SALESPOPUP_OKBTN("//*[@id='okButton']", "xpath"),
	DESC_SECONDROW("//*[@id='turnoverGrid']/table/tbody/tr[2]/td[2]", "xpath"),
	DESC_THIRDROW("//*[@id='turnoverGrid']/table/tbody/tr[3]/td[2]", "xpath"),
	UPDATE_EDIT("//*[@id='btn-edit']", "xpath"),
	MEALRELATED_CHKBOX("//*[@id='formBody']/div[2]/div[3]/label/span", "xpath"),
	BACKTOMODULE("//*[@id='subNav-invoice']/span/sup", "xpath"),
	BACKTOMODULE_COSTING("//*[@id='subNav-costp']/span/sup", "xpath"),
	SECONDROWFIRSTCOL("//*[@id='turnoverGrid']/table/tbody/tr[2]/td[1]", "xpath"),
	REPLACE_MAINTURNOVERGROUP("//*[@id='MainTurnoverGrpCode']", "xpath"),
	REPLACE_SUBGROUP("//*[@id='SubTurnoverGrpCodeReplace']", "xpath"),
	REPLACE_CONTINUEBTN("//*[@id='turnoverReplacePopup']/div[4]/a[2]", "xpath"),
	REPLACE_CANCELBTN("//*[@id='turnoverReplacePopup']/div[4]/a[1]", "xpath"),
	SALES_POPUP_EXPORTBTN("//*[@id='exportBtn']", "xpath"),
	SALES_POPUP_PAGINATIONGRID("//*[@id='whereUsedGrid']/div", "xpath"),
	SERVICETAXCHARGE("//*[@id='ServiceTax']", "xpath"),
	DESC_FOURTHROW("//*[@id='turnoverGrid']/table/tbody/tr[4]/td[2]", "xpath"),
	DESC_FIRSTROW("//*[@id='turnoverGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	;
	public String element,Identifier;
	private InvoiceTurnoverGroupEnum(String element){
		 this.element = element;
	 }
	private InvoiceTurnoverGroupEnum(String element, String Identifier){
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
