/*package com.sacs.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;



public class InstantiateBrowser extends SetWebdriverWait {
	private static Logger BROWSERINSTANTIATELOGGER = Logger.getLogger(InstantiateBrowser.class);
    private static WebDriver driver=null;
    private  DateTime dateTime = new DateTime();
    private WebDriverWait wait;
    private SacsUtil sacsUtil;
    private String DOWNLOADSPATH=System.getProperty("user.dir")+"\\fileDownloads";
    
    public InstantiateBrowser(){
    	sacsUtil = new SacsUtil();
    }
    
	public WebDriver setUp(String browser)
    {
		SetupProperties properties = new SetupProperties();
		properties.initializeProperties();
    	if (browser.equalsIgnoreCase("Chrome")){
                        System.setProperty("webdriver.chrome.driver", SetupProperties.chromeDriverpath);
                        String downloadFilepath = DOWNLOADSPATH;
                        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                        chromePrefs.put("profile.default_content_settings.popups", 0);
                        chromePrefs.put("download.default_directory", downloadFilepath);
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--test-type");
                        //options.setExperimentalOptions("prefs", chromePrefs);
                        options.setExperimentalOption("prefs", chromePrefs);
                        options.addArguments("--start-maximized");
                        options.addArguments("--always-authorize-plugins");
                        options.addArguments("--ignore-certificate-errors");
                        options.addArguments("chrome.switches","--disable-extensions");
                        HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();

                        DesiredCapabilities cap = DesiredCapabilities.chrome();
                        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
                        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                        cap.setCapability(ChromeOptions.CAPABILITY, options);
                        options.addArguments("--always-authorize-plugins");
                        options.addArguments("--ignore-certificate-errors");

                        driver= new ChromeDriver(cap);
                     //   driver.manage().window().maximize();
                        BROWSERINSTANTIATELOGGER.info("Chrome broswer initiated");
        }
        else if (browser.equalsIgnoreCase("IE"))
        {               
                        System.setProperty("webdriver.ie.driver",SetupProperties.IEDriverpath);
                        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                                        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                                        caps.setCapability("ignoreZoomSetting", true);
                                        caps.setCapability("ignoreProtectedModeSettings" , true);
                                        try {
                                                    Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
                                        } catch (IOException e) {
                                                        e.printStackTrace();
                                        }
                                        driver= new InternetExplorerDriver(caps);
                                        driver.manage().window().maximize();
        }
        else{
        	driver = new FirefoxDriver();
        	 driver.manage().window().maximize();
        }
    	BROWSERINSTANTIATELOGGER.info("Returning driver from loginTest class : "+driver);
   // 	driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
    	return driver;
    }
	
	public void openUrl(WebDriver driver, String url, BufferedWriter bw, String testCaseName) throws Exception
	{
		AccessWebElements.startTime = dateTime.hmsTime();
		BROWSERINSTANTIATELOGGER.info("URL=="+url);
		driver.get(url);
		try {
			wait= webDriverWait(driver);
			//sacsUtil.waitForWebElement(wait, LoginPageEnum.LOGINSUBMIT_ADFS.getElementPath(),LoginPageEnum.LOGINSUBMIT_ADFS.getElementIdentifier(), ElementNamesEnum.LOGINSUBMIT.getObjName(), bw, testCaseName);
			//verifyPageElement(driver, LoginPageEnum.USERNAME_ADFS.getElementPath(), LoginPageEnum.USERNAME_ADFS.getElementIdentifier(), ElementNamesEnum.LOGINPAGE.getObjName(), bw, testCaseName);
			
		} catch (Exception e) {
			BROWSERINSTANTIATELOGGER.error("Method: openUrl; Error Msg: "+e.getMessage());
			throw new Exception(e);
		}
		
	}
	
	public String getFilePath(String sFilepath) {
        char cforwardslash = (char) 47;
        char cbackslash = (char) 92;
        BROWSERINSTANTIATELOGGER.info("File path is "+sFilepath);
        String sPath = System.getProperty("user.dir").replace(cbackslash,
                     cforwardslash)
                     + sFilepath;

        File file = new File(sPath);
        if (file.exists()) {
               sPath = file.getAbsolutePath();
               BROWSERINSTANTIATELOGGER.info("The File Path is " + sPath);
        } else {
        }
        return sPath;
 }

	
}
*/