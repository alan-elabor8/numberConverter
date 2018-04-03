Feature: Convert numbers from integers to string representations

  Scenario Outline:
    Given the integer <number>
    When the converter is run
    Then the word "<numberAsString>" is returned

    Examples:
    | number  | numberAsString  |
    | 1       | one             |
    | 2       | two             |