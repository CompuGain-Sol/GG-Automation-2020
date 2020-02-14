package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface BasicArticlesPageObjects {
	By addarticlebutton=By.xpath("//a[contains(text(),'Add Article')]/..");
	By localdescriptiontextbox=By.xpath("//input[@id='PrimaryDesc']");
	By articlegrouptextbox=By.xpath("//input[@id='ArticleGroupCode']");
	By dropdownvalue=By.xpath("(//*[contains(@class,'ui-autocomplete')])[2]");
	By articlegrouplist=By.xpath("html/body/ul[1]");
	By financearticlegrouptextbox=By.xpath("//input[@id='ArticleFinanceGroupNumber']");
	By financearticlegrouplist=By.xpath("html/body/ul[2]");
	By daypricetextbox=By.xpath("//input[@id='DayPrice']");
	By addnewvendorbutton=By.xpath("//div[@class='addVendContainer']/a");
	By vendornametextbox=By.xpath("//input[@id='VendorName_0']");
	By vendornamemenuitemslist=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[13]/li[1]");
	//By applychangesbutton=By.xpath("//div[@id='subStoreContainer']/..//div[@id='saveContainer']/a");
	By applychangesbutton=By.xpath("//*[contains(@class,'applyAction largebtnSkin icon-Save')]");
	By Editbutton=By.xpath("//*[contains(@id,'saveContainer')]//*[contains(@id,'EditButton')]");

	By purchasestoreuom=By.xpath("//*[@name='PurchaseUOM']");
	By storeuomlist=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[3]");
	By purchasestoreuom2=By.xpath("//*[@name='StoreUOM']");
	By storeuom2list=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[4]");
	By menuuomtextbox=By.xpath("//*[@id='MenuUOM']");
	By menulist=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[5]");
	By settingsbuttoninsearch=By.xpath("(//td[@class='settings'])[1]");
	By searchfirstgrid=By.xpath("//*[@id='results']/table/tbody/tr[1]/td[2]");
	By addsubstorebutton=By.xpath("//*[contains(@class,'addContainer')]/a");
	By substorecodetextbox=By.xpath("//input[@id='StoreCode_0']");
	By substorecodedropdown=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[14]/li/a");
	By substorepositiontextbox=By.id("storePosition_0");
	By updatebasicarticletitle=By.xpath("//*[@id='contentHeader']/div[1]/h1");
	By activecheckbox=By.xpath("//*[contains(@name,'IsActive')]/../span");
	By backtosearchbutton=By.xpath("//*[@id='backToSearch']");
	By nomiatedcheckbox=By.xpath("//*[contains(@name,'NominatedArticleInd')]/../span");
	By customerradiobutton=By.xpath("//label[@for='CustomerNominated']//span[@class='radiolabel']");
	By gatetraderadiobutton=By.xpath("//label[@for='GGNominated']//span[@class='radiolabel']");
	By airlineradiobutton=By.xpath("//*[@id='Airlined']/../span");
	By airticlenumbertextbox=By.id("ArticleNumber");
	By zonetextbox=By.id("Zone");
	By showentriesdropdown=By.xpath("//*[@class='k-input']");
	By showentriesdropdown100=By.xpath("(//li[contains(text(),'100')])[2]");
	By seemoreoptionsbuttonlist=By.xpath("//*[@class='articleOptions action-options tooltip']");
	By removearticlefirstbutton=By.xpath("(//*[@class='tooltip action-Remove'])[1]");
	By removearticleconformokbutton=By.xpath("//*[@id='removeAlert']/div[3]/a[1]");
} 
