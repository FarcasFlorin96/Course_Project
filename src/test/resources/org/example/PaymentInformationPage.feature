Feature: PaymentInformation Page

  Scenario: Valid PaymentInformation page
    Given I am on the Payment Information page
    When I type "Farcas Florin" as holder name
    And I type "15504550780" as card number
    And I type "123" as CVC
    And I choose "March" as month
    And I choose "2023" as year
    And I click on the Payment next button
    Then I should be taken to the "Success" text