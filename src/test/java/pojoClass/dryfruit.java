package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class dryfruit extends Parent.Baseclass {
	

	public dryfruit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Farmley Popular W400 Raw Kaju Cashews']")
	private WebElement cashnewNut;

	public WebElement getCashnewNut() {
		return cashnewNut;
	}

	public void setCashnewNut(WebElement cashnewNut) {
		this.cashnewNut = cashnewNut;
	}


}
