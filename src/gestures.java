import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class gestures extends base {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchActions t = new TouchActions(driver);
		WebElement expandList =	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.singleTap((WebElement) tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='custome adapter']").click();
		
		WebElement longpress =  driver.findElementByXPath("//android.widget.TextView[@text='people names']");
		
		t.longPress((WebElement) longPressOptions().withElement(element(longpress)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("").isDisplayed());
		
	}

}
