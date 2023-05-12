package com.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='destination of the week! The Beach!']")
	private WebElement link;
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement dep;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement dest;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement findflightsButton;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement findFlightLowest;
	
	@FindBy(xpath="//p[text()='Total Cost: ']")
	private WebElement text;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement button;
	
	@FindBy(xpath="//table[@class='table']//following::td[2]")
	private WebElement ConfirmId;

	public WebElement getLink() {
		return link;
	}

	public WebElement getDep() {
		return dep;
	}

	public WebElement getDest() {
		return dest;
	}

	public WebElement getFindflightsButton() {
		return findflightsButton;
	}

	public WebElement getFindFlightLowest() {
		return findFlightLowest;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getConfirmId() {
		return ConfirmId;
	}
	

}
