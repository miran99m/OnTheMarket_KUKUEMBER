@Miran
Feature: Search Functionality on Sold Prices Page

	Background: 
			Given user is on onTheMarket Landing Page
			When user hover over ValueMyHome menu tab
			And click on sold prices under ValueMyHome menuTab
			
	@PostCodeVerification
  Scenario Outline: Search a valid post code and verify it shows only homes sold within that post code
  
  		When user enters a valid UK "<postCode>"
			Then it shows only homes with that "<postCode>"
			
	@ProtoTypeVerification
	Scenario Outline: select a protoType from the dropdown and verify it shows homes only with thar specific prototype

			When user selects a "<protoType>"
			And select flat option under the prototype dropdown
			And click on search button
			Then all homes with  "<protoType>" should show
			
			@PostCodeVerification
			@ProtoTypeVerification
			Examples:
		    | postCode | protoType |
		    
		    | "PO16 7GZ" |   "flat" |
		    | "PO16 7GZ" |   "detached" |
		    
		    

					
