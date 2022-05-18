Feature: Register Test
  As user I want to register on nop commerce website

  @sanity
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully

  @smoke
  Scenario: Firstname Lastname Email Password and Confirm password Field are mandatory
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully
    And I click register button
    And I should see the First name is required
    And I should see the Last name is required
    And I should see the Email is required
    And I should see the Password is required
    Then I should see the Confirm Password is required

  @regression
  Scenario Outline: User should create account successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully
    And I select gender "<Gender>"
    And I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I select day "<day>"
    And I select month "<month>"
    And I select year "<year>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmpassword>"
    And I click register button
    Then I should see the message
    Examples:
      | Gender | firstname | lastname | day | month | year | email                   | password  | confirmpassword |
      | female | Rocky     | Bhai     | 5   | 5     | 2021 | RockyBhai0002@gmail.com | Rocky0007 | Rocky0007       |
      | female | Rocky     | Ben      | 10  | 10    | 2021 | RockyBen0001@gmail.com  | Rocky111  | Rocky111        |


