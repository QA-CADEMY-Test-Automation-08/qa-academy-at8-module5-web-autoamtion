package com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.boards;

import com.qaacademy.module5.automation.core.ui.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardMenuPage extends BasePage {
    @FindBy(css = "a[class='board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board']")
    WebElement closeBoardButton;

    @FindBy(css = "input[value='Close']")
    WebElement closeButton;

    public void clickOnCloseBoardButton() {
        action.click(closeBoardButton);
    }

    public void clickInCloseButton() {
        action.click(closeButton);
    }
}
