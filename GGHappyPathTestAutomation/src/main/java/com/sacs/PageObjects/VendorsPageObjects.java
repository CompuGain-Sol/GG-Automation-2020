package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface VendorsPageObjects {
By addvendorbutton=By.xpath("//*[contains(text(),'Add Vendor')]/../a");
By vendornametextbox=By.xpath("//input[@id='Name']");
By currencycodedropdown=By.xpath("//span[@class='formDropDown']//*[@id='CurrencyCode']");
By applychangesbutton=By.xpath("//*[@id='applyChanges']");
By toastmessage=By.xpath("//*[@class='toast-message']");
By secondarynametextbox=By.xpath("//input[@id='SecondaryName']");
By sapvendornumbertextbox=By.xpath("//input[@id='FinanceVendorId']");
By grbasedinvoiceentrycheckbox=By.xpath("//span//label[@for='GRBasedInvEntry']");
By saptransfercheckbox=By.xpath("//label[@for='SAPTransfer']//span/label");
By taxnumber2textbox=By.id("TaxNumber2");
By electronicinterfacesupportedcheckbox=By.xpath("//*[@id='IsElectronicInterfaceSupported']/../span");
By navgateback=By.xpath("//*[@id='subNav-purchase']/span/sup");
By VendorAccountGroupdropdown=By.xpath("//*[contains(@name,'VendorAccountGroup')]");

}
