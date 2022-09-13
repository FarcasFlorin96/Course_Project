Feature: Main page

  Scenario: Enrollment button
    Given I am on the main page
    When I click the enrollment button
    Then I should be taken to the "software testing | enrollment"

  Scenario: Valid Read More button for virtual
    Given I am on the main page
    When I click the Read More button from the Virtual column
    Then I will be taken to the "virtual" page

  Scenario: Verify arrow-up button
    Given I am on the main page
    When I click on the arrowup button
    Then I should be taken to the top of the page

  Scenario: Valid Read More button for hybrid
    Given I am on the main page
    When I click the Read More button from the Hybrid column
    Then I will be taken to the "hybrid" page

  Scenario: Valid Read More button for the in person
    Given I am on the main page
    When I click the Read More button from the In Person column
    Then I will be taken to the "in person" page

  Scenario: Checking What You`ll Learn button functionality
    Given I am on the main page
    When I click the What You`ll Learn button
    Then I should be taken to the "Learn The Fundamentals" column

  Scenario:  Valid Read More Button for fundamentals
    Given I am on the main page
    When I click on the Read More button from the Learn The Fundamentals column
    Then I will be taken to the "fundamentals" page

  Scenario:  Valid Read More Button for Learn Selenium
    Given I am on the main page
    When I click on the Read More button from the Learn Selenium
    Then I will be taken to the "fundamentals" page

  Scenario: Valid email field
    Given I am on the main page
    When I enter a valid email
    And I click the submit button
    Then the pop-up should appear

  Scenario: Invalid email field
    Given I am on the main page
    When I enter a invalid email
    And I click the submit button
    Then The layer of email field should turn red





