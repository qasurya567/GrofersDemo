package Generics;

import java.io.File;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumHelper extends Constant{
	
	
	public static String FILE_NAME; 
	public static String PATH ;
	public static Logger APP_LOGS;
	
	public static void OpenBrowser(String browserType){
		System.out.println("Opening: " + browserType + " Browser");
		try{
          if(browserType.equalsIgnoreCase("FF") || (browserType.equalsIgnoreCase("Firefox"))){
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		  }else if(browserType.equalsIgnoreCase("chrome") ){
			System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
			ChromeOptions chromeOptions = new ChromeOptions(); 
			chromeOptions.addArguments("--test-type");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions); 
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		  }else{
			  System.out.println("Using Default browser as FireFox");
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		  }
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	public static void GetURL(String URL){
		System.out.println("Navigating to (" + URL + ") Site");
		try{
			driver.get(URL);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	public static String getTitleOfPage() {
		return driver.getTitle();
	}
	
	public static void QuitBrowser(){
		System.out.println("Quiting all the open tabs");
		try{
			driver.quit();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void CloseBrowser(){
		System.out.println("Closing the recent tabs");
		try{
			driver.close();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static  void clearcookies() {
	System.out.println("clearing all cookies");
	try {
		driver.manage().deleteAllCookies();
	}catch(Exception exp) {
	System.out.println(exp.getMessage());
	}
	}
	
	public static void WaitImplicitlyForPageToLoad(){
		System.out.println("Waiting For Page to Load ");
		try{
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static String GetTextFromWebelement(WebElement element){
		String text=null;
		try{
			text=element.getText();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
		return text;
	}
	
	public static void ClickOnWebelements(WebElement element){
		try{
			element.click();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void SendTextToElement(WebElement element,String text){
		try{
			element.sendKeys(text);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void SendTextToElementUsingAction(WebElement element,String text){
		try{
			Actions action=new Actions(driver);
			action.moveToElement(element);
			action.click();
			action.sendKeys(text);
			action.build().perform();
			Thread.sleep(1000);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void PressEnterNow(WebElement element){
		try{
			element.sendKeys(Keys.ENTER);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static boolean CheckElementVisibility(WebElement element){
		boolean val=false;
		try{
			ExplicitlyWaitForElement(element);
			val=element.isDisplayed();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
		return val;
	}
	
	public static void PerformClearTextToInputField(WebElement element){
		try{
			element.clear();
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void ExplicitlyWaitForElement(WebElement element){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void SelectFromDropBox(WebElement element,String inputdata){
		try{
			Select option = new Select(element);
			option.selectByVisibleText(inputdata);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	
	public static void scrollDownOnPageDown() {
		try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
		}catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}
	public static void getScreenShot(String Method_name) {
		try {
		File scrFile = ((TakesScreenshot)Constant.driver).getScreenshotAs(OutputType.FILE);
		String path=Constant.RootPath+"/ScreenShot/"+Method_name+"_"+Utils.getMinSec()+".png";
		FileUtils.copyFile(scrFile, new File(path));
		}catch(Exception exp) {
			exp.getMessage();
		}
		
		
	}
	

	public static void assertOnPageopen(String expectedTitle) {
		String pageTitle = SeleniumHelper.getTitleOfPage();
		Assert.assertEquals(pageTitle, expectedTitle);
	}
	public static void VerifyElementDisplayed(WebElement element) {
		boolean isDispalyedmessage =element.isDisplayed();
		Assert.assertTrue(isDispalyedmessage);
	}
	
	public static void assertOnisEnabled(WebElement element) {
		boolean isEnabledmedmessage =element.isDisplayed();
		Assert.assertTrue(isEnabledmedmessage);
	}
	
		
}



	
	
