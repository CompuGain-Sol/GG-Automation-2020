package com.sacs.funUtils;

import org.openqa.selenium.WebDriver;

import com.sacs.PageMethods.AdditionalPurchasesPage;
import com.sacs.PageMethods.AirlineOwnedPurchasesPage;
import com.sacs.PageMethods.BasicArticlesPage;
import com.sacs.PageMethods.HomePage;
import com.sacs.PageMethods.LoginPage;
import com.sacs.PageMethods.PurchaseOrderRecieptPage;
import com.sacs.PageMethods.PurchaseOrderRegistrationPage;
import com.sacs.PageMethods.ReturnToVendorPage;
import com.sacs.PageMethods.VendorInvoiceEntryPage;
import com.sacs.PageMethods.VendorPriceAgreementPage;
import com.sacs.PageMethods.VendorsPage;
import com.sacs.Reportinglib.CustomReport;

public class BasePage {
 private LoginPage loginpage;
 private HomePage homepage;
 private CustomReport customReport;
 private BasePage basePage;
 private WebDriver driver;
 private VendorsPage vendorspage;
 private BasicArticlesPage basicArticlesPage;
 private VendorPriceAgreementPage vendorPriceAgreementPage;
 private PurchaseOrderRegistrationPage purchaseOrderRegistrationPage;
 private PurchaseOrderRecieptPage purchaseOrderRecieptPage;
 private VendorInvoiceEntryPage  vendorInvoiceEntryPage;
 private AirlineOwnedPurchasesPage airlineOwnedPurchasesPage;
 private AdditionalPurchasesPage additionalPurchasesPage;
 private ReturnToVendorPage returnToVendorPage;
 
 public BasePage()
	{
		//logger.info("Creation of Constructer of basepage");
	}
	
	public BasePage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		this.driver=driver;
		this.customReport=customReport;
		this.basePage=basePage;
	}
	
	public LoginPage loginpage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(loginpage==null){
			loginpage = new LoginPage(driver,  customReport,basePage);
		}
		return loginpage;
	}
	
	public HomePage homepage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(homepage==null){
			homepage = new HomePage(driver,  customReport,basePage);
		}
		return homepage;
	}
	
	public VendorsPage vendorspage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(vendorspage==null){
			vendorspage = new VendorsPage(driver,  customReport,basePage);
		}
		return vendorspage;
	}
	
	public BasicArticlesPage basicArticlesPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		
		if(basicArticlesPage==null){
			basicArticlesPage = new BasicArticlesPage(driver,  customReport,basePage);
		}
		return basicArticlesPage;
	}
	
	public VendorPriceAgreementPage vendorPriceAgreementPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(vendorPriceAgreementPage==null){
			vendorPriceAgreementPage = new VendorPriceAgreementPage(driver,  customReport,basePage);
		}
		return vendorPriceAgreementPage;
	}
	
	public PurchaseOrderRegistrationPage purchaseOrderRegistrationPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(purchaseOrderRegistrationPage==null){
			purchaseOrderRegistrationPage = new PurchaseOrderRegistrationPage(driver,  customReport,basePage);
		}
		return purchaseOrderRegistrationPage;
	}
	
	public PurchaseOrderRecieptPage purchaseOrderRecieptPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(purchaseOrderRecieptPage==null){
			purchaseOrderRecieptPage = new PurchaseOrderRecieptPage(driver,  customReport,basePage);
		}
		return purchaseOrderRecieptPage;
	}
	
	public VendorInvoiceEntryPage vendorInvoiceEntryPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(vendorInvoiceEntryPage==null){
			vendorInvoiceEntryPage = new VendorInvoiceEntryPage(driver,  customReport,basePage);
		}
		return vendorInvoiceEntryPage;
	}
	
	public AirlineOwnedPurchasesPage airlineOwnedPurchasesPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(airlineOwnedPurchasesPage==null){
			airlineOwnedPurchasesPage = new AirlineOwnedPurchasesPage(driver,  customReport,basePage);
		}
		return airlineOwnedPurchasesPage;
	}
	
	public AdditionalPurchasesPage additionalPurchasesPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(additionalPurchasesPage==null){
			additionalPurchasesPage = new AdditionalPurchasesPage(driver,  customReport,basePage);
		}
		return additionalPurchasesPage;
	}
	
	public ReturnToVendorPage returnToVendorPage(WebDriver driver, CustomReport customReport,BasePage basePage)
	{
		if(returnToVendorPage==null){
			returnToVendorPage = new ReturnToVendorPage(driver,  customReport,basePage);
		}
		return returnToVendorPage;
	}
	
}
