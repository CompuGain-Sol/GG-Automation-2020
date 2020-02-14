package com.sacs.PageOjects;

public enum SystemAddCurrencyPageEnum {
	Add_Button("//*[@id='contentHeader']/div[2]/a", "xpath"),
	ADD_CURRENCY_CODE_TITLE_XPATH("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	CODE_SEARCH_XPATH("//*[@id='Code']", "xpath"),
	DESCRIPTION_SEARCH_XPATH("//*[@id='Description']","xpath"),
	CURRENCY_UNIT_XPATH("//*[@id='CurrencyUnit']", "xpath"),
	REPORT_DECIMALS_XPATH("//*[@id='DecimalPlace']", "xpath"),
	BASE_CURRENCY_XPATH("//*[@id='BaseCurrencyCode']", "xpath"),
	CURRENCY_UNIT_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[3]/div[1]/div/span/span", "xpath"),
	REPORT_DECIMALS_VALIDATOR_XPATH("//*[@id='formBody']/div[1]/div[3]/div[2]/div/span/span", "xpath"),
	APPLY_CHANGES_XPATH("//*[@id='saveContainer']/a", "xpath"),
	TOAST_CONTAINER_CLASS_NAME("toast-message", "className"),
	EFFECTIVE_DATE_XPATH("//*[@id='EffectiveStartDate']", "xpath"),
	TO_BASE_RATE_XPATH("//*[@id='ExchangeRateToBaseCurr']", "xpath"),
	FROM_BASE_RATE_XPATH("//*[@id='ExchangeRateFromBaseCurr']", "xpath"),
	EFFECTIVE_DATE_VALIDATOR_XPATH("//*[@id='exchangeContainer']/div[1]/div/span/span","xpath"),
	TO_BASE_RATE_VALIDATOR_XPATH("//*[@id='exchangeContainer']/div[2]/div/span/span", "xpath"),
	FROM_BASE_RATE_VALIDATOR_XPATH("//*[@id='exchangeContainer']/div[3]/div/span/span", "xpath"),
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	ADD_EXCHANGE_RATE_XPATH("//*[@id='addExRate']/a", "xpath"),
	ADD_NEW_EXCHANGE_RATE_XPATH("//*[@id='addExchangeRate']/div[1]","xpath"),
	OK_BUTTON_XPATH("//*[@id='exchangeContainer']/div[5]/a","xpath"),
	//OK_BUTTON_XPATH(".//*[@id='crForm']/div[1]/div[2]/div[5]/a","xpath"),
	
	;
	
	public String element,Identifier;
	private SystemAddCurrencyPageEnum(String element){
		 this.element = element;
	 }
	private SystemAddCurrencyPageEnum(String element, String Identifier){
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
