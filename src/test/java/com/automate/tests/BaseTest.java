/**
 * 
 */
package com.automate.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.automate.pages.BasePage;
import com.automate.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author user
 *
 */
public class BaseTest {

	WebDriver driver;
	Page page;

	@Parameters(value = { "browser" })
	@BeforeTest
	public void init(String browser) {
		switch (browser) {
		case "chrome": {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		default:
			System.out.println("browser type is not correct ::" + browser);
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page = new BasePage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
