package selenium_Project_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium_Project_utility.WebDriverSetup;

public class HomePage {
	public static final String baseurl = "https://www.amazon.in/";
	
	private WebDriver driver;
	
	public HomePage() {
		driver= WebDriverSetup.driver;
	}
	
	public void navigateToHomepage() {
		driver.get(baseurl);
	}
	
	public void searchResult(String search) {
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(search);
		
		WebElement searchbtn =  driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
				
	}


}
