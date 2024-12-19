package emrahbase;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import emrahutils.EmrahConfigsReader;
import emrahutils.EmrahConstants;

public class EmrahBaseClass {


	public static WebDriver driver;

	public static void setUp() {
		EmrahConfigsReader.readProperties(EmrahConstants.CONFIGURATION_FILEPATH);
		String browser = EmrahConfigsReader.getProperty("browser");
		String browser1 = EmrahConfigsReader.getProperty("browser1");
		
		String[] browsers = {browser, browser1};
		
		for(String b : browsers) {
			
		// !!! DO NOT TRY AT HOME, YOUR COMPUTER MAY EXPLODE :D
	

		// System.out.println(browser);
		switch (b.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EmrahConstants.IMPLICIT_WAIT_TIME));
		String url = EmrahConfigsReader.getProperty("url");
		driver.get(url);

		EmrahPageInitializer.initialize();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
