package selenium1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		alert.click();
		confirm.click();
		prompt.click();
		line.click();
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);

		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		System.out.println(addr.get(3));
		System.out.println(addr.get(4));
		driver.switchTo().window(addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(3));
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(addr.get(4));
		System.out.println(driver.getCurrentUrl());

	}

}
