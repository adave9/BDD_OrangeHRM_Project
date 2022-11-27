@tag
Feature: Add Employee on Orange HRM

@tag1
Scenario: Add Employee Test for Orange HRM

Given User is already logged in
Then User click on PIM 
Then user click on AddEmployee
Then user enters firstname and lastname and user click on save
|fname|lname| 
|pq|rs| 
|tu|vw|
Then user exits

 