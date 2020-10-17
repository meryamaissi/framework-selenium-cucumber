package com.e2eTest.automation.printDataOutline.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.printDataOutline.pageObjects.PrintDataOutlinePage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PrintDataOutlineStepDef {
	
	public WebDriver driver;
	
	private PrintDataOutlinePage printDataOutlinePage = new PrintDataOutlinePage(driver);
	
	public PrintDataOutlineStepDef () {
		driver = Setup.driver;
	}

	@Given("^I open applicatopn text box$")
	public void iOpenApplicatopnTextBox() throws Throwable {
		driver.get("https://demoqa.com/text-box");

	}

	@When("^I want to print full name \"([^\"]*)\"$")
	public void iWantToPrintFullName(String name) throws Throwable {
		PageFactory.initElements(driver, PrintDataOutlinePage.class);
		printDataOutlinePage.sendFullUserName(name);

	}

	@When("^I want to print email \"([^\"]*)\"$")
	public void iWantToPrintEmail(String mail) throws Throwable {
		printDataOutlinePage.sendEmail(mail);

	}

}
