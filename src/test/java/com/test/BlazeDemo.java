package com.test;


import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.LoginPage;

public class BlazeDemo extends BaseClass{
	
	
	@Test
	public void login() {
		chromeLaunch();
		LoginPage lp = new LoginPage();
		
		loadUrl("https://blazedemo.com/index.php");

		System.out.println("AA");
	driver.findElement(By.xpath("//a[text()='destination of the week! The Beach!']"));
	
		
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		boolean contains = curl.contains("vacation");
		System.out.println(contains);
		
		back();
		
		Select select= new Select(lp.getDep());
		select.selectByVisibleText("Mexico City");
		
		Select select1= new Select(lp.getDest());
		select1.selectByVisibleText("London");
		
		lp.getFindflightsButton().click();
	    lp.getFindFlightLowest().click();
	    lp.getText().getText();
	
		
		Assert.assertEquals(lp.getText().getText(), "Total Cost");
		
		lp.getButton().click();
		//lp.getConfirmId().getText();
		
		System.out.println(lp.getConfirmId().getText());
		
	}

}
