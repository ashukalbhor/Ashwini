package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
//		double date =Math.random();
//		int date1 = ThreadLocalRandom.current().nextInt();
		Random random = new Random();		
		
		int date = random.nextInt();

		TakesScreenshot take = (TakesScreenshot) driver;
		File scr = take.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\user\\OneDrive\\Desktop\\screen" + date + " .jpg");
		FileHandler.copy(scr, dest);

	}

}
