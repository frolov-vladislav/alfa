package com.frolov.tests;

import com.frolov.tests.pages.CreditApplicationPage;
import com.frolov.tests.pages.MainPage;
import com.frolov.tests.pages.components.CreditApplicationInputs;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CreditApplicationTests extends TestData {
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
}