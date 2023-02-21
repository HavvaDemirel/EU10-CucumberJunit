Feature: Example of Cucumber data table implementation

  Scenario: List of fruit I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |
    #to beatifully the pipes above
    #control+at+L