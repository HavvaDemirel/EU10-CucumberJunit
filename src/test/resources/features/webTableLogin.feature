Feature: User should be able to login using correct credential
  Background: user is on the login page
    Given  user is on login page of web table app

  Scenario: positive login scenario

    When user enter username "Test"
    And user enter password "Tester"
    And user clicks to login button
    Then user should see url contains order

  Scenario: positive login scenario

    When user enter username "Test" password "Tester" and logins
    Then user should see url contains order

    #1-implement this new step
  #2- create login method in WebTableLoginPage
  #this login method should have multiple different overloaded version

  #TC #: Login scenario using maps/ alternative practice

  Scenario: User should be able to see all 12 months in months dropdown
   # Given user is on the login page of Web table app
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains order
