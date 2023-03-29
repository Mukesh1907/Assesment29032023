package Testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumberreport.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\Mukesh babu\\eclipse-workspace\\Assesment\\src\\test\\resources\\Feature\\Flipkart.feature", 
		glue = "org.step", 
		dryRun = false, 
		monochrome =true, 
		strict = true , 
		tags = {"@Flipkart"}, 
		plugin = { "pretty",
		"html:C:\\Users\\Mukesh babu\\eclipse-workspace\\Assesment\\Reports\\Html\\mukeshh",
		"junit:C:\\Users\\Mukesh babu\\eclipse-workspace\\Assesment\\Reports\\Junit\\m.xml",	
		"json:C:\\Users\\Mukesh babu\\eclipse-workspace\\Assesment\\Reports\\Json\\placeorder.json",

		}
)

public class Testrunner  {
	
	@AfterClass
	public static void tc() {	
		
JVM.JVMreport(System.getProperty("user.dir")+"\\Reports\\Json\\placeorder.json");	
	}

}
