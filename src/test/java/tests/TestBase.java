package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

abstract public class TestBase {
	private static final String URL = "https://www.google.com/";

	@BeforeMethod
	public void setUp() {
		init();
	}

	public void init() {
		Configuration.browserSize = "1920x1080";
		Configuration.browser = "chrome";
		Configuration.headless = false;
		Configuration.baseUrl = URL;
		open(URL);
	}

	@AfterMethod
	public void tearDown() {
		closeWebDriver();
	}
}
