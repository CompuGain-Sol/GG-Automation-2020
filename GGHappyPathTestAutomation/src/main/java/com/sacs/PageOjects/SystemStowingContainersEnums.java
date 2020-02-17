package com.sacs.PageOjects;

public enum SystemStowingContainersEnums {
	
	SYSTEM("system","id"),
	STOWINGCONTAINERS("stowagecontainer","id"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_STOWING_BUTTON(".//*[@id='contentHeader']/div[2]/a","xpath"),
	//SEARCH_BAR(".//*[@id='articlesearch']"),
	SEARCH_GRID_FIRST_COL_HEADING(".//*[@id='results']/table/thead/tr/th[1]/a","xpath"),
	ITEM_DROPDOWN(".//*[@id='gridWrapper']/div[1]/div[2]/span/span[1]/span[1]","xpath"),
	NEXT_PEGINATION(".//*[@id='pager_top']/div/a[3]/span","xpath"),
	REMOVE_BUTTON("X","linkText"),
	SAVE_ICON("S","linkText"),
	APPLY_CHANGE_BUTTON(".//*[@id='saveContainer']/a","xpath"),
	//APPLY_CHANGE_BUTTON("saveContainer","id"),
	//FIRST_ROW_FIRST_COL("//*[@id='results']/table/tbody/tr[1]/td[1]"),
	SEARCH_RESULT(".//*[@id='results']/table/tbody/tr/td[1]","xpath"),
	SECOND_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr[2]/td[1]","xpath"),
	ITEM_HEADER(".//*[@id='toolsContainer']/div[1]/div","xpath"),
	DESCRIPTION("Description","id"),
	CODECONTAINER("ContainerCode","id"),
	//SEARCHFILTER("searchFilter"),
	SEARCHCRITERIA(".//*[@id='searchContainer']/div[2]","xpath"),
	CODE_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span","xpath"),
	CAPACITY_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	SEAL_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[3]/span","xpath"),
	DESCRIPTION_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[1]/span","xpath"),
	WEIGHT_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[2]/span","xpath"),
	TOASTMSG("toast-message","className"),
	//SEARCHSUBMITE("searchSubmit"),
	SEARCHRESULT(".//*[@id='results']/table/tbody/tr/td","xpath"),
	//NO_OF_ROWS("aticlegroup","className"),
	NO_OF_ROWS("//tr[contains(@class,'articlerow')]","xpath"),
	NO_OF_ROWS_2("//tr[contains(@class,'k-alt')]","xpath"),
	FIRST_ROW_SECOND_COL(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	RESULT_SECOND_COLUMN(".//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	RESULT_THIRD_COL(".//*[@id='results']/table/tbody/tr/td[3]","xpath"),
	CONTAINER_CAPACITY("ContainerCapacity","id"),
	DEFAULTWEIGHT("DefaultWeight","id"),
	NO_OF_SEALS("NumberOfSeals","id"),
	LAST_UPDATED("lastUpdatedContainer","id"),
	CONTINUE(".//*[@id='confirmChangesAlert']/div[2]/a[1]","xpath"),
	REMOVE_CONTINUE("//*[@id='loadingModal']/div[2]/a[1]","xpath"),
	REMOVE_CANCEL(".//*[@id='loadingModal']/div[2]/a[2]","xpath"),
	CODE_HEADING("//*[@id='toolsContainer']/div[1]/div","xpath"),
	CONFIRMATION_POPUP_XPATH("//*[@id='removeMSAlert']","xpath"),
	;
	public String element, identifier;
	
	private SystemStowingContainersEnums(String element, String identifier){
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
