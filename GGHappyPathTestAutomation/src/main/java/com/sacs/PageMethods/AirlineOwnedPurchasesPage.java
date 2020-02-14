package com.sacs.PageMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.AirlineOwnedPurchasesPageobjects;
import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class AirlineOwnedPurchasesPage extends WebElements{
	private static Logger logger = Logger.getLogger(AirlineOwnedPurchasesPage.class);
	 private static PurchaseOrderRegistrationPage purchaseOrderRegistrationPage=null;
	 private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;
	

	public AirlineOwnedPurchasesPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	
	public String verify_AirLineOwnedPurchasesPOSubmittedText() {
		return getText(AirlineOwnedPurchasesPageobjects.airlineownedpurchaseposubmittedtext);
	}
	
}
