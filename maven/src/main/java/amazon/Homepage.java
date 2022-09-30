package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	@FindBy(xpath ="//span[text()='Hello, sign in']")
	private WebElement signin;
	
	public Homepage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	public void signin()
	{
		signin.click();
		
	}
	
	

}
