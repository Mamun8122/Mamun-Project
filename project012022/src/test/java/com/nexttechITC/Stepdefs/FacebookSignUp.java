package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FacebookSignUpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignUp {

	WebDriver driver;
	
	@Given("^user visit facebook home page \"([^\"]*)\"$")
	public void user_visit_facebook_home_page(String arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
	}

	@When("^user click on create account button$")
	public void user_click_on_create_account_button() throws Throwable {
		FacebookSignUpPOM FBSignUp=new FacebookSignUpPOM (driver);
		FBSignUp.CreatButton().click();
	}

	@When("^user type Valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",and valid \"([^\"]*)\"$")
	public void user_type_Valid_and_valid(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FacebookSignUpPOM FBSignUp=new FacebookSignUpPOM (driver);
		FBSignUp.EditFirstname().sendKeys(arg1);
		FBSignUp.EditLastname().sendKeys(arg2);
		FBSignUp.EditEmail().sendKeys(arg3);
		FBSignUp.EditPassord().sendKeys(arg4);
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		
		FacebookSignUpPOM FBSignUp=new FacebookSignUpPOM (driver);
		
		Select DropDownMonth=new Select(FBSignUp.click_month);
		DropDownMonth.selectByValue("7");
		
		Select DropDownDay=new Select(FBSignUp.click_day);
		DropDownDay.selectByIndex(25);
		
		Select DropDownYear=new Select(FBSignUp.click_year);
		DropDownYear.selectByVisibleText("2000");
		
	}

	@Then("^user select  gender$")
	public void user_select_gender() throws Throwable {
		
		FacebookSignUpPOM FBSignUp=new FacebookSignUpPOM (driver);
		FBSignUp.Click_Gender().click();
	}
	
}
