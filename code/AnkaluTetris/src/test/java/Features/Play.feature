Feature: PlayFeature
  This feature deals with the playmenuform, if it's able to open

  Scenario: Open PlayMenu
    Given I am on the "StartForm"
    And I press the Button "Play"
    Then I should be on the "PlayMenuForm"


