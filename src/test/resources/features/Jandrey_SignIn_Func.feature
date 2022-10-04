 @Jandery
Feature: Sign in Functionality

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    And User click on Sign in button

  @Scenario1Jandery
  Scenario Outline: Verify Sign in Functionality
    When User provide <email>
    And User click next button
    When User provide now <password>
    Then User click on login button
    And User must succesfully sign in

    Examples: 
      | email                   | password         |
      | "gulgenaahet@gmail.com" | "techcircle2022" |

  @Scenario2Jandery
  Scenario Outline: Forgotten password
    When User provide <email>
    And User click next button
    And User select Forgotten password
    Then it shows password reset
    And User click to reset a code
    When User reset <email>
    And User click to reset a code
    Then Validate user could digit code

    Examples: 
      | email                   |
      | "gulgenaahet@gmail.com" |