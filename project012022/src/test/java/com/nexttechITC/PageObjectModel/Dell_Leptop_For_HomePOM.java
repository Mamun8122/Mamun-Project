package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_Leptop_For_HomePOM {

	WebDriver driver;
	
	public Dell_Leptop_For_HomePOM (WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	WebElement Hover_Product;
	public WebElement Product() {
		return Hover_Product;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")
	WebElement Hover_Leptop;
	public WebElement Leptop() {
		return Hover_Leptop;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/ul/li[3]/a")
	WebElement For_Home;
	public WebElement for_home() {
		return For_Home;
	}
	
}
