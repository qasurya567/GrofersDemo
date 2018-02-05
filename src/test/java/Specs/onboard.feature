Feature: User Onboarding flow
Description: The purpose of this feature to test complete user onboard flow

@Onboarding
Scenario: Step by Step Execution of onboard Flow 
Given I am navigating to grofers site
And Select a Location "Delhi"
And Select a Product "Most Popular" "Aashirvaad Shudh Chakki Whole Wheat Atta"
And Login into Groffers with username "9205789599" and password "4,1,7,2"
And Proceed to Checkout witn number of items "1" and bill "632"


@Onboarding
Scenario: Step by Step Execution of onboard Flow with selecting multiple items 
Given I am navigating to grofers site
And Select a Location "Delhi"
And Select a Product "Most Popular" "Dove Beauty Cream Soap"
And Select a Product "Most Popular" "Kellogg's Original & the Best Corn Flakes (Pouch)"
And Login into Groffers with username "9205789599" and password "4,1,7,2"
And Proceed to Checkout witn number of items "3" and bill "632"