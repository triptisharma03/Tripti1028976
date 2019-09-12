#Author: tripti.sharma03@infosys.com

Feature: Order a Tshirt and Update Personal Information functionalities of automationpractice web application
 
  Background: Open the URL
  Given user is in the homepage "http://automationpractice.com/index.php"
  
  @firstTest
  Scenario Outline: Test scenario 1 : Order T-Shirt
   Given user is on the Sign in page
   When user adds a T-Shirt to cart by clicking on Add to cart
   And completes the order using "<email>","<password>"
   And select Pay by bank wire
   Then Order reference of the order placed is displayed
  Examples:
  |email|password|
  |someone@xample.com|Password123|
  
  @secondTest
  Scenario Outline: Test Scenario 2 : Update First Name in My Account
  	Given user is in the sign in page
  	When user sign in into the account using "<email>","<password>"
  	And updates first name in My Account page using "<fName>","<password>"
  	Then user gets a success message
  Examples:
  |email|password|fName|
  |someone@xample.com|Password123|Smriti|
