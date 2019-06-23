package Academy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.*;

import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.spi.FileTypeDetector;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver;
	GetProperties getProp = new GetProperties();
	Properties prop=null;
	
	public WebDriver initializeDriver() throws IOException
	{
		/*Properties prop =  new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sanikalj\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);*/
		prop = getProp.getPropData();
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver.exe");
			 driver =  new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "D://SeleniumDrivers//geckodriver.exe");
			 driver =  new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.internetexplorer.driver", "D://SeleniumDrivers//IEDriverServer.exe");
			 driver =  new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	public void getScreenshot(String result) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("D://FirstScreenshot//\"+System. currentTimeMillis()+\".png"));
		FileUtils.copyFile(src, new File("D://FirstScreenshot//"+result+".png"));
		
		
		/*File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D://FirstScreenshot//"+System. currentTimeMillis()+".png"));*/
	}
}
