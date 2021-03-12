Feature: Verify user is able to search field on google

  Background: 
    Given User is on Google Home Page

  @SmokeTest
  Scenario Outline: : User is able to search field and appropriate results are displayed to user
    When user search field <Searchtext> on google home page
    Then user should see title of browser as <BrowserTitle>
    And user should see search results with text <TextInSearchResult>
    And I close the application

    Examples: 
      | Searchtext | BrowserTitle         | TextInSearchResult |
      | Duck       | Duck - Google Search | Duck - Wikipedia   |
