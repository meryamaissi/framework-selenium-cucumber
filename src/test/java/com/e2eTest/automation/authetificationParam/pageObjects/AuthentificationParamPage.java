package com.e2eTest.automation.authetificationParam.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthentificationParamPage {

	WebDriver driver;

	public AuthentificationParamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String MODULE_BUZZ_ID = "menu_buzz_viewBuzz";
	final static String MODULE_TIME_ID = "menu_time_viewTimeModule";


	/*@findBy*/
	@FindBy(how=How.ID , using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how=How.ID , using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = MODULE_BUZZ_ID)
	public static WebElement buzz;
	@FindBy(how = How.ID, using = MODULE_TIME_ID)
	public static WebElement time;

	/*Methods*/
	public void sendUserName(String username) {
		userName.sendKeys(username);
	}
	public void sendUserPassword(String password) {
		userPassword.sendKeys(password);
	}
	public void clickModuleBuzz() {
		buzz.click();
	}
	public void clickModuleTime() {
		time.click();
	}

}
