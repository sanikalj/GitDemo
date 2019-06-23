package Academy;

import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class HomePage extends base {
	
	//base baseClass = null;
	public static WebDriver driver =null;
	LandingPageHelper landHelper=null;
	
	/*public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		
	}*/
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	@Test
	public void loadPage() throws IOException
	{
		landHelper = new LandingPageHelper(driver);
		landHelper.login(driver);
		
		
	}
	
	@BeforeTest
	public void basePageNavigation() throws IOException
	{
		
		driver = initializeDriver();
		//prop = getProp.getPropData();		 
		//driver.get(prop.getProperty("url"));
		log.info("Driver initialized successfully");
		log.debug("Debug");
		log.error("Error");
		log.fatal("Fatal");
		
	}
	
	//@AfterTest
	@AfterMethod
	public void CloseBrowser(){
		driver.quit();
		log.info("Driver closed successfully");
		driver=null;
	}
	
	

}
