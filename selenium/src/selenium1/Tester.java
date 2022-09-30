package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.anhtester.com/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
    Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
}

}
