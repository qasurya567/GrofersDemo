package StepDefinations;

import java.util.Arrays;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import BusinessComponent.onboard;
import Generics.Constant;
import Generics.SeleniumHelper;
import Generics.Utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class OnboardinFlow {
	
	
	
	
	@After()
	public void embedScreenshot(Scenario scenario) {
		
		 if (scenario.isFailed()) {
		        try {
		            byte[] screenshot = ((TakesScreenshot) Constant.driver).getScreenshotAs(OutputType.BYTES);
		            scenario.embed(screenshot, "image/png" );
		            scenario.write("URL at failure: " + Constant.driver.getCurrentUrl());
		            scenario.write("Failed Scenario name: " +scenario.getName());
		            scenario.write("Date and Time at failure: " +Utils.getCurrentDate()+"- "+Utils.getCurrentTime());
		            
		        } catch (WebDriverException wde) {
		        	scenario.write("Embed Failed " + wde.getMessage());
		        } catch (ClassCastException cce) {
		            cce.printStackTrace();
		        }
		    }
		
	}
	onboard logic = new onboard();
	

	@Given("^I am navigating to grofers site$")
	public void NavigateToSite() {
	    
		SeleniumHelper.assertOnPageopen("Online Grocery Shopping - Buy Fruits, Vegetables, Groceries and More | Grofers");
	}

	@And("^Select a Location \"(.*?)\"$")
	public void selectLocation(String Location) throws InterruptedException {
		logic.giveLocation(Location);
	}

	@And("^Select a Product \"(.*?)\" \"(.*?)\"$")
	public void selectProdcut(String header, String product) throws InterruptedException {
		logic.selectGivenProductOnPage(header, product);
	}

	@And("^Login into Groffers with username \"(.*?)\" and password \"(.*?)\"$")
	public void login(String username, String password) throws InterruptedException {
		logic.login(username, Arrays.asList(password.split(",")));
	}
	
	@And("^Proceed to Checkout witn number of items \"(.*?)\" and bill \"(.*?)\"$")
	public void checkout(String items, String bill) throws InterruptedException {
		logic.assertCart(items);
		logic.checkoutToCart(bill);
	}
	
}