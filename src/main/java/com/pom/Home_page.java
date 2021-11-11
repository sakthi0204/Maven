package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement woman;
	
	@FindBy(xpath="//a[@title='Women']//following::a[@title='T-shirts']")
	private WebElement Tshirt;

	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWoman() {
		return woman;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

}
