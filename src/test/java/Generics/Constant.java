package Generics;

import org.openqa.selenium.WebDriver;

public class Constant {

	public static final  String RootPath = System.getProperty("user.dir").replace("\\", "/");
	public static final String ChromeDriverPath=RootPath+"/driver/chromedriver.exe";
	public static final String SRC_Logs = RootPath+ "/logs";

	public static WebDriver driver;
	
}