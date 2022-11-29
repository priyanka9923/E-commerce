package selenium_Project_Testcases;

import selenium_Project_Pages.HomePage;

public class HomeTest {
	
	HomePage home = new HomePage();
	//navigate to home page
	public void testCase1() {
		home.navigateToHomepage();
	
	}
	public void searchTest() {
		home.searchResult("mobile");
	}
}
