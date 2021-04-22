Feature: Testing Incident page Service Now web application
  Description: Purpose of this feature file is to test Incident page

  @SearchIncident
  Scenario: Test Incident page to retrieve record
    Given I am on Service now login page
    And I login with valid credentials
    When I am on home page
    And I click on Incident tab on left hand pane
    And I search for "INC0000002"
    Then I should get only "INC0000002" on results page
