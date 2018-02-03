Feature: To complete the flow of onboarding

@CaseSetup
Scenario: Step by Step Execution of onboard Flow 
Given I am navigating to site
And Select a Location "Bengaluru"
And Select a Product "Most Popular" "Aashirvaad Shudh Chakki Whole Wheat Atta"
And Login into Groffers with username "9205789599" and password "4,1,7,2"
And Proceed to Checkout witn number of items "1" and bill "632"

@CaseSetup
Scenario: Step by Step Execution of onboard Flow with selecting multiple items 
Given I am navigating to site
And Select a Location "Bengaluru"
And Select a Product "Most Popular" "Aashirvaad Shudh Chakki Whole Wheat Atta"
And Select a Product "Most Popular" "Kellogg's Original & the Best Corn Flakes (Pouch)"
And Login into Groffers with username "9205789599" and password "4,1,7,2"
And Proceed to Checkout witn number of items "2" and bill "632"