Feature: Liquibase Test 




  @secondTask
  Scenario: : Customer has access to change setting into system
    Given Customer is logged in
    When Click on the second option (Projects) in the left
    Then Click to expand the default project.
    Then Click on the Operations tab under this project
    Then Select Result = Pass
    Then Click to Expand All button
    Then Verify to Zero Result