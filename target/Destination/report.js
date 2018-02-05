$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onboard.feature");
formatter.feature({
  "line": 1,
  "name": "User Onboarding flow",
  "description": "Description: The purpose of this feature to test complete user onboard flow",
  "id": "user-onboarding-flow",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Step by Step Execution of onboard Flow",
  "description": "",
  "id": "user-onboarding-flow;step-by-step-execution-of-onboard-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Onboarding"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am navigating to grofers site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Select a Location \"Delhi\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select a Product \"Most Popular\" \"Aashirvaad Shudh Chakki Whole Wheat Atta\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Login into Groffers with username \"9205789599\" and password \"4,1,7,2\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Proceed to Checkout witn number of items \"1\" and bill \"632\"",
  "keyword": "And "
});
formatter.match({
  "location": "OnboardinFlow.NavigateToSite()"
});
formatter.result({
  "duration": 280432994,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi",
      "offset": 19
    }
  ],
  "location": "OnboardinFlow.selectLocation(String)"
});
formatter.result({
  "duration": 942695398,
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
  "location": "OnboardinFlow.selectProdcut(String,String)"
});
formatter.result({
  "duration": 11971308616,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027DESKTOP-OKKEN75\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\gaurav\\AppData\\Local\\Temp\\scoped_dir13736_12947}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d63.0.3239.132, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 120543895c73f391da4746cc6a08c1d4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getAttribute(RemoteWebElement.java:150)\r\n\tat BusinessComponent.onboard.selectGivenProductOnPage(onboard.java:26)\r\n\tat StepDefinations.OnboardinFlow.selectProdcut(OnboardinFlow.java:58)\r\n\tat ✽.And Select a Product \"Most Popular\" \"Aashirvaad Shudh Chakki Whole Wheat Atta\"(onboard.feature:8)\r\n",
  "status": "failed"
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
  "location": "OnboardinFlow.login(String,String)"
});
formatter.result({
  "status": "skipped"
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
  "location": "OnboardinFlow.checkout(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("URL at failure: http://screenwatch.yournewtab.com/?chid\u003d127\u0026oid\u003d706\u0026pubid\u003d1320848\u0026subid\u003d428220616291\u0026sah\u003d860\u0026cw\u003d1600\u0026nw\u003d1");
formatter.write("Failed Scenario name: Step by Step Execution of onboard Flow");
formatter.write("Date and Time at failure: 05-Feb-2018- 2018-02-05 10:43:08");
formatter.after({
  "duration": 601546393,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Step by Step Execution of onboard Flow with selecting multiple items",
  "description": "",
  "id": "user-onboarding-flow;step-by-step-execution-of-onboard-flow-with-selecting-multiple-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Onboarding"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am navigating to grofers site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Select a Location \"Delhi\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select a Product \"Most Popular\" \"Dove Beauty Cream Soap\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select a Product \"Most Popular\" \"Kellogg\u0027s Original \u0026 the Best Corn Flakes (Pouch)\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Login into Groffers with username \"9205789599\" and password \"4,1,7,2\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Proceed to Checkout witn number of items \"3\" and bill \"632\"",
  "keyword": "And "
});
formatter.match({
  "location": "OnboardinFlow.NavigateToSite()"
});
formatter.result({
  "duration": 21199284,
  "error_message": "java.lang.AssertionError: expected [Online Grocery Shopping - Buy Fruits, Vegetables, Groceries and More | Grofers] but found [ScreenWatch Now new tab]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\r\n\tat org.testng.Assert.assertEquals(Assert.java:123)\r\n\tat org.testng.Assert.assertEquals(Assert.java:176)\r\n\tat org.testng.Assert.assertEquals(Assert.java:186)\r\n\tat Generics.SeleniumHelper.assertOnPageopen(SeleniumHelper.java:214)\r\n\tat StepDefinations.OnboardinFlow.NavigateToSite(OnboardinFlow.java:48)\r\n\tat ✽.Given I am navigating to grofers site(onboard.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi",
      "offset": 19
    }
  ],
  "location": "OnboardinFlow.selectLocation(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Most Popular",
      "offset": 18
    },
    {
      "val": "Dove Beauty Cream Soap",
      "offset": 33
    }
  ],
  "location": "OnboardinFlow.selectProdcut(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Most Popular",
      "offset": 18
    },
    {
      "val": "Kellogg\u0027s Original \u0026 the Best Corn Flakes (Pouch)",
      "offset": 33
    }
  ],
  "location": "OnboardinFlow.selectProdcut(String,String)"
});
formatter.result({
  "status": "skipped"
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
  "location": "OnboardinFlow.login(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 42
    },
    {
      "val": "632",
      "offset": 55
    }
  ],
  "location": "OnboardinFlow.checkout(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.write("Embed Failed chrome not reachable\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.09 seconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027DESKTOP-OKKEN75\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\gaurav\\AppData\\Local\\Temp\\scoped_dir13736_12947}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d63.0.3239.132, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 120543895c73f391da4746cc6a08c1d4");
formatter.after({
  "duration": 4572225784,
  "status": "passed"
});
});