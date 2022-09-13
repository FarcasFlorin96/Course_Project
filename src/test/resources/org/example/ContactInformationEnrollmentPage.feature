Feature: ContactInformation page

  Scenario: Valid Contact Information Sign up
    Given I am on the Contact Information Sign up page
    When I type my Email in the Email field
    And I type my Phone number in the Phone field
    And I type my Country in the Country field
    And I type my City in the City field
    And I type my Post Code in the Post Code field
    And I click on the Contact page Next button
    Then I should be taken to the "Course options" page