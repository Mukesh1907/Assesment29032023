package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout extends Parent.Baseclass {

	public WebElement getContinuee() {
		return continuee;
	}

	public void setContinuee(WebElement continuee) {
		this.continuee = continuee;
	}

	public checkout() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement login;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continuee;

	@FindBy(xpath = "//div[text()='Cash on Delivery']")
	private WebElement cod;

	public WebElement getCod() {
		return cod;
	}

	public void setCod(WebElement cod) {
		this.cod = cod;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

}
