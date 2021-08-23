@SmokeTest
  Feature: This is just a sample feature file
    this is line 2 of this feature

    @FirstTest
    Scenario: This is my first scenario
      Given Create a new customer
      And Add a new customer to DB
      When Change customer name
      And Change customer DOB
      And Save changes
      Then Check that customer name was changed

      @SecondTest
      Scenario Outline: Multiple Test sample
        Given Create a new <userType>
        When Delete a new <UserTypeForDelete>
        Then Get error message <errorMessage>

        Examples:
    |userType|UserTypeForDelete|errorMessage|
    |customer|customer         |You are not allowed to do so|
    |admin   |admin            |You are allowed to do so    |
    |superUser|    superUser   |You can not do this         |




#    Scenario Outline: Multiple Test sample
#      Given Create a new admin
#      When Delete a new admin
#      Then Get error message You are allowed to do so
#
#
#    Scenario Outline: Multiple Test sample
#      Given Create a new superUser
#      When Delete a new superUser
#      Then Get error message You can not do this