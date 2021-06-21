import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends base {
	
	public static void main(String[] args) throws Throwable {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		TouchActions t = new TouchActions(driver);
		//longpress(source)/move(destination)/release
		WebElement source = driver.findElementByXPath("");
		WebElement destination = driver.findElementByXPath("");
		t.longPress((WebElement) longPressOptions().withElement(element(source))).moveToElement(destination).release().perform();
		
		
	}

}
