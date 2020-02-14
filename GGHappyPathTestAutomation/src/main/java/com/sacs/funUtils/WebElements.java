package com.sacs.funUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * 
 * All the WebElements would be handled here.
 * 
 */
public abstract class WebElements extends WaitForElements implements SACSSetup  {

	private WebDriver driver;


	private static Logger logger = Logger.getLogger(WebElements.class);

	int maxTimeout=60;
	public WebElements(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	
	}
	
	public  void scrollIntoView(By elementLocator) {
		/*try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement element = driver.findElement(elementLocator);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			logger.info("unable to scroll element into view");
		}*/
	}


	/*public void doubleClick(String Imgpath,ScreenRegion s,Mouse mouse) {

		Target imageTarget = new ImageTarget(new File(Imgpath));

		s.wait(imageTarget, 500);

		if (s.find(imageTarget) != null) {

		ScreenRegion r = s.find(imageTarget);

		mouse.doubleClick(r.getCenter());

		} else {

		System.out.println("object not found");

		}

		}



		public void enterText(String sIMagepath, String sText,ScreenRegion s,Mouse mouse,Keyboard keyboard) {


		Target imageTarget = new ImageTarget(new File(sIMagepath));

		s.wait(imageTarget, 500);

		if (s.find(imageTarget) != null) {

		ScreenRegion r = s.find(imageTarget);

		mouse.click(r.getCenter());



		keyboard.type(sText);

		} else {

		System.out.println("Object not found to enter text");

		}

		}

		public void Click(String Imgpath,ScreenRegion s,Mouse mouse) {

		Target imageTarget = new ImageTarget(new File(Imgpath));

		s.wait(imageTarget, 500);

		if (s.find(imageTarget) != null) {

		ScreenRegion r = s.find(imageTarget);

		mouse.click(r.getCenter());

		} else {

		System.out.println("object not found");

		}

		}

*/
	/**
	 * Close browser
	 */
	public void quitBrower()
	{
		driver.close();
	}

	/**
	 * Navigate from current working browser
	 */

	public void navigateBrowser(String url)
	{
		driver.navigate().to(url);
	}

	/**
	 * Navigate to backward screen
	 */

	public void navigateBackward()  
	   {     
		pause(5000); 
	   try{
	   driver.navigate().back();
	   pause(5000);
	   }       
	   catch (org.openqa.selenium.WebDriverException e){
	   logger.error("Error Block on Back Button");       
	   }
	   }
	/**
	 *Refresing Browser 
	 */
	public void refreshBrowser()
	{
		driver.navigate().refresh();
	}

	/**
	 * To scroll page up
	 */

	public void pageUp(){

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);

	}
	/**
	 * To scroll page down
	 */

	public void pageDown(){

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		logger.info("The Page Down is executed");
	}
	
	/**
	 * Taking control to alert
	 */
	public boolean switchTOAlert(String salertText) {
		boolean flag = false;
		Alert alert = driver.switchTo().alert();

		logger.info("Expected Text :::"+ salertText);
		logger.info("Actual Text :::"+alert.getText());

		if (alert.getText().contains(salertText)) {

			logger.info("Alert displayed in loop"+alert.getText());
			flag = true;

		} else {
			logger.info("Alert is not displayed.");
			flag = false;
		}
		return flag;

	}

	/**
	 * Accepting alert
	 */
	public void acceptAlert()
	{
		pause(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 *Dismissing alert
	 */
	public void dismissAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	/**
	 *Element displayed on not.
	 */
	public boolean isDisplayed(WebElement webElement)
	{
		return  webElement.isDisplayed();
	}
	
	
	/**
	 *click on multiple elements
	 *@param by
	 *          : the property of the object
	 * 
	 *
	 */
	public void clickElements(By by)
	{
		List<WebElement> elements = driver.findElements(by);
		for(int i=0;i<elements.size();i++)
		{
			logger.info("ELement is"+i+isDisplayed(elements.get(i)));
			if(isDisplayed(elements.get(i))){
				elements.get(i).click();
			}
		}

	}
	/**
	 *Page load time out.
	 */
	public void pageLoadTimout()
	{
		try
		{
			//	driver.manage().timeouts().pageLoadTimeout(maxTimeout,TimeUnit.SECONDS);
		}
		catch(TimeoutException timeoutexception)
		{
			logger.info("Page Load TimeOut Exception is Thrown After waiting for"+maxTimeout+"Seconds");
		}
	}
	/**
	 *To get page title.
	 */
	public String getpageTitle()
	{
		pageLoadTimout();
		return driver.getTitle();
	}
	/**
	 *To get file path.
	 */
	public String getFilePath(String sFilepath) {
		char cforwardslash = (char) 47;
		char cbackslash = (char) 92;
		logger.info("File path is "+sFilepath);
		String sPath = System.getProperty("user.dir").replace(cbackslash,
				cforwardslash)
				+ sFilepath;

		File file = new File(sPath);
		if (file.exists()) {
			sPath = file.getAbsolutePath();
			logger.info("The File Path is " + sPath);
		} else {
		}
		return sPath;
	}
	
	
	public boolean isDisplayedWithoutException(By locator)
	{
		pause(5000);
		boolean displayedvalue=false;
		try{
			displayedvalue=driver.findElement(locator).isDisplayed();
		}catch(Exception e)
		{
			displayedvalue=false;
		}
		return displayedvalue;

	}

	/**
	 * Click on any Specific elements based on the property.
	 * 
	 * @param locator
	 *            : the property of the object
	 * @param driverWait
	 *            : The driverwait object
	 * @param sPageTitle
	 *            : Page title of page the driver is.
	 */
	public void clickWithoutJavaScript(By locator) {
		scrollIntoView(locator);
		waitForElementPresent(locator);
		driver.findElement(locator).click();
	}	
	
	
	public WebElement returnWebElement(By locator)
	{
		scrollIntoView(locator);
		return driver.findElement(locator);
	}
	
	
	public void clickusingMouse(By locator)
	{
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(locator));
		 actions.click().build().perform();
		  
	}
	
	public void click(By locator) {
		waitForElementPresent(locator);
		if (driver.toString().contains("Internet")) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", returnWebElement(locator));
		} else {
			try {
				logger.info("Clicking normal click");
				returnWebElement(locator).click();
			} catch (StaleElementReferenceException stalement) {
				pause(5000);
				logger.info("I am Into stale Element Block");
				logger.info("Clicked on button after getting stale element exception");
				returnWebElement(locator).click();
			} catch (WebDriverException e) {
				try{
					logger.error("Clicked in error block");
					returnWebElement(locator).sendKeys(Keys.ENTER);
				}
				catch(WebDriverException e1)
				{
					logger.error("Trying to click using mouse---");

					Actions actions = new Actions(driver);
					actions.moveToElement(driver.findElement(locator));
					actions.click();
				}
			}
		}
	}	
	/**
	 * Click on any Specific elements based on the property.
	 * 
	 * @param locator
	 *            : the property of the object
	 * @param driverWait
	 *            : The driverwait object
	 * @param sPageTitle
	 *            : Page title of page the driver is.
	 */
	public void clickMultiple(By locator, int index) {

		if (waitForElementEnable(locator)) {
			
			 driver.findElements(locator).get(index).click();
		}

	}

	
	/**
	 * Click on any Specific element based on the property x axis and y axis.
	 * 
	 * @param locator
	 *            : the property of the object
	 * @param driverWait
	 *            : The driverwait object
	 * @param sPageTitle
	 *            : Page title of page the driver is.
	 */
	

	public void scrollClick(By locator){
		
		if (waitForElementEnable(locator)) {
			logger.info("Clicked using scroll click");
			 WebElement element = driver.findElement(locator);
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 int X=element.getLocation().x;
			 int Y=element.getLocation().y;
			 executor.executeScript("window.scrollTo(" +X+ ","+ (Y - 100) + ");");
			 driver.findElement(locator).click();
		}

		
	}
	
	/**
	 * Click on any Specific elements based on the property.
	 * 
	 * @param locator
	 *            : the property of the object
	 * @param driverWait
	 *            : The driverwait object
	 * @param sPageTitle
	 *            : Page title of page the driver is.
	 */
	public void clickUsingSwitch(By locator) {

		if (waitForElementEnable(locator)) {	
			//logger.info("The Driver value is "+driver.toString());
			if(driver.toString().contains(""))
			{
//				logger.info("I am in the Internet Explorer Block");
				WebElement element = driver.findElement(locator);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element); 

			}
			else{
			try
			{
				driver.findElement(locator).click();
				logger.info("Clicked using normal click");
			}catch(WebDriverException e)
			{
				try
				{
					driver.findElement(locator).sendKeys(Keys.ENTER);
					logger.info("Clicked using Enter key");
				}catch(Exception e1)
				{
					if(driver.toString().contains("chrome"))
					{
						waitForElementPresent(locator);
						WebElement element=driver.findElement(locator);
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("window.scrollTo(0,"+element.getLocation().y+")");
						executor.executeScript("arguments[0].click();", element);
						logger.info("Clicked using javascript----CHROME-----");
					}
					else{

						WebElement element = driver.findElement(locator);
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", element);
						logger.info("Clicked using executor");
					}
				}
			}
			}
		}
	}
	//}
	
	public void clickusingjavascript(By locator){
		
		 WebElement element = driver.findElement(locator);
		   JavascriptExecutor executor = (JavascriptExecutor)driver;
		   executor.executeScript("arguments[0].click();", element); 
	}
	
	public void clickOptions(By locator){
		
		if(waitForElementEnable(locator)){
			
			
			
		}
		
		
		
	}


		/**
		 * Click on any Specific elements based on the property.
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void click_coordinates(By locator) {

			if (waitForElementEnable(locator)) {

				WebElement element = driver.findElement(locator);
				Point location = element.getLocation();
				Actions actions = new Actions(driver);
				actions.moveToElement(element).moveByOffset(location.x+5, location.y+5).click().build().perform();
			}

		}

		/**
		 * Checks a Checkbox if is not selected
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void check_Checkbox(By locator) {
		//	logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& !driver.findElement(locator).isSelected()) {
				driver.findElement(locator).click();
			}
		}
		
		public void verify_CheckCheckBox(String locator) {
			Object pageState=((JavascriptExecutor) driver).executeScript("return document.getElementById('" + locator + "').checked");
			logger.info("The Default Status of the Check Box is :::::"+pageState.toString());
			if (pageState.toString().equals("true")) {
				logger.info("The Check Box is Checked");
			}
			else {
				By checkbox=By.xpath("//*[@id='"+ locator +"']/../span");
				driver.findElement(checkbox).click();
				logger.info("Clicked on the Check box and the Check box is checked Now ");
			}
		}
			
		public void verify_UnCheckCheckBox(String locator) {
			Object pageState=((JavascriptExecutor) driver).executeScript("return document.getElementById('" + locator + "').checked");
			logger.info("The Default Status of the Check Box is :::::"+pageState.toString());
			if (pageState.toString().equals("false")) {
				logger.info("The Check Box is UnChecked by default");
			}
			else {
				By checkbox=By.xpath("//*[@id='"+ locator +"']/../span");
				driver.findElement(checkbox).click();
				logger.info("Clicked on the Check box and the Check box is Unchecked Now");
			}
		}

		public void check_CheckboxButton(By locator,String buttonstatus) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& !buttonstatus.contains("active")) {
				driver.findElement(locator).click();
			}
		}
		
		/**
		 * Checks a Checkbox if is not selected
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void check_CheckboxMultiple(By locator, 
				 int index) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& !driver.findElements(locator).get(index).isSelected()) {
				driver.findElement(locator).click();
			}
		}

		/**
		 * UnChecks a Checkbox if is selected
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void uncheck_Checkbox(By locator) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& driver.findElement(locator).isSelected()) {
				logger.info("The Uncheck box button is clicked");
				driver.findElement(locator).click();
			}

		}

		public void uncheck_CheckboxButton(By locator,String buttonstatus) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& buttonstatus.contains("active")) {
				logger.info("The Uncheck box button is clicked");
				//driver.findElement(locator).click();
				clickUsingSwitch(locator);
			}

		}
		/**
		 * UnChecks a Checkbox if is selected
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void uncheck_CheckboxMultiple(By locator, 
				int index) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator)
					&& driver.findElements(locator).get(index).isSelected()) {
				driver.findElement(locator).click();
			}

		}
		/**
		 * clicks on the visible element
		 * 
		 * @param by
		 *            : the property of the object
		
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */

		public void clickInElements(By by)
		{
			waitForElementPresent(by);
			int j=0;
			logger.info("The by value is"+by);
			List<WebElement> elements= driver.findElements(by);
			for(int i=0 ;i<=elements.size();i++){
				driver.findElements(by).get(i).click();
				j=j+1;
				if(j==1)
				{
					logger.info("The element found and i am in Break statement");
					break;
				}
			}
		}

		/*
		 * public void clickLink(By locator, String
		 * sPageTitle) { if(waitForElementPresent(locator,sPageTitle)) {
		 * driver.findElement(locator).click(); } }
		 */

		/**
		 * Enters text in the Textbox.
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 * @param stextValue
		 *            : value which is going to be entered in the text box.
		 */
		public void enterText(By locator, 
				String stextValue) {
			if (waitForElementPresent(locator)) {
				WebElement element= returnWebElement(locator);
				element.clear();
				element.sendKeys(stextValue);
			}
		}

		public void enterTextnoClear_withscroll(By locator, 
				String stextValue) {
			if (waitForElementPresent(locator)) {
				WebElement element= returnWebElement(locator);
				element.click();
				element.sendKeys(stextValue);
			}
		}
		public void enterTextnoClear(By locator, 
				String stextValue) {
			if (waitForElementPresent(locator)) {
				WebElement element= returnWebElement(locator);
				element.sendKeys(stextValue);
			}
		}
		
		public void enterText_withoutClear(By locator,   String stextValue) {
			   if (waitForElementPresent(locator)) {
				   
				   Actions actions = new Actions(driver);
				   actions.moveToElement(driver.findElement(locator));
				   actions.click();
				   actions.sendKeys(stextValue);
			   }
			  }
				/**
		 * Enters text in the textboxes with same locator.
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 * @param stextValue
		 *            : value which is going to be entered in the text box.
		 * @param   index
		 *             :text box number.            
		 */
		public void enterTextMultiple(By locator, 
				String stextValue , int index) {
			if (waitForElementPresent(locator)) {
				driver.findElements(locator).get(index).clear();
				driver.findElements(locator).get(index).sendKeys(stextValue);
			}
		}

		/**
		 * provides the count of the elements
		 * @param locator
		 * @return
		 */
		public int elements(By locator)
		{
			pause(5000);
			List<WebElement> elements=driver.findElements(locator);
			logger.info("Size of elements"+elements.size());
			for (int i = 0; i < elements.size(); i++) {
			}
			return elements.size();
		}
		
		
		
		
		/**
		 * Verifies element visible or not.
		 * @param locator
		 *               :the property of the object
		 */
		public boolean elementVisibility(By locator)
		{
			boolean sflag=false;
			try{
				driver.findElement(locator).sendKeys("value");
				sflag=true;

			}catch(org.openqa.selenium.ElementNotVisibleException e)
			{
				logger.error("I am in exception :"+sflag);
				sflag=false;
			}
			logger.info("I am in out of catch block :"+sflag);
			return sflag;

		}


		/**
		 * Uploads a file in the Web Page.
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 * @param stextValue
		 *            : value which is going to be entered in the text box.
		 */

		public void enterText_FileUpload(By locator,String stextValue)
		{
			//if(waitForElementPresent(locator)){
			try{
				WebElement fileUpload=driver.findElement(locator);
				//logger.info("web driver is"+driver);
				if(driver.toString().toLowerCase().contains("remote"))
				((RemoteWebElement)fileUpload).setFileDetector(new LocalFileDetector());
				fileUpload.sendKeys(stextValue);
			}
			catch(Exception e)
			{
				logger.info("Object not found"+locator+"Page Title"+sPageTitle);
				e.printStackTrace();
			}


		}
		
		
		/*public void click_withException(By locator)
		{
			waitForElement(locator);
			try{
			driver.findElement(locator).click();
			}
			catch(Exception e)
			{
				logger.info("click_withException");
				e.printStackTrace();
			}
		}*/

		/**
		 * It checks whether an element is enabled and returns a value.
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is. 
		 */

		public boolean isEnabled(By locator) {
			boolean status = false;
			if (waitForElementPresent(locator)) {
				status = driver.findElement(locator).isEnabled();
				logger.info("The Submit button is "+status);
			}
			return status;
		}
		
		public void selectSecondValuefromDropDown(By locator) {
			logger.info("In dropdown selection method");
			if (waitForElementPresent(locator)) {
				new Select(driver.findElement(locator)).selectByIndex(2);
			}
		}
			
		/**
		 * selectValuefromDropDown selects the value from dropdown list which has
		 * been passed selectedValue as parameter
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is. 
		 */
		public void selectValuefromDropDown(By locator, String selectedValue) {
			logger.info("In dropdown selection method");
			if (waitForElementPresent(locator)) {
				new Select(driver.findElement(locator)).selectByVisibleText(selectedValue);
				logger.info("The value to be selected ===" + selectedValue);
			} else {
				logger.info("Drop down not found");
			}
		}

		
		public void selectValuefromDropDownWithOutWait(By locator, String selectedValue) {
			pause(3000);
			logger.info("In dropdown selection method");
				new Select(driver.findElement(locator)).selectByVisibleText(selectedValue);
				logger.info("The value to be selected" + selectedValue);
		}

		/**
		 * getCUrrentValueFromDropDown gets the current value selected in dropdown.
		 * @param locator
		 * @param driverWait
		 * @param selectedValue
		 * @param sPageTitle
		 * @return
		 */
		public String getCurrentValueFromDropdown(By locator) {
			   logger.info("In dropdown selection method");
			   waitForElementPresent(locator);
			   String currentvalue= new Select(driver.findElement(locator))
			    .getFirstSelectedOption().getText();
			   logger.info("The Current Value of Drop down is"+currentvalue);
			    return currentvalue;
			  }
		
		
		/**
		 * Returns the DOM value of the  Web Element 
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is. 
		 * @param  locatorName  
		 *            : key for attribute value.            
		 */
		public String getAttribute(By locator, String locatorName) {
			waitForElementPresent(locator);
			pause(5000);
			String attributeValue=driver.findElement(locator).getAttribute(locatorName);
			logger.info("value of getattribute is =====)"
					+ attributeValue);
			return attributeValue;
		}

		/*It will return the text box values as per Index */
		/**
		 * Returns the DOM value of the  Web Element 
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is. 
		 * @param  locatorName  
		 *            : key for attribute value.  
		 * @param  index
		 *            : attribute number.                      
		 */
		public String getAttributeMultiple(By locator, String locatorName,
				 int index) {
			logger.info("value of getattribute is"+ driver.findElements(locator).get(index).getAttribute(locatorName));
			return driver.findElements(locator).get(index).getAttribute(locatorName);
		}

		/**
		 *clicks on multiple elements with same property according to int value
		 *  @param locator
		 *            : the property of the object
		 * @param  i
		 *            : on which property it should click.                      
		 */
		
		
		public void clickElements(By by,int i)
		{
			List<WebElement> element= driver.findElements(by);
			logger.info("The size of the list is"+element.size());
			WebElement element2=element.get(i);
			/*for (int j = 0; j < element.size(); j++) {
				String text=element.get(i).getText();
				logger.info("The values are "+element.get(i).getText());

			}*/


			if(waitforWebElement(element2))
			{
				element2.click();
				logger.info("Element Clicked");
			}

		}


		/**
		 * Returns all the Dropdown values.
		 *  @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is. 
		 */
		public ArrayList<String> getDropdownValue(By locator) {
			waitForElementPresent(locator);
			WebElement ele = returnWebElement(locator);
			ArrayList<WebElement> dropdownList = new ArrayList<WebElement>();
			dropdownList.addAll(ele.findElements(By.tagName("option")));
			ArrayList<String> dropdownlistValues = new ArrayList<String>();
			// after sorted
			logger.info("ArrayList is sorted");
			for (WebElement temp : dropdownList) {
				dropdownlistValues.add(temp.getText());
			}
			Collections.sort(dropdownlistValues);
			/*for (String values : dropdownlistValues) {
			// logger.info("country value" + values);
		}*/

			return dropdownlistValues;
		}

		
		public ArrayList<String> getDropdownValueWithoutsort(By locator) {
			waitForElementPresent(locator);
			WebElement ele =returnWebElement(locator);
			ArrayList<WebElement> dropdownList = new ArrayList<WebElement>();
			dropdownList.addAll(ele.findElements(By.tagName("option")));
			ArrayList<String> dropdownlistValues = new ArrayList<String>();
			// after sorted
			logger.info("ArrayList is not sorted");
			for (WebElement temp : dropdownList) {
				dropdownlistValues.add(temp.getText());
			}
			return dropdownlistValues;
		}

		
		/**
		 * Clears the data from the TextBox using Locator.
		 * 
		 * @param locator
		 *            : Property of the WebElement.
		 * @param driverWait
		 *            :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *            : Gives the Title of the page.
		 */
		public void clearWebElementText(By locator) {
			if (waitForElementPresent(locator)) 
			{
				driver.findElement(locator).clear();
			}

		}

		/**
		 * Clears the WebElement data using keyboard event(Back Space) 
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 */
		public void clearWebElementTextusingbackspaceUsingAttribute(By locator) {
			//logger.info("The string length is"+getAttribute(locator, "value").length());
			//for (int i = 0; i <=getAttribute(locator, "value").length(); i++) {

			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys("a");
			driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
			//driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
		}

		/**
		 * Clears the WebElement data using keyboard event(Back Space) 
		  * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * @param nooftimes
		 */
		public void clearWebElementTextusingbackspace(By locator,
				 int nooftimes) {
			logger.info("The string length is"+nooftimes);
			for (int i = 0; i <=nooftimes; i++) {
				driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
			}
		}

		/**
		 * Returns the text for the locator
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * @return
		 */

		public String getText(By locator) {
			String sText = "";
			if (waitForElementPresent(locator)) {
				sText = driver.findElement(locator).getText();
			}
			return sText;
		}

		/**
		 * Determine whether or not this element is selected or not. This operation only applies to input
		 * elements such as checkboxes, options in a select and radio buttons.
		 * 
		 * @return True if the element is currently selected or checked, false otherwise.
		 */
		public boolean isSelected(By locator) {

			logger.info("it returns the selected radio button or checkbox value" +driver.findElement(locator).isSelected());
			return driver.findElement(locator).isSelected();
		}

		public boolean isSelectedMultiple(By locator, int index) {
				 return driver.findElements(locator).get(index).isSelected();
		}
		
		
		/**
		 * drags the element and drops in the target location.
		 * @param sourcelocator
		 *              : Property of the WebElement from which it should drag.
		 * @param targetlocator
		 *              : Property of the WebElement where it should drop.             
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * @return
		 */

		public void dragAndDrop(By sourcelocator,By targetlocator)
		{
			WebElement drag=driver.findElement(sourcelocator);
			WebElement drop=driver.findElement(targetlocator);
			
			Actions builder = new Actions(driver);
			
			builder.clickAndHold(drag).build().perform();
			pause(5000);
			builder.moveToElement(drop).build().perform();
			pause(5000);
			builder.release(drop).build().perform();
		}

		/* Returns all the text for a particular Block  */

		/**
		 * Returns the all webelements in list.
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * @return
		 */
		public List<WebElement> getAllWebElementValues(By locator) 
		{
			//waitForElementPresent(locator);
			//ngWebDriver.waitForAngularRequestsToFinish();
			List<WebElement> allwebelements = driver.findElements(locator);
			return allwebelements;
		}

		/**
		 *Element is displayed or not.
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * 
		 */
		
		
		public boolean isDisplayed(By locator)
		{
			waitForElementPresent(locator);
			return driver.findElement(locator).isDisplayed();

		}

		public boolean isDisplayedMultiple(By locator,int index)
		{
			waitForElements(locator);
			return driver.findElements(locator).get(index).isDisplayed();

		}

		public String getTagName(By locator)
		{
			waitForElementPresent(locator);
			return driver.findElement(locator).getTagName();
		}
		
		/**
		 *Returns text  of the selected value from dropdown. 
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * 
		 */
		
		public String getDropDownSelectedOption(By locator)
		{
			Select select = new Select(driver.findElement(locator));
			WebElement option = select.getFirstSelectedOption();
			logger.info("Option Selected in Drop Down is ====>"+option.getText());
			return option.getText();

		}
		/**
		 *Returns text according to index value of which drop down. 
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 * 
		 */
		
		public String getDropDownSelectedOptionMultiple(By locator,int index)
		{
			Select select = new Select(driver.findElements(locator).get(index));
			WebElement option = select.getFirstSelectedOption();
			logger.info("Option Selected in Drop Down is"+option.getText());
			return option.getText();

		}

		/**
		 * waits for milliseconds time specified in the method
		 * @param pausetime
		 */
		
		
		public void pause(long pausetime)
		{
			try
			{
				Thread.sleep(pausetime);
			}catch(Exception e)
			{
				logger.info("I am In catch Block of Thread.sleep");
			}
		}
		/**
		 * Will make the textbox active by clicking first and will then perform operation
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 */
		public void clickEnter(By locator)
		{
			waitForElementPresent(locator);
			boolean result = false;
			int attempts = 0;
			while(attempts < 2) {
				try {
					WebElement element = returnWebElement(locator);
					element.click();
					element.sendKeys(Keys.ENTER);
					 result = true;
					 break;
				} catch(org.openqa.selenium.StaleElementReferenceException e) {
					logger.info("I am into stale element exception");
					pause(5000);
				}
				catch(org.openqa.selenium.WebDriverException e)
				{
					logger.info("The element is not clickable exception occured");
					pause(5000);
				}
				logger.info("The attempts value is"+attempts);
				attempts++;
			}
			
			}
		
		
		/**
		 * Will make the textbox active by clicking first and will then perform operation
		 * @param locator
		 *              : Property of the WebElement.
		 * @param driverWait
		 *               :Waits until the Visibilty of Element.
		 * @param sPageTitle
		 *               : Gives the Title of the page.
		 */
		public void clickEnterButton(By locator)
		{
			waitForElementPresent(locator);
			driver.findElement(locator).sendKeys(Keys.ENTER);
			logger.info("Clicked on Enter key");
		}
		
		/**
		 * Returns the state of video.
		 * @param videoname
		 *                 : specifies video name .
		 * @param functionname              
		 *                 :specifies which action should perform. 
		 */
		public String videoUtilFunctions(String videoname,String functionname)
		{
			String videostatus="";
			if(functionname.equalsIgnoreCase("play"))
			{
				((JavascriptExecutor) driver).executeScript("document.getElementById('"+videoname+"').play2();");
				logger.info("Video is Played");
				videostatus="play";
				pause(5000);
			}
			else if(functionname.equalsIgnoreCase("pause"))
			{
				((JavascriptExecutor) driver).executeScript("document.getElementById('"+videoname+"').pause();");
				pause(5000);
				logger.info("Video is Paused");
				videostatus="pause";
			}
			else if(functionname.equalsIgnoreCase("stop"))
			{
				((JavascriptExecutor) driver).executeScript("document.getElementById('"+videoname+"').pause();");
				pause(5000);
				logger.info("Video is stopped");
				videostatus="stop";
			}
			else
			{
				logger.info("Not A valid Function Passed");
				Reporter.log("Not A valid Function Passed in Videos Page");
			}
			return videostatus;
		}

		/**
		 * When multiple check boxes with same property are there the below method checks a check box if it is not selected. 
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driver wait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 * @param  i
		 * 			  :index of the check box in list
		 *           
		 */

		public void click_Checkbox(By locator,int i) {
			logger.info("locator value is" + locator);
			if (waitForElementPresent(locator) && (!driver.findElements(locator).get(i).isSelected())) {
				logger.info("I am in click check box");
				driver.findElements(locator).get(i).click();
			}
		}
		/**
		 * selectValuefromDropDown selects the value from dropdown list which has
		 * been passed selectedValue as parameter
		 * 
		 * 
		 */
		public void selectValuefromDropDown_multiple(By locator, String selectedValue , int i) {
			logger.info("In dropdown selection method");
			if (waitForElementPresent(locator)) 
			{
				logger.info("The value is " + waitForElementPresent(locator));
				new Select(driver.findElements(locator).get(i)).selectByVisibleText(selectedValue);
				logger.info("The value to be selected" + selectedValue);
			} else {
				logger.info("Drop down not found");
			}
		}
		/**
		 * Returns the text for the locator
		* @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driver wait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 * @return
		 */

		public String getTextMultiple(By locator,int i) {
			String sText = "";
			if (waitForElementPresent(locator)) {
				sText = driver.findElements(locator).get(i).getText();
				logger.info("The Text value is"+sText);
			}
			return sText;
		}



		/**	
		 * Used for opening a new tab. 	
		 *          	
		 */	
		public void openANewTab()	
		{	
			EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
			eventFiringWebDriver.getKeyboard().pressKey(Keys.CONTROL);
			eventFiringWebDriver.getKeyboard().pressKey("t");
			eventFiringWebDriver.getKeyboard().releaseKey(Keys.CONTROL);

		}	

		/**
		 * Submit a form.
		 * 
		 * @param locator
		 *            : the property of the object
		 * @param driverWait
		 *            : The driverwait object
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void submit(By locator)
		{
			if (waitForElementPresent(locator)) {
				//logger.info("The driver value  inside click "+driver);
				driver.findElement(locator).submit();
			}
		}

		/**
		 * moves mouse to particular locator
		 * @param locator
		 *               : the property of the object
		 */
		
		public void mouseOver(By locator)
		{
			Actions actions = new Actions(driver);
			waitForElementPresent(locator);
			actions.moveToElement(driver.findElement(locator));
			actions.build().perform();
			pause(3000);
		}
		/**
		 * Getting driver current url.
		 * @return
		 */
		public String getCurrentURL(){
			return driver.getCurrentUrl();
		}

      /**
       * moves mouse randomly in sourcelocator
       * @param sourcelocator
       *                  : the property of the object
       */
		public void moveMouseRandomly(By sourcelocator)
		{
			WebElement canvasElement = driver.findElement(sourcelocator);
			Actions builder = new Actions(driver);
			pause(2000);
			builder.clickAndHold(canvasElement).moveByOffset(Integer.parseInt(RandomStringUtils.randomNumeric(2)),Integer.parseInt(RandomStringUtils.randomNumeric(2))).
			moveByOffset(Integer.parseInt(RandomStringUtils.randomNumeric(2)),Integer.parseInt(RandomStringUtils.randomNumeric(2))).
			moveByOffset(-Integer.parseInt(RandomStringUtils.randomNumeric(2)),-Integer.parseInt(RandomStringUtils.randomNumeric(2))).
			moveByOffset(-Integer.parseInt(RandomStringUtils.randomNumeric(2)),-Integer.parseInt(RandomStringUtils.randomNumeric(2))).release().perform();
			pause(2000);
		}

       /**
        * switches from sub window to main window.
        * @param driver
        *             :control moves to driver.  
        */
		public void switchToMainWindow(WebDriver driver)
		{
			driver.switchTo().window(driver.getWindowHandle());
			logger.info("The Control is to the Required Window");
		}
		 /**
		   * Return an opaque handle to this window that uniquely identifies it within this driver instance.
		   * This can be used to switch to this window at a later date
		   */

		public Set<String> getAllWindowHandles(WebDriver driver)
		{
			Set<String> handle = driver.getWindowHandles();	
			return handle;
		}
		/**
		 * control switches from one browser to another browser.
		 * @param stext
		 */
		
		public void browserSwitch(String stext)
		{
			
			Set<String> browserHandle = getAllWindowHandles(driver);
		List<String> list = new ArrayList<String>(browserHandle);
			logger.info("The size of windows"+list.size());
			 for(int i=0;i<list.size();i++)
			{
			//	logger.info("Inside For Loop");
		    	driver.switchTo().window(list.get(i));
					    logger.info("Element is found on New Browser"); 
					    
					    if(driver.findElement(By.cssSelector("body")).getText().contains(stext))
					    {
					    	logger.info("The value of i"+ i);
					    	break;
					    }
					    //logger.info(""+driver.findElement(By.cssSelector("body")).getText());
			}
			}
		
		
		/**
		 * Click displayed element 
		 * 
		 * @param locator
		 *            : the property of the object
		 * 
		 * @param sPageTitle
		 *            : Page title of page the driver is.
		 */
		public void clickDisplayedElement(By locator)
		{
			
			List<WebElement> elements= driver.findElements(locator);
			for (WebElement webElement : elements) {
				
				if(webElement.isDisplayed())
				{
				webElement.click();
				}
			}
			
		}
		
		public String getDisplayedElementText(By locator)
		{
			
			List<WebElement> elements= driver.findElements(locator);
			String text="";
			for (WebElement webElement : elements) {
				
				if(webElement.isDisplayed())
				{
				text=webElement.getText();
				}
			}
			return text;
			
		}
		
		public void enterTextDisplayedElement(By locator,
				String stextValue)
		{
			
			List<WebElement> elements= driver.findElements(locator);
			for (WebElement webElement : elements) {
				
				if(webElement.isDisplayed())
				{
					webElement.clear();
					webElement.sendKeys(stextValue);
				}
			}
			
			
		}
		
		/**
		 * moves mouse to particular locator
		 * @param locator
		 *               : the property of the object
		 */
		
		public void mouseOverWithClickAndHold(By locator)
		{
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(locator)).clickAndHold();
			actions.perform();
		}
		
		public void doubleClick(By locator) {
			boolean result = false;
				int attempts = 0;
				while(attempts < 2) {
					try {
						Actions action = new Actions(driver);
						 WebElement element = driver.findElement(locator);
						action.moveToElement(element).doubleClick().build().perform();
						 result = true;
						 break;
					} catch(org.openqa.selenium.StaleElementReferenceException e) {
						logger.info("I am into stale element exception");
						pause(5000);
					}
					catch(org.openqa.selenium.WebDriverException e)
					{
						logger.info("The element is not clickable exception occured");
						pause(5000);
					}
					attempts++;
				}
			}	

		/*It Will return texts  */
		public String getlabel(String labelname,int type)
		{
			By by;
			String flag=null;
			switch (type) {
			case LABEL:
				by = By.xpath("//label[contains(text(),'"+labelname+"')]");
				List<WebElement> labelelements= driver.findElements(by);
				for (WebElement webElement : labelelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;
			case BUTTON:
				by = By.xpath("//button[contains(text(),'"+labelname+"')]");
				List<WebElement> buttonelements= driver.findElements(by);
				for (WebElement webElement : buttonelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;
			case A:
				by=By.xpath("//a[contains(text(),'"+labelname+"')]");
				List<WebElement> aelements= driver.findElements(by);
				for (WebElement webElement : aelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;
			case H4:
				by=By.xpath("//h4[contains(text(),'"+labelname+"')]");
				List<WebElement> h4elements= driver.findElements(by);
				for (WebElement webElement : h4elements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;
			case SPAN:
				by=By.xpath("//span[contains(text(),'"+labelname+"')]");
				List<WebElement> spanelements= driver.findElements(by);
				for (WebElement webElement : spanelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;
			case DIV:
				by=By.xpath("//div[contains(text(),'"+labelname+"')]");
				List<WebElement> divelements= driver.findElements(by);
				for (WebElement webElement : divelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;  
			case STAR:
				by=By.xpath("//*[contains(text(),'"+labelname+"')]");
				List<WebElement> allelements= driver.findElements(by);
				for (WebElement webElement : allelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;  	 
			case XPATH:
				by=By.xpath(labelname);
				List<WebElement> xpathelements= driver.findElements(by);
				for (WebElement webElement : xpathelements) {
					
					if(webElement.isDisplayed())
					{
					flag=webElement.getText();
					}
				}
				break;  


			default:
				logger.info("Switch type not specfied");
				break;
			}
			return flag;
		}
		
		public void switchFrame(By frame)
		{
			driver.switchTo().frame(driver.findElement(frame));
            pause(5000);  
		}
		
		public void frameDefaultContent()
		{
			driver.switchTo().defaultContent();
		}
		
		public String getCurrentUrl()
		{
			return driver.getCurrentUrl();
		}
		
		public boolean isAlertPresent() 
		{ 
		    try 
		    { 
		        driver.switchTo().alert(); 
		        return true; 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }   // catch 
		}   // isAlertPresent()
		
		public void shiftnewindow(){
			pause(5000);
			Set<String> handles=driver.getWindowHandles();
		 	for (String winHandle : handles) {
		 	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		 	}
			logger.info("moved to next tab");
			
		}
		
  public void switchtoGivenWindow(String parentHandle)
  {		pause(2000);
		driver.switchTo().window(parentHandle); 
  }
  
  /**
	 * Paste the copied content
	 * @param loctor
	 */
	public void pasteCopiedContent(By loctor)
	{
		driver.findElement(loctor).sendKeys(Keys.CONTROL + "V");
	}

	public By containstext_xpath(String locator){
	return By.xpath("//*[contains(text(),'"+ locator+"')");
	}
	
	public String getAttribute(By locator) {
		LinkedList< String> attributeValue = new LinkedList<String>();
		WebElement element = null;
		if (waitForElementPresent(locator)) {
				element = driver.findElement(locator);
				attributeValue.add(element.getAttribute("className"));
				attributeValue.add( element.getAttribute("value"));
				attributeValue.add(element.getAttribute("innerHTML"));
				attributeValue.add(element.getAttribute("outerHTML"));
				
				attributeValue.add(element.getAttribute("innerText"));
				attributeValue.add(element.getAttribute("text"));
				attributeValue.add(element.getAttribute("textContent"));

		}
			logger.info("Attribute Value" + attributeValue);
		return attributeValue.toString();

	}
	
	/**Verifies the element present 
	 * 
	 */
	public boolean verifyElementClick(By locator){
		
		boolean sflag=false;
		try{
			driver.findElement(locator).click();
			sflag=false;
			}
			catch(Exception e)
			{
				logger.info("The element is not visible on the page to click");
				//e.printStackTrace();
				sflag = true;
			}
		return sflag;
	}
	
	 public String verify_label(String label)
		{
			By labelvalue=By.xpath("//*[contains(text(),'"+label+"')]");
		   return getText(labelvalue);
		}

	 public String verify_labelText(String label)
		{
			By labelvalue=By.xpath("(//*[(text()='"+label+"')])");
		   return getText(labelvalue);
		}
	 
	 public String verify_labelwithindex(String label,int value)
		{
			By labelvalue=By.xpath("(//*[contains(text(),'"+label+"')])["+value+"]");
			logger.info("The locator value is"+labelvalue);
		   return getText(labelvalue);
		}
	 
	 public boolean verifyPageElements(String label)
		{
			By labelvalue=By.xpath("//*[contains(text(),'"+label+"')]");
		   return isDisplayedWithoutException(labelvalue);
		}

	 public String verify_embedplaybacknotavailablemessage(String label)
	 
	 {
			By labelvalue=By.xpath("(//*[contains(text(),'"+label+"')])[2]");
			   return getText(labelvalue);
		
	 }
	 
	
		public ArrayList<String> getAllWebElementValueslist(By locator) 
		{
			waitForElementPresent(locator);
			ArrayList<String> webelementslist=new ArrayList<String>();
			List<WebElement> allwebelements = driver.findElements(locator);
	        for (WebElement webElement : allwebelements) {
		    webelementslist.add(webElement.getText());
	        }
			logger.info("The Array value is"+webelementslist);
			return webelementslist;
		}
		
		public void enterTextforReadOnly(By locator, String value){
			((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", driver.findElement(locator), value);
		}
		
		 public boolean verifyPageElements(String label,int value)
			{
				By labelvalue=By.xpath("(//*[contains(text(),'"+label+"')])["+value+"]");
				logger.info("The locator value is"+labelvalue);
			   return isDisplayedWithoutException(labelvalue);
			}
		 
		 public boolean fieldEditable(By locator)
			{
				try{
					driver.findElement(locator).clear();
					return false;
				}catch(org.openqa.selenium.InvalidElementStateException e)
				{
				return e.getMessage().toLowerCase().contains("element must be user-editable");
			}
			}
	/**
	 * 	These method verifies whether the element is visible in dom or not.
	 * @param locator:Locator of the element which has to be verified the visibility.
	 * @return 
	 */
	public Boolean isElementInvisible(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, WAIT);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)); 
	}
	/**
	 * Clear all textboxes on the page
	 * @param locator
	 */
	public void clearAllTextFields(String formname) {
		logger.info("The form name is"+formname);
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('"+formname+"')[0].reset();");
		logger.info("Clearing all the fields");
	}
	
	public void close_currentTab()
	{
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		driver.close();
	}
	
	public void sleepMinutes(int sleepMinutes)
	{
		try {
			TimeUnit.MINUTES.sleep(sleepMinutes);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("I am into interrupted Exception");
		}
	}
	
	/**
	 * This Method used to click keys in keyboard
	 */
	public void press_keysInKeyBoard(By locator){
		logger.info("THe keys sent is"+locator);
		driver.findElement(locator).sendKeys(Keys.ARROW_RIGHT);
	}
	
	public void waitForAjaxResponse(WebDriver driver) throws Exception{
	    logger.info("Checking active ajax calls by calling jquery.active");
	    try {
	     int timeoutInSeconds = 2;
	      if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
	        Long n = null;
	       
	        for (int i = 0; i < timeoutInSeconds; i++) {
	         
	          Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
	          // return should be a number
	          if (numberOfAjaxConnections instanceof Long) {
	           n = (Long) numberOfAjaxConnections;
	           logger.info("Number of active jquery ajax calls: " + n);
	           if (n.longValue() == 0L){
	        	 // Thread.sleep(1000);
	            break;
	           }
	           }
	          logger.info("=====");
	          Thread.sleep(3000);
	          logger.info("=====");
	        }
	      } else {
	       logger.error("Web driver: " + driver + " cannot execute javascript");
	      }
	    } catch (Exception e) {
	     logger.error("Failed to wait for ajax response: " + e);
	     throw new Exception(e);
	    }
	   }
	
	public void selectValuefromDropDown_ByIndex(By locator, int selectByIndex) {
        logger.info("In dropdown selection method");
        if (waitForElementPresent(locator)) {
            new Select(driver.findElement(locator))
            .selectByIndex(selectByIndex);
            logger.info("The value to be selected ===>" + selectByIndex);
        } else {
            logger.info("Drop down not found");
        }
    }
	
	/**
	 * 
	 * This Method used to focus the element 
	 */
	public void elementFocusWithTab(By locator)
    {
        waitForElementPresent(locator);
            driver.findElement(locator).sendKeys(Keys.TAB);
            logger.info("Clicked on Tab key");
        
    }
	
	public void click_ElementAfterFocus(By locator) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true);",returnWebElement(locator));
		//logger.info("Scroll to the element selected:::"+locator);
		returnWebElement(locator).click();
		logger.info("Clicked on the element after scrolling");
	}
	
	public List<WebElement> getListOfWebElements(By locator) throws Exception {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		List<WebElement> webElementsList = null;
			try {
				if(locator.equals("xpath")){
					webElementsList = driver.findElements(locator);
				}
				else if(locator.equals("id")){
					webElementsList = driver.findElements(locator);
				}
				else if(locator.equals("className")){
					webElementsList =  driver.findElements(locator);
				}
				else if(locator.equals("linkText")){
					webElementsList = driver.findElements(locator);
				}
				else if(locator.equals("name")){
					webElementsList =  driver.findElements(locator);
				}
				else if(locator.equals("css")){
					webElementsList = driver.findElements(locator);
				}
				else if(locator.equals("partialLinkText")){
					webElementsList = driver.findElements(locator);
				}
				else if(locator.equals("tagName")){
					webElementsList = driver.findElements(locator);
				}
			} catch (Exception e) {
				throw new Exception(e);
			}
		return webElementsList;
	}
	
	
	/*public String get_ToastMessageText() {
		String toastmessage=getText(VendorsPageObjects.toastmessage);
		logger.info("Toast message is ::::"+toastmessage);
		 return toastmessage;
	}*/

}

