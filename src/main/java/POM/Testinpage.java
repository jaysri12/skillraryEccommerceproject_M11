package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testinpage {
	     //Declaration
		 //address of facebook
		@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
		private WebElement Facebook;
		
		//initialization
		public Testinpage (WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		
		//utilization
		
		public WebElement getFacebook() {
			return Facebook;
		}
		//Business library
		public void FacebookWebElement() {
			Facebook.click();
		}
	}
