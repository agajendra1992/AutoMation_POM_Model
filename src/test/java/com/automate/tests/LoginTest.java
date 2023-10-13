/**
 * 
 */
package com.automate.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automate.pages.LoginPage;

/**
 * @author user
 *
 */
public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void TitleTest() {
		String title = page.getInstance(LoginPage.class).getTitle();
		System.out.println("Title of login page is ::" + title);
		AssertJUnit.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 2)
	public void doLoginTest() {
		page.getInstance(LoginPage.class).doLogin("Admin", "admin123");

	}

}
