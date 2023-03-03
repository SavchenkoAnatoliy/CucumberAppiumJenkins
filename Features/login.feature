
Feature: login

  Scenario: Successful login with vaild credentials

    Given user opens url
    When  user gets the title of the page
    When  user click on sign in button
    When  user enters the user id
    Then do screenshot
    And   user enters the password
    And   click on Login button