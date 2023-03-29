package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parent.Baseclass;



public class Viewcart extends Baseclass{
	

	public Viewcart() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement remove;
	
	@FindBy(xpath ="//div[text()='Your cart is empty!']")
	private WebElement empty;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement order;
	
	@FindBy(xpath = "//div[text()='Login to see the items you added previously']")
	private WebElement dropped;
	
	@FindBy(xpath = "//img[@alt='Farmley Popular W400 Raw Kaju Cashews']")
	private WebElement cashnewNut;


	public WebElement getCashnewNut() {
		return cashnewNut;
	}

	public void setCashnewNut(WebElement cashnewNut) {
		this.cashnewNut = cashnewNut;
	}

	public WebElement getDropped() {
		return dropped;
	}

	public void setDropped(WebElement dropped) {
		this.dropped = dropped;
	}

	public WebElement getOrder() {
		return order;
	}

	public void setOrder(WebElement order) {
		this.order = order;
	}

	public WebElement getEmpty() {
		return empty;
	}

	public void setEmpty(WebElement empty) {
		this.empty = empty;
	}

	public WebElement getRemove() {
		return remove;
	}

	public void setRemove(WebElement remove) {
		this.remove = remove;

}
	
	
	

}
