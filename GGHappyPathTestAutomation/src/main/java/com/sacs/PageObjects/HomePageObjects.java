package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface HomePageObjects {
	
 By materialmangementlinktext=By.xpath("//div[@class='icon-purchase leftAlign']/../p[contains(text(),'Material Management')]");
 By vendorslinktext=By.xpath("//li[@id='vendor']");
 By basicarticlelinktext=By.xpath("//li[@id='basicarticle']");
 By workingunitdropdown=By.xpath("//select[@id='WorkingUnit']");
 By purchaseorderregidtrationlinktext=By.xpath("//*[contains(@id,'purchaseorder')]//*[contains(text(),'Purchase Order Registration')]");
 By vendorpriceagreementbutton=By.xpath("//*[@id='vendorpriceagreement']");
 By homelinktext=By.xpath("//li[@id='Home']/a/p");
 By storeslinktext=By.xpath("//p[contains(text(),'Stores')]");
 By purchaseorderreciept=By.xpath("//*[@id='orderreceipt']/a");
 By financelinktext=By.xpath("//p[contains(text(),'Finance')]");
 By vendorinvoiceentrylinktext=By.xpath("//a[contains(text(),'Vendor Invoice Entry')]");
 //Now the update standard price is modified to standard price in UI
 By updatestandardpricelinktext=By.xpath("//li[@id='updatestandardprice']");
 By additionalpurchaseslinktext=By.xpath("//a[contains(text(),'Additional Purchases')]");
 By returntovendorlinktext=By.xpath("//a[contains(text(),'Return To Vendor')]");
 
}
