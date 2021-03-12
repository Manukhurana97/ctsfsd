@SmokeFeature
Feature: check login  functionality

  Background:
    Given the user details:
      | id | username | password |
      | 1  | manu     | manu@123 |
      | 2  | abc     | abc@123 |

  @smoketest
  Scenario Outline: check login is successful with credential
    Given user is on login page
    When user enter <username> and <password>
    Then check  username and password is correct is correct
    Examples:
      | username | password |
      | manu     | manu@123 |
