Feature: User should be able to login using correct credential

  Scenario: positive login scenario
    Given user is on login page of web table app
    When user enter username "Test"
    And user enter password "Tester"
    And user clicks to login button
    Then user should see url contains order
  @wip
  Scenario: positive login scenario
    Given user is on login page of web table app
    When user enter username "Test" password "Tester" and logins
    Then user should see url contains order

    #1-implement this new step
  #2- create login method in WebTableLoginPage
  #this login method should have multiple different overloaded version
