package com.frolov.tests.pages.components;

public enum CreditApplicationsButtons {
    FEMALE("[data-test-id='sex-f']"),
    MALE("[data-test-id='sex-m']");

    public final String selector;

    CreditApplicationsButtons(String button) {
        selector = button;
    }

    public String getSelector() {
        return selector;
    }

}
