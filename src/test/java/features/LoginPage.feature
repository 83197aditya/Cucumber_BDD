Feature: Login functionality for OrangeHRM

  Scenario: Successful login with valid credentials
    Given user is on the test login page
    When user enters username "Admin" and password "admin123"
    And clicks on login
    Then user should redirected to the dashboard page