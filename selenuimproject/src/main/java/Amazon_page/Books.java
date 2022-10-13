package Amazon_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
	WebDriver driver;
	
	@FindBy (linkText = "The Stopover") WebElement st;
	
	

	public void Stopover() {
		st.click();
	}
	
	
	public Books(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}