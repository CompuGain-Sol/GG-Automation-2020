package com.sacs.PageOjects;

public enum UnitLevelConnectWorkCenterToDepartmentEnum {
	
	RESULT_GRID_FIRST_ROW(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	PAGETITLE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	ADD_WORKCENTER_BUTTON(".//*[@id='addWorkCenter']","xpath"),
	DESCRIPTION_THIRD_TEXTBOX(".//*[@id='workCenterDiv_2']/div[2]/input","xpath"),
	SEARCH_RESULT_ROW("//*[@id='results']/table/tbody/tr/td[2]","xpath"),
	DESCRIPTION_FIRST_TEXTBOX("//*[@id='workCenterDiv_0']/div[2]/input","xpath"),
	DONE_BUTTON_FIRST("//*[@id='workCenterDiv_0']/div[6]/a","xpath"),
	EDIT_WORKCENTER_BUTTON(".//*[@id='editWorkCenter']","xpath"),
	REMOVE_WORKCENTER_BUTTON(".//*[@id='removeWorkCenter']","xpath"),
	DESCRIPTION_DISABLED(".//*[@id='workCenterDiv_0']/div[2]/span","xpath"),
	BACK_TO_SEARCH_BUTTON(".//*[@id='contentHeader']/div[2]/a","xpath"),
	TOAST_MSG_CANCEL_BTN(".//*[@id='toast-container']/div/button","xpath"),
	NPT_CHECKBOX(".//*[@id='workCenterDiv_0']/div[4]/label/span","xpath"),
	DESCRIPTION_BOX(".//*[@id='workCenterDiv_0']/div[2]","xpath"),
	;
	public String element,Identifier;
	private UnitLevelConnectWorkCenterToDepartmentEnum(String element){
		 this.element = element;
	 }
	private UnitLevelConnectWorkCenterToDepartmentEnum(String element, String Identifier){
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
