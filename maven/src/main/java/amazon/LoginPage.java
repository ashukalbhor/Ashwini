package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath ="//input[@type ='email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement button;
	public LoginPage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	public void sendemailid()
	{
		emailid.sendKeys("avhadedj97@gmail.com");
		
	}
	public void clickOnContinue()
	{
		button.click();
	}
	
}
