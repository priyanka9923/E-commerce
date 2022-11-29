package selenium_Project_Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium_Project_Pages.LoginPage;

public class LoginTest {
	//public static WebDriver driver;
	public void RegTest() throws InterruptedException {
		
		LoginPage log = new LoginPage();
		log.navigateToLogin();
		Thread.sleep(5000);
		log.login("priyusonawane28@gmail.com", "Sanvi@2811");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

}
