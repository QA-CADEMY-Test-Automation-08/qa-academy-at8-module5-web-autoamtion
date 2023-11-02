package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.trello.core.ui.portals.trello.helpers.LoginHelper;
import io.cucumber.java.en.Given;

public class LoginSteps {
    @Given("I login to {string} portal web with {string} credentials")
    public void loginToPortalWebWithCredentials(String portalWeb, String userType) {
        LoginHelper.loginUserInPortal(portalWeb, userType);
    }
}
