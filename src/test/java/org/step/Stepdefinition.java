package org.step;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Parent.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pojoClass.Viewcart;
import pojoClass.addtocart;
import pojoClass.dryfruit;
import pojoClass.homepage;
import pojoClass.placeorder;

public class Stepdefinition extends Baseclass {
	

@Given("User enters Into walnut section")
public void user_enters_Into_walnut_section() {
	

	homepage h = new homepage();
	clickbutton(h.getCloseIcon());
	Passvalue(h.getText(), "Farmley Popular W400 Raw Kaju Cashews");
	clickbutton(h.getSearch());
   
}

@When("User selects Farmley Cashews {int}g")
public void user_selects_Farmley_Cashews_g(Integer int1) {
   dryfruit d = new dryfruit();
   clickbutton(d.getCashnewNut());
}

@SuppressWarnings("deprecation")
@When("User clicks Go to cart option")
public void user_clicks_Go_to_cart_option() {
	
	Set<String> w = driver.getWindowHandles();
	List<String> l = new ArrayList(w);

	driver.switchTo().window(l.get(1));
   addtocart a = new addtocart();
  WebElement addto = a.getAddto();
  addto.click();
	 
	 
   Viewcart v = new Viewcart();
   WebElement order = v.getOrder();
  String o = order.getText();
  System.out.println(o);
  Assert.assertEquals("PLACE ORDER", o);
  System.out.println("ITem has bees succussfully added to the cart");

}
@When("User click Place order")
public void user_click_Place_order() {
   placeorder p = new placeorder();
   clickbutton(p.getOrder());

}

@When("User navigates back")
public void user_navigates_back() {
   driver.navigate().back();
}

@When("User Clicks Remove")
public void user_Clicks_Remove() {
   Viewcart v = new Viewcart();
 clickbutton(v.getRemove());
 clickbutton(v.getRemove());
}

@Then("Your cart is empty page is displayed")
public void your_cart_is_empty_page_is_displayed() {
	Viewcart v = new Viewcart();
	WebElement m = v.getDropped();

	String messtex = m.getText();
	System.out.println(messtex);
	Assert.assertEquals("Login to see the items you added previously", messtex);
	
    System.out.println("Your cart is empty");
}

}
