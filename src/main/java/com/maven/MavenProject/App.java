package com.maven.MavenProject;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;

public class App extends BaseClass {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Hello World!");

		driver=browserLaunch("chrome");
		
		getUrl("https://www.google.co.in/");
		
		toGetTitle();
		
		System.out.println("sss");

	}
}
