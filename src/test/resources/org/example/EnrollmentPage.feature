Feature: Enrollment page

  Scenario: Valid Enrollment Sign up
    Given I am on the Enrollment Sign up page
    When I type my first name in the First Name field
    And I type my last Name in the Last Name field
    And I type a username in Username field
    And I type a password in the Password field
    And I confirm the password in the Confirm password field
    And I click on the Next button
    Then I should be taken to the "Contact information" text

  Scenario: Invalid Enrollment Sign up
    Given I am on the Enrollment Sign up page
    When I type my first name in the First Name field
    And I type my last Name in the Last Name field
    And I type a username in Username field
    And I type a password in the Password field
    And I click on the Next button
    Then I should stay on the "Personal information" text

  Scenario: First Name missing from Sign Up
    Given I am on the Enrollment Sign up page
    And I type my last Name in the Last Name field
    And I type a username in Username field
    And I type a password in the Password field
    And I confirm the password in the Confirm password field
    And I click on the Next button
    Then I should stay on the "Personal information" text