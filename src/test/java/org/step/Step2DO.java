package org.step;

import java.util.List;

import org.base.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class Step2DO extends BaseClass1{
	
	@Given("user enter on fb login page")
	public void userEnterOnFbLoginPage() {
		WebDriver driver = loadBrowser();
		
		launchUrl("https://www.facebook.com/");
	  
	}

	@When("user enter username and password")
	public void userEnterUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();
		List<String> list = asLists.get(0);
		String string = list.get(0);
		String string2 = list.get(1);
		WebElement txt = driver.findElement(By.id("email"));
		fill(txt, string);
		WebElement pas = driver.findElement(By.id("pass"));
		fill(pas, string2);
		
		
		
		
	  
	}

	@When("user click login button")
	public void userClickLoginButton() {
	  WebElement log = driver.findElement(By.name("login"));
	  btnClick(log);
	}

	@Then("user should login validate page")
	public void userShouldLoginValidatePage() {
		pageClose();
	   
	}




}
