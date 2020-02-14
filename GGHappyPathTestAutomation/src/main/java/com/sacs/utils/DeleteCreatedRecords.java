/*package com.sacs.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gg.costingpricing.costingparameter.page.CostingPricingCostingParameterPage;
import com.gg.sacs.CostingPricing.ProductType.page.CostingPricingProductTypePage;
import com.gg.sacs.CostingPricing.productcosting.page.CostingPricingProductCostingPage;
import com.gg.sacs.CostingPricing.salespricing.page.CostingPricingSalesPricingPage;
import com.gg.sacs.Invoice.CustomerTurnoverGroup.page.InvoiceCustomerTurnoverGroupPage;
import com.gg.sacs.login.page.LoginPage;
import com.gg.sacs.operations.boxcodes.page.OperationsBoxCodesAddPage;
import com.gg.sacs.operations.csp.page.OperationsCSPAddPage;
import com.gg.sacs.operations.deliveryplans.page.OperationsAddDeliveryPlansPage;
import com.gg.sacs.operations.distributioncodes.page.OperationsDistributionCodesAddPage;
import com.gg.sacs.operations.flighttimetable.page.OperationFlightTimetablePage;
import com.gg.sacs.operations.loadingsetup.page.OperationsLoadingSetupAddPage;
import com.gg.sacs.operations.loadratio.page.OperationLoadRatioAddPage;
import com.gg.sacs.operations.rotationplans.page.OperationsRotationPlansAddPage;
import com.gg.sacs.pageobject.enums.CostingPricingCostingParameterEnum;
import com.gg.sacs.pageobject.enums.CostingPricingProductCostingEnum;
import com.gg.sacs.pageobject.enums.CostingPricingProductTypeEnum;
import com.gg.sacs.pageobject.enums.CostingPricingSalesPricingEnum;
import com.gg.sacs.pageobject.enums.InvoiceCustomerTurnOverGroupEnum;
import com.gg.sacs.pageobject.enums.OperationFlightTTEnum;
import com.gg.sacs.pageobject.enums.OperationLoadRatioAddEnum;
import com.gg.sacs.pageobject.enums.OperationsBoxCodesAddEnum;
import com.gg.sacs.pageobject.enums.OperationsCSPAddEnum;
import com.gg.sacs.pageobject.enums.OperationsDeliveryPlansAddEnum;
import com.gg.sacs.pageobject.enums.OperationsDistributionCodesAddEnum;
import com.gg.sacs.pageobject.enums.OperationsLoadingSetupAddEnum;
import com.gg.sacs.pageobject.enums.OperationsRotationPlansAddEnum;
import com.gg.sacs.pageobject.enums.PurchaseAddVendorEnum;
import com.gg.sacs.pageobject.enums.PurchaseAdditionalPurchasesEnums;
import com.gg.sacs.pageobject.enums.PurchaseBasicArticlesSearchEnum;
import com.gg.sacs.pageobject.enums.PurchaseCustomerPriceAgreementEnum;
import com.gg.sacs.pageobject.enums.PurchaseVendorSearchEnum;
import com.gg.sacs.pageobject.enums.SystemCostCenterSearchPageEnum;
import com.gg.sacs.pageobject.enums.SystemStowingContainersEnums;
import com.gg.sacs.pageobject.enums.SystemWasteReasonEnum;
import com.gg.sacs.purchase.basicarticle.page.PurchaseAddBasicArticlePage;
import com.gg.sacs.purchase.basicarticle.page.PurchaseBasicArticlesSearchPage;
import com.gg.sacs.purchase.cpa.page.PurchaseCustomerPriceAgreementPage;
import com.gg.sacs.purchase.page.PurchaseAddVendorPage;
import com.gg.sacs.purchase.page.PurchaseAdditionalPurchasesPage;
import com.gg.sacs.purchase.vendorincidents.page.PurchaseVendorIncidentsPage;
import com.gg.sacs.report.DateTime;
import com.gg.sacs.report.EmailReportBean;
import com.gg.sacs.report.HTMLReport;
import com.gg.sacs.report.ModuleNamesEnum;
import com.gg.sacs.report.ScreenSnap;
import com.gg.sacs.system.costcenter.page.SystemCostCenterDeletePage;
import com.gg.sacs.system.costcenter.page.SystemCostCenterUpdatePage;
import com.gg.sacs.system.wastereason.page.SystemWasteReasonPage;

public class DeleteCreatedRecords {
	private static Logger DELETELOGGER = Logger.getLogger(DeleteCreatedRecords.class);
	public static String flatFilePath =System.getProperty("user.dir")+"\\inputFiles\\FlatFileReport";
	private ScreenSnap createScreenSnapFolder = new ScreenSnap();
	private static Logger VENDORINCIDENTLOGGER = Logger.getLogger(DeleteCreatedRecords.class);
	private InstantiateBrowser instantiateBrowser;
	private WebDriver driver = null;
	private HTMLReport createHTML = new HTMLReport();
	private DateTime dateTime = new DateTime();
	private BufferedWriter bw = null;
	private String browserName, testCaseDesc=null, screenSnapLink;
	private int totalCases = 0;
	private String testCaseName;
	private String appStartTime;
	private String countryLevel;
	private String username;
	private String password;
	private String project;
	private String url;
	private String masterUnit;
	private String testCaseId;
	private SacsUtil sacsUtil;
	private LoginPage loginPage = null;
	private PurchaseVendorIncidentsPage purchaseVendorIncidentPage;
	private OperationLoadRatioAddPage addLoadRatioPage;
	private OperationsRotationPlansAddPage rotationPlansAddPage;
	private OperationsDistributionCodesAddPage distributionCodesAddPage;
	private OperationsBoxCodesAddPage boxCodesAddPage;
	private OperationsAddDeliveryPlansPage addDeliveryPlansPage;
	private OperationsLoadingSetupAddPage loadingSetupAddPage;
	private OperationsCSPAddPage cspAddPage;
	private OperationFlightTimetablePage flightTimetable;
	private CostingPricingProductTypePage costingPricingPage;
	private CostingPricingSalesPricingPage costingPricingSalesPricing;
	private CostingPricingCostingParameterPage CostingParameter;
	private CostingPricingProductCostingPage productCosting;
	private SystemCostCenterDeletePage systemCostCenterDeletePage;
	private SystemCostCenterUpdatePage systemCostCenterUpdatePage;
	private SystemWasteReasonPage wasteReason;
	private PurchaseAdditionalPurchasesPage additionalPurchasesPage;
	private PurchaseCustomerPriceAgreementPage customerPriceAgreementPage;
	private InvoiceCustomerTurnoverGroupPage customerTurnoverGroupPage;
	private Map<String, List<EmailReportBean>> moduleMap; 
	private List<EmailReportBean> emailReportBeanList;
	private String moduleName = ModuleNamesEnum.PURCHASE.getModuleName();
	private String subModuleName = ModuleNamesEnum.VENDOR_INCIDENTS.getModuleName();	
	private PurchaseAddVendorPage addVendorPage;
	private String masterUnitValue;
	private PurchaseAddBasicArticlePage addBasicArticlePage;
	private PurchaseBasicArticlesSearchPage basicArticlesSearchPage;
	
	
	
	@Parameters(value={"project", "sbrowser", "url","username","password","countryLevel"})
	@BeforeClass
	public void setUp(String projectName, String browser, String appurl, String uname, String pwd, String countryLevel) throws Exception
	{
	   VENDORINCIDENTLOGGER.info("Vendor Incident Regression Test Setup method");
	   instantiateBrowser = new InstantiateBrowser();
	   driver = instantiateBrowser.setUp(browser);
	   url = appurl;
	   project = projectName;
	   browserName = browser;
	   appStartTime = this.dateTime.hmsTime();
	   username = uname;
	   password = pwd;
	   bw = createHTML.createHTML(project, browser, url, moduleName+"_"+subModuleName);
	   createScreenSnapFolder.createScreenSnapFolder(project, browser, moduleName+"_"+subModuleName);
	   loginPage = new LoginPage(driver, bw);
	   this.countryLevel = countryLevel;
	   masterUnit = loginPage.selectMasterUnit(testCaseName, countryLevel);
	   moduleMap = new HashMap<String, List<EmailReportBean>>();
	   emailReportBeanList = new ArrayList<EmailReportBean>();
	   purchaseVendorIncidentPage = new PurchaseVendorIncidentsPage(driver, bw);
	   sacsUtil = new SacsUtil();
	   addVendorPage= new PurchaseAddVendorPage(driver, bw);
	   masterUnitValue = loginPage.selectMasterUnit("BVT Suite Tests", countryLevel);
	   addBasicArticlePage = new PurchaseAddBasicArticlePage(driver, bw);
	   basicArticlesSearchPage = new PurchaseBasicArticlesSearchPage(driver, bw);
	   addLoadRatioPage= new OperationLoadRatioAddPage(driver, bw);
	   rotationPlansAddPage = new OperationsRotationPlansAddPage(driver, bw);
	   distributionCodesAddPage = new OperationsDistributionCodesAddPage(driver, bw);
	   boxCodesAddPage = new OperationsBoxCodesAddPage(driver, bw);
	   addDeliveryPlansPage = new OperationsAddDeliveryPlansPage(driver, bw);
	   loadingSetupAddPage = new OperationsLoadingSetupAddPage(driver, bw);
	   cspAddPage = new OperationsCSPAddPage(driver, bw);
	   flightTimetable = new OperationFlightTimetablePage(driver, bw);
	   costingPricingPage=new CostingPricingProductTypePage(driver, bw);
	   costingPricingSalesPricing = new CostingPricingSalesPricingPage(driver, bw);
	   CostingParameter = new CostingPricingCostingParameterPage(driver, bw);
	   productCosting = new CostingPricingProductCostingPage(driver, bw);
	   systemCostCenterDeletePage = new SystemCostCenterDeletePage(driver, bw);
	   systemCostCenterUpdatePage = new SystemCostCenterUpdatePage(driver, bw);
	   wasteReason = new SystemWasteReasonPage(driver, bw);
	   additionalPurchasesPage =new PurchaseAdditionalPurchasesPage(driver, bw);
	   customerPriceAgreementPage =new PurchaseCustomerPriceAgreementPage(driver, bw);
	   customerTurnoverGroupPage = new InvoiceCustomerTurnoverGroupPage(driver, bw);
	 }
	
	 
	@Test
	public void deletingRecords() throws Exception{
		List<String> list=convertToarraylist();
		for(int i=1;i<=list.size(); i++){
			//System.out.println("####: "+list.get(i));
			String[] record = list.get(i).split("-");
			switch_Module(record[0], record[1]);
			//System.out.println("11111111: "+record[0]+"2222222: "+record[1]);
		}
		
	}
	
	public void switch_Module(String objType, String record) throws Exception {
		switch (objType) {
		case "VD":
			System.out.println("VENDORS");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			addVendorPage.navigateToVendorSearchPage(testCaseName);
			sacsUtil.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			sacsUtil.waiter(2);
			String searchtext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(searchtext.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementPath(), PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.VENDOR_REMOVE.getElementPath(), PurchaseAddVendorEnum.VENDOR_REMOVE.getElementIdentifier(), ElementNamesEnum.REMOVE_ICON.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementPath(), PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
				sacsUtil.waiter(2);
				String actual_vd=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_vd=sacsUtil.compareText("No data to display", actual_vd, bw, testCaseName);
				if(result_vd.equals("true")){
					loginPage.logout(testCaseName);
					}
				}
			break;
		case "BA":
			System.out.println("BASIC ARTICLE");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			basicArticlesSearchPage.navigateToBasicArticlesPage(testCaseName);
			addBasicArticlePage.enterDataInSearchBox(record, testCaseName);
			addBasicArticlePage.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementPath(), PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementIdentifier(), ElementNamesEnum.SEARCHSUBMIT.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			String stext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(stext.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			sacsUtil.performDoubleClick(driver, PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementPath(), PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, "X", "linkText", ElementNamesEnum.REMOVE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.REMOVE_BASIC_ARTICLE_POPUP_CONTINUE_BTN.getElementPath(), PurchaseBasicArticlesSearchEnum.REMOVE_BASIC_ARTICLE_POPUP_CONTINUE_BTN.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			addBasicArticlePage.enterDataInSearchBox(record, testCaseName);
			addBasicArticlePage.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementPath(), PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementIdentifier(), ElementNamesEnum.SEARCHSUBMIT.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			String actual_ba=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_ba=sacsUtil.compareText("No data to display", actual_ba, bw, testCaseName);
			if(result_ba.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "CPA":
			System.out.println("CUSTOMER PRICE AGREEMENT");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			customerPriceAgreementPage.NavigateToCustomerPriceAgreementPage(testCaseName);
			customerPriceAgreementPage.insertDataAndClickOnSearch(testCaseName, record);
			sacsUtil.waiter(2);
				sacsUtil.performDoubleClick(driver, PurchaseCustomerPriceAgreementEnum.CUSTFIRSTROW2.getElementPath(), PurchaseCustomerPriceAgreementEnum.CUSTFIRSTROW2.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, "X", "linkText", ElementNamesEnum.REMOVE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, PurchaseCustomerPriceAgreementEnum.APPLYCHANGES.getElementPath(), PurchaseCustomerPriceAgreementEnum.APPLYCHANGES.getElementIdentifier(), ElementNamesEnum.APPLY_CHANGES.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				String tMsg = sacsUtil.getToastMessageText(driver, testCaseName, bw);
				if(tMsg.equals("No articles to save")){
					loginPage.logout(testCaseName);
					}
			break;
		case "KORD":
			System.out.println("ADDITIONAL PURCHASE ORDERS");
			String[] kord_data=record.split("#");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			addVendorPage.navigateToVendorSearchPage(testCaseName);
			sacsUtil.enterInSearchBarAndclickSearchButton(driver, kord_data[0], testCaseName, bw);
			sacsUtil.waiter(2);
			String kordtext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(kordtext.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementPath(), PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.VENDOR_REMOVE.getElementPath(), PurchaseAddVendorEnum.VENDOR_REMOVE.getElementIdentifier(), ElementNamesEnum.REMOVE_ICON.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementPath(), PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.enterInSearchBarAndclickSearchButton(driver, kord_data[0], testCaseName, bw);
				sacsUtil.waiter(2);
				String actual_vd=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_vd=sacsUtil.compareText("No data to display", actual_vd, bw, testCaseName);
				if(result_vd.equals("true")){
					loginPage.logout(testCaseName);
					}
				}
			break;
		case "PORD":
			System.out.println("PURCHASE ORDERS");
			String[] pord_data=record.split("#");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, countryLevel);
			basicArticlesSearchPage.navigateToBasicArticlesPage(testCaseName);
			addBasicArticlePage.enterDataInSearchBox(pord_data[1], testCaseName);
			addBasicArticlePage.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementPath(), PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementIdentifier(), ElementNamesEnum.SEARCHSUBMIT.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			String batext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(batext.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementPath(), PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				//sacsUtil.scrollingPageDown_Two(driver, testCaseName, bw);
				sacsUtil.clearTextFeild(driver, PurchaseBasicArticlesSearchEnum.VENDOR_NAME_01.getElementPath(), PurchaseBasicArticlesSearchEnum.VENDOR_NAME_01.getElementIdentifier());
				sacsUtil.waiter(2);
				sacsUtil.moveToElementByXpath(driver, PurchaseBasicArticlesSearchEnum.REMOVE_VENDOR_ASSOCIATION.getElementPath());
				sacsUtil.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.REMOVE_VENDOR_ASSOCIATION.getElementPath(), PurchaseBasicArticlesSearchEnum.REMOVE_VENDOR_ASSOCIATION.getElementIdentifier(), ElementNamesEnum.REMOVE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.scrollingPageDown(driver, testCaseName, bw);
				sacsUtil.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.APPLY_CHANGES.getElementPath(), PurchaseBasicArticlesSearchEnum.APPLY_CHANGES.getElementIdentifier(), ElementNamesEnum.APPLY_CHANGES.getObjName(), bw, testCaseName);
				sacsUtil.waiter(6);
				sacsUtil.scrollingPageUp(driver, testCaseName, bw);
			}
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			basicArticlesSearchPage.navigateToBasicArticlesPage(testCaseName);
			addBasicArticlePage.enterDataInSearchBox(pord_data[1], testCaseName);
			addBasicArticlePage.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementPath(), PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementIdentifier(), ElementNamesEnum.SEARCHSUBMIT.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			String por_batext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(por_batext.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			sacsUtil.performDoubleClick(driver, PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementPath(), PurchaseBasicArticlesSearchEnum.GRID_SEARCH_RESULT.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, "X", "linkText", ElementNamesEnum.REMOVE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.REMOVE_BASIC_ARTICLE_POPUP_CONTINUE_BTN.getElementPath(), PurchaseBasicArticlesSearchEnum.REMOVE_BASIC_ARTICLE_POPUP_CONTINUE_BTN.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			addBasicArticlePage.enterDataInSearchBox(pord_data[1], testCaseName);
			addBasicArticlePage.clickOnLink(driver, PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementPath(), PurchaseBasicArticlesSearchEnum.SEARCH_SUBMIT.getElementIdentifier(), ElementNamesEnum.SEARCHSUBMIT.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			String por_actual_ba=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String por_result_ba=sacsUtil.compareText("No data to display", por_actual_ba, bw, testCaseName);
			if(por_result_ba.equals("true")){
				loginPage.selectWorkingUnit(testCaseName, countryLevel);
				loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
				addVendorPage.navigateToVendorSearchPage(testCaseName);
				sacsUtil.enterInSearchBarAndclickSearchButton(driver, pord_data[0], testCaseName, bw);
				sacsUtil.waiter(2);
				String vdtext=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
				if(vdtext.equals("No data to display")){
					loginPage.logout(testCaseName);
					break;
				}else{
					sacsUtil.performDoubleClick(driver, PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementPath(), PurchaseAddVendorEnum.FIRSTROW_FIRSTCOL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					sacsUtil.waiter(2);
					sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.VENDOR_REMOVE.getElementPath(), PurchaseAddVendorEnum.VENDOR_REMOVE.getElementIdentifier(), ElementNamesEnum.REMOVE_ICON.getObjName(), bw, testCaseName);
					sacsUtil.waiter(2);
					sacsUtil.clickOnLink(driver, PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementPath(), PurchaseAddVendorEnum.REMOVEPOPUP_CONTINUEBTN.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
					sacsUtil.waiter(2);
					sacsUtil.enterInSearchBarAndclickSearchButton(driver, pord_data[0], testCaseName, bw);
					sacsUtil.waiter(2);
					String por_actual_vd=sacsUtil.getText(driver, PurchaseAddVendorEnum.NODATATODISPLAY.getElementPath(), PurchaseAddVendorEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					String por_result_vd=sacsUtil.compareText("No data to display", por_actual_vd, bw, testCaseName);
					if(por_result_vd.equals("true")){
						loginPage.logout(testCaseName);
						}
					}
				}
			}
			break;
		case "VID":
			System.out.println("VENDOR INCIDENTS");
			break;
		case "LR":
			System.out.println("LOAD RATIO");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			addLoadRatioPage.navigationToLoadRatioSearchPage(testCaseName);
			addLoadRatioPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_lr=sacsUtil.getText(driver, OperationLoadRatioAddEnum.NODATATODISPLAY.getElementPath(), OperationLoadRatioAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_lr.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			addLoadRatioPage.doubleClickSearchResult(testCaseName);
			addLoadRatioPage.clickOnDeleteIcon(testCaseName);
			addLoadRatioPage.clickOnPopUpOKBtn(testCaseName);
			addLoadRatioPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String actual=sacsUtil.getText(driver, OperationLoadRatioAddEnum.NODATATODISPLAY.getElementPath(), OperationLoadRatioAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result=sacsUtil.compareText("No data to display", actual, bw, testCaseName);
			if(result.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "RP":
			System.out.println("ROTATION PLAN");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			rotationPlansAddPage.NavigateToRotationPlansSearchPage(testCaseName);
			rotationPlansAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_rp=sacsUtil.getText(driver, OperationsRotationPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsRotationPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_rp.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			//rotationPlansAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			rotationPlansAddPage.doubleClickOnSearchedRecord(testCaseName);
			rotationPlansAddPage.clickOnDeleteIcon(testCaseName);
			rotationPlansAddPage.clickOnPopUpContinueBtn(testCaseName);
			rotationPlansAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String actual1=sacsUtil.getText(driver, OperationsRotationPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsRotationPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result1=sacsUtil.compareText("No data to display", actual1, bw, testCaseName);
			if(result1.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "DC":
			System.out.println("DISTRIBUTION CODES");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			distributionCodesAddPage.NavigateToDistributionCodesSearchPage(testCaseName);
			distributionCodesAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_dc=sacsUtil.getText(driver, OperationsDistributionCodesAddEnum.NODATATODISPLAY.getElementPath(), OperationsDistributionCodesAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_dc.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			distributionCodesAddPage.doubleClickOnSearchedRecord(testCaseName);
			distributionCodesAddPage.clickOnDeleteIcon(testCaseName);
			distributionCodesAddPage.clickOnPopUpOK(testCaseName);
			distributionCodesAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String actual_dc=sacsUtil.getText(driver, OperationsDistributionCodesAddEnum.NODATATODISPLAY.getElementPath(), OperationsDistributionCodesAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_dc=sacsUtil.compareText("No data to display", actual_dc, bw, testCaseName);
			if(result_dc.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "BC":
			System.out.println("BOX CODES");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			boxCodesAddPage.NavigateToBoxCodesSearchPage(testCaseName);
			boxCodesAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_bc=sacsUtil.getText(driver, OperationsBoxCodesAddEnum.NODATATODISPLAY.getElementPath(), OperationsBoxCodesAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_bc.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			boxCodesAddPage.doubleClickOnSearchedRecord(testCaseName);
			boxCodesAddPage.clickOnDeleteIcon(testCaseName);
			boxCodesAddPage.clickOnPopUpYESBtn(testCaseName);
			sacsUtil.waiter(2);
			boxCodesAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String actual_bc=sacsUtil.getText(driver, OperationsBoxCodesAddEnum.NODATATODISPLAY.getElementPath(), OperationsBoxCodesAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_bc=sacsUtil.compareText("No data to display", actual_bc, bw, testCaseName);
			if(result_bc.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "DP":
			System.out.println("DELIVERY PLAN");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			addDeliveryPlansPage.navigateToDeliveryPlanSearchPage(testCaseName);
			addDeliveryPlansPage.searchDeliveryPlan(record, testCaseName);
			String text_dp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_dp.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			addDeliveryPlansPage.performDoubleClick(driver, OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementPath(), OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			addDeliveryPlansPage.clickOnOk(testCaseName);
			addDeliveryPlansPage.clickOnDeleteIcon(testCaseName);
			addDeliveryPlansPage.clickOnPopUpContinue(testCaseName);
			sacsUtil.waiter(2);
			if(driver.findElement(By.xpath("//*[@id='errorAlert']/div[2]")).getText().equals("You cannot delete this delivery plan! It is used in loading setup(s) and flight(s) timetable.")){
				sacsUtil.clickOnLink(driver, OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementPath(), OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
				loginPage.logout(testCaseName);
				break;
			}else{
			addDeliveryPlansPage.searchDeliveryPlan(record, testCaseName);
			String actual_dp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_dp=sacsUtil.compareText("No data to display", actual_dp, bw, testCaseName);
			if(result_dp.equals("true")){
				loginPage.logout(testCaseName);
					}
				}
			}
			break;
		case "LS":
			System.out.println("LOADING SETUP");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			loadingSetupAddPage.NavigateToLoadingSetupSearchPage(testCaseName);
			loadingSetupAddPage.searchLoadingSetup(record, testCaseName);
			String text_ls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_ls.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			loadingSetupAddPage.performDoubleClick(driver, OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementPath(), OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			loadingSetupAddPage.clickOnDeleteIcon(testCaseName);
			sacsUtil.waiter(2);
			if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().equals("You cannot delete this loading setup. It is used on flight(s) in the time table")){
				sacsUtil.clickOnLink(driver, OperationsLoadingSetupAddEnum.CLOSEBTN.getElementPath(), OperationsLoadingSetupAddEnum.CLOSEBTN.getElementIdentifier(), ElementNamesEnum.CLOSE_BTN.getObjName(), bw, testCaseName);
				loginPage.logout(testCaseName);
				break;
			}else{
			loadingSetupAddPage.clickOnPopUpDelete(testCaseName);
			loadingSetupAddPage.searchLoadingSetup(record, testCaseName);
			String exp="No data to display";
			String actual_ls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_ls=sacsUtil.compareText(exp, actual_ls, bw, testCaseName);
			if(result_ls.equals("true")){
				loginPage.logout(testCaseName);
					}
				}
			}
			break;
		case "CSP":
			System.out.println("CATERING STOWAGE PLAN");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			cspAddPage.NavigateToCSPSearchPage(testCaseName);
			cspAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_csp=sacsUtil.getText(driver, OperationsCSPAddEnum.NODATATODISPLAY.getElementPath(), OperationsCSPAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_csp.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			cspAddPage.doubleClickOnSearchedRecord(testCaseName);
			cspAddPage.clickOnDeleteIcon(testCaseName);
			cspAddPage.clickOnPopUpContinueBtn(testCaseName);
			cspAddPage.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String actual_csp=sacsUtil.getText(driver, OperationsCSPAddEnum.NODATATODISPLAY.getElementPath(), OperationsCSPAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_csp=sacsUtil.compareText("No data to display", actual_csp, bw, testCaseName);
			if(result_csp.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "FTT":
			System.out.println("FLIGHT TIMETABLE");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, countryLevel);
			flightTimetable.NavigateToFlightTimetablePage(testCaseName);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.INVERTED_SYMBOL.getElement(), OperationFlightTTEnum.INVERTED_SYMBOL.getIdentifier(), ElementNamesEnum.SEARCH_DD.getObjName(), bw, testCaseName);
			flightTimetable.enterStartDate(testCaseName);
			flightTimetable.enterStopDate(testCaseName);
			flightTimetable.searchFlightTimetablep(record, testCaseName);
			String text_ftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_ftt.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			sacsUtil.performDoubleClick(driver, OperationFlightTTEnum.FLIGHTFIRSTROW.getElement(), OperationFlightTTEnum.FLIGHTFIRSTROW.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEICON.getElement(), OperationFlightTTEnum.DELETEICON.getIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getElement(), OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			flightTimetable.searchFlightTimetablep(record, testCaseName);
			String actual_ftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_ftt=sacsUtil.compareText("No data to display", actual_ftt, bw, testCaseName);
			if(result_ftt.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "PT":
			System.out.println("PRODUCT TYPE");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			costingPricingPage.naviagtiontoProductType(testCaseName);
			costingPricingPage.searchProductType(record, testCaseName);
			String text_pt=sacsUtil.getText(driver, CostingPricingProductTypeEnum.NODATATODISPLAY.getElementPath(), CostingPricingProductTypeEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_pt.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				costingPricingPage.performDoubleClick(driver, CostingPricingProductTypeEnum.PRODUCTTYPEFIRSTROW.getElementPath(), CostingPricingProductTypeEnum.PRODUCTTYPEFIRSTROW.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				costingPricingPage.clickOnDeleteButton(testCaseName);
				costingPricingPage.clickOnDeletePopupOKButton(testCaseName);
				sacsUtil.waiter(2);
				costingPricingPage.searchProductType(record, testCaseName);
				String act=sacsUtil.getText(driver, CostingPricingProductTypeEnum.NODATATODISPLAY.getElementPath(), CostingPricingProductTypeEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_pt=sacsUtil.compareText("No data to display", act, bw, testCaseName);
			if(result_pt.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "SC":
			System.out.println("SALES CODES");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			costingPricingSalesPricing.navigationToSalesPricingPage(testCaseName);
			costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_sc=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_sc.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, CostingPricingSalesPricingEnum.SINGLEROW.getElementPath(), CostingPricingSalesPricingEnum.SINGLEROW.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.DELETE_ICON.getElementPath(), CostingPricingSalesPricingEnum.DELETE_ICON.getElementIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().contains("You cannot delete sales number "+record+". It is used in:")){
					sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.OKBTN.getElementPath(), CostingPricingSalesPricingEnum.OKBTN.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
					loginPage.logout(testCaseName);
					break;
				}else{
				sacsUtil.clickOnLink(driver,CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementPath(), CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
				costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
				String act=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_sc=sacsUtil.compareText("No data to display", act, bw, testCaseName);
			if(result_sc.equals("true")){
				loginPage.logout(testCaseName);
					}
				}
			}
			break;
		case "CP":
			System.out.println("COSTING PARAMETER");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			CostingParameter.navigationToCostingParameterPage(testCaseName);
			CostingParameter.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_cp=sacsUtil.getText(driver, CostingPricingCostingParameterEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingCostingParameterEnum.NO_DATA_TO_DISPLAY.getIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_cp.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, CostingPricingCostingParameterEnum.SEARCH_RESULT.getElementPath(), CostingPricingCostingParameterEnum.SEARCH_RESULT.getIdentifier(), ElementNamesEnum.SEARCHRESULT.getObjName(), bw, testCaseName);
				sacsUtil.waiter(1);
				sacsUtil.clickOnLink(driver, CostingPricingCostingParameterEnum.REMOVE.getElementPath(), CostingPricingCostingParameterEnum.REMOVE.getIdentifier(), ElementNamesEnum.REMOVE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(1);
				sacsUtil.clickOnLink(driver, CostingPricingCostingParameterEnum.CONTINUE.getElementPath(), CostingPricingCostingParameterEnum.CONTINUE.getIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(1);
				CostingParameter.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
				String act=sacsUtil.getText(driver, CostingPricingCostingParameterEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingCostingParameterEnum.NO_DATA_TO_DISPLAY.getIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_sc=sacsUtil.compareText("No data to display", act, bw, testCaseName);
			if(result_sc.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "PRODCOST":
			System.out.println("PRODUCT COSTING");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			productCosting.navigateToProductCostingLandingPage(testCaseName);
			productCosting.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_pc=sacsUtil.getText(driver, CostingPricingProductCostingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingProductCostingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_pc.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, CostingPricingProductCostingEnum.PRODUCT_NUMBER_GRID_FIRST_ROW_AFTER_SEARCH.getElementPath(), CostingPricingProductCostingEnum.PRODUCT_NUMBER_GRID_FIRST_ROW_AFTER_SEARCH.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, CostingPricingProductCostingEnum.DELETE_PRODUCT.getElementPath(), CostingPricingProductCostingEnum.DELETE_PRODUCT.getElementIdentifier(), ElementNamesEnum.DELETE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, CostingPricingProductCostingEnum.CONTINUE_ON_DELETE_POPUP.getElementPath(), CostingPricingProductCostingEnum.CONTINUE_ON_DELETE_POPUP.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
				sacsUtil.waiter();
				productCosting.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
				sacsUtil.waiter(2);
				String text  = sacsUtil.getText(driver, CostingPricingProductCostingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingProductCostingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.NO_DATA_TO_DISPLAY.getObjName(), bw, testCaseName);
				String result_pc= sacsUtil.compareText("No data to display", text, bw, testCaseName);
			if(result_pc.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "COSTC":
			System.out.println("COST CENTER");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			systemCostCenterDeletePage.navigateToCostCenterSearchPage(testCaseName);
			systemCostCenterUpdatePage.enterDataInToSearchField(testCaseName, record);
			systemCostCenterUpdatePage.clickOnSearchButton(testCaseName);
			String text_cc=sacsUtil.getText(driver, SystemCostCenterSearchPageEnum.NODATATODISPLAY.getElementPath(), SystemCostCenterSearchPageEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_cc.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				systemCostCenterUpdatePage.doubleClickOnARecord(testCaseName, record);
				systemCostCenterDeletePage.clickOnRemoveIcon(testCaseName);
				systemCostCenterDeletePage.clickOnContinueButton(testCaseName);
				systemCostCenterUpdatePage.enterDataInToSearchField(testCaseName, record);
				systemCostCenterUpdatePage.clickOnSearchButton(testCaseName);
				sacsUtil.waiter(2);
				String text  = sacsUtil.getText(driver, SystemCostCenterSearchPageEnum.NODATATODISPLAY.getElementPath(), SystemCostCenterSearchPageEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.NO_DATA_TO_DISPLAY.getObjName(), bw, testCaseName);
				String result_pc= sacsUtil.compareText("No data to display", text, bw, testCaseName);
			if(result_pc.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "WREA":
			System.out.println("WASTE REASON");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			wasteReason.navigateToWasteReason(testCaseName);
			wasteReason.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
			String text_wr=sacsUtil.getText(driver, SystemWasteReasonEnum.NO_DATA_TO_DISPLAY.getElementPath(), SystemWasteReasonEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_wr.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.clickOnLink(driver, SystemWasteReasonEnum.DELETE.getElementPath(), SystemWasteReasonEnum.DELETE.getElementIdentifier(), ElementNamesEnum.DELETE.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver, SystemWasteReasonEnum.CONTINUE_ON_REMOVE_POPUP.getElementPath(), SystemWasteReasonEnum.CONTINUE_ON_REMOVE_POPUP.getElementIdentifier(), ElementNamesEnum.DELETE.getObjName(), bw, testCaseName);
				sacsUtil.waiter();
				sacsUtil.waiter(2);
				sacsUtil.clearTextFeild(driver, SystemStowingContainersEnums.SEARCH_BAR.getElementPath(), SystemStowingContainersEnums.SEARCH_BAR.getElementIdentifier());
				wasteReason.enterInSearchBarAndclickSearchButton(driver, record, testCaseName, bw);
				String text  = sacsUtil.getText(driver, SystemWasteReasonEnum.NO_DATA_TO_DISPLAY.getElementPath(), SystemWasteReasonEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.NO_DATA_TO_DISPLAY.getObjName(), bw, testCaseName);
				String result_wr= sacsUtil.compareText("No data to display", text, bw, testCaseName);
			if(result_wr.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		case "INVOICE":
			System.out.println("INVOICE");
			String[] data=record.split("#");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, countryLevel);
			flightTimetable.NavigateToFlightTimetablePage(testCaseName);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.INVERTED_SYMBOL.getElement(), OperationFlightTTEnum.INVERTED_SYMBOL.getIdentifier(), ElementNamesEnum.SEARCH_DD.getObjName(), bw, testCaseName);
			flightTimetable.enterStartDate_Parameter(data[0],testCaseName);
			flightTimetable.searchFlightTimetablep(data[4], testCaseName);
			String text_invftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_invftt.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			sacsUtil.performDoubleClick(driver, OperationFlightTTEnum.FLIGHTFIRSTROW.getElement(), OperationFlightTTEnum.FLIGHTFIRSTROW.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEICON.getElement(), OperationFlightTTEnum.DELETEICON.getIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getElement(), OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.INVERTED_SYMBOL.getElement(), OperationFlightTTEnum.INVERTED_SYMBOL.getIdentifier(), ElementNamesEnum.SEARCH_DD.getObjName(), bw, testCaseName);
			flightTimetable.enterStartDate_Parameter(data[0],testCaseName);
			flightTimetable.searchFlightTimetablep(data[4], testCaseName);
			String actual_ftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_ftt=sacsUtil.compareText("No data to display", actual_ftt, bw, testCaseName);
			if(result_ftt.equals("true")){
				loginPage.selectWorkingUnit(testCaseName, masterUnitValue);	
				loadingSetupAddPage.NavigateToLoadingSetupSearchPage(testCaseName);
				loadingSetupAddPage.searchLoadingSetup(data[3], testCaseName);
				String text_invls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
				if(text_invls.equals("No data to display")){
					loginPage.logout(testCaseName);
					break;
				}else{
				loadingSetupAddPage.performDoubleClick(driver, OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementPath(), OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				loadingSetupAddPage.clickOnDeleteIcon(testCaseName);
				sacsUtil.waiter(2);
				if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().equals("You cannot delete this loading setup. It is used on flight(s) in the time table")){
					sacsUtil.clickOnLink(driver, OperationsLoadingSetupAddEnum.CLOSEBTN.getElementPath(), OperationsLoadingSetupAddEnum.CLOSEBTN.getElementIdentifier(), ElementNamesEnum.CLOSE_BTN.getObjName(), bw, testCaseName);
					loginPage.logout(testCaseName);
					break;
				}else{
				loadingSetupAddPage.clickOnPopUpDelete(testCaseName);
				loadingSetupAddPage.searchLoadingSetup(data[3], testCaseName);
				String exp="No data to display";
				String actual_ls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_ls=sacsUtil.compareText(exp, actual_ls, bw, testCaseName);
				if(result_ls.equals("true")){
					loginPage.selectWorkingUnit(testCaseName, countryLevel);
					loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
					addDeliveryPlansPage.navigateToDeliveryPlanSearchPage(testCaseName);
					addDeliveryPlansPage.searchDeliveryPlan(data[2], testCaseName);
					String text_invdp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
					if(text_invdp.equals("No data to display")){
						loginPage.logout(testCaseName);
						break;
					}else{
					addDeliveryPlansPage.performDoubleClick(driver, OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementPath(), OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					sacsUtil.waiter(2);
					addDeliveryPlansPage.clickOnOk(testCaseName);
					addDeliveryPlansPage.clickOnDeleteIcon(testCaseName);
					addDeliveryPlansPage.clickOnPopUpContinue(testCaseName);
					sacsUtil.waiter(2);
					if(driver.findElement(By.xpath("//*[@id='errorAlert']/div[2]")).getText().equals("You cannot delete this delivery plan! It is used in loading setup(s) and flight(s) timetable.")){
						sacsUtil.clickOnLink(driver, OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementPath(), OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
						loginPage.logout(testCaseName);
						break;
					}else{
					addDeliveryPlansPage.searchDeliveryPlan(data[2], testCaseName);
					String actual_dp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					String result_dp=sacsUtil.compareText("No data to display", actual_dp, bw, testCaseName);
					if(result_dp.equals("true")){
						loginPage.selectWorkingUnit(testCaseName, countryLevel);
						loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
						costingPricingSalesPricing.navigationToSalesPricingPage(testCaseName);
						costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, data[1], testCaseName, bw);
						String text_invsc=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
						if(text_invsc.equals("No data to display")){
							loginPage.logout(testCaseName);
							break;
						}else{
							sacsUtil.performDoubleClick(driver, CostingPricingSalesPricingEnum.SINGLEROW.getElementPath(), CostingPricingSalesPricingEnum.SINGLEROW.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
							sacsUtil.waiter(2);
							sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.DELETE_ICON.getElementPath(), CostingPricingSalesPricingEnum.DELETE_ICON.getElementIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
							sacsUtil.waiter(2);
							if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().contains("You cannot delete sales number "+record+". It is used in:")){
								sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.OKBTN.getElementPath(), CostingPricingSalesPricingEnum.OKBTN.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
								loginPage.logout(testCaseName);
								break;
							}else{
							sacsUtil.clickOnLink(driver,CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementPath(), CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
							costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, data[1], testCaseName, bw);
							String act=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
							String result_sc=sacsUtil.compareText("No data to display", act, bw, testCaseName);
						if(result_sc.equals("true")){
							loginPage.logout(testCaseName);
								}
							}
						}
					}
					}
					}
				}
				}
				}
			}
			}
			break;
		case "PAX":
			System.out.println("PAX DATA");
			String[] paxdata=record.split("#");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, countryLevel);
			flightTimetable.NavigateToFlightTimetablePage(testCaseName);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.INVERTED_SYMBOL.getElement(), OperationFlightTTEnum.INVERTED_SYMBOL.getIdentifier(), ElementNamesEnum.SEARCH_DD.getObjName(), bw, testCaseName);
			flightTimetable.enterStartDate_Parameter(new DateTime().DDMMYYYY(),testCaseName);
			flightTimetable.searchFlightTimetablep(paxdata[3], testCaseName);
			String text_paxftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_paxftt.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
			sacsUtil.performDoubleClick(driver, OperationFlightTTEnum.FLIGHTFIRSTROW.getElement(), OperationFlightTTEnum.FLIGHTFIRSTROW.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEICON.getElement(), OperationFlightTTEnum.DELETEICON.getIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getElement(), OperationFlightTTEnum.DELETEPOPUP_CONTINUEBTN.getIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
			sacsUtil.waiter(2);
			sacsUtil.clickOnLink(driver, OperationFlightTTEnum.INVERTED_SYMBOL.getElement(), OperationFlightTTEnum.INVERTED_SYMBOL.getIdentifier(), ElementNamesEnum.SEARCH_DD.getObjName(), bw, testCaseName);
			flightTimetable.enterStartDate_Parameter(new DateTime().DDMMYYYY(),testCaseName);
			flightTimetable.searchFlightTimetablep(paxdata[3], testCaseName);
			String actual_ftt=sacsUtil.getText(driver, OperationFlightTTEnum.NODATATODISPLAY.getElement(), OperationFlightTTEnum.NODATATODISPLAY.getIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
			String result_ftt=sacsUtil.compareText("No data to display", actual_ftt, bw, testCaseName);
			if(result_ftt.equals("true")){
				loginPage.selectWorkingUnit(testCaseName, masterUnitValue);	
				loadingSetupAddPage.NavigateToLoadingSetupSearchPage(testCaseName);
				loadingSetupAddPage.searchLoadingSetup(paxdata[2], testCaseName);
				String text_paxls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
				if(text_paxls.equals("No data to display")){
					loginPage.logout(testCaseName);
					break;
				}else{
				loadingSetupAddPage.performDoubleClick(driver, OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementPath(), OperationsLoadingSetupAddEnum.RESULT_GRID_FIRST_ROW_LOADING_SETUP_AFTER_SEARCH.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				loadingSetupAddPage.clickOnDeleteIcon(testCaseName);
				sacsUtil.waiter(2);
				if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().equals("You cannot delete this loading setup. It is used on flight(s) in the time table")){
					sacsUtil.clickOnLink(driver, OperationsLoadingSetupAddEnum.CLOSEBTN.getElementPath(), OperationsLoadingSetupAddEnum.CLOSEBTN.getElementIdentifier(), ElementNamesEnum.CLOSE_BTN.getObjName(), bw, testCaseName);
					loginPage.logout(testCaseName);
					break;
				}else{
				loadingSetupAddPage.clickOnPopUpDelete(testCaseName);
				loadingSetupAddPage.searchLoadingSetup(paxdata[2], testCaseName);
				String exp="No data to display";
				String actual_ls=sacsUtil.getText(driver, OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementPath(), OperationsLoadingSetupAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_ls=sacsUtil.compareText(exp, actual_ls, bw, testCaseName);
				if(result_ls.equals("true")){
					loginPage.selectWorkingUnit(testCaseName, countryLevel);
					loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
					addDeliveryPlansPage.navigateToDeliveryPlanSearchPage(testCaseName);
					addDeliveryPlansPage.searchDeliveryPlan(paxdata[1], testCaseName);
					String text_paxdp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
					if(text_paxdp.equals("No data to display")){
						loginPage.logout(testCaseName);
						break;
					}else{
					addDeliveryPlansPage.performDoubleClick(driver, OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementPath(), OperationsDeliveryPlansAddEnum.RESULT_FIRST_ROW_FIRST_COL.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					sacsUtil.waiter(2);
					addDeliveryPlansPage.clickOnOk(testCaseName);
					addDeliveryPlansPage.clickOnDeleteIcon(testCaseName);
					addDeliveryPlansPage.clickOnPopUpContinue(testCaseName);
					sacsUtil.waiter(2);
					if(driver.findElement(By.xpath("//*[@id='errorAlert']/div[2]")).getText().equals("You cannot delete this delivery plan! It is used in loading setup(s) and flight(s) timetable.")){
						sacsUtil.clickOnLink(driver, OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementPath(), OperationsDeliveryPlansAddEnum.POPUP_OK_BUTTON.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
						loginPage.logout(testCaseName);
						break;
					}else{
					addDeliveryPlansPage.searchDeliveryPlan(paxdata[1], testCaseName);
					String actual_dp=sacsUtil.getText(driver, OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementPath(), OperationsDeliveryPlansAddEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.GRIDFIRSTROW.getObjName(), bw, testCaseName);
					String result_dp=sacsUtil.compareText("No data to display", actual_dp, bw, testCaseName);
					if(result_dp.equals("true")){
						loginPage.selectWorkingUnit(testCaseName, countryLevel);
						loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
						costingPricingSalesPricing.navigationToSalesPricingPage(testCaseName);
						costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, paxdata[0], testCaseName, bw);
						String text_paxsc=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
						if(text_paxsc.equals("No data to display")){
							loginPage.logout(testCaseName);
							break;
						}else{
							sacsUtil.performDoubleClick(driver, CostingPricingSalesPricingEnum.SINGLEROW.getElementPath(), CostingPricingSalesPricingEnum.SINGLEROW.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
							sacsUtil.waiter(2);
							sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.DELETE_ICON.getElementPath(), CostingPricingSalesPricingEnum.DELETE_ICON.getElementIdentifier(), ElementNamesEnum.DELETEICON.getObjName(), bw, testCaseName);
							sacsUtil.waiter(2);
							if(driver.findElement(By.xpath("//*[@id='loadingModal']/div[1]/div")).getText().contains("You cannot delete sales number "+record+". It is used in:")){
								sacsUtil.clickOnLink(driver, CostingPricingSalesPricingEnum.OKBTN.getElementPath(), CostingPricingSalesPricingEnum.OKBTN.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
								loginPage.logout(testCaseName);
								break;
							}else{
							sacsUtil.clickOnLink(driver,CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementPath(), CostingPricingSalesPricingEnum.DELETE_POPUP_CONTINUE.getElementIdentifier(), ElementNamesEnum.CONTINUE.getObjName(), bw, testCaseName);
							costingPricingSalesPricing.enterInSearchBarAndclickSearchButton(driver, paxdata[0], testCaseName, bw);
							String act=sacsUtil.getText(driver, CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementPath(), CostingPricingSalesPricingEnum.NO_DATA_TO_DISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
							String result_sc=sacsUtil.compareText("No data to display", act, bw, testCaseName);
						if(result_sc.equals("true")){
							loginPage.logout(testCaseName);
								}
							}
						}
					}
					}
					}
				}
				}
				}
			}
			}
			break;
		case "CTOG":
			System.out.println("CUSTOMER TURNOVER GROUP");
			instantiateBrowser.openUrl(driver, url, bw, testCaseName);
			loginPage.loginSuccess(username, password, testCaseName);
			loginPage.selectWorkingUnit(testCaseName, masterUnitValue);
			customerTurnoverGroupPage.naviagtiontoCustomerTurnoverGroup(testCaseName);
			customerTurnoverGroupPage.searchCustomerTurnoverGroup(record, testCaseName);
			String text_ctog=sacsUtil.getText(driver, InvoiceCustomerTurnOverGroupEnum.NODATATODISPLAY.getElementPath(), InvoiceCustomerTurnOverGroupEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCH_RESULT_GRID.getObjName(), bw, testCaseName);
			if(text_ctog.equals("No data to display")){
				loginPage.logout(testCaseName);
				break;
			}else{
				sacsUtil.performDoubleClick(driver, InvoiceCustomerTurnOverGroupEnum.SEARCHEDITEM_DOUBLEDCLICK.getElementPath(), InvoiceCustomerTurnOverGroupEnum.SEARCHEDITEM_DOUBLEDCLICK.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver,InvoiceCustomerTurnOverGroupEnum.ADDCTOG_REMOVEICON.getElementPath(), InvoiceCustomerTurnOverGroupEnum.ADDCTOG_REMOVEICON.getElementIdentifier(), ElementNamesEnum.REMOVE_ICON.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				sacsUtil.clickOnLink(driver,InvoiceCustomerTurnOverGroupEnum.CTOG_DELETEPOPUP_OKBTN.getElementPath(), InvoiceCustomerTurnOverGroupEnum.CTOG_DELETEPOPUP_OKBTN.getElementIdentifier(), ElementNamesEnum.OK.getObjName(), bw, testCaseName);
				sacsUtil.waiter(2);
				customerTurnoverGroupPage.searchCustomerTurnoverGroup(record, testCaseName);
				String act=sacsUtil.getText(driver, InvoiceCustomerTurnOverGroupEnum.NODATATODISPLAY.getElementPath(), InvoiceCustomerTurnOverGroupEnum.NODATATODISPLAY.getElementIdentifier(), ElementNamesEnum.SEARCHGRIDFIRSTROW.getObjName(), bw, testCaseName);
				String result_ctog=sacsUtil.compareText("No data to display", act, bw, testCaseName);
			if(result_ctog.equals("true")){
				loginPage.logout(testCaseName);
				}
			}
			break;
		default:
			System.out.println("No Function to Perform");
			break;
		}
	}
	
	public List<String> convertToarraylist() throws IOException{
		 BufferedReader in = new BufferedReader(new FileReader(flatFilePath));
	        String str;
	        List<String> list = new ArrayList<String>();
	        while((str = in.readLine()) != null){
	            list.add(str);
	        }
	        in.close();
	        return list;
	}
	
	@AfterClass
    public void report() throws Exception
	{
		System.out.println("In After Class");
		 driver.quit();
	}
}
*/