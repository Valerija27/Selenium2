@SmokeTest

  Feature: This feature test dogs and cars filter

    @Dogs
    Scenario: Checks functionality of dog filter
      Given Open Chrome
      And Open homepage
      And Open Dogs tab
      When Fill min price 10 and max price 1000
      And Fill min age 1 and max age 10
      Then Press search button
      And Close Chrome


    @Cars
    Scenario: Verify Cars tab functionality
      Given Open Chrome
      And Open homepage
      And Open Cars tab
      When Fill min price 1000 and max price 10000
      And Fill min year 2007 and max year 2021
      And Fill engine min 1.0 and engine max 3.0
      And Select Engine type Benzins
      And Select gear type Manuala
#      And Select car type Sedans
      And Select color White
      Then Press search button
      And Close Chrome
