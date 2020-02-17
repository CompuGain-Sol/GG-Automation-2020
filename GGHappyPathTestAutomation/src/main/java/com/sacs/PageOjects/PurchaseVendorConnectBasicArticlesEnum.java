package com.sacs.PageOjects;

public enum PurchaseVendorConnectBasicArticlesEnum {
	
	BASIC_ARICLES_LINK(".//*[@id='basicarticle']/a", "xpath"),
	SEARCH_FIELD_ID(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	BASIC_ARTICLES_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ADD_ARTICLE_BTN(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	ADD_BASIC_ARTICLE_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	BACK_TO_SEARCH(".//*[@id='contentHeader']/div[3]/a", "xpath"),
	PRIMARY_DESC(".//*[@id='PrimaryDesc']", "xpath"),
	ARTICLE_GROUP(".//*[@id='ArticleGroupCode']", "xpath"),
	PURCHASE_UOM(".//*[@id='PurchaseUOM']", "xpath"),
	STORE_UOM(".//*[@id='StoreUOM']", "xpath"),
	MENU_UOM(".//*[@id='MenuUOM']", "xpath"),
	GRID_FIRST_ROW(".//*[@id='results']/table/tbody/tr/td[2]", "xpath"),
	NO_DATE_TO_DISPLAY(".//*[@id='results']/table/tbody/tr/td", "xpath"),
	SHOW_ENTRIES(".//*[@id='pager_top']/span", "xpath"),
	UPDATE_BASIC_ARTILCE_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ADD_NEW_VENDOR(".//*[@id='vendorContainer']/div[2]/div[3]/a", "xpath"),
	ACTIVE_MENU_ITEMS("ui-menu-item", "className"),
	VENDOR_NAME1(".//*[@id='VendorName_1']", "xpath"),
	VENDOR_NAME0(".//*[@id='VendorName_0']", "xpath"),
	SAVEICON("//*[@id='nav']/li[8]/a/div", "xpath"),
	
	
	;
	
	private String element;
	private String Identifier;
	
	private PurchaseVendorConnectBasicArticlesEnum(String element){
		 this.element = element;
	 }
	private PurchaseVendorConnectBasicArticlesEnum(String element, String Identifier){
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
