Feature: BBC news navigation

  Scenario: Navigate to the local weather via the homepage
    Given A user is on the opinion homepage
    When I login
    And start a survey
    And complete a survey
    Then I get money