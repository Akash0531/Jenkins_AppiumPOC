package AppCenter.appCenter_Sample;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class AppTest extends TestBase {

	SubsequentLoginPage l;
	
	@Test
     public void initial_firstLogin() {
		TestBase.Android_launcher();
		l = new SubsequentLoginPage();
		
		l.chooseApplang();

		boolean preventpopup = l.detectPreventPopup();
		if(preventpopup==true) {
			l.preventpopupProceed();
		}
		else {
			System.out.println("No Prevent Popup displayed in emulator");
		}

		l.swipeSplashScreen();
		l.signInButton();
		l.firstSignIn("0765788088", "12345@Test");
		l.otpByAnotherMethod();
		l.enterOTP();
	}	

	/*
	 * @Test public void user_launch_Equity_app() { TestBase.Android_launcher(); l =
	 * new SubsequentLoginPage();
	 * 
	 * boolean preventpopup = l.detectPreventPopup(); if(preventpopup==true) {
	 * l.preventpopupProceed(); } else {
	 * System.out.println("No Prevent Popup displayed in emulator"); } boolean
	 * pwdstatus = l.passwordField_isDisplayed(); if (pwdstatus == true) {
	 * 
	 * l.password_field("12345@Test"); l.letMeIn_isEnabled();
	 * l.click_On_letMeInButton(); boolean status = l.HomeHeader_isDisplayed(); if
	 * (status == true) {
	 * System.out.println("Successfuly logged in and landed to Home Page"); } } }
	 */

}
