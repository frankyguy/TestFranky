Feature: CBA Test
  Travel Money Page Check

    Scenario: subtopics check in travel money page
      Given I am on CBA home page
      When I click tell me more in travel money section
      Then verify all sub topics exist
      And Click netbank logon link
      Then verify username and password exists
