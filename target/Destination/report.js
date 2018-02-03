$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onboard.feature");
formatter.feature({
  "line": 1,
  "name": "To complete the flow of onboarding",
  "description": "",
  "id": "to-complete-the-flow-of-onboarding",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Step by Step Execution of onboard Flow",
  "description": "",
  "id": "to-complete-the-flow-of-onboarding;step-by-step-execution-of-onboard-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CaseSetup"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am navigating to site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Select a Location \"Bengaluru\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select a Product \"Most Popular\" \"Aashirvaad Shudh Chakki Whole Wheat Atta\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login into Groffers with username \"9205789599\" and password \"4,1,7,2\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Proceed to Checkout witn number of items \"1\" and bill \"632\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.NavigateToSite()"
});
formatter.result({
  "duration": 5885065058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 19
    }
  ],
  "location": "StepDefinition.selectLocation(String)"
});
formatter.result({
  "duration": 1573507126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Most Popular",
      "offset": 18
    },
    {
      "val": "Aashirvaad Shudh Chakki Whole Wheat Atta",
      "offset": 33
    }
  ],
  "location": "StepDefinition.selectProdcut(String,String)"
});
formatter.result({
  "duration": 7489265046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9205789599",
      "offset": 35
    },
    {
      "val": "4,1,7,2",
      "offset": 61
    }
  ],
  "location": "StepDefinition.login(String,String)"
});
formatter.result({
  "duration": 11604029003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    },
    {
      "val": "632",
      "offset": 55
    }
  ],
  "location": "StepDefinition.checkout(String,String)"
});
formatter.result({
  "duration": 6737497301,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Step by Step Execution of onboard Flow with selecting multiple items",
  "description": "",
  "id": "to-complete-the-flow-of-onboarding;step-by-step-execution-of-onboard-flow-with-selecting-multiple-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@CaseSetup"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am navigating to site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Select a Location \"Bengaluru\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select a Product \"Most Popular\" \"Aashirvaad Shudh Chakki Whole Wheat Atta\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select a Product \"Most Popular\" \"Kellogg\u0027s Original \u0026 the Best Corn Flakes (Pouch)\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Login into Groffers with username \"9205789599\" and password \"4,1,7,2\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Proceed to Checkout witn number of items \"2\" and bill \"632\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.NavigateToSite()"
});
