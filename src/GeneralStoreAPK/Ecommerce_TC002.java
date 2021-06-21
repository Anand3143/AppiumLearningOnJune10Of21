package GeneralStoreAPK;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_TC002 extends base{
	
	public static void main(String[] args) throws Throwable {
		
		//fill the form and verify the toast message if got the error
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.findElement(By.id("..")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("...")).click();//radio button
		
		driver.findElement(By.id("android:id/text1")).click();
		//scrolling down
		driver.findElementByAndroidUIAutomator("new UsiScrollable(new UiSelector()).scrollIntoView(text\"Antartica\"));");
		//click on antartica
		driver.findElement(By.xpath("//*[@text='antartica']")).click();
		//submit
		driver.findElement(By.id("")).click();
		//for toast message(error message)
		String toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastmsg);//for printing the toast message
		//we can do with asserts also
		//Assert.assertEquals("Please enter your name", toastmsg);//actuall validation true or false
		
		
		
		
	}

}
