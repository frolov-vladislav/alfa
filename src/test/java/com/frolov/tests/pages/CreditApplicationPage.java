package com.frolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import com.frolov.tests.pages.components.CreditApplicationInputs;
import com.frolov.tests.pages.components.CreditApplicationsButtons;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class CreditApplicationPage {

    protected static final SelenideElement title = element("[data-widget-name='Aligner'] [data-test-id='text']"),
            securityWarrantyBlock = element("[data-test-id='PilSecurityWarrantyBlock']"),
            securityWarrantyText = element("[data-test-id='PilSecurityWarrantyBlock'] [data-test-id='text']"),
            progressBar = element("[data-test-id='progress-bar']"),
            progressBarFilledLine = element("[data-test-id='progress-bar-filled-line']"),
            hasNotMiddleNameCheckbox = element("[type='checkbox'][name='hasMiddleName']");


    public void setInput(CreditApplicationInputs creditApplicationInputs, String value, boolean hasSuggest) {
        step(String.format("Set '%s' value in %s input", value, creditApplicationInputs), () -> {
            element(creditApplicationInputs.getSelector()).setValue(value);
            if (hasSuggest) {
                sleep(500);
                $x(String.format("//*[@role='option'][contains(text(), '%s')]", value)).click();
            }
            progressBar.click();
        });
    }

    public void clickOnButton(CreditApplicationsButtons creditApplicationsButtons) {
        step(String.format("Click on %s button", creditApplicationsButtons), () -> {
            element(creditApplicationsButtons.getSelector()).click();
        });
    }

    public void securityWarrantyBlockIsVisible() {
        step("Security warranty block is visible", () -> {
            securityWarrantyBlock.shouldBe(visible);
        });
    }

    public void securityWarrantyHasText() {
        step("Security warranty has text", () -> {
            securityWarrantyText.shouldBe(text("Заполнение анкеты не обязывает вас брать кредит наличными. " +
                    "Гарантируем: ваши данные останутся в безопасности."));
        });
    }

    public void progressBarIsVisible() {
        step("Progress bar is visible", () -> {
            progressBar.shouldBe(visible);
        });
    }

    public void progressBarPercentOfFullingIs(String percent) {
        step(String.format("Progress bar percent of fulling is '%s'", percent), () -> {
            sleep(1000);
            String stile = progressBarFilledLine.getAttribute("style");
            Assertions.assertEquals(stile, String.format("width: %s", percent) + "%;");
        });
    }
}