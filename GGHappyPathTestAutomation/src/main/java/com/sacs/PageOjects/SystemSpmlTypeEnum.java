package com.sacs.PageOjects;

public enum SystemSpmlTypeEnum {

	SPML_TYPE("specialmealtypes","id"),
	ADD_SPML_BUTTON(".//*[@id='contentHeader']/div[2]/a","xpath"),
	ITEM_PER_PAGE(".//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[1]","xpath"),
	FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	NEXT(".//*[@id='pager_top']/div/a[3]/span","xpath"),
	LAST(".//*[@id='pager_top']/div/a[4]/span","xpath"),
	FIRST(".//*[@id='pager_top']/div/a[1]/span","xpath"),
	PREV(".//*[@id='pager_top']/div/a[2]/span","xpath"),
	BACKTOSEARCH(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SPML_TITLE(".//*[@id='toolsContainer']/div[1]/div","xpath"),
	LASTUPDATED("lastUpdatedContainer","id"),
	SPMLTYPE_TEXTBOX("SpmlType","id"),
	DESCRIPTION_TEXTBOX("Description","id"),
	SEQUENCE("Sequence","id"),
	SEARCHBAR("articlesearch","id"),
	SPMLTYPE_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	SEQUENCE_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"),
	SEARCHFILTER("searchFilter","className"),
	SEARCHSUBMITE("searchSubmit","className"),
	SEQUENCE_GRID_HEADING(".//*[@id='results']/table/thead/tr/th[3]/a","xpath"),
	FIRST_ROW_THIRD_COL(".//*[@id='results']/table/tbody/tr[1]/td[3]","xpath"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SPML_GRIDHEADING(".//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	CONFIRMATION_BOX("loadingModal_wnd_title","id"),
	BACK_TO_SEARCH_CONFIRMATION("confirmChangesAlert_wnd_title","id"),
	CANCEL_POPUP(".//*[@id='loadingModal']/div[2]/a[2]","xpath"),
	CONTINUE_POPUP(".//*[@id='loadingModal']/div[2]/a[1]","xpath"),
	BACK_CONTINUE_BTN("//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	UPDATE_BACKTOSEARCH(".//*[@id='contentHeader']/div[3]/a","xpath"),
	GRIDFIRSTROW("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	DESCRIPTION("//*[@id='Description']", "xpath"),
	SAVE_ICON("//*[@id='saveSpmlType']/a", "xpath"),
	;
	public String element,Identifier;
	private SystemSpmlTypeEnum(String element){
		 this.element = element;
	 }
	private SystemSpmlTypeEnum(String element, String Identifier){
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
