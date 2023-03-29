package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parent.Baseclass;



public class homepage extends Baseclass {
	

	public homepage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}
	
	public void setCloseIcon(WebElement closeIcon) {
		this.closeIcon = closeIcon;
	}

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/ancestor::div/button")
	private WebElement closeIcon;

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement text;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement search;

	public WebElement getText() {
		return text;
	}

	public void setText(WebElement text) {
		this.text = text;
	}



}
