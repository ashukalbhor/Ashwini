package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath ="//input[@type ='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement button;
	
	public Login(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	public void sendpassword()
	{
		password.sendKeys("avhade1997");
		
	}
	public void clickOnContinue()
	{
		button.click();
	}
}


