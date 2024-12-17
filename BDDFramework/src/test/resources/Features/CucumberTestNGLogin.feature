#Author: Emrah
@tag
Feature: Testing cucumber-testng framework


  
  Scenario: Login to hrm website and check the functionality

    When I enter valid credentials
    And click on login button
    Then I validate home page title

