Feature: Testing Incident Table under now namespace in Service Now
  Description: Purpose of this feature file is to test Incident table with various test data

  @GetIncident @RetrieveIncident
  Scenario Outline: Test Incident table to retrieve records
    Given I want to test API "<API>" for test case "<TestName>"
    When I set header content type as "<ContentType>"
    When I hit the API "<API>" of request type "<RequestType>"
    Then I verify that the status code is "<StatusCode>"

    Examples:
      | TestName     | API      | ContentType      | RequestType | StatusCode |
      | OneIncident  | Incident | application/json | GET         | 200        |
      | TenIncidents | Incident | application/json | GET         | 200        |

  @PostIncident @CreateIncident
  Scenario Outline: Test Incident table to create records
    Given I want to test API "<API>" for test case "<TestName>"
    When I set header content type as "<ContentType>"
    When I hit the API "<API>" of request type "<RequestType>"
    Then I verify that the status code is "<StatusCode>"
    Then I validated response against schema "<Schema>"

    Examples:
      | TestName       | API      | ContentType      | RequestType | StatusCode | Schema                    |
      | CreateIncident | Incident | application/json | POST        | 201        | CreateIncidentSchema.json |

  @GetSingleIncident @RetrieveSingleIncident
  Scenario Outline: Test Incident table to retrieve record based on sys id
    Given I want to test API "<API>" for test case "<TestName>"
    When I set header content type as "<ContentType>"
    When I hit the API "<API>" of request type "<RequestType>"
    Then I verify that the status code is "<StatusCode>"
    Then I validated response against schema "<Schema>"
    Then I validated the response values with "<POJOClass>"

    Examples:
      | TestName      | API      | ContentType      | RequestType | StatusCode | Schema                 | POJOClass         |
      | GetIncident17 | Incident | application/json | GET         | 200        | GetIncidentSchema.json | GetSingleIncident |
      | GetIncident14 | Incident | application/json | GET         | 200        | GetIncidentSchema.json | GetSingleIncident |