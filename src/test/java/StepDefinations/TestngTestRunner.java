package StepDefinations;



import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Generics.Constant;
import Generics.SeleniumHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="src/test/java/Specs/",
glue= {"StepDefinations"},
format= {"pretty","html:target/Destination"},
tags={"@Onboarding"}
,
monochrome=true
)
//monochrome=true



public class TestngTestRunner {
	@Parameters({"browserType","URL"})
	@BeforeMethod
	public void beforeMethod(String browserType,String URL){
	
		SeleniumHelper.OpenBrowser(browserType);
		SeleniumHelper.GetURL(URL);
		SeleniumHelper.clearcookies();
		}
	@AfterMethod
	public void afterMethod() {
		 SeleniumHelper.QuitBrowser();
	}
	
	@Test(groups = "cucumber", description = "Runs Cucumber Features")
	public void run_cukes() throws IOException {
	  new TestNGCucumberRunner(getClass()).runCukes();
	}
	
	
}