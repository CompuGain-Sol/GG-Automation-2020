package com.sacs.PageOjects;

public enum PurchaseAddBasicArticleEnums {

	PURCHASE_LINK("//*[@id='purchase']/p", "xpath"),
	BASIC_ARITCLE_LINK(".//*[@id='basicarticle']/a", "xpath"),	
	BASIC_ARTICLE_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ADD_ARTICLE_BTN(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	ADD_BASIC_ARTICLE_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	PURCHASE_TO_STORE_UOM("PurchaseToStoreUOC", "id"),
	STORE_TO_MENU_UOM("StoreToMenuUOC", "id"),
	
	//Pricing information Section
	CUSTOMER_PRICE(".//*[@id='CustomerStandardPrice']", "xpath"),
	VENDOR_REBATE(".//*[@id='VendorRebate']", "xpath"),
	ARTICLE_REBATE(".//*[@id='ArticleRebate']", "xpath"),
	FIXED_PRICE_REBATE(".//*[@id='PriceRebateInd']", "xpath"),
	WY_FACTOR(".//*[@id='WYFactor']", "xpath"),
	COMMODITY_PERCENT(".//*[@id='CommodityPercent']", "xpath"),
	COMMODITY_FIX_VALUE(".//*[@id='CommodityFixValue']", "xpath"),
	INFLATION_RATE(".//*[@id='InflationRate']", "xpath"),
	STANDARD_PRICE(".//*[@id='StandardPrice']", "xpath"),
	ARTICLE_NUMBER("ArticleNumber", "id"),
	
	REPORTS_ICON(".//*[@id='nav']/li[2]/a/div", "xpath"),
	UPLOAD_PHOTO_ICON(".//*[@id='upLoad']/div", "xpath"),
	
	ALLERGENS_ICON(".//*[@id='nav']/li[4]/a/div", "xpath"),
	ALLERGENS_INFO(".//*[@id='allergensContainer']/div[1]/div[1]", "xpath"),
	EDIT_ALLERGENS_BTN(".//*[@id='allergensContainer']/div[1]/div[2]/a/div", "xpath"),
	LIST_OF_ALLERGENS_GRID(".//*[@id='allergen_form']/div[3]", "xpath"),
	ALLERGENS_APPLY_CHANGES(".//*[@id='allergen_form']/div[1]/div[2]/a[2]", "xpath"),
	CANCEL(".//*[@id='allergen_form']/div[1]/div[2]/a[1]", "xpath"),
	ALLERGENS_INFO_TEXT(".//*[@id='allergensContainer']/div[3]", "xpath"),
	CODE_XPATH_1(".//*[@id='allergen_form']/div[3]/table/tbody/tr["),
	CODE_XPATH_2("]/td[2]"),
	CHECK_BOX_1(".//*[@id='allergen_form']/div[3]/table/tbody/tr["),
	CHECK_BOX_2("]/td[1]/label/span"),
	DESC_1(".//*[@id='allergen_form']/div[3]/table/tbody/tr["),
	DESC_2("]/td[3]"),
	ALLERGENS_DESC("allergenDesc", "className"),
	
	/* Upload Image / PDF */
	IMAGE_UPLOAD_BTN(".//*[@id='imageInfo']/div[1]/a[1]", "xpath"),
	UPLOAD_PDF_BTN(".//*[@id='imageInfo']/div[1]/a[2]", "xpath"),
	IMAGE_DETAILS_NOTES("//*[@id='listView']/div/div[1]/textarea", "xpath"),
	BASIC_ARTICLE_IMG(".//*[@id='basicArticleImage']", "xpath"),
	UPLOAD_BASIC_ARTICLE_IMG_POPUP_HEADING(".//*[@id='upLoadImages_wnd_title']", "xpath"),
	UPLOAD_CANCEL_BTN(".//*[@id='upLoadImages']/div[3]/a[1]", "xpath"),
	UPLOAD_BTN(".//*[@id='upload']", "xpath"),
	CHOOSE_BTN(".//*[@id='upLoadImages']/div[1]/a", "xpath"),
	EXAMPLE_TEXT(".//*[@id='upLoadImages']/div[2]", "xpath"),
	REMOVE_IMAGE(".//*[@id='slideShow']/div[2]/a", "xpath"),
	REMOVE_IMAGE_POPUP_HEADING(".//*[@id='removeImage_wnd_title']", "xpath"),
	REMOVE_IMG_POPUP_CANCEL_BTN(".//*[@id='removeImage']/div[4]/a[1]", "xpath"),
	REMOVE_IMG_POPUP_OK_BTN(".//*[@id='remove']", "xpath"),
	REMOVE_IMG_POPUP_OK_BTN1("OK", "linkText"),
	UPLOAD_FILE("files-upload", "id"),
	UPLOADED_PDF(".//*[@id='imageInfo']/div[1]/a[3]", "xpath"),
	UPLOADED_PDF_BTN_AT_UNIT(".//*[@id='imageInfo']/div[1]/a", "xpath"),
	REMOVE_PDF(".//*[@id='imageInfo']/div[1]/a[4]", "xpath"),
	REMOVE_PDF_POPUP_HEADING(".//*[@id='removePDF_wnd_title']", "xpath"),
	REMOVE_PDF_POPUP_CANCEL_BTN(".//*[@id='removePDF']/div[2]/a[1]", "xpath"),
	REMOVE_PDF_POPUP_OK_BTN("OK", "linkText"),
	APPLY_CHANGES_LINKTEXT("Apply Changes", "linkText"),
	EDIT_ALLERGENS_BTN2("//*[@id='allergensContainer']/div[3]", "xpath"),
	UPLOADEDPDF_MASTER("//*[@id='imageInfo']/div[1]/a[3]", "xpath"),
	IMAGEUPLOAD_APPLYCHANGEDBTN("//*[@id='upload_form']/..//*[@id='saveContainer']/a", "xpath"),
	CHECKALL_ALLERGENS("//*[@id='allergen_form']/div[3]/table/tbody/tr[1]/th[1]/label/span", "xpath"),
	;
	
	public String element, identifier;
	
	private PurchaseAddBasicArticleEnums(String element){
		 this.element = element;
	 }
	
	private PurchaseAddBasicArticleEnums(String element, String identifier){
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
