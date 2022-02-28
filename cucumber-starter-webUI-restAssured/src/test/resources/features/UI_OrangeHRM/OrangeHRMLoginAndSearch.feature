Feature: OrangeHRM UI Automation

  Scenario: Login with valid credentials
    Given The user navigates to OrangeHRM page
    When The user enters "Admin" as username
    And The user enters "admin123" as password and clicks on login button
    Then The user should be able to login

  Scenario Outline: Search employees in directory
    When The user navigates to Directory page
    Then The user should be able to search for employee "<EmpName>"

    Examples: 
      | EmpName        | Result |
      | Dominic Chase  | Found  |
      | Chenzira Chuki | Found  |

  Scenario: Logout from the application
    When The user clicks on Logout button
    Then The user successfully logs out
