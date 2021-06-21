import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Swipedemo extends base {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("").click();
		driver.findElementByAndroidUIAutomator("").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();//
		TouchActions t = new TouchActions(driver);
		//longpress atleast for one second and move to another element
		WebElement first = driver.findElementByXPath("");
		WebElement target = driver.findElementByXPath("");
		t.longPress((WebElement) longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveToElement(target).release().perform();

	}

}
