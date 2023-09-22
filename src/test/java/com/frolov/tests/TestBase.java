package com.frolov.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.DriverConfig;
import config.RemoteWebDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public DesiredCapabilities capabilities = new DesiredCapabilities();
    private final DriverConfig config = ConfigFactory.create(DriverConfig.class, System.getProperties());
    private final RemoteWebDriver remoteWebDriver = ConfigFactory.create(RemoteWebDriver.class, System.getProperties());

    @BeforeEach
    void beforeAll() {
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getVersion();
        Configuration.remote = config.remote() ? remoteWebDriver.getRemote() : null;
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        open(config.getBaseUrl());


    }

    @BeforeEach
    public void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}