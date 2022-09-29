package ashu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath ="//span[text()='Me']")
	private WebElement me;
	
	@FindBy(linkText =("Sign Out"))
	private WebElement signout;
	public Logout(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	public void me()
	{
		me.click();
		
	}
	public void signout()
	{
		signout.click();
}
}


