package org.flightticket;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
public static WebDriver driver;
	
	
	public static void chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
	}
	
	public void close() {
		driver.close();

	}
	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void findElementByXpath(String attribute) {
		WebElement e=driver.findElement(By.xpath("attribute"));

	}
	
	public String getAttributeValue(WebElement ele) {
		String attr = ele.getAttribute("value");
		return attr;

	}
	
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
		

	}
	
	public void refresh() {
		driver.navigate().refresh();

	}
	public void back() {
		driver.navigate().back();

	}

}
