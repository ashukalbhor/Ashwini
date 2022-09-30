package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.Homepage;
import amazon.Login;
import amazon.LoginPage;
import amazon.Sreach;

  public class Testngamazon {
	private WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void loginBrowser() throws InterruptedException {
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

	}

	@Test
	public void sreachMobile() throws InterruptedException {
		Sreach sreach = new Sreach(driver);
		sreach.sendName();
		sreach.clickOnContinue();
		sreach.clickOn();
		 String url =driver.getCurrentUrl();
		 System.out.println(url);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		if (url.equals("https://www.amazon.in/s?k=Mobile&ref=nb_sb_noss")&&title.equals("Amazon.in : Mobile")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
  }
