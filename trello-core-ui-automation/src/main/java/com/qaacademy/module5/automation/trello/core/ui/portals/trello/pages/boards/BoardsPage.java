package com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardsPage extends BasePage {

    @FindBy(css = "h3[class='boards-page-section-header-name']")
    WebElement workSpaceLabel;

    public boolean isWorkSpaceLabelDisplayed() {
        return action.isElementDisplayed(workSpaceLabel);
    }
}
