@gulgena
 Feature:  New homes for sale Functionality
  I want to be able to see the new build tab

  Background:
  Given  User is on HomePage
  When   Hover on New Homes Tab
  And    Click on the New homes for sale

  Scenario Outline: happy path
    When   Write a  UK zip code  in the  question box <PostCode>
    And    we click on the houses for sale tab
    Then   houses for sell displayed
  
  Examples:
   |PostCode|
   |"DH5"   | 
 @NegativeScenario
 Scenario Outline: Negative Testing 
   When   Write a zip code  in the  question box <PostCode>
   Then   Message Location not recognised
   
   Examples:
   |PostCode|
   |"20120" |
