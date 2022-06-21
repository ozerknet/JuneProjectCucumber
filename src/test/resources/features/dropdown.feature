
Feature: Dropdwon menu control

  Scenario: dropdwon menu verificcation
    When user go to link
    Then check options data is available
      | Please select an option |
      | Option 1   |
      | Option 2   |