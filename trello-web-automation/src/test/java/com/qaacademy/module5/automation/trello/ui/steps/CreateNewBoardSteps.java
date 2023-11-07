package com.qaacademy.module5.automation.trello.ui.steps;

import com.qaacademy.module5.automation.trello.core.ui.portals.trello.pages.boards.CreateNewBoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewBoardSteps {
    private final CreateNewBoardPage createNewBoardPage;

    public CreateNewBoardSteps() {
        createNewBoardPage = new CreateNewBoardPage();
    }

    @When("I click on \"Create new Board\" button")
    public void clickOnCreateNewBoardButtonButton() {
        createNewBoardPage.clickOnCreateNewBoardButton();
    }

    @And("I fill {string} on Board title field")
    public void fillOnBoardTitleField(String boardTitle) {
        createNewBoardPage.fillOnBoardTitleField(boardTitle);
    }

    @And("I click on \"Create\" button")
    public void clickOnCreateButton() {
        createNewBoardPage.clickOnCreateButton();
    }
}
