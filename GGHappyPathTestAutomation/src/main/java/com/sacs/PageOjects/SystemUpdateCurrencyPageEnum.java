package com.sacs.PageOjects;

public enum SystemUpdateCurrencyPageEnum {
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	UPDATE_CURRENCY_CODE_XPATH("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	
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
	ADD_EXCHANGE_RATE_XPATH("//*[@id='addExRate']/a", "xpath"),
	ADD_NEW_EXCHANGE_RATE_XPATH("//*[@id='addExchangeRate']/div[1]","xpath"),
	OK_BUTTON_XPATH("//*[@id='exchangeContainer']/div[5]/a","xpath"),
	BACK_TO_SEARCH_XPATH("//*[@id='contentHeader']/div[3]/a", "xpath"),
	CONFIRMATION_ALERT_XPATH("//*[@id='confirmChangesAlert']", "xpath"),
	CONFIRMATION_ALERT_CONTINUE_XPATH("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	SEARCH_BOX_XPATH("//*[@id='articlesearch']", "xpath"),
	SEARCH_BUTTON_XPATH("//*[@id='searchContainer']/div[2]/span[2]/a/img","xpath"),
	SEARCH_RESULT_GRID_FIRST_COLUMN_XPATH_1("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	;
	
	
	public String element,Identifier;
	private SystemUpdateCurrencyPageEnum(String element){
		 this.element = element;
	 }
	private SystemUpdateCurrencyPageEnum(String element, String Identifier){
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
