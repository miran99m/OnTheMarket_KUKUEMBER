@Gulfire
Feature: Retirement Property Functionality
  I want to use this template for my feature file

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    When Hover On Buy menu tab
    And click on Retirement property for sale

  @InvalidPostCode
  Scenario Outline: Search with an invalid(US) zipcode under retirement properties tab
    When Enter an invalid <postCode> into the input field under retirement properties tab
    Then It should display Location not recognised

    Examples: 
      | postCode |
      | "20120"  |

  @ValidPostCode
  Scenario Outline: Search with a valid(UK) zipcode under retirement properties tab
    When Enter <postCode> into the input field under retirement properties tab
    And Click On each of the properties below cv nb
    Then The Retirement Text Should display

    Examples: 
      | postCode |
      | "NE45"   |
