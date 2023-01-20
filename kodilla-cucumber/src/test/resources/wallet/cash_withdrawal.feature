Feature: Cash Withdrawal

  Scenario: Successful from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Successful from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $199
    Then $199 should be dispensed

  Scenario Outline: Unsuccessful from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<amount>
    Then there should be error message "Incorrect amount!"
    Examples:
      | amount |
      | 201    |
      | 0      |
      | -200   |
