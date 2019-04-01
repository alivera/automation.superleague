package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup {
	
	//Globals
	public Properties prop;
	public static WebDriver driver;
	public static Logger Log = LogManager.getLogger(Setup.class.getName());
	
	public WebDriver initializeDriver() throws IOException {
				
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String chromedriverpath = prop.getProperty("chromedriverpath");
		String firefoxdriverpath = prop.getProperty("firefoxdriverpath");
		String edgedriverpath = prop.getProperty("edgedriverpath");
		String iedriverpath = prop.getProperty("iedriverpath");
		
		//Select a Browser to test in 
		switch(browser) {
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver", chromedriverpath); 
			   driver = new ChromeDriver();
		    break;
		  case "firefox":
			  System.setProperty("webdriver.gecko.driver", firefoxdriverpath); 
			   driver = new FirefoxDriver();
		    break;
		  case "edge":
			  System.setProperty("webdriver.edge.driver", edgedriverpath);
			   driver = new EdgeDriver();
			    break;
		  case "ie":
			  System.setProperty("webdriver.ie.driver", iedriverpath);
			   driver = new InternetExplorerDriver();
			    break;
		  default:
			  System.out.println("browser : " + browser + " is invalid, Launching Firefox as browser of choice..");
				driver = new ChromeDriver();
		}
		
		//Set Timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		 driver.manage().window().maximize();
		
		return driver;
	}
	
	//initialize the driver
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized!");
		driver.get(prop.getProperty("url"));
		Log.info("URL opened: " + prop.getProperty("url"));
	}
	
	//run script after each test
	public void teardown() {
		driver.quit();
		driver = null;
		Log.info("WebDriver Successfully Quit!");
	}

	//take screenshots
	public void takeScreenshot(String result) throws IOException {
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("screenshots/"+result+System.currentTimeMillis()+".png"));
	}
		
}
