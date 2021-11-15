package AppCenter.appCenter_Sample;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;

public class Waitstatement extends TestBase {

	/**
	 * This function will wait for a element until it is clickable within the
	 * provided delay.
	 */
	public static boolean waitForAnElementToBeClickable(WebElement element, WebDriver driver) {
		if (element != null) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(element));
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			System.out.println("PageElement not exist");
		}
		return false;
	}

	/**
	 * This function will wait for a element until it is visible within the provided
	 * delay.
	 */
	public static boolean waitTillElementIsVisible(WebElement elementTobeFound, int seconds, WebDriver driver) {
		if (elementTobeFound != null) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, seconds);
				wait.until(ExpectedConditions.visibilityOf(elementTobeFound));
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			System.out.println("PageElement not exist");
		}
		return false;
	}
}