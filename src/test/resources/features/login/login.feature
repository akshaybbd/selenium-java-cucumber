Feature: Logging in to BBD ICapture

  Scenario Outline: Logging in to ICapture Dashboard
    Given I visit the BBD iCapture login page
    When I enter my username "<username>"
    And I enter my password "<password>"
    Then I click on the login in button

    @poc
    Examples:
      | username | password |
      | 123456    | test     |
