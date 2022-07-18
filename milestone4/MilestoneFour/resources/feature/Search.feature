Feature: search feature

  @Search
  Scenario Outline: search input test
    Given i am on the Gillette HomePage
    And i click on search icon
    When I enter <search> and press enter
    Then It should display Results

    Examples: 
      | search |
      | Razor  |
