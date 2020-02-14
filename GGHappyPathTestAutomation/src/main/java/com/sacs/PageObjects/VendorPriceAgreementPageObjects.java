package com.sacs.PageObjects;

import org.openqa.selenium.By;

public interface VendorPriceAgreementPageObjects {
	By searchtextbox=By.xpath("//input[@id='articlesearch']");
	By addagreementbutton=By.xpath("//a[contains(text(),'Add Agreement')]/..");
	By vendorsearchtextbox=By.xpath("//input[@id='articlesearch']");
	By vendorsearchgrid=By.xpath("//td[@class='articlenumber']");
	By descriptiontextbox=By.id("Description");
	By vendornametitle=By.xpath("//div[@class='itemHeader']");
	By validperioddatetextbox=By.xpath("//*[@id='StartDate']");
	By todatetextbox=By.xpath("//*[@id='EndDate']");
	By okbutton=By.xpath("//*[@id='btn-ok']");
	By addnewpriceagreementdropdown=By.xpath("//select[@id='ReadArticles']");	
	By pricetextbox=By.xpath("//*[@class='slick-cell l5 r5 editableCell numberCell active editable']/input");
}