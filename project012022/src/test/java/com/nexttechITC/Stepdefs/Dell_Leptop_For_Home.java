package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.Dell_Leptop_For_HomePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Leptop_For_Home {

	WebDriver driver;
	
	@Given("^user Visits Dell HomePage$")
	public void user_Visits_Dell_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
	}
	

	@When("^user go to Products dropdown menu and able to see Laptops$")
	public void user_go_to_Products_dropdown_menu_and_able_to_see_Laptops() throws Throwable {
		
		Dell_Leptop_For_HomePOM obj=new Dell_Leptop_For_HomePOM (driver);
		Actions act = new Actions (driver);
		act.moveToElement(obj.Product()).build().perform();
		//WebDriverWait wait=new WebDriverWait (driver,20);
	}

	@When("^user go to Laptops and able to see For Home$")
	public void user_go_to_Laptops_and_able_to_see_For_Home() throws Throwable {
		
		Dell_Leptop_For_HomePOM obj=new Dell_Leptop_For_HomePOM (driver);
		Actions act = new Actions (driver);
		act.moveToElement(obj.Leptop()).build().perform();
		//WebDriverWait wait=new WebDriverWait (driver,20);
	}

	@Then("^user will click to For Home option$")
	public void user_will_click_to_For_Home_option() throws Throwable {
		Dell_Leptop_For_HomePOM obj=new Dell_Leptop_For_HomePOM (driver);
		Actions act = new Actions (driver);
		act.moveToElement(obj.for_home()).build().perform();
		obj.for_home().click();
		//WebDriverWait wait=new WebDriverWait (driver,20);
	}

	
}
