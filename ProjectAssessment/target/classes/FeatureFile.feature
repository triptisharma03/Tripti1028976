#Author: tripti.sharma03@infosys.com

Feature: Automating scenario 1 and scenario 2 of automationpractice web application
 
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
  |tripti95@example.com|password123|