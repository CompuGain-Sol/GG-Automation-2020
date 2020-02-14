/*package com.sacs.utils;

import java.io.BufferedWriter;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sacs.PageOjects.SystemStowingContainersEnums;
import com.sacs.funUtils.WebElements;

public class SacsUtil extends WebElements{
	public int customerIndex=0;
	By searchfilter=By.className(SystemStowingContainersEnums.SEARCHFILTER.getElementPath());
	By searchbar=By.xpath(SystemStowingContainersEnums.SEARCH_BAR.getElementPath());
	By searchsubmit=By.xpath(SystemStowingContainersEnums.SEARCHSUBMITE.getElementPath());
	
	public SacsUtil(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	private static Logger logger = Logger.getLogger(SacsUtil.class);
	private static String expectedResult;
	private static String actualResult;
	
	public void waitForWebElements(WebDriverWait driverWait, By webElement, String objectName){
		int i = 1;
		boolean flag = false;
		while(flag==false && i<=3){
			try{
				if(driverWait.until(ExpectedConditions.visibilityOfElementLocated(webElement)).isDisplayed()){
					flag = true;
				}
			}catch(Exception e){
				logger.error("The element with the "+webElement+" idenfier was not visible");
				 try {
                     Thread.sleep(1000);
                     System.out.println("!!! Trying to Find the Element : Try No. "+i+"  !!!");
               } catch (InterruptedException e1) {
                     e1.printStackTrace();
               }
			}
			i++;
		}
	}
	
	public void waitForWebElement(WebDriverWait driverWait, String webElement, String by, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		logger.info("---- waitForWebElement ----");
		try {
			if(by.equals("xpath")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElement)));
			}
			else if(by.equals("id")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(webElement)));
			}
			else if(by.equals("className")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(webElement)));
			}
			else if(by.equals("linkText")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(webElement)));
			}
			else if(by.equals("name")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(webElement)));
			}
			else if(by.equals("css")){
				driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(webElement)));
			}
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
		
	}
	
	
	public void waitForWebElementByXpath(WebDriverWait driverWait, String webElement, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElement)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			 throw new Exception(e);
		}
	}
	
	public void waitForWebElementById(WebDriverWait driverWait, String webElement, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(webElement)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
	}
	
	public void waitForWebElementByName(WebDriverWait driverWait, String webElement, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(webElement)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
	}
	
	public void waitForWebElementByClassName(WebDriverWait driverWait, String className, String objectName, BufferedWriter bw, String testCaseName)  throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
	}
	
	public void waitForWebElementByLinkText(WebDriverWait driverWait, String webElement, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(webElement)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
	}
	
	public void waitForWebElementByCss(WebDriverWait driverWait, String webElement, String objectName, BufferedWriter bw, String testCaseName) throws Exception{
		try {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(webElement)));
		} catch (Exception e) {
			expectedResult = "The element \"" + objectName+ "\" should be present.";
			actualResult = "The element \"" + objectName+ "\" is not present.";
			//updateFailedTestSteps(actualResult, expectedResult, "", testCaseName, "", bw);
			throw new Exception(e);
		}
	}
	
	public void waiter(){
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void waiter(int n){
		try{
			Thread.sleep(1000 * n);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static int length = 4;
	public String generateRandomString(){
		Random rnd = new Random();
	   StringBuilder sb = new StringBuilder( length );
	   for( int i = 0; i < length; i++ ) 
	      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	   return sb.toString();
	}
	
	*//** Generate  random integers in the range 0..n. *//*
	public int randomInteger(int numberOfDigits) {
		 Random randomGenerator = new Random();
	        int ndigits = 1;
		    int randomInt;
	        boolean flag = false;
		    for (int i = 1; i<=numberOfDigits ; i++)
	    			ndigits = 10 * ndigits;
		    
		    if(numberOfDigits==3){
                do{
                    randomInt = randomGenerator.nextInt(ndigits);
                    logger.info("Generated : " + randomInt);
                    if(randomInt==0)
                       flag = false;
                    else{
                           if(randomInt<100)
                                  flag = false;
                           else
                                  flag = true;
                    }
                 }while(!flag);
            }
            else{
               do{
                  randomInt = randomGenerator.nextInt(ndigits);
                  logger.info("Generated : " + randomInt);
                  if(randomInt==0)
                    flag = false;
                  else
                         flag = true;
               }while(!flag);
            }

	    return randomInt;
	  }

public static List<WebElement> getListOfWebElementsByClassName(WebDriver driver, String className) {
		
		return driver.findElements(By.className(className));
	}

*//** Generate  random String of special characters. *//*
static final String SP = "!@#$%^&*()_+/*-?><|'_=";
public String generateRandomSpecialCharString(int length){
	Random rnd = new Random();
   StringBuilder sb = new StringBuilder( length );
   for( int i = 0; i < length; i++ ) 
      sb.append( SP.charAt( rnd.nextInt(SP.length()) ) );
   return sb.toString();
}

 Selecting Customer Code for Unit Level Unit passed 
public int selectCustomerCode(String workingUnit){
	 int CustomerCode = 0;
	 switch (workingUnit)
	 {
		 case "UK-LBA 3298":
			 		CustomerCode = 16;
			 		break;
		 case "AUS-SYD 5004":
			 		CustomerCode = 16;
			 		break;
		 case "PE-LIMA 1712":
			 		//CustomerCode = 16;
			 		CustomerCode = 20;
	 			    break;
		 default :
			 		logger.info("No Customer Code has been selected");
			 		break;
	 }
	 System.out.println("customerIndex is: "+customerIndex);
	return CustomerCode;
  }

public void clickSearchFilter() throws Exception
{
	
	click(searchfilter);
	logger.info("Clicked on search filter");
//	driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(webElement)));
	
}

public void enterInSearchBarAndclickSearchButton(String itemToSearch) throws Exception {
	enterText(searchbar, itemToSearch);
	logger.info("Text entered in search bar is "+itemToSearch);
	click(searchsubmit);
	logger.info("Clicked on submit button");
}

}


*/