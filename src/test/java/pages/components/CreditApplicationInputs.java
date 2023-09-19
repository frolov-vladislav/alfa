package pages.components;

public enum CreditApplicationInputs {
    FIRST_NAME("input[name='firstName']"),
    MIDDLE_NAME("input[name='middleName']"),
    LAST_NAME("input[name='lastName']"),
    FULL_NAME("input[name='fullName']"),
    PHONE("[data-test-id='phoneInput']"),
    EMAIL("[data-test-id='email-input']");

    public final String selector;

    CreditApplicationInputs(String input) {
        selector = input;
    }

    public String getSelector() {
        return selector;
    }
}
