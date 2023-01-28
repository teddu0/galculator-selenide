package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import pages.MainPage;


public class CalculatorTests extends TestBase {
	MainPage mainPage = new MainPage();
	CalculatorPage cp = new CalculatorPage();
	private final String RESULT = "0";

	@Test
	@Description("Проверка результата выражения 1*2-3+1")
	@Owner("Константин В.")
	public void CalculatingTest() {
		mainPage
						.fillSearchField()
						.clickToButtonSearch()
						.calculatingResult();
		Assert.assertEquals(cp.calculatedResult(), RESULT);
	}
}
