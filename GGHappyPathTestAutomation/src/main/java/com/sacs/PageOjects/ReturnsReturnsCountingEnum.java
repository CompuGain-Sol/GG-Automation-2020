package com.sacs.PageOjects;

public enum ReturnsReturnsCountingEnum {

	 RETURNS("returns","id"),
	 RETURNS_COUNTING("//*[@id='returnscounting']/a","xpath"),
	 PAGE_TITLE("//*[@id='contentHeader']/div/h1","xpath"),
	 EDIT_CHECK_OUT("//*[@id='editCheckout']","xpath"),
	 EDIT_FLIGHT_DETAILS("//*[@id='resultsCounting']/div[6]/div/div/div[1]/div[12]//span/a","xpath"),
	 RETURN_QTY("//*[@id='resultsDetails']/div[6]/div/div/div[1]/div[7]","xpath"),
	 RETURN_QTY_INPUT("//*[@id='resultsDetails']/div[6]/div/div/div[1]/div[7]/input","xpath"),
	 RETURNS_COUNTING_BUTTON("//*[@id='rCountButtonbm']","xpath"),
	 RETURNS_COUNT_POPUP("//*[@id='flightCheckOutWrapper']","xpath"),
	 STOCK_DATE_ON_RETURNS_COUNT_POPUP("//*[@id='coStockDate']","xpath"),
	 CONTINUE_ON_RETURNS_COUNT_POPUP("//*[@id='continueCOPopup']","xpath"),
	 STATUS("//*[@id='rCountHeaderWrapper']/div[4]/div[3]/div[4]/span[2]","xpath"),
	 SEARCHBOX("//*[@id='articlesearch']", "xpath"),
	 GRID("//*[@id='results']/table", "xpath"),
	 SEARCH_ICON("//*[@id='gridWrapper']/div[1]/div/span[2]/a/img", "xpath"),
	 NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	 DATE_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	 DATE_SEARCHROW("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	 EDIT_ICON_FIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[6]/a", "xpath"),
	 CHANGEDATE("//*[@id='contentHeader']/div[2]/span[2]/a", "xpath"),
	 EDITICON_CHANGEDDATEPAGE("//*[@id='resultsCounting']/div[6]/div/div/div/div[13]/span/a", "xpath"),
	 RETURNCOUNT_BTN("//*[@id='rCountButton']", "xpath"),
	 RETURNCOUNT_POPUP_CONTINUEBTN("//*[@id='continueCOPopup']", "xpath"),
	 RETURNCOUNT_POPUP_CANCELBTN("//*[@id='cancelCOPopup']", "xpath"),
	 RETURNCOUNTED_POPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	 RET_QTY_CLICK("//*[@id='resultsDetails']/div[6]/div/div/div[2]/div[8]", "xpath"),
	 RET_QTY_INPUT("//*[@id='resultsDetails']/div[6]/div/div/div[2]/div[8]/input", "xpath"),
	 ADD("//*[@id='addLineContainer']/ul/li[1]/div", "xpath"),
	 SALESNO_TEXTFIELD("//*[@id='SalesNumber']", "xpath"),
	 ADD_SALESNUMBER("//*[@id='addSalesButton']", "xpath"),
	 SALESNO_SEARCHICON("//*[@id='addLineSubContainer']/div[1]/span[2]/a/img", "xpath"),
	 SEARCH_SALENO_FIRSTROW("//*[@id='addSalesNumberGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	 CLASSCODE_DD("//*[@id='ClassCode']", "xpath"),
	 SALESNO_ADDBTN("//*[@id='addButton']", "xpath"),
	 RC_GRID_FIRSTROW("//*[@id='resultsDetails']/div[6]/div/div/div[1]/div[1]", "xpath"),
	 ADDARTICLE("//*[@id='addArticleButton']", "xpath"),
	 BASICARTICLE_TEXTBOX("//*[@id='addLineSubContainer']/div[3]/span[2]/input", "xpath"),
	 ARTICLESECTION_CANCELBTN("//*[@id='addLineWrapper']/div[3]/a[2]", "xpath"),
	 BA_SEARCHICON("//*[@id='addLineSubContainer']/div[3]/span[2]/a/img", "xpath"),
	 SEARCH_BA_FIRSTROW("//*[@id='addBasicArticlesGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	 RC_GRID_BAFIRSTROW("//*[@id='resultsDetails']/div[6]/div/div/div[1]/div[2]", "xpath"),
	 CHANGEDDATE_2("//*[@id='contentHeader']/div[2]/span[5]/a", "xpath"),
	 VIEWCORRECTSTOCKDATES("//*[@id='viewCorrectStockDates']", "xpath"),
	 MENU("//*[@id='rCountingWrapper']/div/div[2]/ul/li[1]/div", "xpath"),
	 TITLE_2("//*[@id='contentHeader']/div[1]/h1", "xpath"),
	 RETURNCOUNT_POPUPTITLE("//*[@id='flightCheckOutWrapper_wnd_title']", "xpath"),
	 CHANGEDATE_BTN("//*[@id='changeDate']", "xpath"),
	 ;
	 public String element, identifier;
		
		private ReturnsReturnsCountingEnum(String element){
			 this.element = element;
		 }
		
		private ReturnsReturnsCountingEnum(String element, String identifier){
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
