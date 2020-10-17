@print-data
Feature: Print data  - text Box
  As a user i want to print my data

  @outline
  Scenario Outline: Print data  - text Box
    Given I open applicatopn text box
    When I want to print full name "<fullName>"
    And I want to print email "<email>" 

    Examples: 
      | fullName   | email            |
      | meryam     | test@test.com    |
      | testPerson | meryam@gmail.com |
