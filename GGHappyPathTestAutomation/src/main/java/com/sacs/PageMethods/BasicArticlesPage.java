package com.sacs.PageMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.sacs.PageObjects.BasicArticlesPageObjects;
import com.sacs.PageObjects.HomePageObjects;
import com.sacs.PageObjects.PurchaseOrderRegistrationPageObjects;
import com.sacs.PageObjects.VendorPriceAgreementPageObjects;
import com.sacs.Reportinglib.CustomReport;
import com.sacs.dao.BasicArticlesBeanPage;
import com.sacs.funUtils.BasePage;
import com.sacs.funUtils.WebElements;

public class BasicArticlesPage extends WebElements {
	 private static Logger logger = Logger.getLogger(BasicArticlesPage.class);
	 private static BasicArticlesPage basicArticlesPage=null;
	 private CustomReport customReport;
	 private BasePage basePage;
	 private WebDriver driver;
	
	
	public BasicArticlesPage(WebDriver driver,CustomReport customReport, BasePage basePage) {
		super(driver);
		this.driver = driver;
		this.customReport=customReport;
		this.basePage=basePage;
		PageFactory.initElements(driver,this);
	}
	
	public String create_NonAriLine_NonNominated_BasicArticle_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname) {
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		enter_ArticleGroup(basicArticlesBeans);
		enter_FinanceAccountGroup(basicArticlesBeans);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		click_AddNewVendor();
		enter_DayPrice(basicArticlesBeans);
		enter_VendorForBasicArticle(vendorname);
		click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticleNonNominated_AirLine_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		check_AirLine();
		enter_ArticleNumber(basicArticlesBeans);
		enter_ArticleGroup(basicArticlesBeans);
		enter_FinanceAccountGroup(basicArticlesBeans);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		return basicarticlename;
	}
	
	public String create_BasicArticleNominatedCustomer_AirLine_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		check_AirLine();
		enter_ArticleNumber(basicArticlesBeans);
		enter_ArticleGroup(basicArticlesBeans);
		enter_FinanceAccountGroup(basicArticlesBeans);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		click_NominatedCheckBox_SelectCustomer();
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticleNominatedGateTrade_AirLine_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		check_AirLine();
		enter_ArticleNumber(basicArticlesBeans);
		enter_ArticleGroup(basicArticlesBeans);
		enter_FinanceAccountGroup(basicArticlesBeans);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		click_NominatedCheckBox_SelectGateTrade();
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticle_NonNominatedAndAssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		String articlegroup=select_ArticleGroupRandom();
		enter_selected_ArticleGroup(articlegroup);
		String financeaccountgroup=select_FinanceAccountGroup();
		enter_SelectedFinanceAccountGroup(financeaccountgroup);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		enter_DayPrice(basicArticlesBeans);
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		//click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticle_NonNominatedAndAssignVendorWithSpecificArticleGroup(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		enter_selected_ArticleGroup(basicArticlesBeans.getArticlegroup());
		String financeaccountgroup=select_FinanceAccountGroup();
		enter_SelectedFinanceAccountGroup(financeaccountgroup);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		enter_DayPrice(basicArticlesBeans);
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		//click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticle_NonAirline_NonNominatedCustomer_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		String articlegroup=select_ArticleGroupRandom();
		enter_selected_ArticleGroup(articlegroup);
		String financeaccountgroup=select_FinanceAccountGroup();
		enter_SelectedFinanceAccountGroup(financeaccountgroup);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		enter_DayPrice(basicArticlesBeans);
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		click_NominatedCheckBox_SelectCustomer();
		click_ApplyChanges();
		return basicarticlename;
	}
	
	public String create_BasicArticle_NonAirline_NonNominatedGateTrade_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname){
		click_AddArticle();
		String basicarticlename=enter_LocalDescription(basicArticlesBeans);
		String articlegroup=select_ArticleGroupRandom();
		enter_selected_ArticleGroup(articlegroup);
		String financeaccountgroup=select_FinanceAccountGroup();
		enter_SelectedFinanceAccountGroup(financeaccountgroup);
		enter_PurchaseStoreUOM();
		enter_PurchaseStoreUOM2();
		enter_MenuUOM();
		enter_DayPrice(basicArticlesBeans);
		click_AddNewVendor();
		enter_VendorForBasicArticle(vendorname);
		click_NominatedCheckBox_SelectGateTrade();
		click_ApplyChanges();
		return basicarticlename;
	}
	
	/*public void create_NonAriLine_NonNominated_MultipleBasicArticle_AssignVendor(BasicArticlesBeanPage basicArticlesBeans,String vendorname) {
		create_NonAriLine_NonNominated_BasicArticle_AssignVendor(basicArticlesBeans, vendorname);
		click(BasicArticlesPageObjects.backtosearchbutton);
		logger.info("Clicked on back to search button");
		create_NonAriLine_NonNominated_BasicArticle_AssignVendor(basicArticlesBeans, vendorname);
	}*/
	
	public void click_BackToSearch() {
		waitForElementPresent(BasicArticlesPageObjects.backtosearchbutton);
		click(BasicArticlesPageObjects.backtosearchbutton);
		logger.info("Clicked on back to search button");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
	}
	
	public void assign_SubStoreBasicArticleUnitLevel() {
		click_GridSearchResult();
		click_AddSubStoreButton();
		String substorecode=select_SubStoreCode();
		enter_SubStoreCode(substorecode);
		click_ActiveCheckBox();
		click_EditButton();
		click_ApplyChanges();
	}
	
	public void assign_SubStoreBasicArticleUnitLevelForAirLine() {
		click_GridSearchResult();
		pageDown();
		click_AddSubStoreButton();
		String substorecode=select_SubStoreCode();
		enter_SubStoreCode(substorecode);
		click_ActiveCheckBox_Airline();
		click_EditButton();
		click_ApplyChanges();
	}
	
	
	public void click_AddArticle() {
		click(BasicArticlesPageObjects.addarticlebutton);
		logger.info("Clicked on Add Article button");
		waitForElementPresent(BasicArticlesPageObjects.localdescriptiontextbox);
	}
	
	public String select_ArticleGroupRandom() {
		 Random r = new Random();
		  int Low = 1;
		  int High = 10;
		  int R = r.nextInt(High-Low) + Low;	
		  logger.info("Random R value picked is ::::"+R);
		waitForElementPresent(BasicArticlesPageObjects.articlegrouptextbox);
		click(BasicArticlesPageObjects.articlegrouptextbox);
		logger.info("Clicked on Article group textbox");
		enterText(BasicArticlesPageObjects.articlegrouptextbox, "*");
		logger.info("Entered Article group textbox value is ::::"+"*");
		waitForElementPresent(BasicArticlesPageObjects.dropdownvalue);
		logger.info("Drop down values are present");
		WebElement select = driver.findElement(BasicArticlesPageObjects.articlegrouplist);
		List<WebElement> options = select.findElements(By.tagName("a"));
		String uom = options.get(R).getText();
		logger.info("Selected Article Group is ::::"+uom);
		String[] element = uom.split("-");
		pause(2000);
		return uom;
	}
	
	public void enter_ArticleGroup(BasicArticlesBeanPage basicArticlesBeanPage) {
		enterText(BasicArticlesPageObjects.articlegrouptextbox, basicArticlesBeanPage.getArticlegroup());
		logger.info("Entered Article group textbox value is ::::"+basicArticlesBeanPage.getArticlegroup());
	}
	
	public void enter_selected_ArticleGroup(String articlegroupname) {
		clearWebElementTextusingbackspaceUsingAttribute(BasicArticlesPageObjects.articlegrouptextbox);
		logger.info("Cleared ArticleGroup Textbox");
		enterText(BasicArticlesPageObjects.articlegrouptextbox, articlegroupname);
		logger.info("Entered Article group is ::::"+articlegroupname);
		pause(3000);
		click(BasicArticlesPageObjects.localdescriptiontextbox);
	}
	
	public String enter_LocalDescription(BasicArticlesBeanPage basicArticlesBeans) {
		pause(2000);
		enterText(BasicArticlesPageObjects.localdescriptiontextbox, basicArticlesBeans.getLocaldescription());
		logger.info("Created Basic Article is ::::"+basicArticlesBeans.getLocaldescription());
		String basicarticlename=basicArticlesBeans.getLocaldescription();
		return basicarticlename;
	}
	
	public String select_FinanceAccountGroup() {
		 Random r = new Random();
		  int Low = 1;
		  int High = 10;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);
		waitForElementPresent(BasicArticlesPageObjects.financearticlegrouptextbox);
		pause(2000);
		click(BasicArticlesPageObjects.financearticlegrouptextbox);
		logger.info("Clicked on Finance Account group textbox");
		enterText(BasicArticlesPageObjects.financearticlegrouptextbox, "*");
		logger.info("Entered Finance Account group textbox value is ::::"+"*");
		waitForElementPresent(BasicArticlesPageObjects.dropdownvalue);
		logger.info("Drop down values are present");
		WebElement select = driver.findElement(BasicArticlesPageObjects.financearticlegrouplist);
		List<WebElement> options = select.findElements(By.tagName("a"));
		String uom = options.get(R).getText();
		logger.info("Selected Finance Account Group is ::::"+uom);
		String[] element = uom.split("-");
		return uom;
	}
	
	public void enter_SelectedFinanceAccountGroup(String financeaccount) {
		clearWebElementTextusingbackspaceUsingAttribute(BasicArticlesPageObjects.financearticlegrouptextbox);
		logger.info("Cleared ArticleGroup Textbox");
		enterText(BasicArticlesPageObjects.financearticlegrouptextbox, financeaccount);
		logger.info("Entered Article group is ::::"+financeaccount);
		pause(3000);
		click(BasicArticlesPageObjects.localdescriptiontextbox);
	}
	
	public void enter_FinanceAccountGroup(BasicArticlesBeanPage basicArticlesBeanPage) {
		enterText(BasicArticlesPageObjects.financearticlegrouptextbox, basicArticlesBeanPage.getFinanceaccountgroup());
		logger.info("Entered Article group textbox value is ::::"+basicArticlesBeanPage.getFinanceaccountgroup());
	}
	
	public void enter_DayPrice(BasicArticlesBeanPage basicArticlesBeanPage) {
		waitForElementPresent(BasicArticlesPageObjects.daypricetextbox);
		enterText(BasicArticlesPageObjects.daypricetextbox, basicArticlesBeanPage.getDayprice());
		logger.info("Entered day price textbox value is ::::"+basicArticlesBeanPage.getDayprice());
	}
	
	public void enter_BasicArticle(BasicArticlesBeanPage basicArticlesBeanPage) {
		click_AddArticle();
		enter_LocalDescription(basicArticlesBeanPage);
	}
	
	public void click_AddNewVendor() {
		waitForElementPresent(BasicArticlesPageObjects.addnewvendorbutton);
		pageDown();
		pause(2000);
		click(BasicArticlesPageObjects.addnewvendorbutton);
		logger.info("Clicked on Add new Vendor Button");
		waitForElementPresent(BasicArticlesPageObjects.vendornametextbox);
		logger.info("Vendor name text box is visible on the page");
	}
	
	public void enter_VendorForBasicArticle(String vendorname) {
		enterText(BasicArticlesPageObjects.vendornametextbox, vendorname);
		logger.info("Entered vendor name to assigning basic article =====>"+vendorname);
		//waitForElement(BasicArticlesPageObjects.vendornamemenuitemslist);
		pause(3000);
		click(BasicArticlesPageObjects.vendornamemenuitemslist);
		logger.info("Clicked on Menu item");
	}

	public void click_ApplyChanges() {
		waitForElementPresent(BasicArticlesPageObjects.applychangesbutton);
		logger.info("Apply Changes button is visible on the page");
		click_ElementAfterFocus(BasicArticlesPageObjects.applychangesbutton);
		logger.info("Clicked on Apply changes button after focus");
		pause(6000);
	}
	
	public void enter_PurchaseStoreUOM() {
		/* Random r = new Random();
		  int Low = 1;
		  int High = 5;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);*/
		waitForElementPresent(BasicArticlesPageObjects.purchasestoreuom);
		pause(2000);
		click(BasicArticlesPageObjects.purchasestoreuom);
		logger.info("Clicked on Purchase Store UOM textbox");
		enterText(BasicArticlesPageObjects.purchasestoreuom, "CV");
		logger.info("Entered text in Purchase Store UOM is ::::"+"CV");
		waitForElementPresent(BasicArticlesPageObjects.storeuomlist);
		logger.info("Drop down values are present");
		By selectitem=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[3]/li[1]");
		//By selectitem=By.xpath("//*[contains(text(),'CV-CASE/BOX')]");
		pause(1000);
		String storeuom1=getText(selectitem);
		/*clearWebElementText(BasicArticlesPageObjects.purchasestoreuom);
		enterText(BasicArticlesPageObjects.purchasestoreuom, storeuom1);
		logger.info("Entered text in Purchase Store UOM is ::::"+storeuom1);*/
		//mouseOver(selectitem);
		//pause(2000);
		clickUsingSwitch(selectitem);
		logger.info("Selected Purchase Store UOM is ::::"+storeuom1);
	}
	
	public void enter_PurchaseStoreUOM2() {
		 /*Random r = new Random();
		  int Low = 1;
		  int High = 5;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);*/
		waitForElementPresent(BasicArticlesPageObjects.purchasestoreuom2);
		pause(2000);
		click(BasicArticlesPageObjects.purchasestoreuom2);
		logger.info("Clicked on Purchase Store UOM textbox");
		enterText(BasicArticlesPageObjects.purchasestoreuom2, "CV");
		logger.info("Entered text in Purchase Store UOM2 is ::::"+"CV");
		waitForElementPresent(BasicArticlesPageObjects.storeuom2list);
		logger.info("Drop down values are present");
		By selectitem=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[4]/li[1]");
		pause(1000);
		String storeuom2=getText(selectitem);
		/*clearWebElementText(BasicArticlesPageObjects.purchasestoreuom2);
		enterText(BasicArticlesPageObjects.purchasestoreuom2, storeuom2);
		logger.info("Entered text in Purchase Store UOM is ::::"+storeuom2);*/
		//mouseOver(selectitem);
		//pause(2000);
		clickUsingSwitch(selectitem);
		logger.info("Selected Purchase Store UOM2 is ::::"+storeuom2);
	}
	
	public void enter_MenuUOM() {
		/* Random r = new Random();
		  int Low = 1;
		  int High = 5;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);*/
		waitForElementPresent(BasicArticlesPageObjects.purchasestoreuom2);
		pause(2000);
		click(BasicArticlesPageObjects.menuuomtextbox);
		logger.info("clicked on Menu UOM textbox");
		enterText(BasicArticlesPageObjects.menuuomtextbox, "CV");
		logger.info("Entered text in Menu UOM is ::::"+"CV");
		waitForElementPresent(BasicArticlesPageObjects.menulist);
		pause(1000);
		By selectitem=By.xpath("(//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all'])[5]/li[1]");
		pause(1000);
		String menuuom=getText(selectitem);
		/*clearWebElementText(BasicArticlesPageObjects.menuuomtextbox);
		enterText(BasicArticlesPageObjects.menuuomtextbox, menuuom);
		logger.info("Entered text in Purchase Store UOM is ::::"+menuuom);*/
		//mouseOver(selectitem);
		//pause(2000);
		clickUsingSwitch(selectitem);
		logger.info("Selected Menu UOM is ::::"+menuuom);
	}
	
	public VendorPriceAgreementPage navigate_VendorPriceAgreementFromBasicArticlePage() {
		pause(5000);
		waitForElementPresent(BasicArticlesPageObjects.addarticlebutton);
		click(BasicArticlesPageObjects.addarticlebutton);
		logger.info("Clicked on Add Article Button");
		waitForElementPresent(BasicArticlesPageObjects.localdescriptiontextbox);
		click(HomePageObjects.vendorpriceagreementbutton);
		logger.info("Clicked on Vendor Price Agreement Button");
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
	return basePage.vendorPriceAgreementPage(driver, customReport, basePage);
	}
	
	public HomePage select_Unit(String unit) {
		waitForElementPresent(HomePageObjects.workingunitdropdown);
		selectValuefromDropDown(HomePageObjects.workingunitdropdown, unit);
		logger.info("The Country Unit Selected is ::::"+unit);
		return basePage.homepage(driver, customReport, basePage);
	}
	
	public void search_BasicArticle(BasicArticlesBeanPage basicArticlesBeans) {
		enterText(VendorPriceAgreementPageObjects.searchtextbox, basicArticlesBeans.getLocaldescription());
		logger.info("Entered value in basic article search is ::::"+ basicArticlesBeans.getLocaldescription());
		waitForElementPresent(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Search result is visible on the page");
		pause(2000);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		pause(2000);
	}
	
	public void search_BasicArticle(String basicarticlename) {
		enterText(VendorPriceAgreementPageObjects.searchtextbox, basicarticlename);
		logger.info("Entered value in basic article search is ::::"+ basicarticlename);
		waitForElementPresent(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Search result is visible on the page");
		pause(2000);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		pause(2000);
	}
	
	public void click_GridSearchResult() {
		pause(4000);
		doubleClick(BasicArticlesPageObjects.searchfirstgrid);
		logger.info("Double Clicked on search result");
		waitForElementPresent(BasicArticlesPageObjects.localdescriptiontextbox);
	}
	
	public void click_AddSubStoreButton() {
		waitForElementPresent(BasicArticlesPageObjects.addsubstorebutton);
		pause(1000);
		click(BasicArticlesPageObjects.addsubstorebutton);
		//logger.info("@@@checking is displayed"+isDisplayedWithoutException(BasicArticlesPageObjects.substorecodetextbox));
		if(isDisplayedWithoutException(BasicArticlesPageObjects.substorecodetextbox)) {
			logger.info("Clicked on Add Sub Store Button 1");
		}
		else {
			logger.info("@@@ clicking second time add sub store button");
			click(BasicArticlesPageObjects.addsubstorebutton);
			waitForElementPresent(BasicArticlesPageObjects.substorecodetextbox);
			logger.info("Clicked on Add Sub Store Button 2");}
		
	}
	
	public void click_EditButton() {
		waitForElementPresent(BasicArticlesPageObjects.Editbutton);
		pause(1000);
		click_ElementAfterFocus(BasicArticlesPageObjects.Editbutton);
		logger.info("Clicked on Edit Button");
	}
/*	public String select_SubStoreCode() {
		Random r = new Random();
		  int Low = 1;
		  int High = 10;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);
		click(BasicArticlesPageObjects.substorecodetextbox);
		logger.info("Clicked on Sub Store Code textbox");
		enterText(BasicArticlesPageObjects.substorecodetextbox, "*");
		logger.info("Entered Sub Store Code textbox value is ::::"+"*");
		waitForElementPresent(BasicArticlesPageObjects.substorecodedropdown);
		logger.info("Drop down values are present");
		WebElement select = driver.findElement(BasicArticlesPageObjects.substorecodedropdown);
		List<WebElement> options = select.findElements(By.tagName("a"));
		pause(2000);
		String substorecode = options.get(R).getText();
		logger.info("Selected Sub Store Code is ::::"+substorecode);
		String[] element = substorecode.split("-");
		return substorecode;
	}
	*/
	public String select_SubStoreCode() {
		Random r = new Random();
		  int Low = 1;
		  int High = 10;
		  int R = r.nextInt(High-Low) + Low;	
		logger.info("Random R value picked is ::::"+R);
		click(BasicArticlesPageObjects.substorecodetextbox);
		logger.info("Clicked on Sub Store Code textbox");
		enterText(BasicArticlesPageObjects.substorecodetextbox, "*");
		logger.info("Entered Sub Store Code textbox value is ::::"+"*");
		waitForElementPresent(BasicArticlesPageObjects.substorecodedropdown);
		logger.info("Drop down values are present");
		WebElement select = driver.findElement(BasicArticlesPageObjects.substorecodedropdown);
		List<WebElement> options = select.findElements(BasicArticlesPageObjects.substorecodedropdown);
		pause(2000);
		String substorecode = options.get(R).getText();
		logger.info("Selected Sub Store Code is ::::"+substorecode);
		String[] element = substorecode.split("-");
		return substorecode;
	}
	
	public void enter_SubStoreCode(String substore) {
		clearWebElementText(BasicArticlesPageObjects.substorecodetextbox);
		enterText(BasicArticlesPageObjects.substorecodetextbox, substore);
		logger.info("Entered sub store code is ::::"+substore);
		pause(2000);
		click(BasicArticlesPageObjects.substorepositiontextbox);
	}
	
	public void click_ActiveCheckBox() {
		pause(2000);
		clickusingMouse(BasicArticlesPageObjects.activecheckbox);
		//elementFocusWithTab(BasicArticlesPageObjects.daypricetextbox);
		//click(BasicArticlesPageObjects.daypricetextbox);
		//waitForElementPresent(BasicArticlesPageObjects.activecheckbox);
		pause(2000);
		logger.info("Checked check box for Active");
	}
	
	public void click_ActiveCheckBox_Airline() {
		pageUp();
		pause(2000);
		pageUp();
		pause(2000);
		pageUp();
		pause(2000);
		waitForElementPresent(BasicArticlesPageObjects.activecheckbox);
		clickusingMouse(BasicArticlesPageObjects.activecheckbox);
		logger.info("Checked check box for Active");
	}
	
	public PurchaseOrderRegistrationPage navigate_PurchaseOrderRegistration() {
		click(BasicArticlesPageObjects.backtosearchbutton);
		logger.info("Clicked on back to search button");
		pause(1000);
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
		waitForElementPresent(HomePageObjects.purchaseorderregidtrationlinktext);
		clickusingjavascript(HomePageObjects.purchaseorderregidtrationlinktext);
		logger.info("Clicked on Purchase Order Registration");
		waitForElementPresent(PurchaseOrderRegistrationPageObjects.ordersbyvendorbutton);
		return basePage.purchaseOrderRegistrationPage(driver, customReport, basePage);
	}
	
	public void click_NominatedCheckBox_SelectCustomer() {
		//elementFocusWithTab(BasicArticlesPageObjects.zonetextbox);
		//click(BasicArticlesPageObjects.zonetextbox);
		pageUp();
		pause(2000);
		//waitForElementPresent(BasicArticlesPageObjects.nomiatedcheckbox);
		check_Checkbox(BasicArticlesPageObjects.nomiatedcheckbox);
		logger.info("Checked check box for Nominated");
		pause(2000);
		click(BasicArticlesPageObjects.customerradiobutton);
		logger.info("Clicked Radio button for Customer");
	}
	
	public void click_NominatedCheckBox_SelectGateTrade() {
		//elementFocusWithTab(BasicArticlesPageObjects.zonetextbox);
		//click(BasicArticlesPageObjects.zonetextbox);
		pageUp();
		pause(2000);
		//waitForElementPresent(BasicArticlesPageObjects.nomiatedcheckbox);
		check_Checkbox(BasicArticlesPageObjects.nomiatedcheckbox);
		logger.info("Checked check box for Nominated");
		pause(2000);
		click(BasicArticlesPageObjects.gatetraderadiobutton);
		logger.info("Clicked Radio button for Gate Trade");
	}
	
	public void check_AirLine() {
		waitForElementPresent(BasicArticlesPageObjects.airlineradiobutton);
		click(BasicArticlesPageObjects.airlineradiobutton);
		logger.info("Clicked on Non Airline Radio button");
		waitForElementEnable(BasicArticlesPageObjects.airticlenumbertextbox);
		click(BasicArticlesPageObjects.airticlenumbertextbox);
		logger.info("Clicked on Article Number Text box");
	}
	
	public void enter_ArticleNumber(BasicArticlesBeanPage basicArticlesBeanPage) {
		waitForElementPresent(BasicArticlesPageObjects.airticlenumbertextbox);
		enterText(BasicArticlesPageObjects.airticlenumbertextbox, basicArticlesBeanPage.getArticlenumber());
		logger.info("Entered Article Number is ::::"+basicArticlesBeanPage.getArticlenumber());
	}
	
	public AdditionalPurchasesPage click_AdditionalPurchases() {
		waitForElementPresent(HomePageObjects.additionalpurchaseslinktext);
		click(HomePageObjects.additionalpurchaseslinktext);
		logger.info("Clicked on Additional Purchases link text");
		return basePage.additionalPurchasesPage(driver, customReport, basePage);
	}
	
	String articlename="B ARTICLE";
	public void search_AutoArticles() {
		waitForElementPresent(VendorPriceAgreementPageObjects.searchtextbox);
		enterText(VendorPriceAgreementPageObjects.searchtextbox, articlename);
		logger.info("Entered text for article search is :::::"+articlename);
		clickEnter(VendorPriceAgreementPageObjects.searchtextbox);
		click(BasicArticlesPageObjects.showentriesdropdown);
		logger.info("Clicked on Show entries dropdown");
		waitForElementPresent(BasicArticlesPageObjects.showentriesdropdown100);
		click(BasicArticlesPageObjects.showentriesdropdown100);
		logger.info("Clicked on 100 from Show entries dropdown");
		pause(2000);
	}
	
	By seemoreoptionsbutton=By.xpath("(//*[contains(text(),'"+articlename+"')])[1]/../../..//td[@class='settings']/a");
	public void delete_AutoArticles(String articelname) {
		pause(2000);
		waitForElementPresent(seemoreoptionsbutton);
		click(seemoreoptionsbutton);
		logger.info("Clicked on See More Options Button");
		//waitForElementPresent(BasicArticlesPageObjects.removearticlefirstbutton);
		By removebutton=By.xpath("//*[@id='results']/table/tbody/tr[1]/td[9]/div/div[5]/a");
		mouseOver(removebutton);
		logger.info("Mouse Hovered ");
		clickUsingSwitch(removebutton);
		logger.info("Clicked on the remove article first button");
		waitForElementPresent(BasicArticlesPageObjects.removearticleconformokbutton);
		click(BasicArticlesPageObjects.removearticleconformokbutton);
		logger.info("Clicked on the remove article conformation alert OK");
		//pause(2000);
	}
	
	public void delete_AllAutoArticles() {
		search_AutoArticles();
		String articlename="B ARTICLE";
		By autoarticlelist=By.xpath("//*[contains(text(),'"+articlename+"')]");
		ArrayList<String> allautoarticles= getAllWebElementValueslist(autoarticlelist);
		if (allautoarticles.size()!=0) {
			for(int i=0;i<allautoarticles.size();i++) {
				logger.info("The list is Automation Basic Articles are ::::"+allautoarticles.size());
				pause(2000);
				delete_AutoArticles(allautoarticles.get(i));
				
			}
		}
	}
		
		
		
		
	}


