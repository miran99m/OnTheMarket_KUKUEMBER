@Nariman
Feature: Booking an Agent visit

  Background: 
    Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
    When User hover Agents menu tab
    And User click on Book an agent visit
    Then User should be on arange a free agent valuation page
    When User enters postcode
    And User clicks on Lets Go button
    And User select address
    And User selects reason for valuation
    And press Continue button

  @VerifyErrorMessage
  Scenario Outline: Booking an agent without valid phone number and verify if it returns expected error message.
    When User enters <fullName>
    And User enters valid <email>
    And User leaves telephone blank
    And User selects Im ready now as when are you looking to market your property
    And User opts out from contact list
    And User clicks Send button
    Then User should receive Please enter a valid telephone number on the next page

    Examples: 
      | fullName      | email                  |
      | "James Smith" | "JamesSmith@Gmail.com" |

  @VerifyExpectedMessage
  Scenario Outline: Booking an agent with valid credentials and verify if it returns expected message
    When User enters <fullName>
    And User enters valid <email>
    And User enters valid <phone> number
    And User selects Im ready now as when are you looking to market your property
    And User opts out from contact list
    And User clicks Send button
    Then User should receive Your request for a property valuation has been sent to you on the next page

    Examples: 
      | fullName       | email                    | phone        |
      | "Harry truman" | "HarrySTruman@Gmail.com" | "7034560021" |
