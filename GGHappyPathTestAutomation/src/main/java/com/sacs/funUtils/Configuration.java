
package com.sacs.funUtils;

import org.apache.log4j.Logger;

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
	
	public static String randomData()
	{
		String param = System.getProperty("Random");
		if (isEmpty(param)) {
			return sRandomData;
		}
		logger.info("The parameter for random data is" + param);
		logger.info("Random Value" + sRandomData);
		return param;
	}

	public static String getEnvironment() {
		String param = System.getProperty("environment");
		if (isEmpty(param)) {
			return sEnvironment;
		}
		logger.info("The parameter of Username from pom" + param);
		logger.info("The Automation URL is not from Pom" + sEnvironment);
		return param;
	}

	public static String getSeleniumJar() {
		String param = System.getProperty("seleniumjar");
		if (isEmpty(param)) {
			return seleniumjar;
		}
		logger.info("The parameter of Username from pom" + param);
		logger.info("The Automation URL is not from Pom" + seleniumjar);
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
	
	public static String getMasterUnit() {
		String param = System.getProperty("masterUnit");
	
		if (isEmpty(param)) {
				return SCOUNTRYLEVEL;
		}
		logger.info("The parameter of Master Unit from pom " + param);
		return param;
	}
	
	public static String getCountryUnit() {
		String param = System.getProperty("countryUnit");
	
		if (isEmpty(param)) {
				return SCOUNTRYCODE;
		}
		logger.info("The parameter of Country Unit from pom " + param);
		return param;
	}
	
	public static String getMainStore() {
		String param = System.getProperty("mainStore");
	
		if (isEmpty(param)) {
				return SMAINSTORE;
		}
		logger.info("The parameter of Main Store from pom " + param);
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
	
	public static String getEmailIdS() {
		String param = System.getProperty("email");
		if (isEmpty(param)) {
			return defaultEmailID;
		}
		logger.info("The Paramter for email is " + param);
		logger.info("The username paramter is not from pom"	+ defaultEmailID);
		return param;
	}


	public static String getAutomationBrowser() {
		String param = System.getProperty("browser");
		if (isEmpty(param)) {
			return SBROWSER;
		}
		logger.info("The browser Parameter from Pom" + param);
		return param;
	}

	public static String getGrid() {
		String param = System.getProperty("grid");
		if (isEmpty(param)) {
			return grid;
		}
		logger.info("The grid Parameter from Pom" + param);
		return param;
	}
	
}
