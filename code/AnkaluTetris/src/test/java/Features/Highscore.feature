Feature: Highscore

Scenario: Delete Highscore
  Given Im on the "HighscoreForm"
  And I press the "DeleteButton"
  Then The Highscore gets deleted

  Scenario: View Highscore
    Given I am on the "StartForm"
    And I press the Highscorebutton
    Then I can view the Highscore
