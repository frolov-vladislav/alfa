package com.frolov.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CreditApplicationPage;
import pages.MainPage;
import pages.components.CreditApplicationInputs;
import pages.components.CreditApplicationValidatesMessages;

import static com.frolov.tests.TestData.email;
import static com.frolov.tests.TestData.phoneNumber;

public class CreditApplicationTests extends TestBase {
    CreditApplicationPage creditApplicationPage = new CreditApplicationPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("progress_bar")
    void progressBarTest() {
        mainPage.clickOnGetCreditButton();
        creditApplicationPage.progressBarIsVisible();
        creditApplicationPage.setInput(CreditApplicationInputs.FULL_NAME, "Сергеев", true);
        creditApplicationPage.progressBarPercentOfFullingIs("7");
        creditApplicationPage.setInput(CreditApplicationInputs.FIRST_NAME, "Сергей", true);
        creditApplicationPage.progressBarPercentOfFullingIs("14");
        creditApplicationPage.setInput(CreditApplicationInputs.MIDDLE_NAME, "Сергеевич", true);
        creditApplicationPage.progressBarPercentOfFullingIs("21");
        creditApplicationPage.setInput(CreditApplicationInputs.PHONE, phoneNumber, false);
        creditApplicationPage.progressBarPercentOfFullingIs("32");
        creditApplicationPage.setInput(CreditApplicationInputs.EMAIL, email, true);
        creditApplicationPage.progressBarPercentOfFullingIs("40");
    }

    @Test
    @Tag("fields_validate")
    void validateFields() {
        mainPage.clickOnGetCreditButton();
        creditApplicationPage.clickOnSubmitButton();
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.EMAIL);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.FULL_NAME);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.AGREEMENT);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.PHONE);
    }
}