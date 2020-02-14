package com.sacs.funUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase implements SACSSetup {
	private static Logger logger = Logger.getLogger(TestBase.class);
	public WebDriver secondDriver, thirdDriver;
	public FirefoxProfile profile;
	private static String versionvalue = "";
	public String DBSTRING = null;
	public String surl;
	public String username;
	public String password;
	public static String language="en";
	public String browser;
	public String masterUnit;
	public String countryUnit;
	public String mainStore;
	public static String getVersionvalue() {
		return versionvalue;
	}

	public TestBase() {
		browser=Configuration.getAutomationBrowser();
		surl=Configuration.getAutomationURL();
		username=Configuration.getUserName();
		password=Configuration.getPassword();
		masterUnit=Configuration.getMasterUnit();
		countryUnit=Configuration.getCountryUnit();
		mainStore=Configuration.getMainStore();
	}
	

	public static void setVersionvalue(String versionvalue) {
		TestBase.versionvalue = versionvalue;
	}

	public static boolean isEmpty(String item) {
		if (item == null || item.trim().length() == 0) {
			return true;
		}
		return false;
	}

	public DesiredCapabilities chromeProfileSetUp() {
		System.setProperty("webdriver.chrome.driver", getFilePath(CHROMEPATH));
		//System.setProperty("webdriver.chrome.driver", KBSSetup.CHROMEPATHCIRCLECI);
		String downloadFilepath = getFilePath(DOWNLOADSPATH);
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		// options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("start-maximized");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.addArguments("--always-authorize-plugins");
		options.addArguments("--ignore-certificate-errors");
		return cap;
	}

	public DesiredCapabilities ieProfileSetUp() {
		System.setProperty("webdriver.ie.driver", getFilePath(IEPATH));
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		caps.setCapability("ignoreZoomSetting", true);
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setCapability("enablePersistentHover", true);
		caps.setCapability("nativeEvents", false);
		try {
			Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return caps;
	}

	/**
	 * Initializes web driver object based on the browser type
	 * 
	 * @param sbrowser
	 *            : THe browser we need to run
	 * @param surl
	 *            : the URL of the application
	 * @return : Webdriver object
	 */
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver(String sbrowser) {
		 WebDriver driver = null;
		if (driver == null && sbrowser != null) {
			if (sbrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", getFilePath(FIREFOXPATH));
				String downloadPath = getFilePath(DOWNLOADSPATH);
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("browser.download.folderList", 2);
				profile.setPreference("browser.download.manager.showWhenStarting", false);
				profile.setPreference("browser.download.dir", downloadPath);
				profile.setPreference("browser.helperApps.neverAsk.openFile",
						"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
						"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
				profile.setPreference("browser.helperApps.alwaysAsk.force", false);
				profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
				profile.setPreference("browser.download.manager.focusWhenStarting", false);
				profile.setPreference("browser.download.manager.useWindow", false);
				profile.setPreference("browser.download.manager.showAlertOnComplete", false);
				profile.setPreference("browser.download.manager.closeWhenDone", false);
				profile.setPreference("xpinstall.signatures.required", false);
				System.out.println("The Profile Setup Data");
				driver = new FirefoxDriver((Capabilities) profile);
				String s = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
				System.out.println("Browser name : " + s);
			} else if (sbrowser.equalsIgnoreCase("Chrome")) {

				driver = new ChromeDriver(chromeProfileSetUp());
				String s = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
				System.out.println("Browser name : " + s.split("Chrome"));
				String[] result = s.split("Chrome");
				versionvalue = result[1].substring(1, 6);
				setVersionvalue(versionvalue);
			} else if (sbrowser.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver(ieProfileSetUp());
			} else if (sbrowser.equalsIgnoreCase("Safari")) {
				DesiredCapabilities capabilities = DesiredCapabilities.safari();
				driver = new SafariDriver(capabilities);
			}
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		}
		return driver;
	}

	/**
	 * This Method is used to get the Absolute path of the File
	 * 
	 * @param sFilepath
	 *            : Contains the Folder Path.
	 * @return : It returns the Path of the File
	 */
	public static String getFilePath(String sFilepath) {
		char cforwardslash = (char) 47;
		char cbackslash = (char) 92;
		String sPath = System.getProperty("user.dir").replace(cbackslash, cforwardslash) + sFilepath;

		File file = new File(sPath);
		if (file.exists()) {
			sPath = file.getAbsolutePath();
			//System.out.println("The File Path is " + sPath);
		} else {
			//System.out.println("File not Found");
		}
		return sPath;
	}
	
	public void launchURL(String surl,WebDriver driver)
	{
		driver.get(surl);
		logger.info("Application lauched with URL::::::::"+surl);
	}
	
	public void logout(WebDriver driver){
		try{
			if(driver.findElement(By.id("loginBtn")).isDisplayed())
			{
				WebDriverWait driverwait = new WebDriverWait(driver, 60);
				driver.findElement(By.id("loginBtn")).click();
				driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			}
		}
		catch(Exception e)
		{
			logger.info("Logout button is not found!!!!!");
		}
		
	}
	
	public void browserQuit(WebDriver driver)
	{
		try
		{
		driver.quit();
		driver=null;
		}
		catch(Exception e)
		{
			logger.info("Event Driver is Not Initialized");
		}

	}
	

}
