package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoskillrarypage {
     //declaration
	//address of select catagory
	@FindBy(name="addresstype")
	private WebElement selected;
	
	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbckbtn;
	
	//initialization
	public Demoskillrarypage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	
	public WebElement getSelectedDd() {
		return selected;
	}
	
	public WebElement getFeedbckbtn() {
		return feedbckbtn;
	}
}
