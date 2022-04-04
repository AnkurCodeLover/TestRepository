Feature: verify the test Application

  @TestCodeNew
  Scenario: Verify the test wesite
    Given User login to the page using username "nabeel@df.com" and pwd "123123"
    When Click on the link Test GP_1
    Then Again click on the link ABS_DF
    And Click on the MY TEAM menu option
    And Click on the Active Team member 12_212
