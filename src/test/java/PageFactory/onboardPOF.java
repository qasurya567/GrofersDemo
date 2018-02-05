package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class onboardPOF {

	final WebDriver driver;	
	WebElement element;
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@class='account__my-account hide@mobile']")
	public WebElement selectAccount_heading;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	public WebElement tag_login;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	public WebElement btn_login;
	
	@FindBy(xpath="//input[@type='tel']")
	public WebElement input_mobile;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	public WebElement btn_next;
	
	@FindBy(xpath="//div[@class='shopping-cart shopping-cart--empty']")
	public WebElement btn_cart;
	
	@FindBy(xpath="//div[@class='shopping-cart shopping-cart--empty']/span/span")
	public List<WebElement> items_bill;
	
	public WebElement amount_verify(String bill) {
		return driver.findElement(By.xpath("//div[contains(text(),'"+bill+"')]"));
	}
	
	@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
	public WebElement btn_checkout;
	 


	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement btn_nextVerification;
	
	@FindBy(xpath="//input[@type='tel']")
	public List<WebElement> input_otp;
	
	
	@FindBy(xpath="//div[@class='slider-container']/h1")
	public List<WebElement> allContainersOnPage;
	
	@FindBy(xpath="//div[@class='slider-container']//div[@title='Next Product']")
	public List<WebElement> allContainerNextButton;
	
	@FindBy(xpath="//div[@class='slider-container']//div[@class='plp-product']//div[4]")
	public List<WebElement>  allContainerProductTitle;
	
	@FindBy(xpath="//div[@class='slider-container']//div[@class='plp-product']//div[7]")
	public List<WebElement>  allContaineProductAdd;
	
	@FindBy(xpath="//span[@id='react-select-2--value']//input")
	public WebElement input_locationSelect;
	
	@FindBy(xpath="//div[@class='location-body']")
	public WebElement LocationBody;
	
	@FindBy(xpath="//div[contains(@class,'location-body__selected-title') ]/span[@class='weight--semibold']")
	public WebElement defaultSelectedDeliveryLocationtab;
	
	@FindBy(xpath="//div[@class='cities-container-list']")
	public List <WebElement> topSearcheCitiesList;
	
     @FindBy(id="react-select-2--value")
	public List <WebElement>  autoSuggestedLocationList;
	
	
	
	public onboardPOF(WebDriver driver){
		this.driver=driver;
	}
}