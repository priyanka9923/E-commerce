package selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_Project_Testcases.HomeTest;
import selenium_Project_Testcases.LoginTest;
import selenium_Project_Testcases.Register;
import selenium_Project_utility.WebDriverSetup;

public class Application_first {
	
	
	 public static void logStatus(String type, String message, String status) {

	        System.out.println(String.format("%s |  %s  |  %s | %s", String.valueOf(java.time.LocalDateTime.now()), type,
	                message, status));
	    }
	public static void main(String[] args) {
		WebDriverSetup setup = new WebDriverSetup();
		try {
			
			setup.driverSetup();
			
			HomeTest testcase= new HomeTest();
//			testcase.testCase1();
//			
			Register navigate = new Register();
			navigate.TestNavigate();
//			Register navigate = new Register();
//			navigate.TestNavigateToRegister();
			
//			LoginTest loginTst = new LoginTest();
//			loginTst.RegTest();
//			
			//testcase.searchTest();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		 
		} finally{
			
			//setup.QuitDriver();
		}
	}
	

}
