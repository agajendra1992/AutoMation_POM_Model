/**
 * 
 */
package com.automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author user
 *
 */
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private final By username = By.xpath("//input[@name='username']");
	private final By password = By.xpath("//input[@name='password']");
	private final By loginBtn = By
			.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

	public WebElement getUsername() {
		return getElement(username);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}

	public HomePage doLogin(String username, String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginBtn().click();
		return getInstance(HomePage.class);
	}

}
