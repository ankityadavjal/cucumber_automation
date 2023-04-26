Feature: Adding Comments functionality on the website

  Scenario: User on the site's main page
    Given Open up chrome and launch application
    When Enter the valid username and password
    And User successfully logged in
    When The user clicks on blogs button
    When The user clicks on sequence link
    Then The user writes his comment and enter


  Scenario: user validate file plugin
    Given Open up chrome and launch
    When User select a plugin:"File" from the plugins
    When User clicks on properties
    And Enter input plugin property: "referenceName" with value: "Referencename"
    And Enter input plugin property: "path" with value: "ankityadav"
    And Select dropdown plugin property: "select-format" with option value: "tsv"
    And User click on validate button
    Then Validate mandatory property error for:"referenceName"











