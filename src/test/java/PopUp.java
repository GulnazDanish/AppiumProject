import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PopUp extends Setup{
	public static void main(String args[]) throws MalformedURLException {
				
		AndroidDriver<AndroidElement> driver = capabilitiesMethod("emulator");
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//driver.findElementById("android:id/text1").click();
		driver.findElementById("android:id/checkbox").click();
		//driver.findElementById("android:id/title").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Hello");
	//	driver.findElementById("android:id/button2").click();
		driver.findElementById("android:id/button1").click();
	}

}
