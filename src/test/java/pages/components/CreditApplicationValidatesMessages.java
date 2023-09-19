package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.element;

public enum CreditApplicationValidatesMessages {
    FULL_NAME("[data-test-id='captionError-fullName']"),
    PHONE("[data-test-id='captionError-phone']"),
    EMAIL("[data-test-id='captionError-email']"),
    AGREEMENT("Чтобы продолжить, необходимо ваше согласие");

    public final String selector;

    CreditApplicationValidatesMessages(String field) {
        selector = field;
    }

    public String getSelector() {
        return selector;
    }

    public SelenideElement getElement(CreditApplicationValidatesMessages messages) {
        SelenideElement element;
        if (messages == AGREEMENT) {
            element = element(byText(messages.getSelector()));
        } else {
            element = element(messages.getSelector());
        }
        return element;
    }
}
