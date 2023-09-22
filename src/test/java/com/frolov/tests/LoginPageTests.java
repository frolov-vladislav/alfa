package com.frolov.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginPageTests extends TestBase {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("login_opened")
    public void loginPageOpenedTest() {
        mainPage.clickOnBankOnlineButton();
        loginPage.isLoginPage();

    }
}