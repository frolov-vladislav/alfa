package com.frolov.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchResultsPage {

    ElementsCollection results = $$(".b-serp-item");

    public void firstResultIs(String expected) {
        step(String.format("The first result contains the string '%s'", expected), () -> {
            results.first().shouldHave(Condition.text(expected));
        });
    }
}
