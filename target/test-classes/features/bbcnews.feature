Feature: BBC news navigation

  Scenario: Navigate to the local weather via the homepage
    Given A user is on the BBC homepage they can navigate to local weather via top
    When A user selects "weather" in the top toolbar
    Then the local weather is displayed