package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement toScr;
	
	@FindBy(xpath="//span[@class='available-now']")
	private WebElement pap;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement q;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement cart;

	public Tshirt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getToScr() {
		return toScr;
	}

	public WebElement getPap() {
		return pap;
	}

	public WebElement getQ() {
		return q;
	}

	public WebElement getCart() {
		return cart;
	}

}
