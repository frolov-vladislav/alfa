package com.frolov.tests;

import com.frolov.tests.pages.CreditApplicationPage;
import com.frolov.tests.pages.MainPage;
import com.frolov.tests.pages.components.CreditApplicationInputs;
import com.frolov.tests.pages.components.CreditApplicationValidatesMessages;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.frolov.tests.TestData.*;

public class CreditApplicationTests extends TestBase {
    CreditApplicationPage creditApplicationPage = new CreditApplicationPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("progress_bar")
    void progressBarTest() {
        open(mainUrl);
        mainPage.clickOnGetCreditButton();
        creditApplicationPage.progressBarIsVisible();
        creditApplicationPage.setInput(CreditApplicationInputs.FULL_NAME, "Фамилия", true);
        creditApplicationPage.progressBarPercentOfFullingIs("7");
        creditApplicationPage.setInput(CreditApplicationInputs.FIRST_NAME, "Имя", true);
        creditApplicationPage.progressBarPercentOfFullingIs("14");
        creditApplicationPage.setInput(CreditApplicationInputs.MIDDLE_NAME, "Дмитриевич", true);
        creditApplicationPage.progressBarPercentOfFullingIs("21");
        creditApplicationPage.setInput(CreditApplicationInputs.PHONE, phoneNumber, false);
        creditApplicationPage.progressBarPercentOfFullingIs("32");
        creditApplicationPage.setInput(CreditApplicationInputs.EMAIL, email, true);
        creditApplicationPage.progressBarPercentOfFullingIs("40");
    }

    @Test
    @Tag("fields_validate")
    void validateFields() {
        open(mainUrl);
        mainPage.clickOnGetCreditButton();
        creditApplicationPage.clickOnSubmitButton();
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.EMAIL);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.FULL_NAME);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.AGREEMENT);
        creditApplicationPage.validateMessageIsVisible(CreditApplicationValidatesMessages.PHONE);
    }
}