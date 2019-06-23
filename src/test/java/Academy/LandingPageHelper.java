package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;



public class LandingPageHelper extends HomePage{
	
	public static WebDriver driver=null;
	LandingPage landPage = new LandingPage();
	
	public LandingPageHelper(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, landPage);		
	}
	

	public void login(WebDriver driver) throws IOException
	{
		prop = getProp.getPropData();
		System.out.println("Printing....."+prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		Reporter.log("The Home Page is sucessfully loaded",true);
		landPage.demosite.click();
		Assert.assertEquals(landPage.demosite.getText(), "HOME");
		Assert.assertTrue(landPage.demosite.isDisplayed());		
		//Assert.assertFalse(landPage.demosite.isDisplayed());
		Reporter.log("The Demo Site is successfully clicked",true);
		
		
	}
	
	
	/*public void clickspVersionLink() throws InterruptedException, IOException {
		basePageNavigation();
		landPage.login.click();
		Reporter.log("The Login link is clicked sucessfully",true);
   }*/
}
