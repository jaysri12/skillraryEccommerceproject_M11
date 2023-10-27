package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillaryHomePage {
    //Declaration
	//address of gears
	@FindBy(xpath ="//a[text()'GEARS']")
	private WebElement gearsbtn;
	
	
	//address of skillrary demo app
	@FindBy(xpath ="//a[text()'skillRary Demo App'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath ="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath ="//input[@value='go']")
	private WebElement searchIcon;
	
	//initialization
	public skillaryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getGearsbtn1() {
		return gearsbtn;
	}
	
	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}
	
	public WebElement getSearchTf() {
		return searchTf;
	}
	
	public WebElement getGearsbtn() {
		return searchIcon;
	}
	
	//Business libraries
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillraryDemoApp() {
		skillrarydemoapp.click();
	}
	
	public void searchTextField(String data) {
		searchTf.sendKeys(data);
	}
}
