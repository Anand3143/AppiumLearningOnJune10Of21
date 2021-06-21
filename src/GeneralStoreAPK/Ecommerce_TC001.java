package GeneralStoreAPK;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_TC001 extends base{
	
	public static void main(String[] args) throws Throwable {
		
		//fill the form and click on submit button
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("..")).sendKeys("Hello");
		driver.hideKeyboard();//for hidding the active keyboard
		driver.findElement(By.xpath("...")).click();//radio button
		
		driver.findElement(By.id("android:id/text1")).click();//clicks on dropdown
		//scrolling down
		driver.findElementByAndroidUIAutomator("new UsiScrollable(new UiSelector()).scrollIntoView(text\"Antartica\"));");
		//click on antartica
		driver.findElement(By.xpath("//*[@text='antartica']")).click();
		//submit
		driver.findElement(By.id("")).click();
		
		
		
		
		
	}

}
