package com.sacs.utils;


public enum PageTitlesEnum {
	
	CREATED_SUCCESSFULL("Created Successfully"),
	/** Vendor Incidents **/
    VENDOR_INCIDENTS_TITLE("Vendor Incidents"),
    CREATE_VENDOR_INCIDENT_TITLE("Create Vendor Incident"),
    BASIC_ARTICLES_TITLE("Basic Articles"),
    ADD_BASIC_ARTICLE_TITLE("Add Basic Article"),
    COPY_BASIC_ARTICLE_TITLE("Copy Basic Article"),
    COPY_NEW_ARTICLE_TITLE("Copy New Article"),
    REMOVE_BASIC_ARTICLE_TITLE("Confirm article removal"), 
    UPDATE_BASIC_ARTICLE_TITLE("Update Basic Article"),
    
    /** Distribution Codes **/
    
    DISTRIBUTION_CODES_TITLE("Distribution Codes"),
    APPLY_CHANGES_ICON("Apply Changes"),
    
    
    /** Distribution Codes **/
    BOX_CODES("Box Codes"),
    BACK_TO_SEARCH("Back To Search"),
    
    ALLERGENS_INFO_TEXT("There is currently no allergen information attached to this basic article. Use the edit button above to attach allergen information."),  
	
    
    LOADING_SETUP("Loading Setup Title"),
    CSP("Catering Stowage Plans Title"),
    
    ROTATION_PLANS("Rotation Plans Title"),
    FLIGHTTIMETABLE("Flight Timetable"),
    ;
	
	
	public String pageTitle;
	private PageTitlesEnum(String pageTitle){
		 this.pageTitle = pageTitle;
	 }
	
	public String getPageTitle(){
		return pageTitle;
	}
	
}