package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface PurchaseOrderRegistrationPageObjects {

	By ordersbyvendorbutton=By.xpath("//*[@id='searchExistingVendor']//div[contains(@class,'OrderRegBtn2')]");
	By searchallexisitngordersbutton=By.xpath("//*[@id='searchExistingOrder']//div[contains(@class,'reportModuleBlock')]");
	By airlineownedpurchasesbutton=By.xpath("//*[@id='airlineOwnedPurchases']//div[contains(@class,'reportModuleBlock')]");
	By createmultiplepurchaseorderbutton=By.xpath("(//*[@class='reportModuleBlock']/span)[3]/..");
	By createmultiplepurchaseordermenu=By.xpath("//*[@class='reportSubMenu dispNone']");
	By viewpurchaseorderproposal=By.xpath("//a[contains(text(),'View Purchase Order Proposal')]");
	By createoderbutton=By.xpath("//*[@id='addNew']");
	By getarticlesdropdown=By.xpath("//select[@id='PoSource']");
	By okbutton=By.xpath("//*[@id='okButton']");
	By addarticlesearchtextbox=By.xpath("//input[@id='addArticlesearch']");
	By articlename=By.xpath("(//span[@class='articlerow'])[2]");
	By secondarticlename=By.xpath("(//span[@class='articlerow'])[6]");
	By addarticlecheckbox=By.xpath("(//*[@id='addArticles']/table/tbody/tr/td[1]/div/label/span)[1]");
	By addarticlecheckbox2=By.xpath("(//*[@id='addArticles']/table/tbody/tr/td[1]/div/label/span)[2]");
	By addselectedbutton=By.xpath("//*[@class='bigbtnSkin action-addSelected']");
	By selectedrowgrid=By.xpath("(//*[contains(@class,'ui-widget-content slick-row even')])[1]");
	By orderqunatity=By.xpath("//*[contains(@class,'slick-cell l6')]");
	By secondorderqunantity=By.xpath("(//*[@id='myGrid']/div[7]/div/div/div/div[4])[2]");
	By orderqunatitytextbox=By.xpath("//*[contains(@class,'slick-cell l6 r6')]/input");
	By addarticlebutton=By.xpath("//a[contains(text(),'Add Article')]");
	By applychangesbutton=By.xpath("//a[@id='applyChanges']");
	By ordersubmitbutton=By.xpath("//*[contains(@id,'submitOrder')]");
	By continuebutton=By.xpath("//*[contains(@id,'continueButton')]");
	By conformtionokbutton=By.xpath("(//*[@id='poConfirmInfo']//a[contains(text(),'OK')])[2]");
	By ordernumber=By.xpath("//*[@id='OrderNumber']");
	By submittext=By.xpath("//div[@class='articlerow']");
	By navigatebackbutton=By.xpath("//*[@id='subNav-purchase']/span/sup");
	By totalamount=By.xpath("//*[@class='formInput itotal']");
	By proposalfromdatetextbox=By.id("PoProposalFromDate");
	By proposaltodatetextbox=By.id("PoProposalToDate");
	By multipookbutton=By.id("setSelectedListButton");
	By multiporegistrationvendortextbox=By.id("Vendor");
	By vendorsearchbutton=By.xpath("//div[@class='formlabel fl']/../span/a[@class='searchBtn']");
	By vendoridcheckbox=By.xpath("//*[@id='POresults']/table/thead/tr/th[1]/div/label/span");
	By vendorsearchresultscheckbox=By.xpath("//*[@id='POresults']/table/tbody/tr[1]/td[1]/div/label/span");
	By vendorsearchcontinuebutton=By.id("vendorSearchContinue");
	By vendornotextbox=By.xpath("(//*[@class='ui-state-default slick-headerrow']/div/div)[1]/input");
	
}
