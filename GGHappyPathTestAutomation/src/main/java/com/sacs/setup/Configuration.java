
package com.sacs.setup;

import org.apache.log4j.Logger;

import com.sacs.funUtils.SACSSetup;

public class Configuration implements SACSSetup	{

	private static Logger logger = Logger.getLogger(Configuration.class);
	int urlFlag=1;
	    
	public static boolean isEmpty(String item) {
		if (item == null) {
			return true;
		}

		else if (item.trim().length() == 0) {
			return true;
		}

		return false;
	}
	
	public static String getAutomationBrowser() {
		String param = System.getProperty("browser");
		if (isEmpty(param)) {
			return SBROWSER;
		}
		logger.info("The browser Parameter from Pom" + param);
		return param;
	}
	
	public static String getAutomationURL() {
		String param = System.getProperty("environmentURL");
	
		if (isEmpty(param)) {
				return SURL;
		}
		logger.info("The parameter of url from pom " + param);
		return param;
	}
	
	public static String getUserName(){
		String param = System.getProperty("username");
		if (isEmpty(param)){
		return SUSERNAME;
		}
		logger.info("The parameter of username from pom " + param);
		return param;
	}

	public static String getPassword(){
		String param = System.getProperty("password");
		if (isEmpty(param)){
		return SPASSWORD;
		}
		logger.info("The parameter of password from pom " + param);
		return param;
	}
	
	public static String getCountryleve1(){
		String param = System.getProperty("countryLevel");
		if (isEmpty(param)){
		return SCOUNTRYLEVEL;
		}
				logger.info("The parameter of country level from pom " + param);
		return param;
	}
	
	
	public static String getCustomercode(){
		String param = System.getProperty("customercode");
		if (isEmpty(param)){
		return sCUSTOMERCODE;
		}
		logger.info("The parameter of country code from pom " + param);
		return param;
	}
	

	public static String getCountrycode(){
		String param = System.getProperty("countrycode");
		if (isEmpty(param)){
		return SCOUNTRYCODE;
		}
		logger.info("The parameter of country code from pom " + param);
		return param;
	}

	public static String getMainstore(){
		String param = System.getProperty("mainStore");
		if (isEmpty(param)){
		return SMAINSTORE;
		}
		logger.info("The parameter of main store from pom " + param);
		return param;
	}
	
	public static String getCustomerCode(){
		String param = System.getProperty("customerCode");
		if (isEmpty(param)){
		return SMAINSTORE;
		}
		logger.info("The parameter of customer code from pom " + param);
		return param;
	}
	
	public static String getSuiteName(){
		String param = System.getProperty("suiteName");
		if (isEmpty(param)){
		return SSUITENAME;
		}
		logger.info("The parameter of suite from pom " + param);
		return param;
	}
	
	public static String getProjectName(){
		String param = System.getProperty("projectName");
		if (isEmpty(param)){
		return SPROJECT;
		}
		logger.info("The parameter of project name from pom " + param);
		return param;
	}
	public static String getTestCaseFile() {
		String param = System.getProperty("testcasefile");
	     logger.info("Test Case File is"+param);
		if (isEmpty(param)) {
			return testcasefile;
		}
		logger.info("The test case file path" + param);
		return param;
	}
}
