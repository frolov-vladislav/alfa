package com.frolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import com.frolov.tests.pages.components.CreditCalculator;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static io.qameta.allure.Allure.step;

public class MainPage {

    public static final SelenideElement headerContainer = element("[data-test-id=Main-Header-Main-Desktop-container]"),
            logo = element("[data-test-id=Main-Header-Main-DesktopLogo]"),
            searchString = element(byXpath("(//input[@type='search'])[2]")),
            submitQueryButton = element(byText("Найти")),
            bankOnline = element("[data-test-id='internet-bank-button']"),
            getCreditButton = element(By.xpath("//*[contains(text(), 'Получить кредит')]/parent::button"));
    public CreditCalculator creditCalculator = new CreditCalculator();

    public void typeInSearchString(String value) {
        step(String.format("Enter a query in the search bar '%s'", value), () -> searchString.scrollTo().sendKeys(value));
    }

    public void clickOnSubmitQueryButton() {
        step("Click on the 'Найти' button", () -> submitQueryButton.click());
    }

    public void clickOnBankOnlineButton() {
        step("Click on the 'Альфа-Онлайн' button", () -> bankOnline.click());
    }

    public void clickOnGetCreditButton() {
        step("Click on 'Получить кредит' button", () -> getCreditButton.click());
    }
}