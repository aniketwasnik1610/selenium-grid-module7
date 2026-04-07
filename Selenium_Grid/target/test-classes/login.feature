Feature: DemoQA Login Test

  Scenario: Login to DemoQA
    Given user opens the browser
    When user navigates to "https://demoqa.com/login"
    And user enters username "testuser"
    And user enters password "Password@123"
    And user clicks login button
    Then login should be successful