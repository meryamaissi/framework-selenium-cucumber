package com.e2eTest.automation.authetificationParam.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.authetificationParam.pageObjects.AuthentificationParamPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.When;

public class AuthentificationParamStepDefinition {

	public WebDriver driver;
	private AuthentificationParamPage authentificationParamPage = new AuthentificationParamPage(driver);

	public AuthentificationParamStepDefinition() {
		driver = Setup.driver;
	}

	@When("^Je saisie le nom de l utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeNomDeLUtilisateur(String username) throws Throwable {
		PageFactory.initElements(driver, AuthentificationParamPage.class);
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationParamPage.sendUserName(username);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String password) throws Throwable {
		authentificationParamPage.sendUserPassword(password);
	}

	@When("^Je clique sur le module Buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		authentificationParamPage.clickModuleBuzz();
	}

	@When("^Je clique sur le module Temp$")
	public void jeCliqueSurLeModuleTemp() throws Throwable {
		authentificationParamPage.clickModuleTime();
	}

}
