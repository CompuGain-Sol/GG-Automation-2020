package com.sacs.PageOjects;

public enum LoginPageEnum {
	
	 USERNAME("UserName"), 
	 PASSWORD("Password"), 
	 LOGINSUBMIT("/html/body/center/div/div/div/form/div[2]/fieldset/div[2]/div[5]/div/input"),
//	 LOGINSUBMIT("//input[@value='Login']"),
//	 LOGINSUBMIT_CSS("css=input.btnSkin.loginbtnSkin"),
	 LOGOUT("//*[@id='userSettings']/div[3]/a"),
	 LOGOUTSETTING("action-userSettings"),
	//LOGOUT_SETTING("//*[@id='mainNav']/div[1]/div[3]/span/a", "xpath"),
	 LOGINERRORMSG("validation-summary-errors"),
	 USERNAMECLASS("userName"),
	 DISPLAYUSERNAMEXPATH("//div[@class='userName']"),
	 //WORKINGUNIT_DROPDOWN("//span[contains(.,'select')]", "xpath"),
	 WORKINGUNIT_DROPDOWN("//select[@id='WorkingUnit']"),
	 LANDINGPAGE_TITLE("//div[@class='landingTitle fl']"),
	 USERNAME_ADFS("//*[@id='userNameInput']"),
	 PASSWORD_ADFS(".//*[@id='passwordInput']"),
	 LOGINSUBMIT_ADFS("//*[@id='submitButton']"),
	 LOGOUT2("Sign Out"),
	 LOGOUT_SETTING2("//*[@id='mainNav']/div[1]/div[3]/span/a"),
	 USERNAME_QAGEN("//*[@id='UserName']"),
	 PASSWORD_QAGEN("//*[@id='Password']"),
	 LOGOUTSUBMIT_QAGEN("//*[@id='contentBody']/div/form/div/fieldset/div[2]/div[5]/div/input"),
	// LOGOUTSETTING_2("//*[@class='settingsOpen']/span/a", "xpath"),
	;
	public String element;
	private LoginPageEnum(String element){
		 this.element = element;
	 }
	public String getElementPath(){
		return element;
	}
	 
}
