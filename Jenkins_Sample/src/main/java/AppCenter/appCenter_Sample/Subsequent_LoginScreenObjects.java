package AppCenter.appCenter_Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Subsequent_LoginScreenObjects {

	public Subsequent_LoginScreenObjects(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "English")
	public WebElement navigateToLanguage;

	@FindBy(name = "Anza")
	public WebElement navigateToContinueLanguage;

	@FindBy(name = "Log in")
	public WebElement navigateToLoginButton;

	@FindBy(xpath = "/XCUIElementTypeApplication[@name=\"Equity\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField")
	public WebElement navigateToUsernameField;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Equity\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeSecureTextField")
	public WebElement navigateToPasswordField;

	@FindBy(name = "Continue")
	public WebElement navigateToContinue;

	@FindBy(name = "Ok, set up now")
	public WebElement navigateToLater;
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter your password']") 
	public WebElement login_Password;
	
	@FindBy(xpath = "//android.widget.Button[contains(@resource-id,'letMeIn')]")
	public WebElement letMeIn_button;
	
	@FindBy(xpath = "//android.widget.TextView[@text= 'Home']")
	public WebElement home_header;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Try again']")
	public WebElement tryAgainerrorPopup;
	
	@FindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'text_input_end_icon')]")
	public WebElement pwdEyeView_Icon;
	
	@FindBy(xpath = "//android.widget.TextView[@text= 'Uh oh!']")
	public WebElement preventerrorPopup;

	@FindBy(xpath = "//android.widget.Button[@text= 'Proceed']")
	public WebElement preventerrorPopupProceedBtn;
	
	@FindBy(xpath = "//android.widget.RadioButton[@text= 'English']")
	public WebElement chooseEnglishlang;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Continue']")
	public WebElement continuelangScreen;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Next']")
	public WebElement nextSplashScreen;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Get started']")
	public WebElement finalSplashScreen;
	
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Sign in']")
	public WebElement signInbutton;
	

	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter email address or mobile number']") 
	public WebElement signIn_Username;
	
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter your password']") 
	public WebElement signIn_Password;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Need help?']")
	public WebElement needHelpbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text= 'Try another method']")
	public WebElement tryanothermethodbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text= 'By Email']")
	public WebElement ByEmailradiobutton;
	
	@FindBy(xpath = "//android.widget.Button[@text= 'Continue']")
	public WebElement coninueByEmailbutton;

	@FindBy(id = "digit1")
	public WebElement otp1_box;
	
	@FindBy(id = "digit2")
	public WebElement otp2_box;
	
	@FindBy(id = "digit3")
	public WebElement otp3_box;
	
	@FindBy(id = "digit4")
	public WebElement otp4_box;
	
	@FindBy(id = "digit5")
	public WebElement otp5_box;
	
	@FindBy(id = "digit6")
	public WebElement otp6_box;
}

//Hello Ther Denis : textinput_placeholder
//*[@class = 'android.widget.EditText' and @index= '1']

