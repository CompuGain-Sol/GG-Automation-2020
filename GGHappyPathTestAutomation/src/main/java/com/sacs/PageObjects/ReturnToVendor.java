package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface ReturnToVendor {

	By tovendortextbox=By.id("ToVendor");
	By stockdatetextbox=By.id("StockDate");
	By remarks=By.id("Remarks");
	By vendordropdownmenu=By.xpath("//html/body/ul/li/a");
	By returnqtybox=By.xpath("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[4]");
	By returnqtytextbox=By.xpath("//*[@id='returnToVendorGrid']/div[7]/div/div/div/div[4]/input");
	By issuereturnbutton=By.xpath("//*[@id='saveContainer']/a[contains(text(),'Issue Return')]");
	By continuebuttonsubmitreturnorderpopup=By.id("submitReturnOrder");
	By okbuttonsubmittedreturnorderpopup=By.id("okReturnOrder");
	By cancelbuttonforaddvendorincidentpopup=By.id("noRecVendInfo");
	By navigatebackbutton=By.xpath("//*[@id='subNav-store']/span/sup");
	By addarticlebutton=By.xpath("//*[contains(text(),'Add Article')]/../a");
}
