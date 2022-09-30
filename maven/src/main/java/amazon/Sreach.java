package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sreach {
	
		@FindBy(xpath ="//input[@type ='text']")
		private WebElement sreach;
		
		@FindBy(xpath ="//input[@type ='submit']")
		private WebElement sreach1;
		
		@FindBy(xpath ="//span[text()='OnePlus']")
		private WebElement one;
		
		
		public Sreach(WebDriver driver123)
		{
			PageFactory.initElements(driver123, this);
			
		}                             //input[@type ='submit'] (//input[@type ='checkbox'])[1]
		public void sendName()
		{
			sreach.sendKeys("Mobile");
			
		}
		public void clickOnContinue()
		{
			sreach1.click();
		}
		public void clickOn() {
			one.click();
		}
}
