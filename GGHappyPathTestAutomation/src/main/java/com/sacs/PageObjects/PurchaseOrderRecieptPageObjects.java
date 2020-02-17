package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface PurchaseOrderRecieptPageObjects {
	By searchorderbyvendorbutton=By.xpath("//li[contains(text(),'Search orders by vendor')]");
	By receivewithoutPObutton=By.xpath("//a[contains(text(),'Receive Without PO')]");
	By stockdatepicker=By.xpath("//input[@id='StockDate']");
	By delivernotenumbertextbox=By.xpath("(//*[contains(@name,'DeliveryNoteNumber')])[1]");
	By okbutton=By.xpath("//*[contains(@id,'receiptbtnContainer')]/a");
	By customerreferencenumber=By.xpath("//*[@id='CustomsRefNumber']");
	By submitrecieptbutton=By.xpath("//*[contains(text(),'Submit Receipt')]");
	By expirydateeditbutton=By.xpath("(//*[contains(@class,'slick-cell l7')])");
	By expirydateeditbuttonsecondarticle=By.xpath("(//*[@id='myGrid']/div[7]/div/div/div/div[5])[2]");
	By continuebutton=By.xpath("//a[@id='continuepoLotPopup']");
	By expirydate=By.xpath("(//*[@id='PoLotResults']/div[6]/div/div/div/div[4])[1]");
	By expirydatetextbox=By.xpath("(//*[@id='PoLotResults']/div[6]/div/div/div/div[4])[2]/span/span/input");
	By orderqtyrecieved=By.xpath("//*[@id='PoLotResults']/div[6]/div/div/div/div[2]");
	By orderqtnrecievedtextbox=By.xpath("//*[@id='PoLotResults']/div[6]/div/div/div/div[2]/input");
	By popcontinuebutton=By.xpath("//div[@id='submitOrderContainer']//*[contains(text(),'Continue')]");
	By ordersubmittedcontinue=By.xpath("//div[@id='poConfirmInfo']/div/a[contains(text(),'Continue')]");
	By recordincidentcancelbutton=By.xpath("//a[@id='noRecVendInfo']");
	By polabelprintbutton=By.id("PoLabelArticleReportOK");
	By closeordercancelbutton=By.xpath("//*[@id='closeOrder']");
	By status=By.xpath("(//*[@id='results']/table/tbody/tr/td[8])[1]");
	By status2=By.xpath("(//*[@id='results']/table/tbody/tr/td[8])[2]");
	By navigatebackbutton=By.xpath("//*[@id='subNav-store']/span/sup");
	By receiveqtybox=By.xpath("(//*[@id='myGrid']/div[7]/div/div/div/div[4])[1]");
	By receiveqtyboxsecondarticle=By.xpath("//*[@id='myGrid']/div[7]/div/div/div[2]/div[4]");
	By receiveqtytextbox=By.xpath("//*[@id='myGrid']/div[7]/div/div/div/div[4]/input");
	//By receiveqtytextbox2=By.xpath("//*[@id='PoLotResults']/div[6]/div/div/div/div[2]/input");
	By applychangesbutton=By.xpath("//a[@title='Apply Changes']/div");
	By createneworderbutton=By.xpath("//a[contains(text(),'Create New Order')]");
	By articlenumbercheckbox=By.xpath("//*[@id='checkBoxAll']");
	By createordercontinuebutton=By.id("savePartialOrder");
	By incidentlist=By.xpath("html/body/ul[1]");
	By incidenttypetextbox=By.id("IncidentType");
	By descriptiontextbox=By.id("Description");
	By addincidentbutton=By.id("action-addIncident");
	By closebuttoncreateorderpopup=By.id("closePartial");
	By searchresultsecondone=By.xpath("//*[@id='results']/table/tbody/tr[2]/td[1]");
	By orderid=By.xpath("//*[@id='results']/table/tbody/tr[1]/td[1]");
	By orderid2=By.xpath("//*[@id='results']/table/tbody/tr[2]/td[1]");
	By partialponumberpolabelprintqtypopup=By.xpath("(//*[@class='ui-widget-content slick-row even'])[2]/div[1]");
}
