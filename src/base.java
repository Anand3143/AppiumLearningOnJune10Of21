import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	public static AndroidDriver<AndroidElement> capabilities() throws Throwable {
		
		File fi = new File("src");
		File fs = new File(fi, "ApiDemos-debug.apk");
		//General-Store.apk
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");//device name
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomatro2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//path of apk file
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//android update internally
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.01:4723/ws/hub"), cap);//appium connection
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		
		
	}

}
