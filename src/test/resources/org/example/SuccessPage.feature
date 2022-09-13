Feature: Success Page

  Scenario: Valid Success Page
    Given I am on the success page
    When I click on "Return to homepage" button
    Then I am on the main page
