package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public static WebDriver driver;
	//@FindBy(linkText="SP Firewall Status:")
	//public WebElement spFirewallStatus;
	//@FindBy(css="span[class='menu-text']")
	@FindBy(css="span[class='menu-item-text']")
	public WebElement demosite;

}
