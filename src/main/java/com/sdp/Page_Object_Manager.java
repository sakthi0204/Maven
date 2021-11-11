package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Home_page;
import com.pom.OrderPage;
import com.pom.Tshirt;

public class Page_Object_Manager {
	
	public  WebDriver driver;
	private Home_page hm;
	private Tshirt ts;
	private OrderPage op;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_page getInstanceHm() {
		if (hm==null) {
			hm = new Home_page(driver);
			
		}
		return hm;
	}
	
	public Tshirt getInstanceTs() {
		if (ts==null) {
			ts = new Tshirt(driver);
			
		}
		return ts;
	}
	
	public OrderPage getInstanceOp() {
		if (op==null) {
			op = new OrderPage(driver);
			
		}
		return op;
	}

}
