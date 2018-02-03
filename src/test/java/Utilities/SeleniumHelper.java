package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class SeleniumHelper extends Constant{

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
	
	public static void CloseRecentBrowser(){
		System.out.println("Closing the recent tabs");
		try{
			driver.close();
		}catch(Exception exp){
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
			WaitImplicitlyForPageToLoad();
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
}