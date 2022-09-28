@Gulfire
Feature: Testing Retirement properties option

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    When Hover On Buy menu tab
    And click on Retirement property for sale

  Scenario Outline: Negative Testing
    When Enter an invalid <postal code> into the input field under retirement properties tab
    Then It should display Location not recognised
		
    Examples: 
      | postal code |
      | "20120"     |

  Scenario Outline: Smoke Testing
    When Enter <postal code> into the input field under retirement properties tab
    And Click On each of the properties below cv nb
    Then The Retirement Text Should display

    Examples: 
      | postal code |
      | "NE45"      |
