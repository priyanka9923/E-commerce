package selenium_Project_Pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium_Project_Testcases.HomeTest;
import selenium_Project_Testcases.Register;
import selenium_Project_utility.WebDriverSetup;
//nevigate to reg using mouse action
public class RegisterPage {
	public RegisterPage(){
		driver= WebDriverSetup.driver;
	}
	 public static void logStatus(String type, String message, String status) {

	        System.out.println(String.format("%s |  %s  |  %s | %s", String.valueOf(java.time.LocalDateTime.now()), type,
	                message, status));
	    }
	public static final String url = "https://www.amazon.in/";
	private WebDriver driver;
	
	public void navigateToRegisterpage() throws InterruptedException {
		HomeTest testcase= new HomeTest();
	testcase.testCase1();
//		
		Actions actions = new Actions(driver);
		WebElement menuOption =driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(5000);
		actions.moveToElement(menuOption).perform();
		Thread.sleep(5000);
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Start here.')]"));
		Thread.sleep(5000);
		actions.moveToElement(register).perform();
//		Thread.sleep(5000);
//		actions.click().build().perform();
		register.click();
		
		//driver.get(url);
	}
	public void navigateToReg() throws InterruptedException {
		//String SignUrl= driver.getCurrentUrl();
		driver.get(url);
		Thread.sleep(5000);
		WebElement signInOption =driver.findElement(By.xpath("//a[@id= 'nav-link-accountList']"));
		Thread.sleep(5000);
		signInOption.click();
		Thread.sleep(5000);
		String SignUrl= driver.getCurrentUrl();
		if(SignUrl.contains("/signin")) {
			driver.findElement(By.id("createAccountSubmit")).click();
			Thread.sleep(5000);
			String url =driver.getCurrentUrl();
			driver.get(url);
			Thread.sleep(5000);
//			WebDriverWait wait = new WebDriverWait(driver,30);
//			wait.until(ExpectedConditions.urlContains("/register"));
			
			
		}
		
		
	}
	public Boolean registerUser(String uname, String mob,String uemail, String pwd) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.getCurrentUrl();
		WebElement username= driver.findElement(By.id("ap_customer_name"));
		username.sendKeys(uname);
		
		Select countryCode= new Select(driver.findElement(By.xpath("//select[@id ='auth-country-picker']")));
		countryCode.selectByVisibleText(" IN +91");
		
		WebElement mobile= driver.findElement(By.id("ap_phone_number"));
		mobile.sendKeys(mob);
		
		WebElement email= driver.findElement(By.id("ap_email"));
		email.sendKeys(uemail);
		
		WebElement passwd= driver.findElement(By.id("ap_password"));
		passwd.sendKeys(pwd);
		if(pwd.length()<6) {
			 logStatus("Failure Status","password length is less then 6 character","Fail");
			// return false;
		}
		else {
			logStatus("Pass Status","password length is grater then 6 character","PASS");
		 //return true;
	}
		 driver.findElement(By.id("continue")).click();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.urlContains("/signin"));
//		 Thread.sleep(5000);
		 return true;

	}
	
	
	

}
