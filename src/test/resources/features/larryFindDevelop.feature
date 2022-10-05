@larry
Feature: Find Developments

	Background:
		Given User is on Home Page "OnTheMarket | Property, Houses & Flats for Sale & to Rent"
	
	@ltest1
  Scenario: Accepting Cookies
    Then cookies accept request should be gone
    
	@ltest2
	Scenario: New Developments Search
		Then User should open New Homes menu
		And click on Find Developments
		When User is on Find Developments
		Then put <search> into the search box
		And send a search request
		Then User should recieve <search> results
		
		@lcity
		Examples:
			| 		search 			 |
			| "Bristol" 			 |
			| "Churchbridge" 	 |
			| "Arun"				 	 |
			| "Moray"				 	 |
		
		@lpostal
		Examples:
			|		search	|
			| "BA1 2LR"	|
	

