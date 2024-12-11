Feature: Cash withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170
  Scenario: Withdrawal of the exact wallet balance
    Given I have deposited $50 in my wallet
    When I request $50
    Then $50 should be dispensed
  Scenario: Withdrawal exceeding wallet balance
    Given I have deposited $40 in my wallet
    When I request $60
    Then no money should be dispensed when withdraw is bigger than balance
  Scenario: Requesting $0
    Given I have deposited $100 in my wallet
    When I request $0
    Then no money should be dispensed when withdraw $0
  Scenario: Requesting a negative amount
    Given I have deposited $160 in my wallet
    When I request -$10
    Then no money should be dispensed when withdraw is negative number
  Scenario: Withdrawal from an empty wallet
    Given I have deposited $0 in my wallet
    When I request $15
    Then no money should be dispensed when wallet is empty