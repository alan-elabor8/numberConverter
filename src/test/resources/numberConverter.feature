Feature: Convert numbers from integers to string representations

  Scenario:
    Given the integer 0
    When the converter is run
    Then the word "zero" is returned

  Scenario:
    Given the integer 1
    When the converter is run
    Then the word "one" is returned
