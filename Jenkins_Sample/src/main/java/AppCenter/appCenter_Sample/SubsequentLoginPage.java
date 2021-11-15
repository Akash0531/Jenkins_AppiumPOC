package AppCenter.appCenter_Sample;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Hello world!
 *
 */
public class SubsequentLoginPage extends TestBase {

	Subsequent_LoginScreenObjects ls = new Subsequent_LoginScreenObjects(driver);

	public boolean passwordField_isDisplayed() {
		return ls.login_Password.isDisplayed();
	}

	public void password_field(String password) {
		ls.login_Password.sendKeys(password);
	}

	public void password_fieldClear() {
		ls.login_Password.clear();
	}

	public boolean letMeIn_isEnabled() {
		return ls.letMeIn_button.isEnabled();
	}

	public void click_On_letMeInButton() {
		ls.letMeIn_button.click();
	}

	public boolean HomeHeader_isDisplayed() {
		return ls.home_header.isDisplayed();
	}

	public boolean detectPreventPopup() {
		Waitstatement.waitTillElementIsVisible(ls.preventerrorPopup, 20, driver);
		boolean popupstatus = ls.preventerrorPopup.isDisplayed();
		if (popupstatus == true) {
			return true;
		}
		return false;
	}

	public void preventpopupProceed() {	
		Waitstatement.waitForAnElementToBeClickable(ls.preventerrorPopupProceedBtn, driver);
		ls.preventerrorPopupProceedBtn.click();
	}

	public void chooseApplang() {
		Waitstatement.waitForAnElementToBeClickable(ls.continuelangScreen, driver);
		ls.chooseEnglishlang.click();
		ls.continuelangScreen.click();
	}

	public void swipeSplashScreen() {
		Waitstatement.waitTillElementIsVisible(ls.nextSplashScreen, 20, driver);
		ls.nextSplashScreen.click();
		ls.nextSplashScreen.click();
		ls.nextSplashScreen.click();
		ls.finalSplashScreen.click();
	}

	public void signInButton() {
		Waitstatement.waitForAnElementToBeClickable(ls.signInbutton, driver);
		ls.signInbutton.click();
	}

	public void firstSignIn(String username, String password) {
		Waitstatement.waitTillElementIsVisible(ls.signIn_Username, 20, driver);
		ls.signIn_Username.sendKeys(username);
		ls.signIn_Password.sendKeys(password);
		ls.signInbutton.click();
	}

	public void otpByAnotherMethod() {
		Waitstatement.waitTillElementIsVisible(ls.needHelpbutton, 30, driver);
		Waitstatement.waitForAnElementToBeClickable(ls.needHelpbutton, driver);
		ls.needHelpbutton.click();
		ls.tryanothermethodbutton.click();
		Waitstatement.waitTillElementIsVisible(ls.ByEmailradiobutton, 20, driver);
		ls.ByEmailradiobutton.click();
		ls.coninueByEmailbutton.click();
	}

	public void enterOTP() {
		Waitstatement.waitTillElementIsVisible(ls.otp1_box, 20, driver);
		ls.otp1_box.sendKeys("1");
		ls.otp2_box.sendKeys("2");
		ls.otp3_box.sendKeys("3");
		ls.otp4_box.sendKeys("4");
		ls.otp5_box.sendKeys("5");
		ls.otp6_box.sendKeys("6");
	}
}
