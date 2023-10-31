package com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.login;

import com.qaacademy.module5.automation.core.ui.environment.EnvironmentManager;
import com.qaacademy.module5.automation.core.ui.webdrivers.WebDriverManager;
import com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Login Page Test")
public class LoginPageTest {

    @AfterEach
    void teardown() {
        WebDriverManager.getInstance().quitWebDriver();
    }

    @Test
    void loginUserInPortal() {
        // Given
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSWORD.val());

        // When
        LoginPage loginUserPasswordPage = LoginFactory.createLoginPage(PortalWeb.TRELLO, UserTypes.TRELLO_USER_PASSWORD);
        loginUserPasswordPage.loginUserInPortal();

        // Then
        StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
        Assertions.assertTrue(startAtlassianPage.isSwitchToLabelDisplayed());
    }
}
