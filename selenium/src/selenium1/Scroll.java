package selenium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.namacindia.com/");
	Thread.sleep(5000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)");
	
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-300)");
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(500,0)");
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(-500,0)");
	
	Thread.sleep(3000);
    WebElement news = driver.findElement(By.xpath("//a[text()='News']"));
	
	js.executeScript("arguments[0].scrollIntoView(true)",news );

}
}
