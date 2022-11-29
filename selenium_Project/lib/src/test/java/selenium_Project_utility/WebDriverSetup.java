package selenium_Project_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetup {
	public static WebDriver driver;
//	public void driverSetup() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/test/resources/drivers/chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//	}
	public void driverSetup() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	
	public void QuitDriver() {
		driver.quit();
	}
}
