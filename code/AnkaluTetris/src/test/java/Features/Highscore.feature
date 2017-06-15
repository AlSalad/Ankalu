Feature: Highscore

Scenario: Delete Highscore
  Given I am on the Highscore Form
  And I press Delete
  Then Highscore gets deleted

  Scenario: View Highscore
    Given I am on the Main Form
    And I press Highscore
    Then I can view the Highscore