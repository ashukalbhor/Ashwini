package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.Homepage;
import amazon.Login;
import amazon.LoginPage;
import amazon.Sreach;

public class Amazontest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Homepage homepage = new Homepage(driver);
		homepage.signin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.sendemailid();
		loginpage.clickOnContinue();
		Thread.sleep(3000);
		
		Login login = new Login(driver);
		login.sendpassword();
		login.clickOnContinue();
		Thread.sleep(3000);
		
		Sreach sreach =new Sreach(driver);
		sreach.sendName();
		sreach.clickOnContinue();
	
	    sreach.clickOn();
}
}

