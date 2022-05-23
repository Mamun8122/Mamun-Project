package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	
public class DellAction {
	
	WebDriver driver;

	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		
		DellActionPOM OBJ=new DellActionPOM(driver);
		Actions act =new Actions (driver);
		act.moveToElement(OBJ.Solutions()).build().perform();
		OBJ.click_view_all_solutions().click();
		
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {

	}	
	
}
