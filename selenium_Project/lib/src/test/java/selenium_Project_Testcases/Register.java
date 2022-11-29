package selenium_Project_Testcases;

import selenium_Project_Pages.RegisterPage;

public class Register {
	
	public void TestNavigate() throws InterruptedException{
//		HomeTest testcase= new HomeTest();
//		testcase.testCase1();
////		
		RegisterPage register = new RegisterPage();
		register.navigateToRegisterpage();
		
	}
	
	public void TestNavigateToRegister() throws InterruptedException{
		Boolean status;
		RegisterPage registerNav = new RegisterPage();
		registerNav.navigateToReg();
		status = registerNav.registerUser("priya", "9823344512","priyusonawane2811@gmail.com", "abcdwef");
	}

}
