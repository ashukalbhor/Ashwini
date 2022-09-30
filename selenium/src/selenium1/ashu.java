package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ashu {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement x=driver.findElement(By.xpath("//span[text()='Hello, sign in'] "));
	
	x.click();


//	WebElement x=driver.findElement(By.xpath("//input[@type='text'] "));
//	x.sendKeys("lipstick");
//	x.click();
//	Thread.sleep(3000);
//	
//	
////	x=driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']"));
////	
////	x.click();
////	Thread.sleep(3000);
//	
//	
//	
//	x=driver.findElement(By.xpath(" //div[text()='Log In']"));
//	
//	x.click();
}
}
