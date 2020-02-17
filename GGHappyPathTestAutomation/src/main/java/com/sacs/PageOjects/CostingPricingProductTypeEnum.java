package com.sacs.PageOjects;

public enum CostingPricingProductTypeEnum {

COSTINGPRICING("//*[@id='costingpricing']","xpath"),
PRODUCTTYPE("//*[@id='producttype']/a", "xpath"),
PRODUCTTYPETITLE("//*[@id='contentHeader']/div[1]/h1", "xpath"),
ADDPRODUCTTYPE("//*[@id='addNew']", "xpath"),
PRODUCTTYPEFIELD("//*[@id='Code']", "xpath"),
PRODUCTTYPEDESCRIPTION("//*[@id='Description']", "xpath"),
PRODUCTTYPEAPPLYCHANGES("//*[@id='saveContainer']/a", "xpath"),
PTBACTOSEARCH(".//*[@id='backToSearch']", "xpath"),
APPLYCHANGESPOPUPCONTINUE("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
PRODUCTTYPEFIRSTROW(".//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
DELPRODUCTTYPE("//*[@id='removeProductType']/a", "xpath"),
DELETEPOPUPOK("OK", "linkText"),
NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
SEARCH_BAR("//*[@id='articlesearch']","xpath"),
GRID_FIRST_ROW("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
GRID_FIRST_ROW_DESC("//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
ITEMPERPAGE("//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
PAGENATION("pagContainerTop","className"),
MENU("last","className"),
MENU_ITEM("//*[@id='nav']/li[1]//ul[@class='subMenu']/li/a","xpath"),
CONTINUE("Continue","linkText"),
DELETE_ICON("X","linkText"),
POPUP_TEXT("//*[@id='loadingModal']/div[1]/div","xpath"),
OK("OK","linkText"),
CANCEL("Cancel","linkText"),
WHERE_USED_POPUP("//*[@id='whereUsedPopup_wnd_title']","xpath"),
EXPORT(".//*[@id='exportProductTypeBtn']","xpath"),
POPUP_GRID("//table[@class='k-selectable']","xpath"),
PRODUCTTYPE_DROPDOWN("//*[@id='ProductType']","xpath"),
REPLACE_POPUP_TEXT("//*[@id='lblReplaceMsg']","xpath"),
REPLACE_POPUP_TITLE("//*[@id='productTypeReplacePopup_wnd_title']","xpath"),
MEALSERVICECHKBOX("//*[@id='cb0']", "xpath"),
	;
	public String element,Identifier;
	private CostingPricingProductTypeEnum(String element){
		 this.element = element;
	 }
	private CostingPricingProductTypeEnum(String element, String Identifier){
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
