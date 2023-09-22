package com.frolov.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;
import pages.components.YearsSelectors;

import static com.frolov.tests.TestData.*;

public class CalculatorTests extends TestBase {

    MainPage mainPage = new MainPage();

    @ParameterizedTest(name = "{index} - Validate min amount with {0} term")
    @Tag("validating_low_amount")
    @EnumSource(value = YearsSelectors.class, mode = EnumSource.Mode.EXCLUDE)
    void creditMinAmountValidateTest(YearsSelectors yearsSelectors) {
        mainPage.creditCalculator.fillCreditCalculator(lowerEquivalenceAmount.toString(), yearsSelectors);
        mainPage.creditCalculator.creditMinValidateMessageIsVisible();
    }

    @ParameterizedTest(name = "{index} - Fill with {0} term")
    @Tag("calculator_fill")
    @EnumSource(value = YearsSelectors.class, mode = EnumSource.Mode.EXCLUDE)
    void creditTest(YearsSelectors yearsSelectors) {
        mainPage.creditCalculator.fillCreditCalculator(validEquivalenceAmount.toString(), yearsSelectors);
        mainPage.creditCalculator.monthlyPayIsVisible();

    }

    @ParameterizedTest(name = "{index} - Validate max amount with {0} term")
    @Tag("validating_high_amount")
    @EnumSource(value = YearsSelectors.class, mode = EnumSource.Mode.EXCLUDE)
    void creditMaxAmountValidateTest(YearsSelectors yearsSelectors) {
        mainPage.creditCalculator.fillCreditCalculator(highestEquivalenceAmount.toString(), yearsSelectors);
        mainPage.creditCalculator.creditMaxValidateMessageIsVisible();

    }
}