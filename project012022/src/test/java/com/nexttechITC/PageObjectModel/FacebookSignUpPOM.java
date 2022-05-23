package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpPOM {

	WebDriver driver;
	
	public FacebookSignUpPOM (WebDriver driver) {
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")
	WebElement Click_Create_Button;
	public WebElement CreatButton () {
		return Click_Create_Button;
	}
	
	@FindBy(name="firstname")
	WebElement edit_firstname;
	public WebElement EditFirstname() {
		return edit_firstname;
	}
	
	@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement EditLastname () {
		return edit_lastname;
	} 
	
	@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement EditEmail () {
		return edit_email;
	}
	
	@FindBy(id="password_step_input")
	WebElement edit_passord;
	public WebElement EditPassord () {
		return edit_passord;
	}
	
	@FindBy(xpath="//*[@id=\"month\"]")
	public WebElement click_month;
			
	@FindBy(xpath="//*[@id=\"day\"]")
	public WebElement click_day;
	
	@FindBy (xpath="//*[@id=\"year\"]")
	public WebElement click_year;
	
	@FindBy(id="u_4_2_vr")
	WebElement cilck_gender;
	public WebElement Click_Gender() {
		return cilck_gender;
	}
	
	
}
