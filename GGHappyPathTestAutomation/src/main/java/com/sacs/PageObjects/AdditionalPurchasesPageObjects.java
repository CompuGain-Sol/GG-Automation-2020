package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface AdditionalPurchasesPageObjects {
	By vendorsearchresult=By.xpath("//*[@id='results']/table/tbody/tr/td[1]");
	By createorderbutton=By.id("addNew");
	By currencydropdown=By.id("Currency");
	By okbutton=By.id("okButton");
	By searchaddarticletextbox=By.id("addArticlesearch");
	By addlinebutton=By.xpath("//a[contains(text(),'Add Line')]");
	By addlinerow=By.xpath("//div[@class='ui-widget-content slick-row even']");
	By vendorarticlenumberbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[2]");
	By vendorarticlenumbertextbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[2]/input");
	By descriptionbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[3]");
	By descriptiontextbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[3]/input");
	By puruomdropbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[4]");
	By puruomdropdown=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[4]/select");
	By articlegroupbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[6]");
	By articlegroupdropdown=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[6]/select");
	By orderqtybox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[8]");
	By orderqtytextbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[8]/input");
	By netpricebox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[9]");
	By netpricetextbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[9]/input");
	By costcenterdropbox=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[5]");
	By costcenterdropdown=By.xpath("//*[@id='myGrid']/div[6]/div/div/div/div[5]/select");
	By submitorderbutton=By.xpath("//a[contains(text(),'Submit Order')]");
	By sendemailnotificationtovendorcheckbox=By.xpath("//*[@id='sendEmailWrapper']/label/span");
	By continuebtnsubmitadditionalpurchaseorderpopup=By.id("continueButton");
	By okbuttonadditionalpurchasesordersubmit=By.xpath("//*[@id='poConfirmInfo']/div/a[3]");
	By deliverynotenumbertextbox=By.id("DeliveryNoteNumber");
	By receiveddatetext=By.xpath("//input[@id='ReceivedDate']");
	By receiveorderbutton=By.xpath("//*[@id='orderReceiptSubmitted']/a");
	By yesbuttonregisterorder=By.id("receivePO");
	By navigatebackbutton=By.xpath("//*[@id='subNav-purchase']/span/sup");
	By ordernumber=By.xpath("(//*[@id='OrderNumber'])[1]");
}

