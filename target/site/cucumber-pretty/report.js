$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CBATest.feature");
formatter.feature({
  "line": 1,
  "name": "CBA Test",
  "description": "Travel Money Page Check",
  "id": "cba-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5979951200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "subtopics check in travel money page",
  "description": "",
  "id": "cba-test;subtopics-check-in-travel-money-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on CBA home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click tell me more in travel money section",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify all sub topics exist",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click netbank logon link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify username and password exists",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.iAmOnCBAHomePage()"
});
formatter.result({
  "duration": 2681438000,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.iClickTellMeMoreInTravelMoneySection()"
});
formatter.result({
  "duration": 1567635200,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.verifyAllSubTopicsExist()"
});
formatter.result({
  "duration": 253340000,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.clickNetbankLogonLink()"
});
formatter.result({
  "duration": 104007200,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.verifyUsernameAndPasswordExists()"
});
formatter.result({
  "duration": 2307058100,
  "status": "passed"
});
formatter.after({
  "duration": 929299400,
  "status": "passed"
});
});