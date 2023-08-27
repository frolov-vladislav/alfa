package com.frolov.tests;

import com.frolov.tests.pages.LoginPage;
import com.frolov.tests.pages.MainPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.frolov.tests.TestData.mainUrl;

public class LoginPageTests extends TestBase {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("login_opened")
    public void loginPageOpenedTest() {
        open(mainUrl);
        mainPage.clickOnBankOnlineButton();
        loginPage.isLoginPage();

    }
}
