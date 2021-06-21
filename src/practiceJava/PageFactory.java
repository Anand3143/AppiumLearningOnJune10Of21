package practiceJava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {

	@FindBy(xpath = "//input[@class='type']")
	WebElement search_box;
}
