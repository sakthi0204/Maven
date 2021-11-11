package com.maven.MavenProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.com.BaseClass;

public class Up3 extends BaseClass{

	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\driver\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
		
	driver=	browserLaunch("chrome");
		driver.get("https://www.amazon.in/");
		
		Actions ac=new Actions (driver);
		Robot r= new Robot();
		
		
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//div[@id='nav-xshop']//following::a[text()='Mobiles']"));
		
		ac.contextClick(mobile).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("1");
		
		WebElement fashion = driver.findElement(By.xpath("//div[@id='nav-xshop']//following::a[text()='Fashion']"));
		
		ac.contextClick(fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.getTitle();
		
		System.out.println("2");
		
		WebElement amazonpay = driver.findElement(By.xpath("//div[@id='nav-xshop']//following::a[text()='Amazon Pay']"));
		
		ac.contextClick(amazonpay).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("3");
		
		WebElement computer = driver.findElement(By.xpath("//div[@id='nav-xshop']//following::a[text()='Computers']"));
		
		ac.contextClick(computer).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("4");
		
WebElement home = driver.findElement(By.xpath("//div[@id='nav-xshop']//following::a[text()='Home & Kitchen']"));
		
		ac.contextClick(home).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("5");
		
		
		//div[@id='nav-xshop']//following::a[text()='Home & Kitchen']
		
		String windowHandle = driver.getWindowHandle();
		System.out.println("parent ="+windowHandle);
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
//		List<String> list =new ArrayList<String>(windowHandles);
//		driver.switchTo().window(list.get(3));
		windowhandels(0);
		
		WebElement eee = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		scrollByElement(eee);
		scrollByElement(mobile);
		
		System.out.println("s");
		
		
		
		
		
		
		
		
//		String s= "amazonpay";
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String str : windowHandles) {
//			 driver.switchTo().window(str).getTitle();
//		System.out.println("");
//			 }
		
//		Iterator<String> iter =  windowHandles.iterator();
//		
//		while (iter.hasNext()) {
//			
//			if (driver.switchTo().window(iter.next()).getTitle().equalsIgnoreCase(s)) {
//				break;
//				
//			}
		
		}
		

			
		
		
		
		
		
		
		
		



		
		
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//		WebElement element = driver.findElement(By.xpath("//div[@class='navFooterColHead']"));
//		WebElement element2 = driver.findElement(By.xpath("(//img[@alt='Holi'])[1]"));
//		
//		js.executeScript("arguments[0].scrollIntoView();",element);
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();",element2);

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File source = ts.getScreenshotAs(OutputType.FILE);
//
//		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\s4.png");
//		
//		FileUtils.copyFile(source, destination);
//		
//		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"));
//		Actions ac= new Actions(driver);
//		
//		WebElement wish = driver.findElement(By.xpath("(//span[@class='nav-text'])[1]"));
//		ac.moveToElement(signin).build().perform();
//		wish.click();

		
		
		

	

	
	



}
