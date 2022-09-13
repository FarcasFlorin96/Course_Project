Feature: CourseOptions page

  Scenario: Valid course options choice
    Given I am on the Course Options page
    When I click on Automation tester button
    And I click the Course options Next button
    Then I should be taken to the "Card Holder Name" text
