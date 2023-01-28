package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница калькулятора
 */

public class CalculatorPage {
	/**
	 * Цифра калькулятора '1'
	 */
	private final SelenideElement button1 = $x("//div[@jsname='N10B9']");
	/**
	 * Кнопка калькулятора '*'
	 */
	private final SelenideElement buttonMultiply = $x("//div[@jsname='YovRWb']");
	/**
	 * Кнопка калькулятора '2'
	 */
	private final SelenideElement button2 = $x("//div[@jsname='lVjWed']");
	/**
	 * Цифра калькулятора '-'
	 */
	private final SelenideElement buttonMinus = $x("//div[@jsname='pPHzQc']");
	/**
	 * Цифра калькулятора '3'
	 */
	private final SelenideElement button3 = $x("//div[@jsname='KN1kY']");
	/**
	 * Кнопка калькулятора '+'
	 */
	private final SelenideElement buttonPlus = $x("//div[@jsname='XSr6wc']");
	/**
	 * Кнопка калькулятора '='
	 */
	private final SelenideElement buttonEquals = $x("//div[@jsname='Pt8tGc']");
	/**
	 * Поле результатов выражений
	 */
	private final SelenideElement resultsField = $x("//span[@jsname='VssY5c']");

	/**
	 * Решение выражения '1*2-3+1'
	 */
	@Step
	public final CalculatorPage calculatingResult() {
		button1.shouldBe(Condition.visible).click();
		buttonMultiply.shouldBe(Condition.visible).click();
		button2.shouldBe(Condition.visible).click();
		buttonMinus.shouldBe(Condition.visible).click();
		button3.shouldBe(Condition.visible).click();
		buttonPlus.shouldBe(Condition.visible).click();
		button1.shouldBe(Condition.visible).click();
		buttonEquals.shouldBe(Condition.visible).click();
		return new CalculatorPage();
	}

	/**
	 * Получение резульатата выражения
	 */
	@Step
	public final String calculatedResult() {
		return resultsField.getText();
	}
}
