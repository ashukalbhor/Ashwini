package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		WebElement frame = driver.findElement(By.xpath("//ul[@id='gallery']/iframe"));
//		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement drop = driver.findElement(By.xpath("//div[text()='Italy']"));
	    Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
}
}

