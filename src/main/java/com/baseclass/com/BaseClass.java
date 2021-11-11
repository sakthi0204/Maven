package com.baseclass.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "ccc");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "ccc");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("INVALID BROWSER");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) {			//getUrl("google,com");
		driver.get(url);
	}

	public static void toClose() {
		driver.close();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toclick(WebElement element) {
		element.click();
	}

	public static void toNavigate(String Url) {
		driver.navigate().to(Url);
	}

	public static void toNavigateBack() {
		driver.navigate().back();
	}

	public static void toNavigateForward() {
		driver.navigate().forward();
	}

	public static void toRefresh() {
		driver.navigate().refresh();
	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	} 

	public static void toGetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void moveToElement(WebElement element) {								 // actions moveToElement
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void toScroll(String a) { 											// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;						    // toScroll
		js.executeScript("window.scrollBy(0," + a + ")");

	}
	
	public static void scrollByElement(WebElement element) {
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", element);
		

	}

	public static void threadSleep(int a) throws InterruptedException { 				// Thread.sleep
		Thread.sleep(a);
	}

	public static void frameIn(int a) { 												// frame open
		driver.switchTo().frame(a);
	}

	public static void frameOut() { 													// frame close
		driver.switchTo().defaultContent();
	}

	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS); 				// implycitlyWait
	}

	public static void takesScreenshot(String path) throws IOException { 				// Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}



	public static void windowhandels(int a) {											// windowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(a));
	}

}
