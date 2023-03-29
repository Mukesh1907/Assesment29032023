package org.step;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Parent.Baseclass;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	@Before
	public void browser() {
		chrome();
		maximize();
		url("https://www.flipkart.com/");
		implicitwait();

	}

	@After
	public void After(Scenario s) {

		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");

		}

	}
}
