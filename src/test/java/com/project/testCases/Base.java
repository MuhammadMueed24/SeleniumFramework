package com.project.testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.project.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getUrl();
	String browser = readConfig.getBrowser();

	protected static WebDriver driver;
	
	@BeforeClass
	public void setup() {

		if (browser.equalsIgnoreCase("chrome")) {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
		    WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		} else {
		    driver = null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterClass
	public void teadDown() {
		driver.quit();
	}
}
