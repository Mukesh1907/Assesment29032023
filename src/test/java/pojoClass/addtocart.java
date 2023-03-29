package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class addtocart extends Parent.Baseclass {
	

	public addtocart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Buy Now']//parent::form//parent::li//preceding-sibling::li//child::button")
	private WebElement addto;
	
	public WebElement getAddto() {
		return addto;
	}

	public void setAddto(WebElement addto) {
		this.addto = addto;
	}

	@FindBy(xpath = "//button[text()='Buy Now']")
	private WebElement buy;

	public WebElement getBuy() {
		return buy;
	}

	public void setBuy(WebElement buy) {
		this.buy = buy;
	}

	

}
