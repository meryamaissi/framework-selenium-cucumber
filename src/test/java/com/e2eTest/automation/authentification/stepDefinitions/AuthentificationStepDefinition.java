package com.e2eTest.automation.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AuthentificationStepDefinition extends CommonMethods {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage(driver);
	private CommonMethods commonMethods = new CommonMethods ();
	
	public AuthentificationStepDefinition () {
		driver = Setup.driver ;
	}

	@Given("^Je ouvre l application OrangeHRM$")
	public void jeOuvreLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile();
		logger.info("^Je ouvre l application OrangeHRM$");

	}

	@When("^Je saisie le userName$")
	public void jeSaisieLeUserName() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class); // dans la premiere methode qui fait appel au WebElement
		authentificationPage.sendUserName();
		logger.info("^Je saisie le userName$");

	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authentificationPage.sendUserPassword();
		logger.info("^Je saisie le mot de passe$");

	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authentificationPage.clickLoginButton();
		logger.info("Je clique sur le bouton Login$");

	}

	@Then("^Redirection vers la page Home$")
	public void redirectionVersLaPageHome() throws Throwable {
		String welcome = AuthentificationPage.welcome.getText();
		Assert.assertTrue(welcome.contains("Welcome"));
		logger.info("Redirection vers la page Home$");

	}


}
