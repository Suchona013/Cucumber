Feature: User Login
  Scenario: User can login with valid username and password
    Given User visited the portal
    When User inputs valid username and password
    Then User can see dashboard

    Examples:
        | username  | password |
        | Admin     | admin123 |
