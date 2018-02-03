package BusinessComponent;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactory.onboardPOF;
import Utilities.Constant;
import Utilities.SeleniumHelper;

public class onboard {

	onboardPOF elements = PageFactory.initElements(Constant.driver, onboardPOF.class);

	public void selectGivenProductOnPage(String headerName, String productName) throws InterruptedException {
		Thread.sleep(5000);
		SeleniumHelper.scrollDownOnPageDown();
		List<WebElement> headerList = elements.allContainersOnPage;
		List<WebElement> productNames = elements.allContainerProductTitle;
		List<WebElement> productAddButton = elements.allContaineProductAdd;
		for (int i = 0; i < headerList.size(); i++) {
			if (headerList.get(i).getText().contains(headerName)) {
				for (int j = 0; j < productNames.size(); j++) {
					if (productNames.get(j).getAttribute("title").equalsIgnoreCase(productName)) {
						SeleniumHelper.ExplicitlyWaitForElement(productAddButton.get(j));
						SeleniumHelper.ClickOnWebelements(productAddButton.get(j));
					}
				}
			}

		}
	}

	public void giveLocation(String Location) {
		Assert.assertEquals(elements.input_locationSelect.isDisplayed(), true);
		SeleniumHelper.ExplicitlyWaitForElement(elements.input_locationSelect);
		elements.input_locationSelect.sendKeys(Location);
		elements.input_locationSelect.sendKeys(Keys.ENTER);
	}

	public void assertOnPageopen(String expectedTitle) {
		String pageTitle = SeleniumHelper.getTitleOfPage();
		Assert.assertEquals(pageTitle, expectedTitle);
	}

	public void login(String userName, List<String> password) throws InterruptedException {
		Thread.sleep(5000);
		elements.tag_login.click();
		elements.btn_login.click();
		SeleniumHelper.ExplicitlyWaitForElement(elements.input_mobile);
		elements.input_mobile.sendKeys(userName);
		elements.btn_next.click();
		
		for (int i = 0; i < password.size(); i++) {
			SeleniumHelper.ExplicitlyWaitForElement(elements.input_otp.get(i));
			Thread.sleep(1000);
			elements.input_otp.get(i).sendKeys(password.get(i));
		}
		SeleniumHelper.ExplicitlyWaitForElement(elements.btn_nextVerification);
		elements.btn_nextVerification.click();
	}
	
	public void assertCart(String items) {
		SeleniumHelper.ExplicitlyWaitForElement(elements.items_bill.get(0));
		Assert.assertEquals(elements.items_bill.get(0).getText(), items);
	}
	
	public void checkoutToCart(String bill_amount) throws InterruptedException {
		SeleniumHelper.ExplicitlyWaitForElement(elements.btn_cart);
		Thread.sleep(5000);
		elements.btn_cart.click();
		//Assert.assertEquals(elements.amount_verify(bill_amount),true,"Bill is not matching");
		elements.btn_checkout.click();
	}
}
