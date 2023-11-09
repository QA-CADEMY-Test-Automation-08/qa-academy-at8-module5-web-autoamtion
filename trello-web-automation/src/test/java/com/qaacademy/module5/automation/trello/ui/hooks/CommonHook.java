package com.qaacademy.module5.automation.trello.ui.hooks;

import com.qaacademy.module5.automation.core.ui.webdrivers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.ByteArrayInputStream;
import java.util.Objects;

public final class CommonHook {
    private static final Logger LOGGER = LogManager.getLogger(CommonHook.class.getSimpleName());

    @After(order = 1002)
    public void quitWebDriver() {
        if (!Objects.isNull(WebDriverManager.getInstance().getWebDriver())) {
            WebDriverManager.getInstance().quitWebDriver();
        }
    }

    @After(order = 1004)
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            LOGGER.info(String.format("Taking screenshot for %s scenario", scenario.getName()));
            try {
                byte[] screenshot = ((TakesScreenshot) WebDriverManager.getInstance().getWebDriver())
                        .getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment(String.format("Take screenshot for %s scenario", scenario.getName()),
                        new ByteArrayInputStream(screenshot));
            } catch (WebDriverException e) {
                LOGGER.error(String.format("Error when taking screenshot for %s scenario", scenario.getName()));
            }
        }
    }
}
