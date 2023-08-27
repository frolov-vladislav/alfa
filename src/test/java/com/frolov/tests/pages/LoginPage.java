package com.frolov.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.element;
import static io.qameta.allure.Allure.step;

public class LoginPage {

    public static final SelenideElement pageTitle = element(".login h1"),
            loginInput = element("input[aria-label='Логин']"),
            passwordInput = element("input[aria-label='Пароль']"),
            loginButton = element("button[type='submit']");

    public void isLoginPage() {
        step("Authorization page has opened", () -> {
            pageTitle.shouldBe(visible);
            loginInput.shouldBe(visible);
            passwordInput.shouldBe(visible);
            loginButton.shouldBe(visible);
        });
    }
}