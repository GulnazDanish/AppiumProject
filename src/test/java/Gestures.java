import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.LongPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends Setup{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilitiesMethod("emulator");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"Views\")));").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
			
		t.tap(TapOptions.tapOptions().withElement(element(expandList))).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		WebElement w = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(LongPressOptions.longPressOptions().withElement(element(w)).withDuration(Duration.ofMillis(5))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
	
	}

}
