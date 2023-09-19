package com.frolov.tests;

import pages.MainPage;
import pages.SearchResultsPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.frolov.tests.TestData.mainUrl;

public class SearchTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @Tag("search")
    public void searchTest() {
        open(mainUrl);
        mainPage.typeInSearchString("Ипотека");
        mainPage.clickOnSubmitQueryButton();
        searchResultsPage.firstResultIs("Ипотека");
    }
}
