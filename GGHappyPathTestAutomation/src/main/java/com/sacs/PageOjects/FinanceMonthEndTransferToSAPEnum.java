package com.sacs.PageOjects;

public enum FinanceMonthEndTransferToSAPEnum {
	FINANCE("//*[@id='finance']", "xpath"),
	MONTH_END_TRANSFER("//*[@id='monthendtransfers']/a","xpath"),
	MONTH_END_TRANSFER_TITLE("//*[@id='contentHeader']/div/h1","xpath"),
	FILE_TYPE("//*[@id='FileType']","xpath"),
	OK("//*[@id='ok']","xpath"),
	ORDERRECEIVEDFROM("//*[@id='OrdersReceiptFromDate']", "xpath"),
	ORDERRECEIVEDTO("//*[@id='OrdersReceiptToDate']", "xpath"),
	INVENTORYDATE("//*[@id='InventoryDate']", "xpath"),
	SELECTPRICES("//*[@id='PriceType']", "xpath"),
	WASTECOLLECTEDFROM("//*[@id='WastageCollectedFrom']", "xpath"),
	WASTECOLLECTEDTO("//*[@id='WastageCollectedTo']", "xpath"),
	PERIODFROM("//*[@id='ArPreriodFrom']", "xpath"),
	PERIODTO("//*[@id='ArPreriodTo']", "xpath"),
	;
	
	
	public String element,Identifier;
	private FinanceMonthEndTransferToSAPEnum(String element){
		 this.element = element;
	 }
	private FinanceMonthEndTransferToSAPEnum(String element, String Identifier){
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
