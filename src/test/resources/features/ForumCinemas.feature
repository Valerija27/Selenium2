@SmokeTest

  Feature: This feature test ForumCinemas profile page

    Scenario: Checks functionality of changing account data
      Given Open Chrome
      And Open homepage Forum
      When Press Login button
      And Fill user name test@test.lv and pass Test1
      And Scroll page
      And Press Login
      Then Go to profile
      And Press change
      And Scroll page
      And Clear fields
      And Fill name Valerija and surname Filipova
      And Fill new date day 1 month March year 2002
      And Scroll page
      And Press submit button
      And Close Chrome


