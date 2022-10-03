@Miran
Feature: Search Functionality on Sold Prices Page

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    When user hover over ValueMyHome menu tab "Value my home"
    And click on sold prices under ValueMyHome menuTab "Sold prices"

  @Scenario1
  Scenario Outline: Search a valid post code and verify it shows only homes sold within that post code
    When user enters a valid UK <zipCode>
    And click on search button to change the type
    Then it shows only homes with that postCode

    Examples: 
      | zipCode    |
      | "PO16 7GZ" |

  @Scenario2
  Scenario Outline: select a protoType from the dropdown and verify it shows homes only with thar specific prototype
    When user enters a valid UK <zipCode>
    And click on search button to change the type
    When user selects a <protoType> under the prototype dropdown
    And click on search button
    Then all homes with that <protoType> should show

    Examples: 
      | protoType | zipCode    |
      | "Flat"    | "PO16 7GZ" |
