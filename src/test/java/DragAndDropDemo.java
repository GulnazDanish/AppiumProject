import static io.appium.java_client.touch.offset.ElementOption.element;

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
import io.appium.java_client.touch.LongPressOptions;

public class DragAndDropDemo extends Setup{
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilitiesMethod("emulator");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"Views\")));").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction t = new TouchAction(driver);
		WebElement w = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement w2 = driver.findElementByAndroidUIAutomator("index(2)");
		t.longPress(element(w)).moveTo(element(w2)).release().perform();
	}

}
