Feature: User can log out and ends up in login page


  Scenario: User can log out and ends up in login page
    When user got Go to login page
    Then username and password entered and click Log in button
    Then user click to Logout