Feature: validating AddPlace API

  @regression
  Scenario: verify if Place is being successfully added using AddPlaceAPI
    Given Add Place API request is prepared with query param "qaclick123"
    When user calls "maps/api/place/add/json" with Post http request
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"

  @regression
  Scenario Outline: Adding users to the application
    Given Insert user "<Name>", "<LastName>" and "<City>"
    When Click submit button
    Then Verify user "<User>" is added
    Examples:
      | Name | LastName | City   | User |
      | John | Doe      | Dallas | John |
      | Mary | Does     | Austin | Mary |

  @tag1@regression
  Scenario: Inserting user information
    Given user is on the info page
    When insert user
      | Mehmet              |
      | Unlu                |
      | munlu2008@gmail.com |
      | Dallas              |
      | Collin              |
    Then verify user is inserted