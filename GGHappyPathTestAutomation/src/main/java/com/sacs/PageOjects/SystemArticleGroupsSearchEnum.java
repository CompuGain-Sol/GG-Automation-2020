package com.sacs.PageOjects;

public enum SystemArticleGroupsSearchEnum {
	
	
	
	ARTICALGROUP_TITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	SYSTEM_MENUITEM_ID("system","id"),
	SYS_ARTICLEGROUP_LINKTEXT(".//*[@id='articlegroup']/a","xpath"), 
	SYS_ADD_ARTICLE_GROUP_BUTTON(".//*[@id='contentHeader']/div[2]/a","xpath"),
	SYS_ADD_ARTICLE_GROUP_CODE_ID("ArticleGroupCode","id"),
	SYS_ADD_ARTICLE_GROUP_DESC_ID("Description","id"),
	SYS_ADD_ARTICLE_GROUP_FINPRODID_ID("FinanceGLAccount","id"),
	SYS_ADD_ARTICLE_GROUP_COSTCENTER_CSS("FinanceGLAccount","id"),
	SYS_ADD_ARTICLE_GROUP_NONMATERIALCOST_XPATH(".//*[@id='formBody']/div[1]/label[1]/span","xpath"),
	SYS_ADD_ARTICLE_GROUP_RESTITUTION_XPATH(".//*[@id='formBody']/div[1]/label[2]/span"),
	SYS_ADD_ARTICLE_GROUP_INFLATIONRATE_ID("InflationRate"),
	SYS_ADD_ARTICLE_GROUP_CCP1BEHAV_ID("CCP1Ind"),
	SYS_ADD_ARTICLE_GROUP_APPLYCHANGESBTN_LINKTEXT(".//*[@id='saveContainer']/a", "xpath"),
	SYS_ADD_ARTICLE_GROUP_PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"), 
	SYS_BACKTOSEARCH_BUTTON("//a[contains(@class,'btnSkin backBtn action-trackChanges')]","xpath"), 
	ARTICLE_SEARCH_FIELD_ID("//input[@id='articlesearch']","xpath"), 
	ARTICLE_SEARCH("//*[@id='articleSearch']", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	ARTICLE_SEARCH_SUBMIT_CLASS("searchSubmit","className"), 
	SEARCH_BASIC_ARTICLE(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	ARTICLE_SEARCH_NO_ITEMS_TO_DISPLAY_XPATH(".//*[@id='results']/table/tbody/tr/td","xpath"), 
	ARTICLE_SEARCH_TOTAL_PAGE_ENTRIES_XPATH(".//*[@id='pager_top']/span","xpath"), 
	ARTICLE_SEARCH_GRID_SELECT_ITEMS_PER_PAGE_XPATH(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[2]","xpath"),
	ARTICLE_SEARCH_GRID_SELECT_ITEMS_PER_PAGE_LIST_CLASS("k-item","className"),
	ARTICLE_SEARCH_GRID_ARTICLE_GROUP_COLUMN_HEADING_XPATH("//*[@id='results']/table/thead/tr/th[2]/a","xpath"),
	ARTICLE_SEARCH_GRID_ARTICLE_GROUP_COLUMN_CLASS("articlegroup","className"), 
	ARTICLE_SEARCH_GRID_FIRST_COLUMN_XPATH(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	ARTICLE_SEARCH_GRID_NEXT_LINK_XPATH("//span[contains(.,'NEXT')]","xpath"), 
	ARTICLE_SEARCH_GRID_SHOWING_ENTRIES_XPATH("//div[contains(@id,'pager_top')]","xpath"), 
	ARTICLE_SEARCH_GRID_PREVIOUS_LINK_XPATH("//span[contains(.,'PREV')]","xpath"), 
	ARTICLE_SEARCH_GRID_LAST_LINK_XPATH("//span[contains(.,'LAST')]","xpath"), 	
	ARTICLE_SEARCH_GRID_FIRST_LINK_XPATH("//span[contains(.,'FIRST')]","xpath"), 
	ARTICLE_SEARCH_GRID_DESCR_FIRST_CELL_XPATH(".//*[@id='results']/table/tbody/tr[1]/td[1]/div","xpath"), 	
	ARTICLE_SEARCH_FILTER_CLASS("searchFilter","className"), 
	ARTICLE_SEARCH_FILTER_ARTICLE_GROUP_XPATH(".//*[@id='searchContainer']/div[2]/div[1]/label/span","xpath"),
	ARTICLE_SEARCH_FILTER_ARTICLE_GROUP_DESC_XPATH("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"), 
	ARTICLE_SEARCH_TOAST_MSG_CLASS("toast-message","className"),
	ARTICLE_SEARCH_EDIT_VENDOR_PAGE_TITLE_XPATH(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	ARTICLE_SEARCH_GRID_PAGINATION_OPTIONS_CLASS("pagContainerTop","className"), 
	TOAST_MESSAGE("toast-message","className"),
	SEARCHFIELD("//*[@id='articleSearch']", "xpath"),
	SEARCHICON2("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	DESCRIPTION("//*[@id='Description']", "xpath"),
	SAVEICON("//*[@id='saveDepartment']/a", "xpath"),
	ARTGROUP_DESC_SEARCHROW("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	;
	
	public String element,Identifier;
	private SystemArticleGroupsSearchEnum(String element){
		 this.element = element;
	 }
	private SystemArticleGroupsSearchEnum(String element, String Identifier){
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
