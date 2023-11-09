@regression @board
Feature: Board

  Background:
    Given I login to "TRELLO" portal web with "TRELLO-USER-PASSWORD" credentials
    And I click on "Start Product Trello" button on "StartAtlassian" page

  @deleteBoard
  Scenario: Create new board
    When I click on "Create new Board" button
    And I fill "Board test auto" on Board title field
    And I click on "Create" button
    Then Verify "Board test auto" is displayed

  @deleteBoard
  Scenario: Create new board failed
    When I click on "Create new Board" button
    And I fill "Board test auto2" on Board title field
    And I click on "Create" button
    Then Verify "Board test auto3" is displayed

  @deleteBoard @outlineTest
  Scenario Outline: Create new board Outline
    When I click on "Create new Board" button
    And I fill "<nameCreate>" on Board title field
    And I click on "Create" button
    Then Verify "<nameAssertion>" is displayed
    Examples:
      | nameCreate       | nameAssertion    |
      | Board test auto  | Board test auto  |
      | Board test auto2 | Board test auto3 |
