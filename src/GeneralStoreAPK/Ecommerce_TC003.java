package GeneralStoreAPK;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_TC003 extends base{
	
	public static void main(String[] args) throws Throwable {
		
		//fill the form and click on submit and select the item and add to cart
		
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
		//finding out all the products in page
		System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productitem")).size());//it will display no.of items displayed on mobile screen only, it will not display total items in that page
		//displaying the product completelly
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("new UiSelector().resourceId(\"com.androidstore:id/rvProductlist\")).scrollIntoView(new UiSelector().textMatches(\"\").instance(0))"));
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".resourceId(\"android:id/list\")).scrollIntoView("
                + "new UiSelector().text(\"Jardan 6 Rings\"));");
		
		//displaying products in page
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productitem")).size();
		//
		for(int i=0;i<count;i++)
		{
		String text = driver.findElements(By.id("com.androidsample.generalstore:id/productitem")).get(i).getText();
			
			if(text.equalsIgnoreCase("Jardan 6 Rings"))
			{
				//now add to cart the product
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			}
			driver.findElement(By.id("com.androidsample.generalstore:id/product_btn_cart")).click();
		}
		
		
		
	}

}
