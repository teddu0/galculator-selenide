package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;

abstract public class TestBase {

	@BeforeMethod
	public void setUp() {
		init();
	}

	public void init() {
		Configuration.browserSize = "1920x1080";
		Configuration.browser = "chrome";
		Configuration.headless = false;
		Configuration.baseUrl = "https://www.google.com/";
	}
	@AfterMethod
	public void tearDown(){
		closeWebDriver();
	}
}
