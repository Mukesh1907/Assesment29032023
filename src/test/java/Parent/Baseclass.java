package Parent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.Date;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	public static Actions a;
	public static WebDriver driver;

	public static Robot r;


	public static Select s;
	public static void chrome() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
	}
	
	

	public static void firefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void edge() {
		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void minimize() {

		driver.manage().window().minimize();
	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void FetchTitle() {
		String pagetitle = driver.getTitle();

		System.out.println(pagetitle);

	}

	public static void FetchUrl() {
		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}
	
	

	public static void Passvalue(WebElement element, String input) {

		element.sendKeys(input);

	}

	public static void clickbutton(WebElement element) {
		
		
	
		element.click();

	}
	
	
	public static void jsClick(WebElement element) {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
				
		executor.executeScript("arugments[0].click()", element);
	}

	public static void mouseOver(WebElement element) {
		a = new Actions(driver);

		a.moveToElement(element);

	}

	public static void rightclick() {

		a.contextClick();

	}

	public static void doubleclick() {
		a.doubleClick();

	}

	public static void draganddrop(WebElement ele1, WebElement ele2) {
		a.dragAndDrop(ele1, ele2);

	}

	public static void enter() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

	}

	public static void copy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	// getText() - to print the text presented inside the webpage

	// getAttribute(name) = to print the attribute's value ex : ID=Email =
	// getAttribute(ID); - Email attribute value will be printed.

	// getAttribute(Value); = to print the value which we have given in

	public static void gettext(WebElement element) {

		String text = element.getText();

		System.out.println(text);

	}

	public static void getAttribute(WebElement element, String input) {
		element.getAttribute(input);

	}

	public static void screenshot(String path) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver; // object creation for screenshot
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE); // command for taking screenshot =
																	// getScreenshotAs(OutputType.file);
		File f = new File(path); // creating path where the screenshot should be saved
		FileUtils.copyFile(screenshotAs, f);

	}

	public static void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);

		s.selectByIndex(index);

	}

	public static void selectbyvalue(WebElement element, String value) {
		Select s = new Select(element);

		s.selectByValue(value);

	}

	//public static void locatorwithname(String name) {
		//driver.findElement(By.name(name));

	//}

	public static String readFromexcel(String sheetname, int rowno, int cellno) throws IOException {
		File f = new File("C:\\Users\\Mukesh babu\\eclipse-workspace\\Ttt\\files\\Cricket.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fi);

		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();

		String input;

		if (type == 1) {

			input = cell.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(cell)) {

		java.util.Date date = cell.getDateCellValue();

			SimpleDateFormat sim = new SimpleDateFormat("dd,mmm,yyyy");

			input = sim.format(date);

		}

		else {

			double num = cell.getNumericCellValue();

			long lo = (long) num;

			input = String.valueOf(lo);

		}

		return input;

	}

	public static void Jscriptclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview(true)", element);

	}

	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview(false)", element);

	}
	
	public static void Javascriptgetattribute(WebElement element) {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("return arguments[0].getAttribute('value')", element);

	}
	
	public static void  implicitwait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	}


}
