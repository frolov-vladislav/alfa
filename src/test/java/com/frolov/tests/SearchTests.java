package com.frolov.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;

public class SearchTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @Tag("search")
    public void searchTest() {
        mainPage.typeInSearchString("Ипотека");
        mainPage.clickOnSubmitQueryButton();
        searchResultsPage.firstResultIs("Ипотека");
    }
}