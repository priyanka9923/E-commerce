package selenium_Project_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium_Project_Testcases.LoginTest;
import selenium_Project_utility.WebDriverSetup;

public class LoginPage {
	
	public static void logStatus(String type, String message, String status) {

        System.out.println(String.format("%s |  %s  |  %s | %s", String.valueOf(java.time.LocalDateTime.now()), type,
                message, status));
    }
	public LoginPage(){
		driver= WebDriverSetup.driver;
	}
	public static final String url = "https://www.amazon.in/";
	private WebDriver driver;
	public void navigateToLogin() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
		WebElement signInOption =driver.findElement(By.xpath("//a[@id= 'nav-link-accountList']"));
		Thread.sleep(5000);
		signInOption.click();
	}
	public void login(String email1, String passward) throws InterruptedException {
		
		System.out.println(driver.getCurrentUrl());
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(email1);
		if(email1.contains("@")) {
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			WebElement pwd = driver.findElement(By.id("ap_password"));
			pwd.sendKeys(passward);
			WebElement signin = driver.findElement(By.id("signInSubmit"));
			signin.click();
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		     wait.until(ExpectedConditions.urlContains("ref_=nav_ya_signin"));
			//Thread.sleep(5000);
			
			
		}
		else {
			logStatus("Failure Status","Invalid email address","FAIL");
		}
	}
	

}
