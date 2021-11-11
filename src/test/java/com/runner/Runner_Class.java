package com.runner;

import org.openqa.selenium.WebDriver;
import com.baseclass.com.BaseClass;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends BaseClass {

	public static WebDriver driver = BaseClass.browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {


		driver.get("http://automationpractice.com/index.php");

		moveToElement(pom.getInstanceHm().getWoman()); // hm.getWoman()
		toclick(pom.getInstanceHm().getTshirt()); // hm.getTshirt()

		threadSleep(3000);
		scrollByElement(pom.getInstanceTs().getToScr()); // ts.getToScr()
		threadSleep(4000);

		moveToElement(pom.getInstanceTs().getPap());
		toclick(pom.getInstanceTs().getQ());

		threadSleep(5000);

		frameIn(0);

		toclick(pom.getInstanceTs().getCart());

		frameOut();

		implicitlyWait(10);

		toclick(pom.getInstanceOp().getProceed());
		toclick(pom.getInstanceOp().getClick1());
		sendkey(pom.getInstanceOp().getUsername(), "sakthi123@gmail.com");
		sendkey(pom.getInstanceOp().getPassword(), "12345");
		toclick(pom.getInstanceOp().getClick2());
		toclick(pom.getInstanceOp().getClick3());
		toclick(pom.getInstanceOp().getClick4());
		toclick(pom.getInstanceOp().getClick5());
		toclick(pom.getInstanceOp().getClick6());
		toclick(pom.getInstanceOp().getClick7());

		takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\miniproject2.png");

		System.out.println("s");

		// driver = browserLaunch("chrome");

		// WebElement woman = driver.findElement(By.xpath("//a[@title='Women']"));

		// WebElement Tshirt =
		// driver.findElement(By.xpath("//a[@title='Women']//following::a[@title='T-shirts']"));

		// WebElement toScr = driver.findElement(By.xpath("//span[@class='cat-name']"));

		System.out.println("sucess");

		// WebElement pap =
		// driver.findElement(By.xpath("//span[@class='available-now']"));

		// WebElement q = driver.findElement(By.xpath("//span[text()='Quick view']"));

		// WebElement cart =
		// driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));

		// WebElement proceed =
		// driver.findElement(By.xpath("//span[contains(text(),'Proceed ')]"));

		// WebElement click1 = driver.findElement(By.xpath("(//a[@title='Proceed to
		// checkout'])[2]"));

		// WebElement username = driver.findElement(By.id("email"));

		// WebElement password = driver.findElement(By.id("passwd"));

		// WebElement click2 =
		// driver.findElement(By.xpath("(//button[@type='submit'])[3]"));

		// WebElement click3 =
		// driver.findElement(By.xpath(("(//button[@type='submit'])[2]/span")));

		// WebElement click4 = driver.findElement(By.id("cgv"));

		// WebElement click5 =
		// driver.findElement(By.xpath(("(//button[@type='submit'])[2]/span")));

		// WebElement click6 =
		// driver.findElement(By.xpath(("//a[@class='bankwire']/span")));

		// WebElement click7 =
		// driver.findElement(By.xpath(("(//button[@type='submit'])[2]/span")));

	}

}
