package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class placeorder extends Parent.Baseclass {
	
	public placeorder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

	public void setOrder(WebElement order) {
		this.order = order;
	}


}
