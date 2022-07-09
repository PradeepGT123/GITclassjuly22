Feature: Verifying adactinhotel details

  Scenario: Verifying adactinhotel login detsils with valid credentials
    Given User is on the adactinhotel page
    When User should enter username & password
    And User should click login button
    Then User should verify success message
