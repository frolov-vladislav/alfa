package com.frolov.tests.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.element;
import static io.qameta.allure.Allure.step;

public class CreditCalculator {

    protected static final SelenideElement monthlyPay = element(byXpath("//*[@data-test-id='popover-target']/parent::div/*[@data-test-id='text']")),
            creditMinValidateMessage = element("[data-test-id='crossSaleText']"),
            creditMaxValidateMessage = $x("(//*[contains(text(), 'Альфа-Банк не выдаёт кредиты наличными больше 7,5')])[1]"),
            creditAmountInput = element("#creditAmount");

    public void fillCreditCalculator(String amount, YearsSelectors term) {
        element(term.getSelector()).click();
        for (int i = 0; i <= 7; i++) {
            creditAmountInput.sendKeys(Keys.BACK_SPACE);
        }
        step(String.format("Fill credit calculation form - Amount: '%s', Term: '%s'", amount, term), () -> {

            creditAmountInput.sendKeys(amount);
        });
    }

    public void creditMinValidateMessageIsVisible() {
        step("Low credit validation message has appeared", () -> {
            creditMinValidateMessage.shouldBe(visible);
            creditMinValidateMessage.shouldHave(Condition.text("Минимальная сумма кредита 100 000 ₽. " +
                    "Увеличьте сумму кредита или оформите кредитную карту 100 дней без %"));
        });
    }

    public void monthlyPayIsVisible() {
        step("Monthly pay is visible", () -> {
            monthlyPay.shouldBe(visible);
        });
    }

    public void creditMaxValidateMessageIsVisible() {
        step("Validation message about the exceeded credit amount has appeared", () -> {
            creditMaxValidateMessage.shouldBe(visible);
        });
    }
}