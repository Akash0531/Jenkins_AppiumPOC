package AppCenter.appCenter_Sample;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	  public static AndroidDriver<MobileElement> driver;
	  public static DesiredCapabilities cap;

	  public static AndroidDriver<MobileElement> Android_launcher() {
			try {

				cap = new DesiredCapabilities();

				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_29");
				cap.setCapability("appPackage", "ke.co.equitygroup.equitymobile.debug");
				cap.setCapability("appActivity", "ke.co.equitybank.oneequity.SplashActivity");
				cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
				//cap.setCapability(MobileCapabilityType.FULL_RESET, "True");
				// cap.setCapability(MobileCapabilityType.APP, "/Users/Akash/Desktop/equity.apk");
				cap.setCapability("noReset", false);

				
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return driver;
		}

		public void tearDown() {
			System.out.println("Stopping App");
	        driver.quit();
		}

}
