package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

	WebDriver driver;
	  
	// Constructor is not a method but a spechil type of method.
	// Constructor name should be same as class name.
	// There is no rrtrun type in constructor.
	  
	  public AmazonsearchPOM (WebDriver driver) {
	     this.driver=driver;
	    
	     PageFactory.initElements(driver, this);
	    }
	   
	  // @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	   @FindBy(name="field-keywords")
	   WebElement edit_serchbox;
	   public WebElement Search(){
	   return edit_serchbox;
	    
	   }
	   @FindBy(id="nav-search-submit-button")
	   WebElement click_searchbutton;
	   public WebElement searchbutton(){
	   return click_searchbutton;
	    

	}
	
}
