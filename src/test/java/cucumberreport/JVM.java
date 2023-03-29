package cucumberreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM {
	
	public static void JVMreport(String jsonpath) {

	

		File f = new File(System.getProperty("user.dir")+"\\Reports\\JVM"); 



		Configuration c = new Configuration(f, "Flipkart");

		c.addClassifications("Platform", "Windows 11");
		c.addClassifications("JDK Version", "Jdk-1.8");
		c.addClassifications("Selenium version", "4.8.0");

	

		List<String> l = new ArrayList<String>();
		l.add(jsonpath);

		

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();


	}

}
