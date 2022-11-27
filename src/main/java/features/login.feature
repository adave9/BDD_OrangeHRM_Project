@tag
Feature: Orange HRM Login Test

@tag1
Scenario: Login Test Orange HRM Test Scenario
    Given User is already on login page 
    When title of the page is OrangeHRM
    Then user enters username "Admin" and user enters password "admin123"
    And user clicks on login button
	Then user gets on Dashboard
    Then user quit
