@Chrisitan
Feature: On The Market testing
 
 Background: open Browser
 		Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
  	When User hovers over Value my home tab
    Then click on Home Price Guide
    Then If user is on Home Price guide page
    Then Verify that Home Price Guide tab is selected
@VerifySearchMenu
  Scenario: Testing the search menu
   
    Then Click on Agent Valuation tab and verify it is selected
    Then Click on Instant Valuation tab and verify it is selected
@SearchFuncOfPriceGuideTab    
  Scenario:  Testing the Search Function of Home Price Guide tab
   
    Then Enter postcode and hit enter
    Then Verify user in on page for that specific post code