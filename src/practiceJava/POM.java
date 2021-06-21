package practiceJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {

	static WebElement search_txt;
	public static WebElement textbox_search(WebDriver driver)
	{
		search_txt = driver.findElement(By.id("1"));
	return search_txt;

	}
	}
