package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Proceed ')]")
	private WebElement proceed;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement click1;
	
	public OrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getClick4() {
		return click4;
	}

	public WebElement getClick5() {
		return click5;
	}

	public WebElement getClick6() {
		return click6;
	}

	public WebElement getClick7() {
		return click7;
	}

	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement click2;
	
	@FindBy(xpath="(//button[@type='submit'])[2]/span")
	private WebElement click3;
	
	@FindBy(id="cgv")
	private WebElement click4;
	
	@FindBy(xpath="(//button[@type='submit'])[2]/span")
	private WebElement click5;
	
	@FindBy(xpath="//a[@class='bankwire']/span")
	private WebElement click6;
	
	@FindBy(xpath="(//button[@type='submit'])[2]/span")
	private WebElement click7;
	
	
	
	

}
