package Amazon_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StopOver {

WebDriver driver;
	
	@FindBy (linkText = "Read and Listen for free") WebElement ls;
	
	

	public void Stopover() {
		ls.click();
	}
	
	
	public void Stop (WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}