@Tukta
Feature: Varify findingAent

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    When User hover Agents button
    And User click on findEstateLettingAgents button
    When User should be on findAgents page
    And User click on searchTextBox
    When User enter London as a City in seachTextBox
    And User click on MagnifyingGlass

  @VerifyFindingAgent
  Scenario: Varify findingAgent
    Then User should be on Letting agents & estate agents in London Page

  @VerifyPickingAgent
  Scenario Outline: Varify pickingAgent
    And User click on Email agent button choose the first one
    When User should be on Contact Agent page
    And User enter full name in textbox <fullName>
    And User enter email in textbox <email>
    And User enter phone number in textbox <phone>
    And User enter post code in textbox <postCode>
    And User click on situation dropDown button choose option I have a property to sell
    And User click on radio button OntheMarket can Contact me with relevant properties choose no
    And User click submit button
    Then User should be on One Click Properties page

    Examples: 
      | fullName       | email              | postCode | phone        |
      | "Tukta Mangan" | "Dome19@yahoo.com" | "20121"  | "2022039741" |
