package org.step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefi {
	public WebDriver driver;
	@Given("user enter on fb login page")
	public void userEnterOnFbLoginPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	    
	}

	@When("user enter username and password")
	public void userEnterUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList();
	    String string1 = asList.get(0);
	    String string2 = asList.get(1);
	  driver.findElement(By.id("email")).sendKeys(string1);
	  driver.findElement(By.id("pass")).sendKeys(string2);
	    

	}

	@When("user click login button")
	public void userClickLoginButton() {
		driver.findElement(By.name("login")).click();
		
	  
	}

	@Then("user should login validate page")
	public void userShouldLoginValidatePage() {
		driver.close();
		
	  
	}


}
