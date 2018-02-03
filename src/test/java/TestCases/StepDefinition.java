package TestCases;

import java.util.Arrays;

import BusinessComponent.onboard;
import Utilities.Constant;
import Utilities.SeleniumHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDefinition {

	onboard logic = new onboard();

	@Given("^I am navigating to site$")
	public void NavigateToSite() {
		SeleniumHelper.GetURL(Constant.URL);
		logic.assertOnPageopen("Online Grocery Shopping - Buy Fruits, Vegetables, Groceries and More | Grofers");
	}

	@And("^Select a Location \"(.*?)\"$")
	public void selectLocation(String Location) {
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