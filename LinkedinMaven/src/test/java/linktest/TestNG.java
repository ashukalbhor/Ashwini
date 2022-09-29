package linktest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ashu.HomePage;
import ashu.LoginPage;
import ashu.Logout;
import ashu.MyNetwork;

public class TestNG {
private WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashuk\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod

	public void loginBrowser() throws InterruptedException {
		driver.get("https://in.linkedin.com/");
	
		LoginPage loginpage = new LoginPage(driver);
	
		Thread.sleep(3000);
		loginpage.email();
		loginpage.sendpassword();
		loginpage.clickon();
		Thread.sleep(3000);
		HomePage homepage = new HomePage(driver);
		homepage.network();
		
	}

	@Test
	public void myNetwork() throws InterruptedException {
		 MyNetwork mynetwork = new MyNetwork(driver);
		mynetwork.connetions();
		Thread.sleep(3000);
		
	}
	@Test
	public void MyNetwork1() throws InterruptedException {
		
		MyNetwork mynetwork = new MyNetwork(driver);
		mynetwork.contact();
		Thread.sleep(4000);
		

	}
	@Test
	public void MyNetwork2() {
		MyNetwork mynetwork = new MyNetwork(driver);
		
		mynetwork.people();
		

	}

	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Logout logoutPage = new Logout(driver);
		logoutPage.me();
		logoutPage.signout();
		Thread.sleep(3000);
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}


