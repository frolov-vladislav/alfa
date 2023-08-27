package com.frolov.tests.pages.components;

public enum YearsSelectors {

    ONE_YEAR("[data-test-id=creditTerm-1]"),
    TWO_YEARS("[data-test-id=creditTerm-2]"),
    THREE_YEARS("[data-test-id=creditTerm-3]"),
    FOUR_YEARS("[data-test-id=creditTerm-4]"),
    FIVE_YEARS("[data-test-id=creditTerm-5]");


    public final String selector;

    YearsSelectors(String term) {
        this.selector = term;
    }

    public String getSelector() {
        return selector;
    }
}

