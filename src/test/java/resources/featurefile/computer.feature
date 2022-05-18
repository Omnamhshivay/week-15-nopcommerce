Feature: Computer Test
  User Should build own computer and add to cart successfully
@sanity
  Scenario: User  should navigate to computer page successfully
    Given I am on homepage
    When I click on computer tab
    Then I should see the computer text
@smoke
  Scenario: User should navigate to desktops page successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktops
    Then I should see the desktops text
@regression
  Scenario Outline: User should build you own computer and add them to cart successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktops
    And I click on build on own computer
    And I select processor "<Processor>"
    And I select ram "<Ram>"
    And I select hdd "<HDD>"
    And I select os "<OS>"
    And I select software "<Software>"
    And I click on Add to cart button
    Then I should get message "<NotificationMessage>"
    Examples:
      | Processor                                       | Ram           | HDD               | OS                      | Software                   | NotificationMessage                                    |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   | The product has been added to your shopping cart |