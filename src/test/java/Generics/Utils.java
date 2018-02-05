package Generics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;


public class Utils extends Constant {
	public static String getCurrentTime(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		java.util.Date curDate = new java.util.Date();
		String strDate = sdf.format(curDate);
		String strActDate = strDate.toString();
		return strActDate;
	}
	
	public static String getCurrentDate(){
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		java.util.Date curDate = new java.util.Date();
		String strDate = sdf.format(curDate);
		String strActDate = strDate.toString();
		return strActDate;
	}
	
	
	public static void makeScreenshot(WebDriver driver, Scenario scenario) { 
      
        if (driver instanceof TakesScreenshot) { 
            TakesScreenshot screenshotableDriver = (TakesScreenshot) driver; 
            try { 
                byte[] screenshot = screenshotableDriver.getScreenshotAs(OutputType.BYTES); 
                scenario.embed(screenshot, "image/png"); 
            } catch (WebDriverException somePlatformsDontSupportScreenshots) { 
              
            } 
        } else { 
            
        } 
    } 
	
	
	public static boolean numberOrNot(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}
	
	public static void checkMoileNuer(String number) {
		
		if(Utils.numberOrNot(number) && (number.length()==10 && number.startsWith("0")))
		{
			System.out.println("Good!!! You have entered valid mobile number");
		}
		else
		{
			System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
		}
	}
	
	public static void checkOTP(String otp) {
		if(Utils.numberOrNot(otp) && otp.length()==4) {
			System.out.println("Good!!! You have entered right length otp");
			
		}else
		{
			System.out.println("Sorry!!!! You have entered invalid otp");
		}
		
	}
	public static String getMinSec(){
		
		 int hrs=Calendar.getInstance().get(Calendar.HOUR);
		 int min=Calendar.getInstance().get(Calendar.MINUTE);
		 int sec=Calendar.getInstance().get(Calendar.SECOND);
		 return hrs+"_"+min+"_"+sec;
			
		}	
}
