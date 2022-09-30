package selenium1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\OneDrive\\Documents\\ashusel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
Random random =new Random();
		
		int date =random.nextInt();

//		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy hh mm ss");
//		String str = f.format(new Date());

//		Calendar cal =Calendar.getInstance();
//		Date time =cal.getTime();
//		String times = currentdate.toString().replace(" ", "-").replace(":", "-");

//		Date currentdate = new Date();
//		String times = currentdate.toString().replace(" ", "-").replace(":", "-");

		TakesScreenshot take = (TakesScreenshot) driver;
		File scr = take.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\user\\OneDrive\\Desktop\\screen" + date+ " .jpg");
		FileHandler.copy(scr, dest);

	}

}
