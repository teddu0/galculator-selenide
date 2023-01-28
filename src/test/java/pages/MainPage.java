package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

/**
 * Главная страница google.com
 */

public class MainPage {
	/**
	 * Поле поиска
	 */
	private final SelenideElement searchField = $x("//input[@name='q']");
	/**
	 * Кнопка 'Поиск'
	 */
	private final SelenideElement searchButton = $x("//div[@jsname='VlcLAe']//input[@class='gNO89b']");

	/**
	 * Открытие страницы 'google.com'
	 */
	@Step
	public final MainPage openGooglePage(String url) {
		open(url);
		return new MainPage();
	}

	/**
	 * Ввод текста 'Калькулятор' в поле поиска
	 */
	@Step
	public final MainPage fillSearchField() {
		searchField.shouldBe(Condition.visible).sendKeys("Калькулятор");
		return new MainPage();
	}

	/**
	 * Клик по кнопке 'поиск'
	 */
	@Step
	public final CalculatorPage clickToButtonSearch() {
		searchButton.shouldBe(Condition.visible).click();
		return new CalculatorPage();
	}
}
